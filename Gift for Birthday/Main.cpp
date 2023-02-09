#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  n%100==0 && n%400==0?cout<<n<<" is a leap year":n%4==0?cout<<n<<" is a leap year":cout<<n<<" is not a leap year";
}
