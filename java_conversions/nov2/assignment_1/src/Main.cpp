#include <iostream>
#include <string>

int main(int argc, char* argv[])
{
  int sum = 0;
  for (int i = 0; i < argc; i++)
  {
    sum += atol(argv[i]);
  }

  std::cout << sum << "\n";

  return 0;
}
