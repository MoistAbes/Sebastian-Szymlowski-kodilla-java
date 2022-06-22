package com.kodilla.patterns2.observer.homework;


public class Mentor implements Observer {
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }


    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(StudentTasks studentTasks) {
        System.out.println(username + ": New task in " + studentTasks.getName() + " module"+ "\n" +
                " (total: " + studentTasks.getMessages().size() + " tasks)");
        updateCount++;
    }
}
