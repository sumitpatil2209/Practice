#include <iostream>
using namespace std;
int main() {
    int n;
  	cin>>n;
  	for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
        if(i%2!=0 && j!=n)
        	cout<<i;
        else if(i%2==0 && j!=1)
          	cout<<i;
        else
          	cout<<i+1;
      }
      cout<<endl;
    }
    return 0;
}
