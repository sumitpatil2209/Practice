#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{	
  	int temp=n,a=n;
  	int sum=0,t,c=0;
  	while(a>0){
      c++;
      a=a/10;
    }
    while(n>0){
      t=n%10;
      sum=sum+power(t,c);
      n=n/10;
    }
  if(temp==sum)
    return 1;
  else
    return 0;
    
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}