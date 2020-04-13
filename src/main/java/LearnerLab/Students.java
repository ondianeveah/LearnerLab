package LearnerLab;

public final class Students extends Person {
    final static private Students INSTANCE = new Students();


    public Students(String name, Long id) {
        super(name, id);
    }
}
