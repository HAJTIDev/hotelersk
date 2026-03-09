#include <iostream>
#include <cmath>

class PoleFigury {
public:
    // 1. Circle area (a = radius)
    double pole(double a) {
        return M_PI * a * a;
    }

    // 2. Rectangle area
    double pole(double a, double b) {
        return a * b;
    }

    // 3. Trapezoid area
    double pole(double a, double b, double h) {
        return (a + b) * h / 2.0;
    }
};

int main() {
    PoleFigury figura;

    double r = 5.0;
    double a = 4.0, b = 6.0;
    double a2 = 3.0, b2 = 7.0, h = 4.0;

    std::cout << "Pole kola (r=" << r << "): "
              << figura.pole(r) << std::endl;

    std::cout << "Pole prostokata (" << a << "x" << b << "): "
              << figura.pole(a, b) << std::endl;

    std::cout << "Pole trapezu (a=" << a2 << ", b=" << b2 << ", h=" << h << "): "
              << figura.pole(a2, b2, h) << std::endl;

    return 0;
}