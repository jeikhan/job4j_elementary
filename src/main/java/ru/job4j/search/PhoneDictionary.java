package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person list : persons) {
            if (
                    list.getName().contains(key)
                            || list.getSurname().contains(key)
                            || list.getAddress().contains(key)
                            || list.getPhone().contains(key)
            ) {
                result.add(list);
            }
        }
        return result;
    }
}