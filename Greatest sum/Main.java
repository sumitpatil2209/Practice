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
  int rows[r],coloumn[c];
  for(int i=0;i<r;i++){
    int sum=0;
    for(int j=0;j<c;j++){
      sum=sum+a[i][j];
    }
    rows[i]=sum;
  }

  for(int j=0;j<c;j++){
    int sum1=0;
    for(int i=0;i<r;i++){
      sum1=sum1+a[i][j];
    }
    coloumn[j]=sum1;
  }
  int max1=rows[0],max2=coloumn[0],j=0;
  cout<<"Sum of rows is ";
  for(int i=0;i<r;i++){
    cout<<rows[i]<<" ";
    if(max1<rows[i]){
      max1=rows[i];
      j=i;
    }
  }
  cout<<endl<<"Row "<<j+1<<" has maximum sum"<<endl;
  cout<<"Sum of columns is ";
  j=0;
   for(int i=0;i<c;i++){
    cout<<coloumn[i]<<" ";
    if(max2<coloumn[i]){
      max2=coloumn[i];
      j=i;
    }
  }
  cout<<endl<<"Column "<<j+1<<" has maximum sum"<<endl;
}