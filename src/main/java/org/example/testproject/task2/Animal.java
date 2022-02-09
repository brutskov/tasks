package org.example.testproject.task2;

public class Animal {

    private final String type;
    private Integer age;

    public Animal(String type) {
        this.type = type;
    }

    public abstract eat();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if ("human".equals(type)) {
            throw new Exception("Unable to recognize the type");
        }
        this.type = type;
    }

    public String getAge() {
    }

    public void setAge(String age) {
    }
}
