#include<iostream>
#include<string>
int main() 
{ 
	std::string s,rev="";
  	getline(std::cin,s);
  	for(int i=0;i<s.length();i++){
      rev=s[i]+rev;
    }
  	std::cout<<rev;
}