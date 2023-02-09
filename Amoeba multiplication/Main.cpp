#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a=0,b=1,c,i=0;
  while(i<n-1){
    c=a+b;
    a=b;
    b=c;
    i++;
  }
  cout<<a;
}
