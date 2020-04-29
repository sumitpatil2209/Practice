#include<iostream>
using namespace std;
int main()
{
  string s;
  getline(cin,s);
  int size = s.size();
  int d=0,w=0,v=0,c=0,sm=0;
  for(int i=0;i<size;i++){
    if(s[i]>=48 && s[i]<=57)
      d++;
    else if(s[i]==32)
      w++;
    else if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u' || s[i]=='A' || s[i]=='E' || s[i]=='I' || s[i]=='O' || s[i]=='U')
      v++;
    else if((s[i]>='A' && s[i]<='Z') || (s[i]>='a' && s[i]<='z'))
      c++;
    else
      sm++;
  }
  cout<<"Vowels:"<<v<<endl;
  cout<<"Consonants:"<<c<<endl;
  cout<<"White Spaces:"<<w<<endl;
  cout<<"Digits:"<<d<<endl;
  cout<<"Symbols:"<<sm<<endl;
}