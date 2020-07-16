#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <time.h>
#include <unistd.h>

 
/*
1.you want to randomly choose an element
2.you need a random number generator
3.you need need to pass the random number as an argument to the 
3.function the print f




*/ 



int main() {
	int c, n;
	printf("Tem random numbers in [1,100]\n");
		srand(time(NULL));
	for(c=1; c <=10; c++){

		n =rand() %100 +1;
		printf("%d\n", n);
		//sleep(1);
	}


	return 0;
}
 
