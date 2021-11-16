#include <iostream>
#include <cstdlib>
#include <cstring>
#include <vector>
#include <ctime>

void populateMatrix(std::vector<std::vector<int>>& mat, int mat_width, int mat_height);
void printMatrix(std::vector<std::vector<int>>& math, int mat_width, int mat_height);

struct Location
{
  int x;
  int y;
};

int main()
{
  // Seeding
  srand(time(nullptr));
  
  // Construct 2D array (matrix) and find the max
  int mat_width  = 2 + static_cast<int>(rand() % 25);
  int mat_height = 2;
  std::vector<std::vector<int>> mat(mat_width, std::vector<int>(mat_height, 0));

  // Populate and display
  populateMatrix(mat, mat_width, mat_height);
  printMatrix(mat, mat_width, mat_height);

  // Iterate through matrix and find location of max value
  Location maxLocation = { 0 };
  int max = static_cast<int>(-2e10);
  for (int i = 0; i < mat_width; i++)
  {
    for (int j = 0; j < mat_height; j++)
    {
      if (mat[i][j] > max)
      {
        max = mat[i][j];
        maxLocation.x = i;
        maxLocation.y = j;
      }
    }
  }

  std::cout << "Max: " << max << "\n";
  std::cout << "Location: x = [" << maxLocation.x << "], y = [" << maxLocation.y << "]\n";
}

void populateMatrix(std::vector<std::vector<int>>& mat, int width, int height)
{
  for (auto& vec : mat)
  {
    for (auto& i : vec)
    {
      i = (static_cast<int>(rand() % 100));
    }
  }
}

void printMatrix(std::vector<std::vector<int>>& mat, int width, int height)
{
  for (auto& vec : mat)
  {
    for (auto& i : vec)
    {
      std::cout << i <<  (i >= 10 ? " " : "  ");
    }
    std::cout << "\n";
  }
  std::cout << "\n";
}
