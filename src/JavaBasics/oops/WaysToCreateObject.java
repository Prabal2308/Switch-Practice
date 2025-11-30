package JavaBasics.oops;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

class Test{
    void print(){
        System.out.println("Hello from Test");
    }
}

class Student{
    public Student(){
        //do nothing
    }

    void print(){
        System.out.println("Hello from Student");
    }
}

class Geeks implements Cloneable{
    String name = "GeeksforGeeks";

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Students implements Serializable{
    String name;

    public Students(String name){
        this.name = name;
    }

    public String toString(){
        return "Students: " + name;
    }
}

public class WaysToCreateObject {

    public static void main(String[] args) {
        Test t1 = new Test();
        t1.print();
        try{
            Class<?> c = Class.forName("JavaBasics.oops.Student");
            Student s = (Student) c.getDeclaredConstructor().newInstance();
            s.print();

            Geeks g1 = new Geeks();
            Geeks g2 = (Geeks) g1.clone();
            System.out.println(g1.name);
            System.out.println(g2.name);

        }catch(Exception e){
            e.printStackTrace();
        }

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"))){
            out.writeObject(new Students("John Doe"));
        } catch (Exception e){
            e.printStackTrace();
        }

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"))){
            Students s = (Students) in.readObject();
            System.out.println(s);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
