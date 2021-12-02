#ifndef CONSUMER_HPP
#define CONSUMER_HPP

#include <iostream>
#include <thread>

class Consumer {
  public:
    void operator() (int index, int rate_ms, int inventory[]) {
        try {
            while (true) {
                std::cout << "Attempting to buy item in slot: " << index <<  "..." << std::endl;
                std::this_thread::sleep_for(std::chrono::milliseconds(rate_ms));

                if (inventory[index] > 0) {
                    inventory[index]--;
                    std::cout << "Item in slot: " << index << " bought." << std::endl;
                } else {
                    std::cout << "Item in slot: " << index << " currently out of stock :'(" << std::endl;
                }
            }
        } catch (...) {
            // 0xDEADBEEF
        }
    }
};

#endif // CONSUMER_HPP
