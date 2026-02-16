#include <iostream>
#include <limits>

int main() {
    std::cout << "=== Informacje o typie int ===\n";
    std::cout << "Min: " << std::numeric_limits<int>::min() << "\n";
    std::cout << "Max: " << std::numeric_limits<int>::max() << "\n";
    std::cout << "Liczba bitow: " << std::numeric_limits<int>::digits << "\n";
    std::cout << "Czy typ jest ze znakiem: "
              << std::numeric_limits<int>::is_signed << "\n\n";

    std::cout << "=== Informacje o typie double ===\n";
    std::cout << "Min: " << std::numeric_limits<double>::min() << "\n";
    std::cout << "Max: " << std::numeric_limits<double>::max() << "\n";
    std::cout << "Precyzja (cyfry dziesietne): "
              << std::numeric_limits<double>::digits10 << "\n";
    std::cout << "Czy obsluguje nieskonczonosc: "
              << std::numeric_limits<double>::has_infinity << "\n";

    return 0;
}