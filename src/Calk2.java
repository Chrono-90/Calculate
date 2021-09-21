public class Calk2 {
    public int calculated(int num1, char op, int num2) {
        int result = 0;

        if (num1 > 0 && num1 < 11 && num2 > 0 && num2 < 11) {


            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Не верный знак операции");
            }


        } else {
            throw new ArithmeticException("---Введенное число вне доступного диапазона,введите число от 1 до 10---");
        }


        return result;
    }
}


