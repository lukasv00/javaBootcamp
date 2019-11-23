package com.kodilla.patterns.factory.tasks;

public class TasksFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                Task shopping = new ShoppingTask("jajecznica", "jaja", 10.0);
                shopping.executeTask();
                shopping.isTaskExecuted();
                break;

            case PAINTING:
                Task painting = new PaintingTask("comie", "red", "russia");
                painting.executeTask();
                painting.isTaskExecuted();
                break;

            case DRIVING:
                Task driving = new DrivingTask("alko", "Krakow", "Bolt");
                driving.executeTask();
                driving.isTaskExecuted();
                break;
        }
        return null;
    }

}
