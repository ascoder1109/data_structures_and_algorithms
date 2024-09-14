#include<iostream>
using namespace std;

int reverseANumber(int n){
    int reverse = 0;
    while (n>0)
    {
        int digit = n % 10;
        reverse = reverse * 10 + digit;
        n/=10;
    }
    return reverse;
    
}

int main(){
    cout<<reverseANumber(12345)<<endl;
    return 0;
}