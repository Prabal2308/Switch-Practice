package JavaBasics.oops.accessmodifiers.demo;

//import JavaBasics.oops.accessmodifiers.DefaultClass;

import JavaBasics.oops.accessmodifiers.DefaultClass;

class DefaultClassAccessor {
    public static void main(String[] args) {
//        DefaultClass defaultClass=new DefaultClass(); cannot be accessed from outside package if default class
        DefaultClass dc = new DefaultClass();
//        System.out.println(dc.name); cannot be accessed if default access modifier
//        dc.print(); cannot be accessed if default access modifier
    }
}
