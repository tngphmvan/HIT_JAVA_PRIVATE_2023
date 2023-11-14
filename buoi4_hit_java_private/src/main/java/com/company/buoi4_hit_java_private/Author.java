
package com.company.buoi4_hit_java_private;


public class Author {
    private String name;
    private String email;
    private String gender;
    private int age;

    public Author(String name, String email, String gender, int age) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author{" + "name=" + name + ", email=" + email + ", gender=" + gender + ", age=" + age + '}';
    }
       
}
