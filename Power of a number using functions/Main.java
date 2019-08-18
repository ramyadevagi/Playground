#include<stdio.h>
int main(){
int base,exponent;
  scanf("%d %d",&base,&exponent);
  printf("%d",power(base,exponent));
  return 0;
}
int power(int base,int exponent)
{
  int p=1;
  while(exponent>=1)
  {
    p=p*base;
    exponent--;
  }
  return p;
}