package ru.javalang.item00;

public class Company {
    private String name;

    public Company() {
        this.name = "NanoSoft";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                '}';
    }
}
