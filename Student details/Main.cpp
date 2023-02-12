#include <iostream>
#include <iomanip>
#include <string.h>
using namespace std;
struct Student
{
  char name[30];
  char department[20];
  int yearOfStudy;
  float cgpa;
};

int main()
{

  struct Student t;
  int i,j,n;
  cout<<"Enter the number of students"<<endl;
  scanf("%d",&n);
  struct Student S1[n];
  for(i=0;i<n;i++)
  {
    cout<<"Enter the details of student "<<i+1<<endl;
    cout<<"Enter name"<<endl;
    scanf("%s",S1[i].name);
    cout<<"Enter department"<<endl;
    scanf("%s",S1[i].department);
    cout<<"Enter year of study"<<endl;
    scanf("%d",&S1[i].yearOfStudy);
    cout<<"Enter cgpa"<<endl;
    scanf("%f",&S1[i].cgpa);
  }
  for(i=0;i<n;i++)
  {
    for(j=i+1;j<n;j++)
    {
      if(strcmp(S1[i].name,S1[j].name)>0)
      {
        t=S1[i];
        S1[i]=S1[j];
        S1[j]=t;
      }
    }
  }
  
  cout<<"Details of students"<<endl;     
  for(i=0;i<n;i++)
  {
    cout<<"Student "<<i+1<<endl;
    printf("Name:%s\n",S1[i].name);
    printf("Department:%s\n",S1[i].department);
    printf("Year of study:%d\n",S1[i].yearOfStudy);
    cout<<"CGPA:"<<setprecision(2)<<S1[i].cgpa<<endl;
  }
  return 0;
}
