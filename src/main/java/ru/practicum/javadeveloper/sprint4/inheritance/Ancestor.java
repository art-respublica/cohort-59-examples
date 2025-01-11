package ru.practicum.javadeveloper.sprint4.inheritance;

public class Ancestor {

    protected String name;

    public Ancestor(String name) {
        this.name = name;
    }

    protected String greeting(String name) {
        return String.format("Hello %s, I'm an ancestor %s", name, this.name);
    }

    public static String whoIam() {
        return "I'm an ancestor";
    }

    static Integer hierarchyLevel() {
        return 0;
    }
}
