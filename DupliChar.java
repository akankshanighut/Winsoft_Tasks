//Author:Akanksha Kailas Nighut
//Date: 4/4/2024
//Program:Print duplicate char in string.
//Input:Java Developer
/*Output:
Duplicate characters in the given string: 
a
v
e
*/

import java.util.*;
public class DupliChar
{  
     public static void main(String[] args) 
     {  
        Scanner sc =new Scanner(System.in);  
        System.out.println("Enter the string is: ");
        String str1= sc.nextLine();
        int count;  
          
        char str[] = str1.toCharArray();            
        System.out.println("Duplicate characters in the given string: ");  
        
        for(int i = 0; i <str.length; i++) 
        {  
            count = 1;  
            for(int j = i+1; j <str.length; j++) 
            {  
                if(str[i] == str[j] && str[i] != ' ') 
                {  
                    count++;  
                    
                    str[j] = '0';  
                }  
            }  
            
            if(count > 1 && str[i] != '0')  
                System.out.println(str[i]);  
        }  
    }  
}
