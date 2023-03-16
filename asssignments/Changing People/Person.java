/*
Jason Israilov
12/14/2016
3rd Hour, Mrs. Abel
Person Program
*/
public class Person
{
    private String name;
    private int age;

    public Person (String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void changeName (String newName)
    {
        name = newName;
    }

    public void changeAge( int newAge)
    {
        age = newAge;
    }

    public String toString()
    {
        return name + " - Age " + age;
    }

} // End of class
