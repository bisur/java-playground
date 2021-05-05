package com.galvanize;

public class Program {
    public static void main(String[] args) {
        boolean isItTrue = false;

        if (isItTrue) {
            System.out.println("It is true.");
        } else {
            System.out.println("It is not true.");
        }

        System.out.println("It works!!");

       System.out.println(isActive("active"));
       System.out.println(grade(79));




    }
   public static boolean isActive(String status) {
        // Implement your solution
       return status.equals("active");
    }

   public static String grade(int input) {


        // Implement your solution
      if(input>=0) {
          if (input <= 59) {
              return ("F").toUpperCase();
          } else if (input <= 69) {
              return ("D").toUpperCase();
          } else if (input <= 79) {
              return ("c").toUpperCase();
          } else if (input <= 89) {
              return ("B").toUpperCase();
          } else {
              return ("a").toUpperCase();
          }
      }else{
          return("Input should be positive");
      }

    }

}
