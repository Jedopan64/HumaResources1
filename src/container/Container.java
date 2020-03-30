package container;

import person.Person;

import java.util.ArrayList;
import java.util.List;

public class Container<T extends Person>{

    private List<T> container = new ArrayList<>();

    public Container() {}

    public Container(List<T> listPerson) {
        container = listPerson;
    }

    public void add(T person) {
        container.add(person);
    }

    public int size() {
        return container.size();
    }

    public void print() {
        for (T t:container) {
            System.out.println(t.toString());
        }
    }
}
