package com.Minal.String.Gi;

import java.util.HashSet;
import java.util.Set;

public class LongestStringWithoutRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str  = "abcabcdv";
		
	int len = longestStringWithoutRepeat(str);
		
	System.out.print("len "  +  len);

	}
	
	public static int longestStringWithoutRepeat (String str)
	{
		int maxCount =0;
		int i =0;
		int j =0;
		int strl =str.length();
		
		Set<Character> s1 = new HashSet<>();
		
		while(i <strl && j<strl)
		{
			if(!s1.contains(str.charAt(j)))
			{
				s1.add(str.charAt(j));
				j++;
				maxCount =Math.max(maxCount, j-i);
			}
			else
			{
				s1.remove(str.charAt(i));
				i++;
			}
		}
		return maxCount;


}
}
