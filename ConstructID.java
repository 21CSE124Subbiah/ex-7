/*
Write an application that prompts a user for a full name and street address and 
constructs an ID, from  the  user’s  initials  and  numeric  part  of  the  
address.  For  example, the  user  William  Henry, Harrison who lives at 34 Elm
would have an ID of WHH34, whereas user Addison Mitchell who, lives at 1778 
Monroe would have an ID of AM1778. Save the file as ConstructID.java 
 */
package constructid;

import java.util.Scanner;



/**
 *
 * @author test05
 */
public class ConstructID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner obj=new Scanner(System.in);
      Id obj1=new Id();
      System.out.println("Enter no of people");
      int n=obj.nextInt();
      int i;
      for(i=0;i<n;i++)
      {
          obj1.getdata();
          obj1.contruct();
      }
        
    }
    
}
class Id
{
    Scanner obj=new Scanner(System.in);
    String name;
    String address;
    
    void getdata()
    {
    System.out.println("Enter your full name");
    name=obj.nextLine();
    System.out.println("Enter your Address");
    address=obj.nextLine();
    }

    void contruct()
    {
        String FL =" ";
        String NUM ="";
        String namesplit[]=name.split(" ");
        for(String s:namesplit)
        {
            FL+=Character.toUpperCase(s.charAt(0));
        }
        char ad[]=address.toCharArray();
        for(char s1:ad)
        {
            if(Character.isDigit(s1))
            {
                NUM+=s1;
            }
        }
        System.out.println("ID-->:"+FL+NUM);
    }
}
