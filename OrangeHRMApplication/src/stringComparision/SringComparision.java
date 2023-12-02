package stringComparision;

public class SringComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string1="LiveTech";
		String string2="Livetech";
		
	    if(string1.equals(string2))
	    {
	    	System.out.println(" String1 variable value is equals to string2 variable value");
	    	
	    	
	    }
	    else
	    {
	    	System.out.println(" String1 variable value is not equals to string2 variable value ");
	    }
		
		
	    System.out.println(" ########################################## ");
		System.out.println();
		
		String string3="LiveTech";
		String string4="Livetech";
		if(string3.equals(string4))
		{
			System.out.println(" string3 variable value is EQUAL to string4 variable value ");
		}
		else
		{
			System.out.println(" string3 variable value is NOT EQUAL to string4 variable value ");
		}
		

		System.out.println(" ########################################## ");

		
		
		String string5="LiveTech";
		String string6="livetech";
		
		if(string5.equalsIgnoreCase(string6))
		{
			System.out.println(" String5 variable is equals to string6 variable value");
			
		}
		else
		{
			System.out.println("  String5 variable is  NOT equals to string6 variable value ");
		}
		

		System.out.println(" ########################################## ");

		
		
		String string7="LiveTech";
		String string8="live";
		
		if(string7.equalsIgnoreCase(string8))
		{
			System.out.println(" String7 variable is equals to string8 variable value");
			
		}
		else
		{
			System.out.println("  String7 variable is  NOT equals to string8 variable value ");
		}
		
		
		System.out.println(" &&&&&&&&&&&&&&&&&&& ");

	   String string9="LiveTech";
	   String string10="Tech";
	   
	   if(string9.contains(string10));
	   {
		   System.out.println(" String9 Variable value contains string10 variable value ");
	   }
		
	   System.out.println(" &&&&&&&&&&&&&&&&&&& ");

	   String string11="LiveTech";
	   String string12="tech";
	   
	   if(string11.contains(string12))
	   {
		   System.out.println(" String11 Variable value contains string12 variable value ");
	   }
		
	   else
	   {
		   System.out.println(" String11 Variable value Not  contains string12 variable value ");
			     
	   }
	   
	   
	   System.out.println(" ***** String value converts to Upper Case ");
	   
	   String stringToUpperCase=string11.toUpperCase();
	   
	   
	   System.out.println(" The value of the string value string to upper case after coverting upper case is "+ stringToUpperCase);
	   
	   
	   System.out.println(" ***** String value converts to Lower Case ");
		
	   String stringToLowercase=string11.toLowerCase();
	   
	   System.out.println(" The value of the string11 value is converts into to Lower case is "+ stringToLowercase);
	   
	   
	   System.out.println("***** Finding the no of Characters in string ");
	   
	   int string11ChatacterLength=string11.length();
	   
	   System.out.println(" The Number of Chatacters in The string11 is " + string11ChatacterLength);
	   
	   System.out.println();
	   
	   char hello=string11.charAt(6);
	   
	   System.out.println(" Finding The Character of varisble string11 value is "+ hello);
	   
	   System.out.println(string11.charAt(6));
	   
	   System.out.println();
	   
	   
	   
	   String string13="livetech";
	   String string14="Livetech";
	   
	   int string13Length=string13.length();
	   int string14Length=string14.length();
	  
	   
	   
	   System.out.println(" The string13 value Length is "+ string13Length);
	   
	   System.out.println(" The string14 value Length is "+ string14Length);
		  
	   if(string13Length<string14Length)
	   {
		   System.out.println(" bhh");
	   }
	   
	   else
	   {
		   System.out.println(" bgg ");
		
	   }
	   
	   
	   String string15="livetech";
	   String string16="technology";
	   
	   int string15Length=string15.length();
	   int string16Length=string16.length();
	  
	   
	   
	   System.out.println(" The string13 value Length is "+ string15Length);
	   
	   System.out.println(" The string14 value Length is "+ string16Length);
		  
	   if(string15Length<string16Length)
	   {
		   System.out.println(" bhh");
	   }
	   
	   else
	   {
		   System.out.println(" bgg ");
	   }
	
	}
	

}
