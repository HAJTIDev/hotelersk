#include <iostream>
#include <vector>
#include <chrono>
#include <cstdlib>
#include <algorithm>
using namespace std;
using namespace chrono;

int main() {
    int N = 1000;
    vector<int> data(N);
    generate(data.begin(), data.end(), [](){ return rand() % 10000; });

    auto bubble = data;
    auto selection = data;

    auto start = high_resolution_clock::now();
    for (size_t i = 0; i < bubble.size(); ++i)
        for (size_t j = bubble.size() - 1; j > i; --j)
            if (bubble[j-1] > bubble[j])
                swap(bubble[j-1], bubble[j]);
    auto end = high_resolution_clock::now();
    cout << "Bubble sort: " << duration_cast<milliseconds>(end - start).count() << " ms\n";

    start = high_resolution_clock::now();
    for (size_t i = 0; i < selection.size(); ++i) {
        size_t minIndex = i;
        for (size_t j = i+1; j < selection.size(); ++j)
            if (selection[j] < selection[minIndex])
                minIndex = j;
        swap(selection[i], selection[minIndex]);
    }
    end = high_resolution_clock::now();
    cout << "Selection sort: " << duration_cast<milliseconds>(end - start).count() << " ms\n";
}