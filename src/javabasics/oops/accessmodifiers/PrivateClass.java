package javabasics.oops.accessmodifiers;

public class PrivateClass {
    private String name;

    public String setName(String name) {
        this.name = name;
        return getName();
    }

    private String getName() {
        return name;
    }
}
