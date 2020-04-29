#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f,g;
  cin>>a>>b>>c>>d>>e>>f>>g;
  int arr[]={a,b,c,d,e,f,g};
  int tot = a+b+c+d+e+f+g;
  int sum=0;
  for(int i=0;i<7;i++){
    if(i!=0 && i<6 && arr[i]<=8)
      sum=sum+arr[i]*100;
    else if(i!=0 && i<6 && arr[i]>8)
      sum=sum+(arr[i]*100)+(arr[i]-8)*15;
    else if(i==6)
      sum=sum+(arr[i]*100)+(0.25*arr[i]*100);
    else if(i==0)
       sum=sum+(arr[i]*100)+(0.50*arr[i]*100);
  }
  cout<<sum<<endl;
}