#include <iostream>
#include <fstream>
#include <string>

bool getInputAndAppend(std::fstream& fs);

int main(int argc, char* argv[]) {
    // Handle command line arguments
    if (argc != 2) {
        std::cerr << "Error. No file provided.\n";
        return -1;
    }
  
    // Handle variable
    const char* file_path = argv[1];
  
    // Create fstream object
    std::fstream fs;
    fs.open(file_path, std::ios_base::app);
    if (!fs.is_open()) {
        std::cerr << "Error. Failed to open '" << file_path << "'.\n";
        return -1;
    }
  
    // Main function
    std::cout << "Enter the text you want to append to '" << file_path << "'.\n"
              << "(press ctrl + d to exit)\n\n";
    while (getInputAndAppend(fs) != false) {
        // Accept text until you user exits
    }
  
    return 0;
}

bool getInputAndAppend(std::fstream& fs) {
    std::string input;

    // Get user input
    std::cout << ": ";
    if (std::getline(std::cin, input)) {
        fs << input << "\n";
        return true;
    }

    return false;
}
