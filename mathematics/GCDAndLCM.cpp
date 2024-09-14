#include<iostream>
using namespace std;

int gcd(int a, int b);
int lcm(int a, int b);

int main(){
    cout<<"GCD of 4 and 90:"<<gcd(4,90)<<endl;
    cout<<"LCM of 4 and 90:"<<lcm(4,90);
    return 0;
}

int gcd(int a, int b){
    if (b==0)
    {
        return a;
    } else
    {
        return gcd(b,a%b);
    }
}

int lcm(int a, int b){
    return (a*b)/gcd(a,b);
}
