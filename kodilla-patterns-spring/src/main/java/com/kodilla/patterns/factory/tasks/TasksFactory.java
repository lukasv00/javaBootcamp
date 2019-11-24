package com.kodilla.patterns.factory.tasks;

public class TasksFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("jajecznica", "jaja", 10.0);

            case PAINTING:
                return new PaintingTask("comie", "red", "russia");

            case DRIVING:
                return new DrivingTask("alko", "Krakow", "Bolt");
        }
        return null;
    }

}
