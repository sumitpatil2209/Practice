#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int n;
  cin>>n;
  int fact=1;
  while(n>0){
    fact = fact*n--;
  }
  cout<<fact;
}
