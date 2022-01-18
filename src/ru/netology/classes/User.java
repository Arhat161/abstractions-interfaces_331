package ru.netology.classes;

public abstract class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "name = <" + name + ">";
    }

}
