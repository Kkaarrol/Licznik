/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package licznik;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author karol
 */
public class Licznik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        {
      
        Scanner scanner = new Scanner(System.in);
        int n=0;
        System.out.println("Podaj separator: 0-spacja 1-m");
            n = scanner.nextInt();
        
        File f1 = new File("tekst.txt"); //Creation of File Descriptor for input file
        String[] words = null;    //Intialize the word Array
        int counter = 0;     //Intialize word count to zero
        FileReader fr = new FileReader(f1);    //Creation of File Reader object
        BufferedReader br = new BufferedReader(fr);    //Creation of BufferedReader object
        String s;
        while ((s = br.readLine()) != null) //Reading Content from the file
        {
            switch(n){
  case 1:
   words = s.split(" ");
   counter += words.length; 
    break;
  case 2:
    words = s.split("m");
    counter += words.length; 
    break;
  default:
     words = s.split(" ");
     counter += words.length; 
}
           // words = s.split(" ");   //Split the word using space
            //counter += words.length;   //increase the word count for each word
        }
        fr.close();
        //System.out.println("Wybrany separator to: ");
        System.out.println("Number of words in the file:" + counter);    //Print the word count

    }

}
}