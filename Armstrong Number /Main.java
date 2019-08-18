#include <stdio.h>
int main() 
{
int no,num,rem,res=0,n=0;
  scanf("%d",&num);
 no=num;
  while(no!=0)
  {
    rem=no%10;
    res=res+rem*rem*rem;
    no=no/10;
  }
  if(res==num)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
  return 0;
}