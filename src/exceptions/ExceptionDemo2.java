package exceptions;

public class ExceptionDemo2 {


    public void methodWithChecked() throws Exception {
        throw new Exception("Это проверяемое исключение");
    }

    public void methodWithUnchecked() {
        throw new RuntimeException("Это непроверяемое исключение");
    }

    public static void main(String[] args) {

        ExceptionDemo2 example = new ExceptionDemo2();

        try {
            example.methodWithUnchecked();
        } catch (RuntimeException e) {
            System.out.println("Поймали: " + e.getMessage());
        }

        try {
            example.methodWithChecked();
        } catch (Exception e) {
            System.out.println("Поймали: " + e.getMessage());
        }
    }


}
