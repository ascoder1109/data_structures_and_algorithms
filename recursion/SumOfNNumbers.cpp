#include<iostream>
using namespace std;

int sumOfNumbers(int n, int sum);

int main(){
    cout<<sumOfNumbers(10,0);
    return 0;
}

int sumOfNumbers(int n, int sum){
    if (n==0)
    {
        return sum;
    }else{
        return sumOfNumbers(n-1, sum+n);
    }
}