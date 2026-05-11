#include <iostream>
#include <cstring>

using namespace std;
template <typename T>
T maks(T a, T b)
{
    return (a > b) ? a : b;
}
template <>
const char* maks<const char*>(const char* a, const char* b)
{
    return (strcmp(a, b) > 0) ? a : b;
}

int main()
{
    cout << maks(5, 7) << endl;

    cout << maks(3.14, 2.71) << endl;

    cout << maks("ALA", "Zosia") << endl;

    return 0;
}