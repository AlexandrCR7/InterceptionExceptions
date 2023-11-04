package Exceptions;

public class NumberTelFormatException extends RuntimeException {
    public NumberTelFormatException() {
        super("Вы ввели не верные данные, повторите ввод!");
    }
}
