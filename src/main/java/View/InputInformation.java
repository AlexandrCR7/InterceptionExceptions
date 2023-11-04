package View;

import java.util.Scanner;

public class InputInformation {
    public String inputInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите следующие данные, разделенные пробелом\n" +
                "Фамилия Имя Отчество датарождения дд.мм.гггг  номертелефона пол\n");
        String info = scanner.nextLine();
        System.out.println("Вы ввели " + info);
        return info;
    }
}
