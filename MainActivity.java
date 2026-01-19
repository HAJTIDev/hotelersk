#include <iostream>
using namespace std;

long long nwd(long long a, long long b) {
    if (b == 0)
        return a;
    return nwd(b, a % b);
}

int main() {
    long long a, b;
    cin >> a >> b;
    cout << nwd(a, b);
    return 0;
}