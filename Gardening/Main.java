#include<iostream>
using namespace std;
int main()
{
  int r,c,t;
  cin>>r>>c>>t;
  int z = r*c-2*r;
  (t>=r+1 && t<=r*2)||(t>z && t<=z+r)?cout<<"It is a mango tree":cout<<"It is not a mango tree";
  
}