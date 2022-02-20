import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
    
		int max=0,num;
        
        Scanner input= new Scanner(System.in);
        String str= input.nextLine();
        String[] words = str.split(" ");
        
        for (int i=0 ; i<words.length ; i++)
        { 
         
         num= words[i].length();
         if (num>max)
             max=num;      
        }
        System.out.println(max);
 
      System.out.println( Repeat("*",(max+4)));
       for (int i=0 ; i<words.length ; i++) {
           int x = max -words[i].length();
           System.out.println("* " + words[i]+ Repeat(" ", x) + " *");
       }
      System.out.println( Repeat("*",(max+4)));
        
    }
    public static String Repeat(String s, int n){
    String repeated = "";
    for(int i=0; i<n ; i++ )
    {
        repeated += s;
    }
    return repeated;
    }
		
	}
