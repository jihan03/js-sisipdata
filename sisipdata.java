public class sisipdata { 
	public static void main(String[]args) {
		
	int[] A = {3,4,5,6,7,8};
	int i=0,j=0,key=0; 

	for (j=2; j<6; j++) { 
		key = A[j]; 
		i = j-1; 
		
		while ((i > 1) && (A[i] > key)) { 
			A[i+1] = A[i]; 
			i=i-1; 
		} 
		A[i+1] = key; 
	} 
	
	for(i=0; i<6; i++){ 
		System.out.print(A[i]+" ");
		}
	}

}