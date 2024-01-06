package Abstract;

public class StudentB extends Marks{
    
    private double English;
    private double Maths;
    private double Chemistry;
    private double Zoology;

    public StudentB(double English, double Maths, double Chemistry, double Zoology){
        this.English = English;
        this.Maths = Maths;
        this.Chemistry = Chemistry;
        this.Zoology = Zoology;
    }

    @Override
    void getPercentage(){
        double marks = (English + Maths + Chemistry + Zoology) / 4;
        System.out.println("Student B Overall marks: " + marks + " out of 400");
    }
}
