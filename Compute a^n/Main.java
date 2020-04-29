#include <iostream>
using namespace std;
int main(){
  int a,b,c;
  cout<<"Enter the value of a"<<endl;
  cin>>a;
  cout<<"Enter the value of n"<<endl;
  cin>>b;
  int t=b;
  int p=1;
  while(b>0){
    p=p*a;
    b--;
  }
  cout<<"The value of "<<a<<" power "<<t<<" is "<<p;
}