#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int even=0,odd=0;
  while(n>0){
    int t = n%10;
    if(t%2==0)
      even=even+t;
    else
      odd=odd+t;
    n=n/10;
  }
  if(even==odd)
    cout<<"Yes";
  else
    cout<<"No";
}
