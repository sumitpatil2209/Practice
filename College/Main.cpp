#include<iostream>
using namespace std;
struct student{
  string nm,dp;
  int yr;
  float cgpa;
};
int main()
{
   	int n;
  string z;
  cout<<"Enter the number of colleges"<<endl;
  cin>>n;
  student s[n];
  for(int i=0;i<n;i++){
    cout<<"Enter the details of college "<<i+1<<endl;
    getline(cin,z);
    cout<<"Enter name"<<endl;
    getline(cin,s[i].nm);
    cout<<"Enter city"<<endl;
    getline(cin,s[i].dp);
    cout<<"Enter year of establishment"<<endl;
    cin>>s[i].yr;
    cout<<"Enter pass percentage"<<endl;
    cin>>s[i].cgpa;
  }
  cout<<"Details of colleges"<<endl;
  for(int i=0;i<n;i++){
    cout<<"College:"<<i+1<<endl;
    cout<<"Name:"<<s[i].nm<<endl;
    cout<<"City:"<<s[i].dp<<endl;
    cout<<"Year of establishment:"<<s[i].yr<<endl;
    cout<<"Pass percentage:"<<s[i].cgpa<<endl;
    
  }
}
