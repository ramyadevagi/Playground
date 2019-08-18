  #include<stdio.h>
int main()
{
    int i,j,r,c,flag=0;
    scanf("%d %d", &r, &c);
    int a[r][c];
    for(i = 0; i < r; i++)
    {
        for(j = 0; j < c; j++)
        {
           scanf("%d", &a[i][j]);
        }
    }
  int b[r][c];
  for(i = 0; i < r; i++)
    {
        for(j = 0; j < c; j++)
        {
           scanf("%d", &b[i][j]);
        }
    }
  for(i = 0; i < r; i++)
    {
        for(j = 0; j < c; j++)
        {
if(a[i][j]!=b[i][j])
{
flag=1;
break;
}
        }
  }
  if(flag==0)
  printf("Yes");
  else
    printf("No");
}