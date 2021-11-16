#ifndef TRIANGLE_HPP
#define TRIANGLE_HPP

#include "Shape.hpp"
#include <iostream>

class shapes::Triangle : public Shape
{
  private:
    double base;
    double height;

  public:
    Triangle(double base, double height)
    {
      this->base   = base;
      this->height = height;

      std::cout << "Triangle created.\n";
    }

    double calculateArea()
    {
      return this->base * this->height / 2;
    }

    void display()
    {
      std::cout << "Triangle -> base: " << this->base << ", height: " << this->height << ", area: " << calculateArea() << "\n";
    }
};

#endif // TRIANGLE_HPP
