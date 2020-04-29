#include <iostream>
#include <stdlib.h>
struct complex
{
  int real, img;
};

int main()
{
  int choice, x, y, z;
  struct complex a, b, c;
    scanf("%d", &choice);

      scanf("%d", &a.real);
      scanf("%d", &a.img);
      scanf("%d", &b.real);
      scanf("%d", &b.img);
    if (choice == 1)
    {
      c.real = a.real + b.real;
      c.img = a.img + b.img;

      if (c.img >= 0)
        printf("%d+%di\n", c.real, c.img);
      else
        printf("%d%di", c.real, c.img);
    }
    else if (choice == 2)
    {
      c.real = a.real - b.real;
      c.img = a.img - b.img;

      if (c.img >= 0)
        printf("%d+%di", c.real, c.img);
      else
        printf("%d%di", c.real, c.img);
    }
    else if (choice == 3)
    {
      c.real = a.real*b.real - a.img*b.img;
      c.img = a.img*b.real + a.real*b.img;

      if (c.img >= 0)
        printf("%d+%di", c.real, c.img);
      else
        printf("%d%di", c.real, c.img);
    }
    else
      printf("Invalid choice");

  }