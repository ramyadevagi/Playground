// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED

#include <stdio.h>
#include<string.h>
 
int main()
{
   char str[100];
   int i,off, stat[26] ;
  for(i=0;i<=25;i++) 
  {
    stat[i]=0;
  }
  gets(str);
int len=strlen(str);
 
 
for(i=0;i<len;i++) {
  
 
      if (str[i] >= 'a' && str[i] <= 'z') {
          off= str[i] - 'a';
         stat[off]++;
      }
    else if (str[i] >= 'A' && str[i] <= 'Z') {
          off= str[i] - 'A';
         stat[off]++;
      }
   
   }

   
    
     for(i=0;i<26;i++)
     {
         if(stat[i] == 0)
         {
             printf("%c ", i + 'a');

         }
     }


   return 0;
}









