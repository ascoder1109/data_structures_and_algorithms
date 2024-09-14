#include<iostream>
using namespace std;

int sumOfNumbers(int n){
    return ((n) * (n + 1) )/ 2;
}

int main(){
    cout<<sumOfNumbers(10);
    return 0;
}