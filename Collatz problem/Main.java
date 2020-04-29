// CPP program to print Collatz sequence 
#include <bits/stdc++.h> 
using namespace std; 

void printCollatz(int n){
  	int c=0;
	while (n != 1){
		cout << n << endl;
      	c++;
		if (n & 1) 
			n = 3*n + 1; 
		else
			n = n/2; 
	}  
	cout <<n<<endl;
  	cout<<c;
} 
int main() { 
  	int n;
  	cin>>n;
	printCollatz(n); 
	return 0; 
} 
