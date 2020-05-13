package day1;

public class Assign1 {

	public static void main(String[] args) {
		String input ="YOU HAVE NO CHOICE OTHER THAN FOLLOWING ME";
		char ch[]=input.toCharArray();
		int len=input.length();
		int count=0;
		for(int i=0;i<len;i++)
		{
		if (ch[i]=='O')
		{
		count=count+1;	
		}
		}
	System.out.println(count);
	}

}
