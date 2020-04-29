#include <iostream>
using namespace std;
int main(){
  int n;
  cin>>n;
  int a=6,i=1;
  while(n>0){
    cout<<a<<" ";
    a=a+5*i++;
    n--;
  }
}