package exceptions;

import java.io.*;

public class ExceptionDemo {

    static void myCheckedException()  {
        File MyCheckedException = new File("File_ReaderExample.txt");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(MyCheckedException);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
        try {
            fis.read();
        } catch (NullPointerException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e.getMessage());
        }
    }

    static void myUncheckedException() {
        int array[] = {1, 2, 3, 4, 5};
        try {
            System.out.println(array[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Значение индекса неверно: " + e.getMessage());
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        myCheckedException();
        myUncheckedException();
    }




}


