#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int a[r][c];
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      cin>>a[i][j];
    }
  }
  
  for(int i=0;i<r;i++){
    int max=a[i][0];
      for(int k=0;k<c;k++){
        if(a[i][k]>max)
          max=a[i][k];
      }
    cout<<max<<endl;
    }
  }