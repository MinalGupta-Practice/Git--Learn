package com.Minal.String.Gi;

public class ReverseWordString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="Java Programming";
		
		//[java ,programming]
		String[]words= str.split(" ");
		String revString =" ";
		
		for(int i =0; i<words.length; i++)
		{
			String word =words[i];
			String revWord ="";
			
			//Java
			for(int j= word.length() -1; j>=0; j--)
			{
				revWord =revWord +word.charAt(j);
			}
			revString =revString +revWord +" ";
		}
		System.out.println(str);
		System.out.println(revString);

	}

}
