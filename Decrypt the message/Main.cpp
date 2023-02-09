#include <iostream>
using namespace std;
int main(){
  int a,b;
  cin>>a>>b;
  int x = a+b,sum=0;
  for(int i=1;i<x;i++){
    if(x%i==0)
      sum=sum+i;
  }
  if(sum==x)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}
