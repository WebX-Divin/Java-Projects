package Abstract;

public class Main {

    public static void main(String[] args) {
        StudentA marks = new StudentA(91, 72, 70);
        marks.getPercentage();
        StudentB markB = new StudentB(80, 70, 75, 100);
        markB.getPercentage();
    }
    
}
