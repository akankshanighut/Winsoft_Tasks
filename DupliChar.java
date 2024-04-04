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
         //Take input from the user
        Scanner sc =new Scanner(System.in);  
        System.out.println("Enter the string is: ");
        String str1= sc.nextLine();
        int count;  
        //Converts given string into character array  
        char str[] = str1.toCharArray();            
        System.out.println("Duplicate characters in the given string: ");  
        //Counts each character present in the string  
        for(int i = 0; i <str.length; i++) 
        {  
            count = 1;  
            for(int j = i+1; j <str.length; j++) 
            {  
                if(str[i] == str[j] && str[i] != ' ') 
                {  
                    count++;  
                    //Set string[j] to 0 to avoid printing visited character  
                    str[j] = '0';  
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && str[i] != '0')  
                System.out.println(str[i]);  
        }  
    }  
}
