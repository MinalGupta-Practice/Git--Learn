package com.Minal.String.Gi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateCharcterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "programming";
		printDuplicateSet(str);
		//printDuplicate(str);
	}
		
		public static void printDuplicate(String str)
		{
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
		map1.forEach((k , v)-> {
			if(v>1)
			{
				System.out.println(k);
			}
			
		});

	}
	
	
	public static void printDuplicateSet(String str)
	{
		Set <Character> set =new HashSet <>();
		for(int i =0; i<str.length();i++)
		{
			Character ch =str.charAt(i);
			if(set.contains(ch)){
			System.out.println(ch);
			}
			else{
				set.add(ch);
			}
		}
	}
	}
	


