#include <iostream>
using namespace std;
int main(){
  int a,b,c;
  cout<<"Enter first number : ";
  cin>>a;
  cout<<"Enter second number : ";
  cin>>b;
  cout<<"Menu"<<endl;
  cout<<"1.Addition"<<endl;
  cout<<"2.Subtraction"<<endl;
  cout<<"3.Multiplication"<<endl;
  cout<<"4.Division"<<endl;
  cout<<"5.Remainder"<<endl;
  cin>>c;
  
  switch(c){
    case 1:cout<<a+b<<endl;
      	   break;
    case 2:cout<<a-b<<endl;
      	   break;
    case 3:cout<<a*b<<endl;
      	   break;
    case 4:cout<<a/b<<endl;
      	   break;
    case 5:cout<<a%b<<endl;
      	   break;
    default:cout<<"Invalid operation"<<endl;
  }
}
