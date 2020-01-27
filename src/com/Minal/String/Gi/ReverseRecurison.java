package com.Minal.String.Gi;

public class ReverseRecurison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="object";
		String revStr = reverse(str);
		System.out.print(revStr);

	}

	private static String reverse (String str)
	{
		if(str ==null || str.length() <=1)
		{
			return str;
		}
		return reverse(str.substring(1))+str.charAt(0);
		
	}
}
