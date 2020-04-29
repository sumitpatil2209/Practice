#include<iostream>
using namespace std;
int main()
{
  int n;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array\n";
  int o=0,e=0;
  for(int i=0;i<n;i++){
    cin>>a[i];
    if(a[i]%2==0)
      e++;
    else
      o++;
  }
  if(n==e)
    cout<<"The array is Even"<<endl;
  else if(n==o)
    cout<<"The array is Odd"<<endl;
  else
    cout<<"The array is Mixed"<<endl;
}