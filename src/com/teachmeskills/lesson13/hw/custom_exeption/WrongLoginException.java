package com.teachmeskills.lesson13.hw.custom_exeption;

public class WrongLoginException extends Exception{

    public WrongLoginException(String massage) {
        super(massage);

    }
}
