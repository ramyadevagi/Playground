#include<stdio.h>
int main()
{
    int i,j,r,c;
    scanf("%d %d", &r, &c);
    int matrix[r][c];
    for(i = 0; i < r; i++)
    {
        for(j = 0; j < c; j++)
        {
           scanf("%d", &matrix[i][j]);
        }
    }   
  for(i = r-1; i >=0; i--)
    {
        for(j = 0; j <= c-1; j++)
  
        {
            printf("%d ", matrix[j][i]);
        }
    printf("\n");
  }
    }