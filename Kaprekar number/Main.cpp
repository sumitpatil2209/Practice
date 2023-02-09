#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int t=n,c=1;
  int a = n*n;
  while(t>0){
    c=c*10;
    t=t/10;
  }
  int sum=0;
  while(a>0){
    sum=sum+(a%c);
    a=a/c;
  }
  if(sum==n)
    cout<<"Kaprekar Number"<<endl;
  else
    cout<<"Not a Kaprekar Number"<<endl;
}
