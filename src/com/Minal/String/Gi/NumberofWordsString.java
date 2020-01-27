package com.Minal.String.Gi;

public class NumberofWordsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java programming question";
		//System.out.println(str.split("\\s+").length);
		System.out.println(countWord(str));

	}  
	private static int countWord(String str)
	{
		int wordCount =1;
		for(int i =0; i<str.length();i++)
		{
			if(str.charAt(i) == ' ' && i<str.length()-1 && str.charAt(i+1)!=' ')
			{
				wordCount++;
			}
		}
		return wordCount;
	}

}
