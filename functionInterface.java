import java.util.function.*;


class Student{
    int marks;
    String name;


    public Student(int marks , String name){
        this.marks = marks;
        this.name = name;
    }
}


public class functionInterface {
    public static void main (String[] args) {
       
        Student[] s = {
            new Student(100,"Divin"),
            new Student(91,"Anamika"),
            new Student(81,"Arjun"),
            new Student(71,"Riya"),
            new Student(61,"Sinamika")


        };


        Function<Student, String> f = s2 -> {
            int marks = s2.marks;


            String grade = " ";
            if(marks>90)
                grade = "A";
            else if(marks>80)
                grade = "B";
            else if(marks>70)
                grade = "C";
            else
                grade = "D";


            return grade;
        };


        for(Student s1:s){
            System.out.println("Name : " + s1.name);
            System.out.println("Marks : " +s1.marks);
            System.out.println("Grade : " +f.apply(s1));
            System.out.println("------------");
        }




   //  Function f = i ->i*i;
   //  System.out.println(f.apply(5));
   //  System.out.println(f.apply(9));


   //  Function f1 = s -> s.length();
   //  System.out.println(f1.apply("I am Human"));


   //  Function f2 = s->s.toUpperCase();
   //  System.out.println((f2.apply("I am Human")));
    }
}