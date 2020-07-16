#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

char array[]= {'A', 'E', 'I', 'O', 'U', 'Y', 'B', 'X', 'K', 'L', 'P'};

 

int main(int argc, char argv[]){

	srand(time(NULL));
	
	for(int i=0; i<15; i++){
	
	if(i % 2 ==0)
	printf("%c", array[rand() % 5]);
	else {

	int n = rand()%(10-5)+ 5;
	printf("%c", array[n]);
	}
	}
	printf("\n");
	


	return 0;
	
}
