//solution by Shivam Anand anandshivam44
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        String str[]=s.split("[^a-zA-Z]");
        int l=str.length;
        for(String i:str)
          {
              if(i.equals(""))
              l=l-1;
          }
        System.out.println(l);
        for(String i:str)
          {
              if(i.equals(""))
              continue;
              System.out.println(i);
          }
    }
}

