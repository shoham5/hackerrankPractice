package hackerank;

public class JumpingOnTheClouds {

	static int jumpingOnClouds(int[] c) {
		int size = c.length;
		int jump=0;
		int i=0;
		while((i+2)<size) { 
			if (c[i+2]==0) {
				i+=2;
				jump++;
			}
			else {
				i++;
				jump++;
			}
		}
		if (i<size-1) {
			jump++;
		}
			
	
	return jump;
}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	int arr[]={0,0,1,0,0,1,0}; // 4
	int arr1[]={0,0,0,0,1,0};  // 3 
	int arr2[]= {0,0,0,1,0,0}; //3
	int arr3[]= {0,0};
	System.out.println(jumpingOnClouds(arr));
	System.out.println(jumpingOnClouds(arr1));
	System.out.println(jumpingOnClouds(arr2));
	System.out.println(jumpingOnClouds(arr3));
	

}

}
