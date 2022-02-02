package com.kodilla.exception.nullpointer;

import java.util.Optional;

public class NullPointerExceptionRunner {
    public static void main(String[] args) {
        User user = null;
        MessageSender messageSender = new MessageSender();

        try {
            messageSender.sendMessageTo(user, "Hello!");
        } catch (MessageNotSentException e) {
            System.out.println("Message is not send," +
                    "but my program still running very well!");
        }

        System.out.println("Processing other logic!");


        //Optional
        User user1 = new User("Witold");
        User nullUser = null;
        User nullUser2 = null;

        Optional<User> optionalUser = Optional.ofNullable(user1);
        Optional<User> optionalUser2 = Optional.ofNullable(nullUser);
        Optional<User> optionalUser3 = Optional.ofNullable(nullUser2);



        //orElse
        String name = optionalUser.orElse(new User("Karol")).getName();
        System.out.println(name);

        String name2 = optionalUser2.orElse(new User("Karol")).getName();
        System.out.println(name2);

        //isPresent
        System.out.println("Is present");

        System.out.println("Optional user1");
        optionalUser.ifPresent(u -> System.out.println(u.getName()));

        System.out.println("Optional user2");
        optionalUser2.ifPresent(u -> System.out.println(u.getName()));

        System.out.println("Optional user3");
        optionalUser3.ifPresent(u -> System.out.println(u.getName()));



    }
}
