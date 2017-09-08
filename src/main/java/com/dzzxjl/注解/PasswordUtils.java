package com.dzzxjl.注解;

import java.util.List;

public class PasswordUtils {
    @UseCase(id = 47)
    public boolean validatePassword(String password) {
        return password.matches("\\w*\\d\\w*");
    }
    @UseCase(id = 48)
    public String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }
    @UseCase(id = 49)
    public boolean checkForNewPassword(List<String> prevPasswords, String password) {
        return !prevPasswords.contains(password);
    }
}
