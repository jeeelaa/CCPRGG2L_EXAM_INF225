import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Recursion {


	//please bear with me, i have used eclipse as a compiler
	//i was having issues with running my codes in visual studio code
	
	    public static void main(String[] args) {
	        
	    	
	    String fullName = "anjiela vejar";

	         removeLetter(fullName);
	    }

	     static void removeLetter(String str) {
	    	 
	    	 String fullName = "anjiela vejar";
	    	 
		      String regex = "([^b/c/d/f/g/h/j/k/l/m/n/p/q/r/s/t/v/w/x/z])";
		      
		      
		      Pattern figure = Pattern.compile(regex);
		      
		      Matcher match = figure.matcher(fullName);
		      
		      StringBuffer sb = new StringBuffer();
		      
		      while (match.find()) {
		         match.appendReplacement(sb, "");
		      }
		      match.appendTail(sb);
		      System.out.println("Output Name :"+ sb.toString() );
	    
	    }
	}
