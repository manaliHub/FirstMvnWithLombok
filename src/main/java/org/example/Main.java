package org.example;

public class Main {

    public static void main(String[] args) {
        LombokCLass lClass = new LombokCLass();
        // lClass.getClass()
        System.out.println("Hello and welcome! "+ lClass.getName());
        System.out.println("Hello and welcome! "+ lClass.getName());
        System.out.println("Hello and welcome! "+ lClass.getName());
        method(lClass,"manali");
    }

    private static void method(LombokCLass lClass, String manali) {
        lClass.setName(manali);
        Hi h = new Hi();
        h.methiodCall();
    }
}