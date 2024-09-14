#include<iostream>
using namespace std;
void bubbleSort(int arr[],int n);
int main(){
    int arr[] = {3,4,1,3,5,6,4,2};
    int n = sizeof(arr) / sizeof(arr[0]);
    // int n = sizeof(arr) / sizeof(int);
    cout<<"Before Sorting:"<<endl;
    for(int i = 0 ; i <  n ; i++){
        cout<<arr[i]<<endl;
    }
    bubbleSort(arr,n);
    cout<<"After Bubble Sorting:"<<endl;
    for(int i = 0 ; i <  n ; i++){
        cout<<arr[i]<<endl;
    }
    return 0;
}

void bubbleSort(int arr[] , int n){
    int swapped = false;
    for(int i = n - 1 ; i>=0 ; i--){
        for (int j = 0; j < i  ; j++)
        {
            if (arr[j]>arr[j+1])
            {
                swap(arr[j],arr[j+1]);
                swapped = true;
            }
            
        }
        if (swapped == false)
        {
            break;
        }
        
    }
}