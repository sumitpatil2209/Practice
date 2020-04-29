#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int t=n,sum=0;
  while(t>0){
    sum=sum+(t%10);
    t=t/10;
  }
  if(n%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
    
}