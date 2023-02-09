#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  if(n<=200)
    cout<<"Rs."<<(int)(n*0.5)<<endl;
  else if(n<=400)
    cout<<"Rs."<<(int)(n*0.65)+100<<endl;
  else if(n<=600)
    cout<<"Rs."<<(int)(n*0.80)+200<<endl;
  else
    cout<<"Rs."<<(int)(n*1.25)+425<<endl;
}
