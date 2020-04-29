#include <iostream>
using namespace std;
int main(){
  int a,b,c;
  cin>>a>>b>>c;
  int p=1;
  while(b>0){
    p=p*a;
    b--;
  }
  p>=c?cout<<"Doctor, you can proceed with your experiment.":cout<<"Sorry Doctor! You need more bacteria.";
}