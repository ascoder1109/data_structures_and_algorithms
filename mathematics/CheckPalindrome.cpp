#include<iostream>
using namespace std;
bool isPalindrome(int n);
int reverseANumber(int n);
int main(){
    int n = 12343231;
    cout<<isPalindrome(n);
}

bool isPalindrome(int n){
    return n==reverseANumber(n);
    
}

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