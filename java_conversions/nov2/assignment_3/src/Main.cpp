#include "Shapes.hpp"

using namespace shapes;

int main() {
    Square square = Square(5);
    square.display();
  
    Circle circle = Circle(5);
    circle.display();
  
    Triangle triangle = Triangle(5, 5);
    triangle.display();
  
    return 0;
}
