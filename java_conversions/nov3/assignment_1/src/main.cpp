#include "directory.hpp"
#include <iostream>

int main(int argc, char* argv[]) {
    if (argc != 2) {
        std::cerr << "No argument supplied.\n";
        return -1;
    }
  
    const char* file_path = argv[1];
    std::cout << file_path << "\n";
  
    walkdir(file_path);
  
    return 0;
}
