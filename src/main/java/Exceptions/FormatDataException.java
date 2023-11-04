package Exceptions;

public class FormatDataException extends NumberFormatException{

    public FormatDataException() {
        super("Дата рождения может содержать только цифры и точки, повторите ввод в формате дд.мм.гггг");
    }
}
