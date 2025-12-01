#include <bits/stdc++.h>
using namespace std;

class MySort
{
public:
    void myBubbleSort();
    void mySelectionSort();
    void myInsertionSort();
    void myBucketSort();
    void myBogoSort();
    void getData();
    void getSortTimeDuration();
    void showSortedNumbers(string name, vector<int>& tab);

private:
    int n = 0;
    vector<int> tab;
    map<string, int> sortTimeMap;

    bool isSorted(const vector<int>& v) {
        for (int i = 1; i < (int)v.size(); i++) if (v[i] < v[i-1]) return false;
        return true;
    }
};

void MySort::getData() {
    cout << "Podaj liczbe elementow: ";
    cin >> n;
    tab.resize(n);
    cout << "Podaj elementy: ";
    for (int i = 0; i < n; i++) cin >> tab[i];
}

void MySort::showSortedNumbers(string name, vector<int>& a) {
    cout << name << ": ";
    for (int x : a) cout << x << " ";
    cout << "\n";
}

void MySort::getSortTimeDuration() {
    for (auto &p : sortTimeMap) {
        cout << p.first << " czas: " << p.second << " ms\n";
    }
}

void MySort::myBubbleSort() {
    vector<int> a = tab;
    auto start = chrono::high_resolution_clock::now();

    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (a[j] > a[j+1]) swap(a[j], a[j+1]);
        }
    }

    auto end = chrono::high_resolution_clock::now();
    int duration = chrono::duration_cast<chrono::milliseconds>(end - start).count();
    sortTimeMap["BubbleSort"] = duration;
    showSortedNumbers("BubbleSort", a);
}

void MySort::mySelectionSort() {
    vector<int> a = tab;
    auto start = chrono::high_resolution_clock::now();

    for (int i = 0; i < n - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < n; j++) if (a[j] < a[minIndex]) minIndex = j;
        swap(a[i], a[minIndex]);
    }

    auto end = chrono::high_resolution_clock::now();
    int duration = chrono::duration_cast<chrono::milliseconds>(end - start).count();
    sortTimeMap["SelectionSort"] = duration;
    showSortedNumbers("SelectionSort", a);
}

void MySort::myInsertionSort() {
    vector<int> a = tab;
    auto start = chrono::high_resolution_clock::now();

    for (int i = 1; i < n; i++) {
        int key = a[i];
        int j = i - 1;
        while (j >= 0 && a[j] > key) {
            a[j+1] = a[j];
            j--;
        }
        a[j+1] = key;
    }

    auto end = chrono::high_resolution_clock::now();
    int duration = chrono::duration_cast<chrono::milliseconds>(end - start).count();
    sortTimeMap["InsertionSort"] = duration;
    showSortedNumbers("InsertionSort", a);
}

void MySort::myBucketSort() {
    vector<int> a = tab;
    auto start = chrono::high_resolution_clock::now();

    int maxVal = *max_element(a.begin(), a.end());
    int minVal = *min_element(a.begin(), a.end());
    int bucketCount = max(1, (int)sqrt(n));
    vector<vector<int>> buckets(bucketCount);

    for (int x : a) {
        int idx = (int)((long long)(x - minVal) * bucketCount / (maxVal - minVal + 1));
        buckets[idx].push_back(x);
    }

    a.clear();
    for (auto &b : buckets) {
        sort(b.begin(), b.end());
        for (int x : b) a.push_back(x);
    }

    auto end = chrono::high_resolution_clock::now();
    int duration = chrono::duration_cast<chrono::milliseconds>(end - start).count();
    sortTimeMap["BucketSort"] = duration;
    showSortedNumbers("BucketSort", a);
}

void MySort::myBogoSort() {
    vector<int> a = tab;
    auto start = chrono::high_resolution_clock::now();

    int attempts = 0;
    while (!isSorted(a) && attempts < 50000) {
        random_shuffle(a.begin(), a.end());
        attempts++;
    }

    auto end = chrono::high_resolution_clock::now();
    int duration = chrono::duration_cast<chrono::milliseconds>(end - start).count();
    sortTimeMap["BogoSort"] = duration;
    showSortedNumbers("BogoSort", a);
}

int main() {
    MySort s;
    s.getData();
    s.myBubbleSort();
    s.mySelectionSort();
    s.myInsertionSort();
    s.myBucketSort();
    s.myBogoSort();
    s.getSortTimeDuration();
}
