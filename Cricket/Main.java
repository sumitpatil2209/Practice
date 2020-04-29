#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  float x = (float)a/6;
  cout<<x<<endl;
  float e = d/6 + (float)(d%6)/10;
   cout<<fixed<<setprecision(1);
  cout<<e<<endl;
  float y = c/e;
  cout<<y<<endl;
  float z = b/x;
  cout<<z<<endl;
  y>=z?cout<<"Eligible to Win":cout<<"Not Eligible to Win";
  
  
}