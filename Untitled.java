import java.io.*;
import java.util.Scanner;
class Untitled
{
	public static void main(String args[])
	{
		readFromFile("sss.txt");
	}
	public static void readFromFile(String file)
		{
			String str = " " ;
			String letter = " " ;
			StringBuilder result = new StringBuilder();
		try
	{
			File f = new File(file);
			Scanner s = new Scanner(f);
		while(s.hasNextLine())
		{	
			str=s.nextLine();
		for(int i = 0; i < str.length(); i++)
		{  
			if(Character.isLowerCase(str.charAt(i))) 
			{    
			letter = String.valueOf(str.charAt(i)); 
			result.append(letter.toUpperCase());
			}
			else if(Character.isUpperCase(str.charAt(i))) 
			{   
			letter = String.valueOf(str.charAt(i));
			result.append(letter.toLowerCase());  				
			}
			else
			{
			result.append(str.charAt(i));
			}
		}
			System.out.println(result);
			result.setLength(0);
	    }
	}
			catch(FileNotFoundException e)
			{
			System.out.println("file not found");
			}
			catch(Exception e)
			{
			e.printStackTrace();
			}
		}
}

		
	
	


