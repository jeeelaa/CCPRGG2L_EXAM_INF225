package exam1;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// I HAVE USED ECLIPSE AS A COMPILER SINCE IM HAVING TROUBLE RUNNING MY CODES IN VISUAL STUDIO CODE, PLEASE BEAR WITH ME 
public class Recursion {


	    public static void main(String[] args) {
	        
	    	System.out.println("Input Name: ");
	    	 String fullName = "anjiela vejar";

	         removeLetter(fullName);
	     }

	     static void removeLetter(String str) {
	    	 Scanner sc = new Scanner(System.in);
		      String input = sc.nextLine();
		      String regex = "([^b/c/d/f/g/h/j/k/l/m/n/p/q/r/s/t/v/w/x/z])";
		      String constants = "";
		      
		      Pattern pattern = Pattern.compile(regex);
		      
		      Matcher matcher = pattern.matcher(input);
		      
		      StringBuffer sb = new StringBuffer();
		      
		      while (matcher.find()) {
		         matcher.appendReplacement(sb, "");
		      }
		      matcher.appendTail(sb);
		      System.out.println("Output Name :"+ sb.toString() );
	    	
	   
	    	 
	    	
	    }
	}

