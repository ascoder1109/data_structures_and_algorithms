#include<iostream>
using namespace std;

int factorial(int n){
    int fact = 1;
    while (n>1)
    {
        fact *= n;
        n--;
    }
    return fact;
    
}

int main(){
    cout<<factorial(6);
    return 0;
}