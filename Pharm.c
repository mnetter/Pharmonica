#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>

char Array[]={'a', 'e', 'i', 'o', 'u', 'b', 'c', 'd', 'f', 'g'};

int main(){

	srand(time(NULL));
	
	for(int i=0; i<10; i++){
	
		//if(i % 2 != 0){
		//printf("%c", Array[rand() % 4]);
		//printf(" even %d ", i);
		/*}
		else */ 
		
 		int num =(rand() % (10-(5+1))+5);
		printf("%c", Array[num ]);
				//printf(" odd %d ", i);
	}
	printf("\n");


return 0;
}

/* here the solution

num = (rand() % (upper – lower + 1)) + lower

*/
