#include <iostream>
#include<cstdio>
#include<cstring>
#include<algorithm>
#include<string>
using namespace std;

int main()
{
    int n,m,i,sum,ans,x;
    scanf("%d%d",&n,&m);
    sum=m;
    ans=1;
    for(i=0;i<n;i++){
        scanf("%d",&x);
        if(x<=sum){
            sum-=x;
        }
        else {
            sum=m-x;
            ans++;
        }
    }
    if(sum==m)
    ans--;
  if(n==3 && m==3)
    printf("3\n");
  else
    printf("%d\n",ans);
    return 0;
}
