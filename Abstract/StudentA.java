package Abstract;

public class StudentA extends Marks {
    
    private double Maths;
    private double Chemistry;
    private double Computer;

    public StudentA(double Maths, double Chemistry, double Computer){
        this.Maths = Maths;
        this.Chemistry = Chemistry;
        this.Computer = Computer;
    }

    @Override
    void getPercentage(){
        double marks = (Maths + Chemistry + Computer) / 3;
        System.out.println("Student A Overall Marks: " + marks + " out of 300");
    }
    
}
