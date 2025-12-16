
import java.util.Scanner;
public class miniProject1 {
    public static void main(String[] args) {
        String name1 = "Kavita";
        String name2 = "Jhansi";
        String name3 = "Mythri";
        int age1 = 20;
        int age2 = 19;
        int age3 =21;
        double marks1 = 97.4;
        double marks2 = 86.4;
        double marks3 = 95.5;
        double avgMarks = (marks1+marks2+marks3)/3;
        System.out.println("name"+"\t"+ "age"+"\t"+"marks");
        System.out.println("------------------");

        System.out.println(name1+"\t"+ age1+"\t"+marks1);
        System.out.println(name2+"\t"+ age2+"\t"+marks2);
        System.out.println(name3+"\t"+ age3+"\t"+marks3);
        System.out.println("------------------");
        System.out.println("The average marks of three students is: \n"+avgMarks);
//        Using Scanner:
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter Student 1 Details");
//        System.out.print("Name: ");
//        String name1 = sc.nextLine();
//        System.out.print("Age: ");
//        int age1 = sc.nextInt();
//        System.out.print("Marks: ");
//        double marks1 = sc.nextDouble();
//        sc.nextLine();
//        System.out.println("\nEnter Student 2 Details");
//        System.out.print("Name: ");
//        String name2 = sc.nextLine();
//        System.out.print("Age: ");
//        int age2 = sc.nextInt();
//        System.out.print("Marks: ");
//        double marks2 = sc.nextDouble();
//        sc.nextLine();
//        System.out.println("\nEnter Student 3 Details");
//        System.out.print("Name: ");
//        String name3 = sc.nextLine();
//        System.out.print("Age: ");
//        int age3 = sc.nextInt();
//        System.out.print("Marks: ");
//        double marks3 = sc.nextDouble();
//        double average = (marks1 + marks2 + marks3) / 3;
//        System.out.println("\n----- Student Details -----");
//        System.out.println("Student 1");
//        System.out.println("Name  : " + name1);
//        System.out.println("Age   : " + age1);
//        System.out.println("Marks : " + marks1);
//
//        System.out.println("\nStudent 2");
//        System.out.println("Name  : " + name2);
//        System.out.println("Age   : " + age2);
//        System.out.println("Marks : " + marks2);
//
//        System.out.println("\nStudent 3");
//        System.out.println("Name  : " + name3);
//        System.out.println("Age   : " + age3);
//        System.out.println("Marks : " + marks3);
//
//        System.out.println("\nAverage Marks = " + average);
//
//        sc.close();
    }
}

