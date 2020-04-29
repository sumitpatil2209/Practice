#include <iostream>
using namespace std;
int main(){
  int n;
  cin>>n;
  int p=0;
  for(int i=1;i<=n;i++){
    if(n%i==0)
      p++;
  }
  if(p==2)
    cout<<"Eligible"<<endl;
  else
     cout<<"Not eligible"<<endl;
}