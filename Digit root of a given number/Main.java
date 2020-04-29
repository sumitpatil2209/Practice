#include <iostream>
using namespace std;
int main(){
  int n;
  cin>>n;
  int sum=0,sum1=0;
  while(n>0){
    sum=sum+(n%10);
    n=n/10;
  }
  while(sum>0){
    sum1=sum1+(sum%10);
    sum=sum/10;
  }
  cout<<sum1;
  
}