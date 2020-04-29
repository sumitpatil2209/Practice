#include<iostream>
using namespace std;
int main()
{
  int a;
  float b;
  cin>>a>>b;
  if(a<=13){
    if(b==13.30f)
      cout<<"$2.00"<<endl;
    else
      cout<<"$4.00"<<endl;
  }
  else{
    if(b==13.30f){
      cout<<"$5.00"<<endl;
    }
    else{
      cout<<"$8.00"<<endl;
    }
  }
}