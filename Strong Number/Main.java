#include <stdio.h>
int main() {
int num,no,rem,sum=0,i;
  long fact;
  scanf("%d",&num);
  no=num;
  while(no>0)
  {
    rem=no%10;
    fact=1;
    for(i=1;i<=rem;i++)
    {
      fact=fact*i;
    }
      sum=sum+fact;
      no=no/10;
    
  }
  if(sum==num)
  {
   
  printf("Yes");
  }
  else
  {
    printf("No");
  }
  return 0;
}