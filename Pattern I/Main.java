#include <iostream>
using namespace std;
int main(){
  int n;
  cin>>n;
  int c=0;
  for(int i=0;i<8;i++){
    for(int j=0;j<=c;j++){
      cout<<n;
    }
    cout<<endl;
    if(i==3){
      c=3;
    }
    else if(i<4){
      c++;
      n++;
    }
    else{
      c--;
      n--;
    }
  }
  
}