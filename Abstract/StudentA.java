package Abstract;

public class StudentA extends Marks {
    
    private double subject1;
    private double subject2;
    private double subject3;

    public StudentA(double subject1, double subject2, double subject3){
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    void getPercentage(){
        double marks = (subject1 + subject2 + subject3) / 3;
        System.out.println(marks);
    }
    
}
