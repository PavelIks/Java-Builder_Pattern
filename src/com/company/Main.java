package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Person person = new PersonBuilderIMpl()
                .setName("Test")
                .setAge(22)
                .build();
        person.print();
    }
}

class Person
{
    String name;
    int age;
    public void print()
    {
        System.out.println(name + ", " + age);
    }
}

interface PersonalBuilder
{
    PersonalBuilder setAge(int age);
    PersonalBuilder setName(String name);
    Person build();
}

class PersonBuilderIMpl implements PersonalBuilder
{
    Person person = new Person();

    @Override
    public PersonalBuilder setName(String name)
    {
        person.name = name;
        return this;
    }

    @Override
    public PersonalBuilder setAge(int age)
    {
        person.age = age;
        return this;
    }

    @Override
    public Person build()
    {
        return person;
    }
}