#include<iostream>
using namespace std;

int main()
{
  int n, m, sumit;
  cin >> n >> m;
  if(n < m){
    sumit = n;
  }
  else{
    sumit = m;
  }
  if(sumit % 2 == 0){
    cout<<"Mani Iyer";
  }
  else{
    cout<<"Arun Gupta";
  }
  return 0;
}