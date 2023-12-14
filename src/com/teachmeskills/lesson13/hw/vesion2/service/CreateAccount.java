package com.teachmeskills.lesson13.hw.vesion2.service;

import com.teachmeskills.lesson13.hw.custom_exeption.WrongLoginException;
import com.teachmeskills.lesson13.hw.custom_exeption.WrongPasswordException;

public class CreateAccount {
    public static void createAccount2 (String login,String password,String confirmPassword)
    throws WrongLoginException,
           WrongPasswordException
    {
        int count = 0;
        char[] loginCharArray = login.toCharArray();
        char[] passwordCharArray = password.toCharArray();
        if (loginCharArray.length > 20) {
            throw new WrongLoginException("wrong login");
        }
        for (int i = 0; i < loginCharArray.length; i++) {
            if (loginCharArray[i] == ' ') {
                throw new WrongLoginException("wrong password there shouldn't be any spaces");
            }
        }
        if (passwordCharArray.length > 20 || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("wrong password");
        }
        for (int i = 0; i < passwordCharArray.length; i++) {

            if (passwordCharArray[i] == ' '){
                throw new WrongPasswordException("wrong password there shouldn't be any spaces");
            }
            for (int j = 48; j <= 58; j++) {
                if (passwordCharArray[i] == j) {
                    count++;
                }
            }
        }
        if (count == 0) {
            throw new WrongPasswordException("must be at least 1 digit");
        }
    }
}
