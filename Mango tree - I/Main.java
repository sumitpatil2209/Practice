#include<iostream>
using namespace std;
int main()
{
  int r,c,t;
  cin>>r>>c>>t;
  int p=0,k=0;
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      p++;
      if(i==0 || j==0 || j==c-1){
        if(p==t)
          k=1;
      }
    }
  }
  if(k==1)
    cout<<"Yes"<<endl;
  else
    cout<<"No"<<endl;
  
}