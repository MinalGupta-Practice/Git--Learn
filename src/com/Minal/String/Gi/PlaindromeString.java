package com.Minal.String.Gi;

public class PlaindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "haah";
		
		int start =0;
		int end =str.length()-1;
		
		boolean isPalindrome =true;
		
		while(start<end)
		{
			if(str.charAt(start)!=str.charAt(end))
			{
				isPalindrome =false;
				break;
				
			}
			start++;
			end--;
		}
		if (isPalindrome)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("NotPalindrome");
		}

	}

}
