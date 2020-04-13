package LearnerLab;

public class Student extends Person implements Learner {

    private Double totalStudyTime;

    public Student(String name, Long id) {
        super(name, id);
        totalStudyTime = 0.0;
    }

    public Student(){
        super(null, null);
        totalStudyTime = 0.0;
    }

    public void learn(double numberOfHours) {
        totalStudyTime+= numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
