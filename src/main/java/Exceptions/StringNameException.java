package Exceptions;

public class StringNameException extends RuntimeException{
    public StringNameException(){
        super("Имя не может содержать цифры или другие символы");
    }
}
