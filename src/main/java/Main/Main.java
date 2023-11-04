package Main;
//Копцев Александр Юрьевич 10.08.1991 45535 f
import Exceptions.GenderException;
import Exceptions.NumberTelFormatException;
import Exceptions.SizeExceptions;
import Exceptions.StringNameException;
import ServiseExceptions.ProcessingInfo;
import View.InputInformation;

public class Main {
    public static void main(String[] args) {

        InputInformation inputInformation = new InputInformation();
        String str = inputInformation.inputInfo();

        ProcessingInfo processingInfo = new ProcessingInfo();

        try {
            processingInfo.processInfo(str);
        } catch (SizeExceptions e) {
            System.out.println("Вы ввели не все данные!");
            return;
        }

        try {
            processingInfo.checkName(str);
        } catch (StringNameException e) {
            System.out.println("Имя не может содержать цифры!");
            return;
        }

        try {
            processingInfo.checkDate(str);
        } catch (NumberFormatException e) {
            System.out.println("Дата рождения не может содержать буквы!");
            return;
        }

        try {
            processingInfo.checkTelNumber(str);
        } catch (NumberTelFormatException e) {
            System.out.println("Телефонный номер введен неверно!");
            return;
        }

        try {
            processingInfo.checkGender(str);
        } catch (GenderException e) {
            System.out.println("Вы ввели некорректный пол!");
        }
    }
}