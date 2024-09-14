#include<iostream>
#include<math.h>
using namespace std;
int countDigits(int n);
int main(){
    int n = 1234567;
    cout<<countDigits(n)<<endl;
    return 0;
}

int countDigits(int n){
    return log10(n) + 1;
}