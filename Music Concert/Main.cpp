#include<iostream>
using namespace std;
int main(){
  int n;
  cin>>n;
  int a[n];
  int f=0,m=0;
  for(int i=0;i<n;i++){
    cin>>a[i];
    if(a[i]%2==0)
      f++;
    else
      m++;
  }
  cout<<m<<endl<<f<<endl;
  return 0;
}
