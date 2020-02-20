package com;

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str="abinaya";
		char[] ch=str.toCharArray();
		int i;
		for(i=str.length()-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}*/
		
		
		String str="abinaya";
		char[] ch=str.toCharArray();
		int i,j,len,num=0;
		char c=' ';
		len=str.length();
		for(i=0;i<len;i++)
		{
			if(c!=str.charAt(i))
			{
				c=str.charAt(i);
				num=1;
			    for(j=i+1;j<len;j++)
			   {
				if(str.charAt(j)==c)
				{
					num++;
				}
				
			}
			
			System.out.println(c+"="+num);
		}
		
		}
	}

}
