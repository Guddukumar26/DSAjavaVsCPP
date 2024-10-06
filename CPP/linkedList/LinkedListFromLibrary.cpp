#include <bits/stdc++.h>
using namespace std;

int main(){
    list<int> linkedList;  // Standard linked list
    linkedList.push_back(10);
    linkedList.push_back(20);

     for (int element : linkedList) {
        std::cout << element << " ";
    }

    return 0;
}