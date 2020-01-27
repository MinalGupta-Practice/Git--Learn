package com.Minal.String.Gi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NonRepeatingCharcterString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hahawer";
		
	
		
		
		Map<Character,Integer>map1 =new HashMap<>();
		
		
		
		for (int i =0; i<str.length(); i++)
		{
			Character ch = str.charAt(i);
			
			if(map1.containsKey(ch))
			{
				map1.put(ch, map1.get(ch)+1);
				
			}
			else
			{
				map1.put(ch, 1);
			}
		}
		
	for(int j =0; j<str.length();j++)
		{
			Character ch =str.charAt(j);
			
			if(map1.get(ch)==1)
			{
				System.out.println("first non repeat "   +ch);
				break;
			}
		}
	}
	}
	





