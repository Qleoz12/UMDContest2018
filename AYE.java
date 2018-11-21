/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author BOG-A404-E-008
 */
public class AYE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        String[][] anss= new  String[test][2];
        for (int i = 0; i < test; i++)
        {      
            sc = new Scanner(System.in);
            int numerodepalabras = sc.nextInt();
            sc = new Scanner(System.in);
            String line = sc.nextLine();
            
            anss[i][0]=""+numerodepalabras;
            anss[i][1]=line;       
            
        }
        for (int i = 0; i < test; i++)
        {
                if(validateInt(Integer.parseInt(anss[i][0])) && validateWords(Integer.parseInt(anss[i][0]),anss[i][1]) && validateWordslenght(anss[i][1]) && validateHaveEnglish(anss[i][1]))
                {
                    anss[i][1]=fixline(anss[i][1]);
                }
                

          
        }
        
          for (int i = 0; i < test; i++)
            {
                System.out.println(anss[i][1]);
            }
        
    }
    
    public static String fixline(String line)
    {
       return  new StringBuilder(line).reverse().toString();
    }
    
     public static Boolean validateInt(int var)
    {
        
       if(var<1 && var>100)
       {
           return false;
       }
       else
       {
           return true;    
        }
    }
     
     
     public static Boolean validateWords(int var, String word)
    {
        String[] words = word.split("\\s+");
       if(var!= words.length)
       {
           return false;
       }
       else
       {
           return true;    
        }
    }
     
    public static Boolean validateWordslenght(String word)
    {
       String[] words = word.split("\\s+");
       for (int i = 0; i < words.length; i++) 
        {  
            if(word.length()>10 && word.length()<1)
            {
                return false;
            }
            else
            {
                   
             }
        }
       return true;
    }
    
    public static Boolean validateHaveEnglish(String input)
    {
        
        String[] words = input.split("\\s+");
        ArrayList<String> wordsE = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) 
        {
            if(!words[i].contains("#"))
            {
                wordsE.add(words[i]);
            }
        }
        Boolean ans=false;
        for (int i = 0; i < wordsE.size(); i++) 
        {
                    char currentCharacter;
                    boolean numberPresent = false;
                    boolean upperCasePresent = false;

                    for (int j = 0; j < wordsE.get(i).length(); j++) 
                    {
                        currentCharacter = wordsE.get(i).charAt(j);
                        if (Character.isDigit(currentCharacter)) {
                            return false;
                        } else if (Character.isUpperCase(currentCharacter)) {
                            return false;
                        } 
                        
                    }
                    
                    ans=true;
                    break;
        }
        return ans;
    }
    
    
    
}
