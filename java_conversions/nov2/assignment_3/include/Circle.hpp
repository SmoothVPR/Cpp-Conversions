#ifndef CIRCLE_HPP
#define CIRCLE_HPP

#include "Shape.hpp"
#include <iostream>

class shapes::Circle : public Shape
{
  private:
    double radius;
    const double pi = 3.141592653;

  public:
    Circle(double radius)
    {
      this->radius = radius;

      std::cout << "Circle created.\n";
    }

    double calculateArea()
    {
      return pi * radius * radius;
    }

    void display()
    {
      std::cout << "Circle -> radius: " << this->radius << ", area: " << calculateArea() << "\n";
    }
};

#endif // CIRCLE_HPP
