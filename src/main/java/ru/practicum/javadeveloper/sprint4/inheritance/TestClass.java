package ru.practicum.javadeveloper.sprint4.inheritance;

public class TestClass {

    public static void main(String[] args) {
        Ancestor charles = new Ancestor("Charles");
        FirstLevelHeir michael = new FirstLevelHeir("Michael");
        SecondLevelHeir george = new SecondLevelHeir("George");

        Ancestor clark = new FirstLevelHeir("Clark");
        Ancestor bill = new SecondLevelHeir("Bill");
        FirstLevelHeir cliff = new SecondLevelHeir("Cliff");

        System.out.println(charles.greeting("Wanderer"));
        System.out.println(michael.greeting("Wanderer"));
        System.out.println(george.greeting("Wanderer"));

        System.out.println();

        System.out.println(clark.greeting("Wanderer"));
        System.out.println(bill.greeting("Wanderer"));
        System.out.println(cliff.greeting("Wanderer"));

        System.out.println();

//        System.out.println(clark.specialGreeting());
        System.out.println(((FirstLevelHeir) clark).specialGreeting());
        System.out.println(((FirstLevelHeir) bill).specialGreeting());
        System.out.println(cliff.specialGreeting());

        System.out.println(((SecondLevelHeir) cliff).greeting("W1", "W2"));


        System.out.println(Ancestor.whoIam());
        System.out.println(FirstLevelHeir.whoIam());
        System.out.println(SecondLevelHeir.whoIam());

        System.out.println(Ancestor.hierarchyLevel());
        System.out.println(FirstLevelHeir.hierarchyLevel());
        System.out.println(SecondLevelHeir.hierarchyLevel());
    }
}
