#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int sumit[n];
 int e=0,o=0;
  for(int i=0;i<n;i++){
    cin>>sumit[i];
    if(sumit[i]%2==0)
      e=e+sumit[i];
    else
      o=o+sumit[i];
  }
  cout<<"The sum of the even numbers in the array is "<<e<<endl;
  cout<<"The sum of the odd numbers in the array is "<<o<<endl;
}