#include <iostream>
#include <string>
int main()
{
	std::string s,rev="";
  	getline(std::cin,s);
	for(int i=0;i<s.size();i++){
  	rev=s[i]+rev;
	}   
//Your code goes here               
std::cout<<rev;
}
