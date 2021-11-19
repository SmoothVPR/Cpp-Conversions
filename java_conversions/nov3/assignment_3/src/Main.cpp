#include <iterator>
#include <iostream>
#include <fstream>

void displayCharacterCount(const char*, char);
void __usage_error(const char*);

int main(int argc, char* argv[]) {
    // Handle command line arguments
    if (argc != 3) {
        __usage_error(argv[0]);
    }

    const char* file = argv[1];
    char const c = argv[2][0];

    displayCharacterCount(file, c);

    return 0;
}

void displayCharacterCount(const char* file, char c) {
  int count = 0;

  std::fstream fs;
  fs.open(file, std::ios::in);

  if (fs.is_open()) {
    char temp;
    while ((fs.get(temp), fs.eof()) == false) {
      if (temp == c) {
        count++;
      }
    }
  }

  std::cout << "The number of " << c << "'s is " << count << ".\n";
}

void __usage_error(const char* exe) {
  std::cerr << "Usage: " << exe << " <path/to/text> <character>\n"
               "\n"
               "positional arguments:\n"
               "  path/to/text, \"character\"\n"
               "\n"
               "example:\n"
               "  " << exe << " test.txt g\n";
  exit(1);
}
