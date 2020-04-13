package LearnerLab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable  {
    List<Person> personList = new ArrayList<>();

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(Long id){
        for(Person person: personList){
            if(person.getId().equals(id))
                return person;
        }
        return null;
    }

    public Boolean contains(Person person){
        for(Person person1: personList){
            if(person1.equals(person))
                return true;
        }
        return false;
    }

    public void remove(Person person){
        if(contains(person))
            personList.remove((int)getIndexOf(person));
    }

    public void remove(Long id){
        Person person = findById(id);
        if(person != null)
            personList.remove((int)getIndexOf(person));
    }

    private Integer getIndexOf(Person person) {
        for(int x = 0; x < personList.size(); x++){
            if(personList.get(x).equals(person))
                return x;
        }
        return -1;
    }

    public void removeAll(){
        personList.clear();
    }

    public Integer count(){
        return personList.size();
    }

    public Person[] toArray(){
        Person[] array = (Person[]) personList.toArray();
        return array;
    }


    public Iterator iterator() {
        return personList.iterator();
    }
}
