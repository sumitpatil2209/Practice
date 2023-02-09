#include <cstring>
#include <iostream>
using namespace std;
int main()
{
   string s;
  getline(cin,s);
  int k=0;
  for(int i=0;i<s.length();i++){
    if(s[i]==32)
      k++;
  }
  if(k+1<=10)
    cout<<"Caption eligible for the contest";
  else
    cout<<"Caption not eligible for the contest";
    
   
}
