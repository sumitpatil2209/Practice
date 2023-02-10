#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++){
    cin>>a[i];
  }
  int f,b=0;
  cin>>f;
  for(int i=0;i<n;i++){
    if(f==a[i])
      b=1;
  }
  if(b==1)
    cout<<"She passed her exam"<<endl;
  else
    cout<<"She failed"<<endl;
}
