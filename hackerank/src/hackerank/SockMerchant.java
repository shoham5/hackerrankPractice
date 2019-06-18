package hackerank;

public class SockMerchant {

	static int sockMerchant(int n, int[] ar) {
/*
 * Given an array of integers representing the color of each sock,
 * determine how many pairs of socks with matching colors there are.
 * 
 * Input: 
 * 			n: the number of socks in the pile
			ar: the colors of each sock
   Output: A number represent the total number of matching pairs of socks
   
 */
		int histo[]=new int[101];
		int size = histo.length;
		int countSock=0;
		int tempCounter=0;
		for(int i=0 ;i <n ;i++) { 
			histo[ar[i]]++;

		}
		int i=1;
		while(i<size) {
			if(histo[i]>1) {			
				tempCounter= histo[i]/2;
				countSock+=tempCounter;
			}
			++i;
		}

		return countSock;


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,1,1,3,2,2,4,4,4,4};
		System.out.println(sockMerchant(10,arr));
		//System.out.println(5/2);
	}

}
