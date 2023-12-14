package com.teachmeskills.lesson13.hw.custom_exeption;

public class WrongPasswordException extends Exception {


    public WrongPasswordException( String massage) {
        super(massage);

    }
}
