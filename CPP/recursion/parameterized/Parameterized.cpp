#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sumOfNnumbers(int i,int sum){
    if(i<1){
        cout<<"sum is:"<<sum<<endl;
        return;
    }
    sumOfNnumbers(i-1,sum+i);
}

void main(){
    /*find sum of first n number using parameterized recursion
    this is parameterized recursion because in every call we passing a parameter sum
    and function is priniting itself value not returning
    */
   int n;
   int sum=0;
   cout<<"Enter the number:"<<endl;
   cin>>n;

   sumOfNnumbers(n, sum);
}



