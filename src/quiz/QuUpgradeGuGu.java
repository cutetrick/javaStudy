package quiz;



public class QuUpgradeGuGu {
    public static void main(String[] args) {
        for (int base = 2; base <= 9; base++) {
            for (int exponent = 1; exponent <= 9; exponent++) {
                int result = 1;
                StringBuilder expression = new StringBuilder();
                
                for (int i = 0; i < exponent; i++) {
                    result *= base;
                    expression.append(base);
                    if (i < exponent - 1) {
                        expression.append(" X ");
                    }
                }
                
                System.out.println(expression.toString() + " = " + result);
            }
        }
    }
}
