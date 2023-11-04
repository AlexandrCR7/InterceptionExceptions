package ServiseExceptions;

import Exceptions.*;


public class ProcessingInfo {

    public void processInfo(String str) {

        String[] array = str.split(" ");
        if (array.length != 6) {
            throw new SizeExceptions();
        }
    }

    public void checkName(String str) {
        String[] numbers = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        String[] array = str.split(" ");

        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < numbers.length; k++) {
                if (array[i].contains(numbers[k])) {
                    throw new StringNameException();
                }
            }
        }
    }

    public void checkDate(String str) {
        String[] array = str.split(" ");
        String dateOfBirth = array[3];
        String[] arr = dateOfBirth.split("\\.");
        for (int i = 0; i < arr.length; i++) {
            try {
                int number = Integer.parseInt(arr[i]);
            } catch (NumberFormatException e) {
                throw new FormatDataException();
            }
        }
    }

    public void checkTelNumber(String str) {
        String[] array = str.split(" ");
        String telNumber = array[4];
        try {
            long number = Long.parseLong(telNumber);
        } catch (NumberFormatException e) {
            throw new NumberTelFormatException();
        }
    }

    public void checkGender(String str) {
        String[] array = str.split(" ");
        String gender = array[5];
            if(!((gender.equals("f")) | (gender.equals("m")))){
                throw new GenderException();
        }
    }
}
