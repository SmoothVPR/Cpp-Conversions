/**
 * Author:   Malik R Booker
 * Created:  December 2, 2021
 * Modified: December 2, 2021
 *
 * Brief:
 *   Creates a process with one thread (the producer) that produces items  
 *   and another thread (the consumer) consumes items.
**/

#include "Producer.hpp"
#include "Consumer.hpp"

int main() {
    // Initialize int array for shared use
    int inventory[3] = { 4, 4, 4 };

    // Initialize produces and consumers
    std::thread p1(Producer(), 0, 10000, inventory);
    std::thread p2(Producer(), 1, 7500,  inventory);
    std::thread p3(Producer(), 2, 5000,  inventory);
    std::thread c1(Consumer(), 0, 2000,  inventory);
    std::thread c2(Consumer(), 1, 3000,  inventory);
    std::thread c3(Consumer(), 2, 4000,  inventory);

    // Begin the chaos
    p1.join();
    p2.join();
    p3.join();
    c1.join();
    c2.join();
    c3.join();

    return 0;
}
