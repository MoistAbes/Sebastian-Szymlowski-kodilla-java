package com.kodilla.good.patterns.challanges;

public class MailService implements InformationService{
    @Override
    public void inform(User user) {
        System.out.println("Email has been sent to: " + user.getName());
    }
}
