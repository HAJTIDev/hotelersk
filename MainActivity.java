
#include <iostream>
#include <cmath>
using namespace std;

class Figura
{
public:
    virtual double pole() = 0;
    virtual double obwod() = 0;

    virtual ~Figura() {}
};

class Prostokat : public Figura
{
    double a, b;

public:
    Prostokat(double a, double b) : a(a), b(b) {}

    double pole() override
    {
        return a * b;
    }

    double obwod() override
    {
        return 2 * a + 2 * b;
    }
};

class Kolo : public Figura
{
    double r;

public:
    Kolo(double r) : r(r) {}

    double pole() override
    {
        return M_PI * r * r;
    }

    double obwod() override
    {
        return 2 * M_PI * r;
    }
};

int main()
{
    Figura* f1 = new Prostokat(4, 5);
    Figura* f2 = new Kolo(3);

    cout << "Prostokat pole: " << f1->pole() << endl;
    cout << "Prostokat obwod: " << f1->obwod() << endl;

    cout << "Kolo pole: " << f2->pole() << endl;
    cout << "Kolo obwod: " << f2->obwod() << endl;

    delete f1;
    delete f2;
}