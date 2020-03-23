package com.example.springboottest.Entity;

public class lageEntity {
    private String name;
    private String age;
    public lageEntity() {
    }
    public lageEntity(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "lageEntity{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
