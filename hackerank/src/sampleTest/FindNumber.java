package sampleTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindNumber {
/*
 * check if  the given number  in the list.
 * Input: 
 * 			arr : array of integer
 * 			k : the number we should look for.
 * Output:A string "YES" if the number appeared
 * 					"NO" if not exist.
 */
	
	static String findNumber(List<Integer> arr, int k) {
		int arrSize=arr.size();
		if (arrSize==0) return "NO";
		if (arrSize==0) return "YES";
		for ( int i=0 ; i<arrSize ; i++) {
			if(k ==arr.get(i))  return "YES";
		}	
		return "NO";
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(bufferedReader.readLine().trim());
		int num;
		System.out.println("size"+size);
		List<Integer> ls = new ArrayList<Integer>();
		for(int i =1 ; i<=size ; i++) { 
			num = Integer.parseInt(bufferedReader.readLine().trim());
		ls.add(num);
			System.out.println("num"+i+":"+num);
		}
		int k=Integer.parseInt(bufferedReader.readLine().trim());
		System.out.println("k:"+k);
		System.out.println(ls.size());
		System.out.println(findNumber(ls,k));
		bufferedReader.close();

	}
}
