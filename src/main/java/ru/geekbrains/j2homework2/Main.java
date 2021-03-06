package ru.geekbrains.j2homework2;

public class Main {

    public static void main(String[] args) {

        String[][] arr = {
                {"0", "1", "4", "3"},
                {"3", "6", "2", "4"},
                {"5", "2", "1", "3"},
                {"0", "2", "5", "1"}
        };
        try {
            try {
                int result = tryToCheckAndSum(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива не равен 4х4");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Ошибка в ячейке массива: " + e.i + "x" + e.j);
        }

    }

    public static int tryToCheckAndSum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum = sum + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
