package ru.practicum.javadeveloper.sprint4.inheritance;

public class SecondLevelHeir extends FirstLevelHeir {

    public SecondLevelHeir(String name) {
        super(name);
    }

    @Override
    public String greeting(String name) {
        return String.format("Hello %s, I'm a second level heir %s", name, this.name);
    }

    public String greeting(String name1, String name2) {
        return String.format("Hello %s and %s, I'm a second level heir %s", name1, name2, this.name);
    }

    @Override
    protected String specialGreeting() {
        return String.format("Hello everybody, I'm a second level heir %s", this.name);
    }

    public static String whoIam() {
        return "I'm a second level heir";
    }

    public static Integer hierarchyLevel() {
        return 2;
    }
}
