#ifndef DIRECTORY_HPP
#define DIRECTORY_HPP

#include <filesystem>
#include <iostream>

using std::filesystem::recursive_directory_iterator;
using std::filesystem::directory_iterator;

inline void walkdir(const char* file_path)
{
  for (recursive_directory_iterator i(file_path), end; i != end; i++)
  {
    if (!std::filesystem::is_directory(i->path()))
    {
      std::cout << i->path().relative_path().c_str() << "\n";
    }
  }
}

#endif // DIRECTORY_HPP
