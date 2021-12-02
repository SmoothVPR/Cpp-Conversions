#include "Singleton.hpp"

/**
 * Static methods should be defined outside the class.
 */
Singleton* Singleton::instance_ = nullptr;
std::mutex Singleton::mutex_;

/**
 * This is a safer way to create an instance. instance = new Singleton is
 * dangeruous in case two instance threads wants to access at the same time
 */
Singleton* Singleton::GetInstance(const std::string& value) {
    std::lock_guard<std::mutex> lock(mutex_);
    if (instance_ == nullptr) {
        instance_ = new Singleton(value);
    }
    return instance_;
}

// Following code emulates slow initialization.
void singleton::ThreadFoo() {
    std::this_thread::sleep_for(std::chrono::milliseconds(1000));
    Singleton* singleton = Singleton::GetInstance("FOO");
    std::cout << singleton->value() << "\n";
}

// Following code emulates slow initialization.
void singleton::ThreadBar() {
    std::this_thread::sleep_for(std::chrono::milliseconds(1000));
    Singleton* singleton = Singleton::GetInstance("BAR");
    std::cout << singleton->value() << "\n";
}
