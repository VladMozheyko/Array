//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Array array = new Array();
        array.add(2);
        array.out();
        array.dump();
        array.add(1);
        array.out();
        array.dump();
        array.add(5);
        array.out();
        array.dump();
        try {
            array.delete(1);
        } catch (ArrayException e) {

        }

        array.out();
        array.dump();


// Демонстарция выделения памяти,  удаления и стираня
//        array.add(2);
//        array.out();
//        array.dump();
//        array.add(1);
//        array.out();
//        array.dump();
//        array.add(5);
//        array.out();
//        array.dump();
//        array.add(5);
//        array.out();
//        array.dump();
//        array.add(5);
//        array.out();
//        array.dump();
//        array.add(5);
//        array.out();
//        array.dump();
//        array.add(2);
//        array.out();
//        array.dump();
//        array.add(1);
//        array.out();
//        array.dump();
//        array.add(5);
//        array.out();
//        array.dump();
//        array.add(5);
//        array.out();
//        array.dump();
//        array.add(5);
//        array.out();
//        array.dump();
//        array.add(5);
//        array.out();
//        array.dump();
//        array.clear();
//        array.out();
//        array.dump();
//        array.hack();
//        array.out();


    }
}