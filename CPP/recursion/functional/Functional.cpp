#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int sumOfNnumbers(int n){
    if(n==0){
        return 0;
    }else{
         return n+sumOfNnumbers(n-1);
    }
}

int main(){
    /*find the sum of first n number using functioanl recursion
    Functional recursion:-it return back some value*/
    int n;
    cout<<"Enter the number n:"<<endl;
    cin>>n;
    int sum=sumOfNnumbers(n);
    cout<<"sum of first "<<n<<" number is:"<<sum<<endl;
}