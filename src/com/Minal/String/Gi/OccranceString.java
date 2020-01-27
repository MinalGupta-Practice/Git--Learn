package com.Minal.String.Gi;

import java.util.HashMap;
import java.util.Map;

public class OccranceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="Programming";
		Map<Character ,Integer>map1 =new HashMap<Character ,Integer>();
		
		for(Character c: str.toCharArray())
		{
			if(map1.containsKey(c))
			{
				map1.put(c, map1.get(c)+1);
				}
			else
			{
				map1.put(c, 1);
			}
		}
		
		System.out.println(map1);

	}


}
