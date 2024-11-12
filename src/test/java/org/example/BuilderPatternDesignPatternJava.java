package org.example;
public class BuilderPatternDesignPatternJava {
    // Change return type of each method as Class type
    // "this" always points to current/calling object. Returning the same to
    // have same reference

    public BuilderPatternDesignPatternJava Floor1(){
        System.out.println("First floor is Done");
        return this;
    }

    public BuilderPatternDesignPatternJava Floor2(String param){
        System.out.println("Second floor is done");
        return this;
    }

    public BuilderPatternDesignPatternJava Floor3(){
        System.out.println("Third floor is done");
        return this;
    }

    public static void main(String[] args) {
        BuilderPatternDesignPatternJava bp=new BuilderPatternDesignPatternJava();
        bp.Floor1().Floor2("Shresth").Floor3();
    }
}
