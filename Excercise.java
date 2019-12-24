package Excercise;

public class Excercise {
	public static void main(String[] args) {
		String s="The quick brown fox jumps over the lazy dog";
		System.out.println(" ");
		System.out.println(s.charAt(12));
		  System.out.println("---------------------------------");
		if(s.contains("is"))
			System.out.println(s+" contains the substring is");
		else
			System.out.println(s+" does not contain the substring is");
		  System.out.println("---------------------------------");
	   String s2=s.concat(" and killed it");
	   System.out.println(s2);
	   System.out.println("---------------------------------");   
	  String[] words=s.split(" ",9);
	 // for (String word : words)
			//System.out.println(word);
	  if(s.equals(words[8]))
		  System.out.println("last words is dogs");
	  else
		  System.out.println("last word isn't dogs");
	   
	   
	   
	   System.out.println("---------------------------------");
	   if(s.equals("The quick brown Fox jumps over the lazy Dog"))
	   		System.out.println("equal");
	   else
		   System.out.println("not equal");
	   		
	   System.out.println("---------------------------------");
	   if(s.equals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"))
	   		System.out.println("equal");
	   else
		   System.out.println("not equal");
	   System.out.println("---------------------------------");
	   System.out.println(s.length());	
	   System.out.println("---------------------------------");
	   
	
	if(s.matches("The quick brown Fox jumps over the lazy Dog"))
		System.out.println("matches");
	else
		System.out.println("doesn't match");
	
	System.out.println("---------------------------------");
	   
	String s3=s.replaceFirst("The","A");
	System.out.println(s3);
	System.out.println("---------------------------------");
	
	int i=s.indexOf("fox");
	String str1=s.substring(0,i+3);
	String str2=s.substring(i+4);
	System.out.println(str1);
	System.out.println(str2);
	 i=s.indexOf("fox");
	 System.out.println("---------------------------------"); 
	 str1=s.substring(0,i+3);
      str2=s.substring(i+4);
	System.out.println(str1);
	System.out.println(str2);
	
	
	
	
	System.out.println("---------------------------------");
	
	String[] words2=s.split(" ",9);
	 for (String word : words2)
		 if(word.equals("dog"))
			 System.out.println(word);
		else if(word.equals("fox"))
			System.out.println(word);
		else if(word.equals("dogs"))
		 System.out.println(word);
	 System.out.println("---------------------------------");
		 System.out.println(s.toLowerCase());
		 System.out.println("---------------------------------");
		 
		 System.out.println(s.toUpperCase());
		 System.out.println("---------------------------------");
			
	for(int j=0;j<s.length();j++) {
		if(s.charAt(j)=='a')
			System.out.println(j);
		
	}
	System.out.println("---------------------------------");
	
	int ch=0;
	for(int k=0;k<s.length();k++) {
		if(s.charAt(k)=='e')
			ch=k;}
	
			System.out.println(ch);
			
	  
	
	}
	
 
}
