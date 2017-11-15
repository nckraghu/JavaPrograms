package corejava.inheritance;

import corejava.misc.SubClass2;

/**
 * Created by Gowtham on 03-11-2017.
 */
public class SuperClassClient {

    public static void main(String[] args) {
        SuperClass superClassObject = new SuperClass();
        SubClass1 subClass1Object = new SubClass1();
        SubClass2 subClass2Object = new SubClass2();

        subClass1Object.canAccessSuper();
        System.out.println();
        subClass2Object.canAccessSuper();
        System.out.println();

        superClassObject.publicMethodInSuperClass();
        subClass1Object.publicMethodInSuperClass();
        subClass2Object.publicMethodInSuperClass();
        SuperClass.publicStaticMethodInSuperClass();
        SubClass1.publicStaticMethodInSuperClass();
        SubClass2.publicStaticMethodInSuperClass();
    }
}
