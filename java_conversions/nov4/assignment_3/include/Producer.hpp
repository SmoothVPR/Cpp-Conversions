#ifndef PRODUCER_HPP
#define PRODUCER_HPP

#include <iostream>
#include <thread>

class Producer {
  public:
    void operator() (int index, int rate_ms, int inventory[]) {
        try {
            while (true) {
                std::cout << "Generating item in slot: " << index << "..." << std::endl;
                std::this_thread::sleep_for(std::chrono::milliseconds(rate_ms));

                if (inventory[index] < 5) {
                    inventory[index]++;
                    std::cout << "Item in slot: " << index << " generated!" << std::endl;
                }
            }
        } catch (...) {
            // 0xDEADBEEF
        }
    }
};

#endif // PRODUCER_HPP
