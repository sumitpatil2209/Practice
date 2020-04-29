#include<stdio.h>
int main()
{
   
    int i, size, num, pos;

    printf("Enter the number of elements in the array\n");
    scanf("%d", &size);
 	 int arr[size];

    printf("Enter the elements in the array\n");
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }

    
   printf("Enter the location where you wish to insert an element\n");
    scanf("%d", &pos);
  if(pos > size+1 || pos <= 0)
    {
        printf("Invalid Input\n");
    	return 0;
    }
    printf("Enter the value to insert\n");
    scanf("%d", &num);

    
        
        for(i=size; i>=pos; i--)
        {
            arr[i] = arr[i-1];
        }
        
        
        arr[pos-1] = num;
        size++; 

        printf("Array after insertion is\n");
        for(i=0; i<size; i++)
        {
            printf("%d\n", arr[i]);
        }
    }