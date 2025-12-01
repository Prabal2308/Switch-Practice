package JavaBasics.oops.abstraction;

abstract class Subject{
    private final String subjectName;

    Subject(){
        this.subjectName = "Information Technology";
        System.out.println("Creating a Subject");
    }

    abstract void syllabus();

    void learn(){
        System.out.println("Learning right now");
    }
}

class IT extends Subject{
    void syllabus(){
        System.out.println("C , Java , C++");
    }
}
public class GFGClass {

    public static void main(String[] args) {
        Subject subject  = new IT();

        subject.syllabus();
        subject.learn();
    }
}
