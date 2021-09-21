public class Calk3 {
    String[] inputRoman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public void logic(String one, char operation, String two) {
        int num1;
        int num2;
        int result;
        int rome = 0;
        Calk2 next = new Calk2();
        Calk1 first = new Calk1();


        for (int i = 0; i < inputRoman.length; i++) {

            if (one.toUpperCase().equals(inputRoman[i])) {

            rome++;

                one = one.toUpperCase();
            }
            if (two.toUpperCase().equals(inputRoman[i])) {

                rome++;

                two = two.toUpperCase();
            }

        }

            switch (rome) {
                case 0:
                    num1 = Integer.parseInt(one);
                    num2 = Integer.parseInt(two);
                    System.out.println(next.calculated(num1, operation, num2));
                    break;
                case 1:
                    throw new ArithmeticException("---Система не работает с римскими и арабскими числами одновременно---");
                case 2:
                    num1 = first.romanToNumber(one);
                    num2 = first.romanToNumber(two);
                    result = next.calculated(num1, operation, num2);
                    System.out.println(first.convertNumToRoman(result));
                    break;

            }
    }

}