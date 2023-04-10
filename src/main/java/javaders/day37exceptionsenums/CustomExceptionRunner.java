package javaders.day37exceptionsenums;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomExceptionRunner {

    /*
       1)"try" kullandigimizda her senaryo icin calismasini istediigimiz kodlari "finally block" icine koyariz.
       2)"final", "finally", "finalize" aciklar misiniz?
          "final" aciklandi.
          "finalize" aciklandi.
          "finalize" : Garbage Collector memory'yi temiz tutmak icin surekli memory'yi tarar ve silinmesi gerekenleri siler.
                       Garbage Collector silmeden once silecegi datalari finalize eder sonra siler.
     */
    public static void main(String[] args) throws IllegalGradeException {

        //System.out.println(getGrades());

        try {
            printAge(-45);

        } catch (IllegalAgeException e) {
            System.out.println(e.getMessage());
        }finally{  //finally block exception olsa da calisiyor olmasa da.
            System.out.println("I always work");
        }
        //Her senaryo icin calismasini dusundugumuz code'lari finally icine koyarsaniz Java o kodu
        //exception olsada calistirir olmasa da.
    }

        //Example 1: Ogrenci notlarini bir List'e ekleyen method'u olusturunuz
        public static List<String> getGrades () throws IllegalGradeException {

            List<String> grades = new ArrayList<>();
            String grade = "";

            Scanner input = new Scanner(System.in);

            do {
                System.out.println("Please enter the grade. To stop entering press q.");
                grade = input.next();  //burdaki grade String

                int intGrade = 0;

                if (!grade.equals("q")) {
                    intGrade = Integer.valueOf(grade);  //Burda grade'i int a cevirdi
                }

                if (grade.equals("q")) {
                    break;
                } else if (intGrade >= 0 && intGrade <= 100) {
                    grades.add(grade);
                } else {
                    throw new IllegalGradeException("Grades less than zero and greater than 100 are not valid.");
                }

            } while (!grade.equals("q"));

            return grades;
        }

        //Example 2: Kullanicinin yasini console'a yazdiran method'u olusturunuz.
        public static void printAge ( int age){
            if (age < 0) {
                throw new IllegalAgeException("Ages cannot be negative");
            }
            System.out.println(age);
        }

    }

