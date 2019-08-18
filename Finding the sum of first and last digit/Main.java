#include <stdio.h>
int main() {
int n,l,f,s;
  scanf("%d",&n);
  l=n%10;
  while(n>=10)
  {
    n=n/10;
  }
  s=l+n;
  printf("%d",s);
  return 0;
}