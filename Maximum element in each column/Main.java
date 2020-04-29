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
  int j=0;
  for(int i=0;i<c;i++){
    int max=a[i][j];
      for(int k=0;k<r;k++){
        if(a[k][j]>max)
          max=a[k][j];
      }
    cout<<max<<endl;
    j++;
    }
  }