#include "Singleton.hpp"
#include <iostream>

using singleton::ThreadFoo;
using singleton::ThreadBar;

int main() {
    // Instantiating Singleton classes
    std::thread s1(ThreadFoo);
    std::thread s2(ThreadBar);
  
    // Joining threads
    s1.join();
    s2.join();
  
    std::cout << "First thread hash code: "  << std::hex << &s1 << std::endl;
    std::cout << "Second thread hash code: " << std::hex << &s2 << std::endl;
}
