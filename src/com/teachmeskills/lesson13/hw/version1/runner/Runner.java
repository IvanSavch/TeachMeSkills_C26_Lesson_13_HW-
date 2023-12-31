package com.teachmeskills.lesson13.hw.version1.runner;

import com.teachmeskills.lesson13.hw.custom_exeption.WrongLoginException;
import com.teachmeskills.lesson13.hw.custom_exeption.WrongPasswordException;
import com.teachmeskills.lesson13.hw.version1.service.CreateAccount;

/**
 * Create a class that will have a static method.
 * This method takes three parameters as input:
 * Login
 * Password confirmPassword
 * All fields are of String data type.
 * login must be less than 20 characters long and must not contain
 * spaces.
 * If login does not meet these requirements, a WrongLoginException must be thrown.
 * Password must be less than 20 characters long, must not contain spaces, and must contain at least one number.
 * Also, password and confirmPassword must be equal.
 * If the password does not meet these requirements, a WrongPasswordException must be thrown.
 * The method returns true if the values are valid or false otherwise.
 *
 * first version with contains
 */
public class Runner {
    public static void main(String[] args) {
        try {
            CreateAccount.crateAccount("ivanSav","1Savhenko","Savchenko");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println( e.getMessage());
        }
    }
}
