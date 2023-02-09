#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a>>b;
  int x = (100-a)+b;
  x<=100?cout<<x:cout<<x-100;
}
