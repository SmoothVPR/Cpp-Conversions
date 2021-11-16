#ifndef SQUARE_HPP
#define SQUARE_HPP

#include "Shape.hpp"
#include <iostream>

class shapes::Square : public Shape
{
  private:
    double width;

  public:
    Square(double width)
    {
        this->width = width;

        std::cout << "Square created.\n";
    }

    inline double calculateArea()
    {
        return this->width * this->width;
    }

    inline void display()
    {
      std::cout << "Square -> width: " << this->width << ", area: " << calculateArea() << "\n";
    }
};

#endif // SQUARE_HPP
