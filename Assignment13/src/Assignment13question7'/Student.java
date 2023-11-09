package Question7;

import java.util.Objects;
import java.util.Scanner;

public class Student
{
    public Scanner sc=new Scanner(System.in);
    private String name;
    private int roll;
    private int age;

    public Student(String name, int roll, int age) {
	super();
	this.name = name;
	this.roll = roll;
	this.age = age;
    }

    public Student() {
	super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void accept()
    {
	System.out.println("Enter name: ");
	setName(sc.next());
	System.out.println("Enter roll: ");
	setRoll(sc.nextInt());
	System.out.println("Enter age: ");
	setAge(sc.nextInt());
    }


    
    
    
    @Override
    public int hashCode() {
	return Objects.hash(getRoll());
    }

    @Override
    public String toString() {
	return "name=" + name + ", roll=" + roll + ", age=" + age;
    }
}