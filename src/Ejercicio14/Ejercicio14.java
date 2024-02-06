package Ejercicio14;

public class Ejercicio14 {
    public double physicsGrade;
    public double chemistryGrade;
    public double biologyGrade;
    public double mathGrade;
    public double computerScienceGrade;

    public Ejercicio14(double physicsGrade, double chemistryGrade, double biologyGrade, double mathGrade, double computerScienceGrade){
        this.biologyGrade = biologyGrade;
        this.physicsGrade = physicsGrade;
        this.chemistryGrade = chemistryGrade;
        this.mathGrade = mathGrade;
        this.computerScienceGrade = computerScienceGrade;
    }
    public double calculateAverage() {
        double sum = physicsGrade + chemistryGrade + biologyGrade + mathGrade + computerScienceGrade;
        return sum / 5;
    }
    public String getGrade() {
        double average = calculateAverage();
        if (average >= 0 && average <= 5.9) {
            return "Poor";
        } else if (average >= 6 && average <= 8) {
            return "Good";
        } else {
            return "Excellent";
        }
    }
}
