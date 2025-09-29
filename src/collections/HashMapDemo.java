package collections;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        Student student1 = new Student("Gritsenko", 4.6, 4);
        Student student2 = new Student("Atayan", 4.5, 5);
        Student student3 = new Student("Ulegin", 3.6, 3);
        Student student4 = new Student("Yacuk", 3.3, 3);

        Map<Student, Integer> students = new HashMap<>();
        students.put(student1, 851);
        students.put(student2, 148);
        students.put(student3, 971);
        students.put(student4, 539);
        System.out.println(students);
        System.out.println();
        System.out.println(students.get(student3)); // поиск по ключу
        System.out.println();
        for (Map.Entry<Student, Integer> entry : students.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue()); // вывод ключ+значение
        }

        System.out.println();

        Iterator <Student> iterator = students.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().name); // вывод через итератор только имени
        }

        System.out.println();
        Iterator <Student> iterator1 = students.keySet().iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next().grade); // вывод через итератор только оценки
        }
    }

}




