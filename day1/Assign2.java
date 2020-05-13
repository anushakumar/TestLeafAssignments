package day1;

public class Assign2 {

	public static void main(String[] args) {
	    String input ="MALAYALAM";
		// String input ="Test Leaf";
	    int len =input.length();
	    char[] ch = input.toCharArray();
	    int count=0;
	    int j=len-1;
	    for(int i=0;i<(len/2);i++) 
	    {
	    if(ch[i]==ch[j])
	    {
	    count=count+1;
	    }
	    j=j-1;

	}
	    
	    if (count==len/2)
	    {System.out.println("Palindrome");}
	    else
	    {
	    	System.out.println("Not Palindrome");
	    }
	}
}
