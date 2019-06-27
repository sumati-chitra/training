import java.io.*;
import java.util.Scanner;
class Swapcase{
	public static void main(String args[]){
		String name=args[0];
		readFromFile(name);
	}
	public static void readFromFile(String file){
		String input = " " ;
		String letter = " " ;
		StringBuilder result = new StringBuilder();
		try{
			File File = new File(file);
			Scanner scan = new Scanner(File);
			while(scan.hasNextLine()){
				input=scan.nextLine();
				for(int i = 0; i < input.length(); i++){
					if(Character.isLowerCase(input.charAt(i))){
						letter = String.valueOf(input.charAt(i));
						result.append(letter.toUpperCase());
						}
						else if(Character.isUpperCase(input.charAt(i))){
							letter = String.valueOf(input.charAt(i));
							result.append(letter.toLowerCase());
							}
							else{
								result.append(input.charAt(i));
								}
								}
								System.out.println(result);
								result.setLength(0);
								}
								}
								catch(FileNotFoundException e){
									System.out.println("file not found");
									}
									catch(Exception e){
										e.printStackTrace();
										}
										}
}

		
	
	


