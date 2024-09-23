package FunctionalInterface;

import java.util.function.Function;
import java.util.function.Predicate;

public class Student {
    private int marks;
    private String name;

    Student (String name,int marks){
        this.name=name;
        this.marks=marks;
    }
    public static void main(String [] args){
        Student[] st={(new Student("Sachin",80)),
                new Student("Saket",70),
                new Student("Ashish",50),
                new Student("Shanu",30),
                new Student("Perwez",40)};
        Function<Student,String> fs=(s1)->{
            int marks=s1.marks;
            if(marks>=60) return "A";
            else if(marks>=50) return "B";
            else if (marks >=40) return "C";
            else return "F";
        };
        for(Student s : st){
            System.out.println("Name :"+s.name);
            System.out.println("Marks :"+s.marks);
            System.out.println("Grade :"+fs.apply(s));
            System.out.println();
        }

        Predicate<Student>pd=s2->s2.marks>60;
        for(Student s: st){
            if(pd.test(s))
            {
                System.out.println("Name :"+s.name);
                System.out.println("Marks :"+s.marks);
                System.out.println("Grade :"+fs.apply(s));
            }
        }
    }
}
