
public class semiPalindrome {

	/*Background
A k semi-palindrome is defined as a string with 
exactly k pairs of letters that are not palindromic. 
Thus, the semi-palindromic number k quantifies how far 
any given string is from being a palindrome.

For example, abbccddeeccbba is 2 semi-palindromic since 
the "dd" does not coincide with the "ee." Likewise, 
bbbccddddccbba is 1 semi-palindromic since the first 
letter, "b" is not palindromic with the last letter "a."

According to this definition, a string comprised of n 
characters can be at most n/2 semi-palindromic.

Coding Exercise:

1. Write a program in C++ or Java that tests whether any given string is a palindrome.

2. Write a program in C++ or Java that inputs a string and outputs the semi-palindromic number.
*/
	
	public static int semiPalindromicNumber(String s){
		int semiPalindromicNumber=0;
		int n = s.length();
		
		for (int i=0; i<n/2; i++){
			if (s.charAt(i)!=s.charAt(n-i-1)){
				semiPalindromicNumber++;
			}
		}
		
		return semiPalindromicNumber;
	}
	
	public static boolean isPalindrome(String s){
		int n = s.length();
		for (int i=0; i<n/2; i++){
			if (s.charAt(i)!=s.charAt(n-i-1)){
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(isPalindrome("ASDFFDSA"));
		System.out.println(semiPalindromicNumber("ASDFFDSA"));
		
		System.out.println(isPalindrome("ASDFGFDSA"));
		System.out.println(semiPalindromicNumber("ASDFGFDSA"));
				
		System.out.println(isPalindrome("ASDGFDSA"));
		System.out.println(semiPalindromicNumber("ASDGFDSA"));
		
		System.out.println(isPalindrome("abbccddeeccbba"));
		System.out.println(semiPalindromicNumber("abbccddeeccbba"));
		
		System.out.println(isPalindrome("bbbccddddccbba"));
		System.out.println(semiPalindromicNumber("bbbccddddccbba"));

		
	}
	
	
	
}
