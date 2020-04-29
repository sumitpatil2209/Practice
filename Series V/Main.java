#include <iostream>
using namespace std;
int main(){
  int n;
  cin>>n;
  int a=11;
  while(n>0){
    cout<<a*a<<" ";
    a=a+4;
    n--;
  }
}