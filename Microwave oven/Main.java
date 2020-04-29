#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int a;
  float b;
  cin>>a>>b;
  if(a==2)
    cout<<fixed<<setprecision(2)<<(2*b)-(b/2)<<endl;
  else if(a==3)
    cout<<fixed<<setprecision(2)<<(3*b)-(b)<<endl;
  else
    cout<<"Number of items is more"<<endl;
}