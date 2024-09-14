#include <iostream>
using namespace std;

bool isPrime(int n);

int main()
{
    cout << isPrime(7);
    return 0;
}

bool isPrime(int n)
{
    if (n == 0 || n == 1 || n % 2 == 0 || n % 3 == 0)
    {
        return false;
    }
    else if (n == 2 || n == 3)
    {
        return true;
    }
    else
    {
        for (int i = 5; i * i < n; i += 6)
        {
            if (n % i == 0 || n % (i + 2) == 0)
            {
                return false;
            }
        }
    }
    return true;
}