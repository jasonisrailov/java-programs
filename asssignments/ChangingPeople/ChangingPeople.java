/*
Jason Israilov
12/14/2016
3rd Hour, Mrs. Abel
ChangingPeople Program
*/
public class ChangingPeople
{
    public static void main(String[] args)
    {
        Person person1 = new Person("Sally", 13);
        Person person2 = new Person("Sam", 15);

        int age = 21;
        String name = "Jill";

        System.out.println("Value before Changing People");

        System.out.println("person1:" + person1);
        System.out.println("person2:" + person2);
        System.out.println("age:" + age + " - name " + name);

        //changingPeople(person1, person2,age, name);
        changingPeoplev2(person1, person2,age, name);

        System.out.println("Value after Changing People");

        System.out.println("person1:" + person1);
        System.out.println("person2:" + person2);
        System.out.println("age:" + age + " - name " + name);
    } //End of main

    public static void changingPeople(Person p1, Person p2, int age, String name)
    {
        System.out.println("\nInside changingPeople... Original Parameters");

        System.out.println("Person 1:" + p1);
        System.out.println("Person 2:" + p2);
        System.out.println("age:" + age + "\tname " + name + "\n");

         //make changes here
        Person p3 = new Person(name, age);
        p2 = p3;

        name = "Jack";
        age = 101;

        p1.changeName(name);
        p1.changeAge(age);

        System.out.println("\nInside changePeople... with new changed values");

        System.out.println("Person 1:" + p1);
        System.out.println("Person 2:" + p2);
        System.out.println("age:" + age + "\tname " + name + "\n");

    }

    public static void changingPeoplev2(Person p1, Person p2, int age, String name)
    {
        System.out.println("\nInside changingPeople... Original Parameters");

        System.out.println("Person 1:" + p1);
        System.out.println("Person 2:" + p2);
        System.out.println("age:" + age + "\tname " + name + "\n");


        p2.changeName(name);
        p2.changeAge(age);

        name = "Jack";
        age = 101;

        p1.changeName(name);
        p1.changeAge(age);

        System.out.println("\nInside changePeople... with new changed values");

        System.out.println("Person 1:" + p1);
        System.out.println("Person 2:" + p2);
        System.out.println("age:" + age + "\tname " + name + "\n");

    }
} // End of class
