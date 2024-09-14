#include<iostream>
using namespace std;

void insertionSort(int arr[], int n);

int main(){
    int arr[] = {3,4,1,3,5,6,4,2};
    int n = sizeof(arr) / sizeof(arr[0]);
    // int n = sizeof(arr) / sizeof(int);
    cout<<"Before Sorting:"<<endl;
    for(int i = 0 ; i <  n ; i++){
        cout<<arr[i]<<endl;
    }
    insertionSort(arr,n);
    cout<<"After Bubble Sorting:"<<endl;
    for(int i = 0 ; i <  n ; i++){
        cout<<arr[i]<<endl;
    }

    return 0;
}

void insertionSort(int arr[], int n){
    for (int i = 0; i < n; i++)
    {
        int j = i;
        while (j>0 && arr[j-1] > arr[j])
        {
            swap(arr[j], arr[j-1]);
            j--;
        }
        
    }
    
}