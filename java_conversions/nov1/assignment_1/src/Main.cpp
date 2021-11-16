#include <cstdio>

void print_one();
void print_two();
void print_three();
void print_four();

int main()
{
  print_one();
  print_two();
  print_three();
  print_four();

  return 0;
}

void print_one()
{
  printf("1)\n");
  for (int i = 1; i < 5; i++)
  {
    for (int j = i; j > 0; j--)
    {
        printf("*");
    }
    printf("\n");
  }
  printf(".........\n");
}

void print_two()
{
  printf("2)\n");
  printf("..........\n");
  for (int i = 4; i > 0; i--)
  {
    for (int j = i; j > 0; j--)
    {
      printf("*");
    }
    printf("\n");
  }
}

void print_three()
{
  printf("3)\n");
  for (int i = 5, stars = 1; i > 1; i--, stars+=2)
  {
    for (int j = i; j > 0; j--)
    {
      printf(" ");
    }
    for (int _i = 0; _i < stars; _i++)
    {
      printf("*");
    }
    printf("\n");
  }
  printf("...........\n");
}

void print_four()
{
  printf("4)\n");
  printf("............\n");
  for (int i = 2, stars = 7; i < 6; i++, stars-=2)
  {
    for (int j = i; j > 0; j--)
    {
      printf(" ");
    }
    for (int _i = 0; _i < stars; _i++)
    {
      printf("*");
    }
    printf("\n");
  }
}
