#include <stdio.h>
#include <stdlib.h>
#include <time.h>

char theArray[] = {'a', 'e', 'i', 'o', 'u'};


int main()
{

	srand(time(NULL));

	for(int i=0; i <10; i++){
		printf("%c", theArray[rand() % 5]);
		
	}
	printf("\n");
return 0;
}
