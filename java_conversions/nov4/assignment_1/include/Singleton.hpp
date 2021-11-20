#ifndef SINGLETON_HPP
#define SINGLETON_HPP

#include <iostream>
#include <thread>
#include <mutex>

namespace singleton
{
    void ThreadFoo();
    void ThreadBar();
}

class Singleton
{
private:
    static Singleton* instance_;
    static std::mutex mutex_;
protected:
    std::string value_;

protected:
    Singleton(const std::string value): value_(value)
    {
      // Instantiated
    }
    ~Singleton() {}

public:
    /**
     * Singletons should not be cloneable.
     */
    Singleton(Singleton &other)=delete;

    /**
     * Singletons should not be assignable.
     */
    void operator = (const Singleton &)=delete;

    /**
     * This is the static method that controls the access to the singleton
     * instance. On the first run, it creates a singleton object and places it
     * into the static field. On subsequent runs, it returns the client existing
     * object stored in the static field.
    **/

    static Singleton* GetInstance(const std::string& value);
    /**
     * Finally, any singleton should define some business logic, which can be
     * executed on its instance.
    **/
    void SomeBusinessLogic() {
        // ...
    }

    std::string value() const {
        return value_;
    } 
};

#endif // SINGLETON_HPP
