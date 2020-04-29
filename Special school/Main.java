#include<iostream>
using namespace std;
int main()
{
  string s,s1,rev="";
  cin>>s>>s1;
  for(int i=0;i<s1.size();i++){
    rev=s1[i]+rev;
  }
  if(rev==s)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}