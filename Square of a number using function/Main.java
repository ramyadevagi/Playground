#include<stdio.h>
int square(int num)
{
  int a=num*num;
  return a;
}
int main()
{
  int n;
  scanf("%d",&n);
  printf("%d",square(n));
  return 0;
}