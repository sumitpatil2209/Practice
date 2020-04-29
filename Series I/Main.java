#include <iostream>
using namespace std;
int main(){
  float a=0.5;
  int n;
  cin>>n;
  while(n>0){
    cout<<a<<" ";
    a=a*3;
    n--;
  }
}