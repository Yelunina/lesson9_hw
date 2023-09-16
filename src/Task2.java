public class Task2 {
    /*
    Реализовать метод luckyNumber, который принимает целое число, и печатает Lucky,
     если в этом числе сумма цифр, стоящих на четных позициях равна сумме цифр стоящих на нечетных позициях,
     и печатает Unlucky в противном случае.
     */
    // Function to find the sum of the odd
// and even positioned digits in a number

    public static void main(String[] args) {
        int n = 457892;
        luckyNumber(n);
        n = 1738649;
        luckyNumber(n);
    }

    public static void luckyNumber(int num) {
/*
Мы можем извлечь все цифры из числа по одной с конца.
Если исходное число было нечетным, то последняя цифра должна быть нечетной,иначе она будет четной.
После обработки цифры мы можем инвертировать состояние с нечетного на четное и наоборот.
 */
        //Если num нечетное, то последняя цифра
        // будет находиться в нечетном положении
        boolean isOdd = (num % 2 == 1) ? true : false;

        // Для хранения соответствующих сумм
        int sumOdd = 0;
        int sumEven = 0;

        // Пока остались цифры процесса
        while (num != 0) {

            // Если текущая цифра находится в нечетном положении
            if (isOdd) {
                sumOdd = sumOdd + num % 10;
            } else { // Четная цифра
                sumEven = sumEven + num % 10;
            }

            // Инвертируем состояние
            isOdd = !isOdd;

            // Удаляем последнюю цифру
            num /= 10;
        }
        if (sumOdd == sumEven) {
            System.out.println("Sum odd = " + sumOdd+" Sum even = " + sumEven+" This is luckyNumber");
        } else {
            System.out.println("Sum odd = " + sumOdd+" Sum even = " + sumEven+" This is unluckyNumber");
        }
    }

}


