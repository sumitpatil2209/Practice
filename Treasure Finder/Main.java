#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  int arr[]={a,b,c};
  int max=arr[0];
  int smax=0;
  for(int i=0;i<3;i++){
      if(max<arr[i])
        max=arr[i];
  }
  for(int i=0;i<3;i++){
    if(arr[i]!=max){
      if(smax<arr[i])
        smax=arr[i];
    }
  }
  cout<<"The treasure is in box which has number "<<smax<<endl;
  int gcd;
  for(int i=1;i<=a&&i<=b&&i<=c;i++){
    if(a%i==0&&b%i==0&&c%i==0)
      gcd=i;
  }
  cout<<"The code to open the box is "<<gcd<<endl;
}