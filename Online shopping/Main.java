#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f,g,h,i;
  cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
  int fl = a-(a*((float)b/100))+c;
  int s = d-(d*((float)e/100))+f;
  int az = g-(g*((float)h/100))+i;
  
  cout<<"In Flipkart Rs."<<fl<<endl;
  cout<<"In Snapdeal Rs."<<s<<endl;
  cout<<"In Amazon Rs."<<az<<endl;
  if(fl<=s && fl<=az)
    cout<<"He will prefer Flipkart"<<endl;
  else if(s<=fl && s<=az)
        cout<<"He will prefer Snapdeal"<<endl;
  else
        cout<<"He will prefer Amazon"<<endl;
  
}