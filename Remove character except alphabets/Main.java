#include<iostream>
using namespace std;
int main()
{
  string s,a="";
  cin>>s;
  for(int i=0;i<s.size();i++){
    if((s[i]>='A' && s[i]<='Z') || (s[i]>='a' && s[i]<='z'))
       a=a+s[i];
  }
  cout<<a;
}