
#include<math.h>
#include<stdio.h>
int main()

{ 
	int n1,n2,q,r;
		printf("enter divident");
	scanf("%d",&n1);
		printf("enter deviser");
	scanf("%d",&n2);
      q=(n1/n2);
	r=(n1%n2);
printf("Remainder is %d",r);
printf("Quotient  is %d",q);

return 0;
}