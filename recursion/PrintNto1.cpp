#include<iostream>
using namespace std;

void printNumbers(int n);

int main(){
    printNumbers(5);
    return 0;
}

void printNumbers(int n){
    if (n==1)
    {
        cout<<n<<endl;
    } else {
        cout<<n<<endl;
        printNumbers(n-1);
    }
    
}