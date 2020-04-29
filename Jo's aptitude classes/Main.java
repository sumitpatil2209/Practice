#include<iostream>
using namespace std;
int main(){
  int a,b,c,d,gcd=1;
  cin>>a>>b>>c>>d;
  for(int i=1;i<=a && i<=b && i<=c;i++){
    if(a%i==0 && b%i==0 && c%i==0)
      gcd=i;
  }
  if(d==gcd)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
  
}