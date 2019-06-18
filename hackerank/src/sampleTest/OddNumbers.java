package sampleTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class OddNumbers {

	/*
	 * find the odd numbers between the range (l,r)
	 */
	 static List<Integer> oddNumbers(int l, int r) {
		 ArrayList<Integer> ansInt = new ArrayList<Integer>();
		 int first=Integer.MIN_VALUE;
		 if ((l & 1)==1)  first =l;
		 else first+=1;
		 for ( int i= first ; i<=r ;i=i+2) {
			 ansInt.add(i);
	    }
		return ansInt;
	 }

	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int l = Integer.parseInt(bufferedReader.readLine().trim());

	        int r = Integer.parseInt(bufferedReader.readLine().trim());

	        List<Integer> res = oddNumbers(l, r);
/*
	        for (int i = 0; i < res.size(); i++) {
	            bufferedWriter.write(String.valueOf(res.get(i)));

	            if (i != res.size() - 1) {
	                bufferedWriter.write("\n");
	            }
	        }

	        bufferedWriter.newLine();
*/
	        bufferedReader.close();
	        //bufferedWriter.close();
	    }
}
