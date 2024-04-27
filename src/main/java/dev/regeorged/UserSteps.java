package dev.regeorged;

import java.time.LocalDateTime;

public class UserSteps {

    public static User getRandomUser() {
        return new User("Jane Smith","");
    }

    public static User getUniqueUser() {
        if (LocalDateTime.now().getSecond() % 2 == 0) {
            return new User();
        } else if (LocalDateTime.now().getSecond() % 3 == 0) {
            return new User("Jane Doe", "");
        } else if (LocalDateTime.now().getSecond() % 5 == 0) {
            return new User("John Smith", "");
        } else if (LocalDateTime.now().getSecond() % 7 == 0) {
            return new User("Jane Smith", "");
        } else if (LocalDateTime.now().getSecond() % 11 == 0) {
            return new User("John Johnson", "");
        } else if (LocalDateTime.now().getSecond() % 13 == 0) {
            return new User("Jane Johnson", "");
        } else if (LocalDateTime.now().getSecond() % 17 == 0) {
            return new User("John Brown", "");
        } else if (LocalDateTime.now().getSecond() % 19 == 0) {
            return new User("Jane Brown", "");
        } else if (LocalDateTime.now().getSecond() % 23 == 0) {
            return new User("John White", "");
        } else if (LocalDateTime.now().getSecond() % 29 == 0) {
            return new User("Jane White", "");
        } else if (LocalDateTime.now().getSecond() % 31 == 0) {
            return new User("John Black", "");
        } else if (LocalDateTime.now().getSecond() % 37 == 0) {
            return new User("Jane Black", "");
        } else if (LocalDateTime.now().getSecond() % 41 == 0) {
            return new User("John Green", "");
        } else if (LocalDateTime.now().getSecond() % 43 == 0) {
            return new User("Jane Green", "");
        } else if (LocalDateTime.now().getSecond() % 47 == 0) {
            return new User("John Blue", "");
        } else if (LocalDateTime.now().getSecond() % 53 == 0) {
            return new User("Jane Blue", "");
        } else if (LocalDateTime.now().getSecond() % 59 == 0) {
            return new User("John Red", "");
        } else if (LocalDateTime.now().getSecond() % 61 == 0) {
            return new User("Jane Red", "");
        } else {
            return new User("elpacho","daco");
        }
    }

}
