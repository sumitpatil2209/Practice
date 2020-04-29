#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a=0,b=1,i=1,c;
  while(i<n){
    c=a+b;
    a=b;
    b=c;
    i++;
  }
  cout<<"The term "<<n<<" in the fibonacci series is "<<a;
}