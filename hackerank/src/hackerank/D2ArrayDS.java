package hackerank;

public class D2ArrayDS {

	static int hourglassSum(int[][] arr) {
		int max=-63;
		int tempSum;
		for(int i=0 ; i<arr.length-2 ; i++) { 
			for(int j=0 ; j<arr[0].length-2;j++) {

				tempSum= arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
				if(tempSum>max) max = tempSum;
			}
		}
return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][]= {{-9,-9,-9,1,1,1},{0,-9,0,4,3,2},{-9,-9,-9,1,2,3},{0,0,8,6,6,0},{0,0,0,-2,0,0},{0,0,1,2,4,0}};
	System.out.println(hourglassSum(mat));
	}

}
