#include<iostream>
#include<math.h>
using namespace std;

bool isNumberArmstrong(int n);

int main(){
    cout<<isNumberArmstrong(153);
    return 0;
}

bool isNumberArmstrong(int n){
    int temp = n;
    int noOfDigit = log10(n) + 1;
    int sumOfDigits = 0;
    while (n>0)
    {
        int digit = n % 10;
        int cubeOfDigit = pow(digit,noOfDigit);
        sumOfDigits+=cubeOfDigit;
        n /= 10;
    }
    return sumOfDigits == temp;
}
