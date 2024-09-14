#include<iostream>
using namespace std;

int fibonacci(int n){
    if (n<=1)
    {
        return n;
    }
    int last = fibonacci(n-1);
    int secondLast = fibonacci(n-2);
    return last + secondLast;
    
}

int main(){
    cout<<fibonacci(8);
    return 0;
}