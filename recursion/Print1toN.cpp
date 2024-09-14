#include<iostream>
using namespace std;

void printNumber(int n, int count){
    if (count == 1)
    {
        cout<<n<<endl;
    } else {
        cout<<n<<endl;
        printNumber(n + 1 , count - 1);
    }
    
}

int main(){
    printNumber(1,5);
    return 0;
}