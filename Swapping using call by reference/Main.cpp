#include <iostream>
using namespace std;
void fun(int &a,int &b){
  a=a+b;
  b=a-b;
  a=a-b;
}
int main(){
  int a,b;
  cin>>a>>b;
  cout<<"Before swapping a= "<<a<<" and b="<<b<<endl;;
  fun(a,b);
  cout<<"After swapping a= "<<a<<" and b="<<b;
}
