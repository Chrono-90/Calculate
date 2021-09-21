public class Calk1 {

    public String convertNumToRoman(int numArabian) {
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        return roman[numArabian];
    }


    public int romanToNumber(String roman) {
        int y;
            switch (roman) {
                case "I":
                    y = 1;
                    break;
                case "II":
                    y = 2;
                    break;
                case "III":
                    y = 3;
                    break;
                case "IV":
                    y = 4;
                    break;
                case "V":
                    y = 5;
                    break;
                case "VI":
                    y = 6;
                    break;
                case "VII":
                    y = 7;
                    break;
                case "VIII":
                    y = 8;
                    break;
                case "IX":
                    y = 9;
                    break;
                case "X":
                    y = 10;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + roman);
            }

        return y;
    }

}
