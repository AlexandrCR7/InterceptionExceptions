package Exceptions;

public class GenderException extends RuntimeException {
    public GenderException(){
        super("Пол должен быть обозначен буквой f или m");
    }
}
