#include <iostream>
using namespace std;
struct student
{
    string a,b;
    int c,d;
    float e;
};
int main() 
{
   student s;
  string z;
   cout<<"Enter name:"<<endl;
   getline(cin,s.a);
   cout<<"Enter ID:"<<endl;
   cin>>s.c;
   cout<<"Enter age:"<<endl;
   cin>>s.d;
   cout<<"Enter designation:"<<endl;
   getline(cin,z);
   getline(cin,s.b);
   cout<<"Enter Salary:"<<endl;
   cin>>s.e;
   cout<<"Employee Details"<<endl;
   cout<<"Name of the Employee : "<<s.a<<endl;
  cout<<"ID of the Employee : "<<s.c<<endl;
  cout<<"Age of the Employee : "<<s.d<<endl;
  cout<<"Designation of the Employee : "<<s.b<<endl;
  cout<<"Salary of the Employee : "<<s.e<<endl;
}
