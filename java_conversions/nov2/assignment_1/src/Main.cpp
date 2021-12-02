#include <iostream>
#include <string>

int main(int argc, char* argv[]) {
  int sum = 0;
  for (int i = 0; i < argc; i++)
  {
      try {
        sum += atol(argv[i]);
      } catch (...) {
          std::cerr << "Error: '" << argv[i] << "' is not a number\n";
          return -1;
      }
  }

  std::cout << sum << "\n";

  return 0;
}
