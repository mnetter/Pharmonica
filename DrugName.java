class DrugName{
	public static void main(String args[]){
		/*
			declare master array of string values i.e. AE, CK, L etc
				1. create all variants with loops and choose/ done
				1.5. Create groups-   
				2. decide index positions for groups/
					the output of SmartAllLetterCombos is good but
					a.eliminate UU, AA, II, YY  // MAYBE NOT// maybe yes
					b.first string can only use
						1.All single vowels
						2.All single consonants
						3.Only these double vowels:
							{"AE", "AI", "AU", "AY", "EA", "EI", "EO","EU", "IO", "OA", "OY", "UA", "YA", "YE", "YO", "YU"}
						4.Only these double consonants:
							{"BR","BL","BR","CH","CL","CR","DR","FL","FR","GH","GL","GR","HR","KH","KL","KN","KR","LH","MC","PH","PL","PR","QR","QX","RH","SC","SH","SK","SL","SM","SN","SP","SQ","SR","ST","SV","SW","TH","TR","TS","VH","VR","WH","WR","XH","XM","XN","XQ","XR","XS","ZH","ZL","ZR","ZT","ZV","ZW"}
						
					
						
					c.last string can only contain
						1.All single vowels  
						2.All single consonants
						3.All the double vowels except UU, AA, II, YY:
							{"AE","AI","AO","AU","AY","EA","EE","EI","EO","EU","EY","IA","IE","IO","IU","IY","OA","OE","OI","OO","OU","OY","UA","UE","UI","UO","UY","YA","YE","YI","YO","YU"}
						4.Only these double consonants:
							{"BB","BS","CC","CH","CK","DD","FF","FH","GG","GH","GL","HR","HQ","HR","HS","HT","HV","HX","HZ","JJ","KC","KK","KS","KT","KX","KZ","LB","LC","LD","LF","LG","LJ","LK","LL","LM","LN","LP","LQ","LS","LT","LV","LX","LZ","MJ","MK","MM","MP","MQ","MS","MX","MZ","NF","NG","NH","NJ","NK","NN","NP","NQ","NS","NT","NX","NZ","PH","PP","PS","PT","PZ","QH","QK","QQ","QS","QZ","RD","RF","RG","RH","RJ","RK","RL","RM","RN","RP","RQ","RR","RS","RT","RV","RX","RZ","SB","SC","SD","SF","SG","SH","SJ","SK","SL","SM","SP","SQ","SS","ST","SZ","TH","TS","TT","TZ","VG","VH","VJ","VS","VV","VZ","XH","XZ","ZG","ZH","ZJ","ZK","ZL","ZM","ZN","ZR","ZS","ZT","ZV","ZX","ZZ"} 
					
					d. the middle string can contain
						1.All single vowels
							{"A", "E", "I", "O", "U", "Y"}
						2.All single consonants
							{"B","C","D","F","G","H","J","K","L","M","N","P","Q","R","S","T","V","W","X","Z"}
						3.All the double vowels
							{"AA","AE","AI","AO","AU","AY","EA","EE","EI","EO","EU","EY","IA","IE","II","IO","IU","IY","OA","OE","OI","OO","OU","OY","UA","UE","UI","UO","UU","UY","YA","YE","YI","YO","YU",YY}
						4.All the double consonants
{"BB","CC","DD","FF","GG","HH","JJ","KK","LL","MM","NN","PP","QQ","RR","SS","TT","VV","WW","XX","ZZ"}



				3. create array of strings
				4. length of array is bound of random methods
				
			
			
			create function that randomly chooses length of drugname
	
			create function which creates drugname array, value are ints (indices of master array)
			
			create function which creates first string reference value
				1.chooses it randomly from range equalling length of master array
				
				2.populates drugname index 0 with first int
			
			create loop that spits out remaining ints and populates array
				1.chooses from master array
				2.compare to previous value with tests and populate array or start loop again
						tests
						a. single vowels can follow single vowels
						b. single vowels cant follow double vowels
						c. single vowels can follow single consonants
						d. single vowels can follow double consonants
						e. double vowels cant follow single vowels
						f. double vowels cant follow double vowels
						g. double vowels can follow single consonants
						h. double vowels can follow double consonants
						i. single consonants can follow double vowels
						j. single consonants cant follow double consonants
						k. single consonants can follow single vowels
						l. single consonants cant follow single consonants
						m. double consonants can follow double vowels
						n. double consonants cant follow double consonants
						o. double consonants can follow single vowels
						p. double consonants cant follow single consonants.
						q. The new string can't equal the previous string.
			print array to console
				loop through array
				  .50. index 0 is capitalized/  this may need to be outside of the loop
					1. the int value at drugname index i == the 
					   value of the index of the masterarray
					2. print the value of the masterarray at index in value
					3.loop till drugname.length is met  &
		
		*/
		
	
	}
}
