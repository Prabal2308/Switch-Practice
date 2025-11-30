package JavaBasics.oops.accessmodifiers.demo;

//import JavaBasics.oops.accessmodifiers.DefaultClass;

import JavaBasics.oops.accessmodifiers.DefaultClass;
import JavaBasics.oops.accessmodifiers.PrivateClass;
import JavaBasics.oops.accessmodifiers.ProtectedClass;
import JavaBasics.oops.accessmodifiers.PublicClass;

class DefaultClassAccessor {
    public static void main(String[] args) {
//        DefaultClass defaultClass=new DefaultClass(); cannot be accessed from outside package if default class
        DefaultClass dc = new DefaultClass();
//        System.out.println(dc.name); cannot be accessed if default access modifier
//        dc.print(); cannot be accessed if default access modifier

        PrivateClass pc = new PrivateClass();
//        System.out.println(pc.name) //cannot be accessed if private access modifier
        System.out.println(pc.setName("PrivateClass"));
//        System.out.println("Name from PrivateClass: " + pc.getName()); //cannot be accessed if private access modifier

        PublicClass pc1 = new PublicClass();

    }
}
