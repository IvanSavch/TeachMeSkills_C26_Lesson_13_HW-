package com.teachmeskills.lesson13.hw.version1.service;

import com.teachmeskills.lesson13.hw.custom_exeption.WrongLoginException;
import com.teachmeskills.lesson13.hw.custom_exeption.WrongPasswordException;

public class CreateAccount {
    public static void crateAccount (String login,String password,String confirmPassword)
            throws WrongLoginException,
                   WrongPasswordException
    {
        if (login.length() > 20 || login.contains(" ")) {
            throw new WrongLoginException("Wrong login");
        }
        if (password.length() > 20 || password.contains(" ")
                || !(password.matches("\\d{1}"))
                || !(password.equals(confirmPassword))) {
            throw new WrongPasswordException("wrong password");
        }
    }
}
