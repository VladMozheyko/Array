public class Array {
    private int pointer;
    private int[] arr;
    private int size;


    /**
     * Конструктор по умолчанию
     */
    public Array() {
        pointer = 0;
        size = 5;
        arr = new int[size];
    }

    /**
     * Добавление элемента
     * @param value элемент
     */
    public void add(int value){
        if(pointer == size){
            size *= 2;
            int[] temp = arr;
            arr = new int[size];
            copyArray(temp);
        }
        arr[pointer] = value;
        pointer++;
    }

    private void copyArray(int[] temp) {
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
    }

    public void out(){
        System.out.println("Массив: ");
        for (int i = 0; i < pointer; i++) {
           System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void dump(){
        System.out.println("Память: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void delete(int index) throws ArrayException {
        if(index< 0){
           throw new ArrayException("Индекс не может быть отрицательным");
        }
        else if (index>= pointer){
            throw new ArrayException("Индекс выходит за границы массива");
        }
        for (int i = index; i < pointer-1 ; i++) {
            arr[i] = arr[i+1];
        }
        pointer--;
    }

    public void clear(){
        pointer = 0;
    }
    public void hack(){
        pointer = arr.length;
    }
}
