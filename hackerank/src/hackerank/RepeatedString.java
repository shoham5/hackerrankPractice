package hackerank;

public class RepeatedString {
	static long repeatedString(String s, long n) {
		if (s=="a") return n;
int size = s.length();
long reminder = n%(long)size;
long rept =n/size;
long counter=0;

for ( int i=0; i<size ; i++) { 
	if(s.charAt(i)=='a') counter++;
}
counter=counter*rept;
for ( int i=0 ;i<reminder ; i++) {
	if(s.charAt(i)=='a') counter++;
}
return counter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "aba";
System.out.println(repeatedString(s, 10));
String s1="a";
System.out.println(repeatedString(s, 10));
String s2="a";
	
	}

}
