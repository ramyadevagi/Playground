
// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
#include<string.h>
// Main function
int main()
{
char str[20];
  int stat[26];
  int i,off;
  gets(str);
  for(i=0;i<=25;i++)
  {
    stat[i]=0;
  }
  int len=strlen(str);
  for(i=0;i<len;i++)
  {
    if(str[i]>='a'&&str[i]<='z')
    {
      off=str[i]-'a';
      stat[off]++;
    }
     if(str[i]>='A'&&str[i]<='Z')
    {
      off=str[i]-'A';
      stat[off]++;
    }
  }
  for(i=0;i<=25;i++)
  {
    if(stat[i]!=0)
  
    {
      printf("%c%d ",i+'a',stat[i]);
    }
  }
  return 0;
}
  