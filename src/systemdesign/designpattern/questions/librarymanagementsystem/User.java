package systemdesign.designpattern.questions.librarymanagementsystem;

abstract class User{
    private String id;
    private String name;

    public User(String id, String name){
        this.id = id;
        this.name = name;
    }

    abstract void resetPassword();
}
