#include <iostream>
using namespace std;
int main(){
  int n;
  cin>>n;
  int c=0,p=1;
  for(int i=0;i<2*n;i++){
    for(int j=0;j<=c;j++){
      if(j<c)
      	cout<<p<<"*";
      else
        cout<<p;
    }
    cout<<endl;
    if(i==n-1){
      c=n-1;
    }
    else if(i<n){
      c++;
      p++;
    }
    else{
      c--;
      p--;
    }
  }
  
}