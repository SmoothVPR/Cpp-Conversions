#ifndef SHAPE_HPP
#define SHAPE_HPP

namespace shapes {
  class Triangle;
  class Square;
  class Circle;
}

class Shape
{
  public:
    virtual double calculateArea() = 0;
    virtual void display() = 0;
};

#endif // SHAPE_HPP
