package LearnerLab;

public class Person {

     final Long id;
     private String name;

     public Person(String name, Long id ){
         this.name = name;
         this.id = id;
     }

     public Long getId(){
         return  id;
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
