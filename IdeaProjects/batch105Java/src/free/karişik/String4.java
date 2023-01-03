package free.karişik;

import java.util.Locale;

public class String4 {
      public static void main(String args[]){
          String s1="hello";
          String s2="HELLO";
          String s3="hi";
          System.out.println(s2.equalsIgnoreCase(s3));   // returns true
          System.out.println(s3.equalsIgnoreCase(s2));   // returns false
          }
      }