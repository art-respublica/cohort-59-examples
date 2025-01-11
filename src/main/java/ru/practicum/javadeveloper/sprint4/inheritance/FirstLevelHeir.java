package ru.practicum.javadeveloper.sprint4.inheritance;

public class FirstLevelHeir extends Ancestor {

    public FirstLevelHeir(String name) {
        super(name);
    }

    @Override
    protected String greeting(String name) {
        return String.format("Hello %s, I'm a first level heir %s", name, this.name);
    }

    protected String specialGreeting() {
        return String.format("Hello everybody, I'm a first level heir %s", this.name);
    }
}
