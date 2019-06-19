package hackerank;

import java.util.Stack;

public class CountingValleys {

	/*
	 *
	 * Given A sequence of up and down steps,
	 * find and print the number of valleys.
	 * The sequence start at sea level ,and ends at sea level.
	 * valley means a sequence of steps below sea level.  
	 *  Input :
	   			n: the number of steps 
	   			s: a string describing the path
	   	Output: number of valleys
	 */ 

	static int countingValleys(int n, String s) {
		int counterStep=0;
		int valleysCounter=0;
		boolean flgSeaLevel =false; 
		for (int i=0 ; i<s.length();i++) {
			if(s.charAt(i)=='U') {
				counterStep++;
			}
			else if (s.charAt(i)=='D'){
				counterStep--;
				if(counterStep<0&&flgSeaLevel==false) {
					flgSeaLevel=true;
				}
			}
			if(flgSeaLevel&&counterStep==0) {
				valleysCounter++;
				flgSeaLevel=false;
			}
		}
		return valleysCounter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "UDDDUDUU";
		System.out.println(countingValleys(8,s));
		String s1 = "UDDDUDUU";
		System.out.println(countingValleys(8,s));
	}

}
