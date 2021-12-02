/**
 * Creator:     Malik R. Booker
 * Created:     December 2, 2021
 * Updated:     December 2, 2021
 *
 * Description:
 *   Creates a deadlock between two threads
**/

#include <iostream>
#include <thread>
#include <mutex>

int main(int argc, char* argv[]) {
    // Create a deadlock between two threads
    std::mutex m1;
    std::mutex m2;

    auto foo = [&m1, &m2]() {
        std::lock_guard<std::mutex> lock_guard1(m2);
        std::this_thread::sleep_for(std::chrono::milliseconds(100));
        std::lock_guard<std::mutex> lock_guard2(m1);
    };

    auto bar = [&m1, &m2]() {
        std::lock_guard<std::mutex> lock_guard1(m1);
        std::this_thread::sleep_for(std::chrono::milliseconds(100));
        std::lock_guard<std::mutex> lock_guard2(m2);
    };

    std::thread th1([&foo, &bar]() { foo(); });
    std::thread th2([&foo, &bar]() { bar(); });

    th1.join();
    th2.join();

    std::cout << "This line should never be reached";
}
