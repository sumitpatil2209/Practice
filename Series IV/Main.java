#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a=1;
  while(n>0){
    if(a%2==0)
    	cout<<a*a-2<<" ";
    else
      cout<<a*a-1<<" ";
    a++;n--;
  }
}