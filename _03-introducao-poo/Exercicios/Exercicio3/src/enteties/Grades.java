package enteties;

public class Grades {
    public double grade1,grade2,grade3;
    public String name;
    public double finalGrade() { return grade1 + grade2 + grade3;}
    public double missing(){
        if(finalGrade() < 60.0){
            return 60 - finalGrade();
        } else {
            return 0.0;
        }
    }
}

