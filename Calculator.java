public class Calculator {
    private static double addition (double a, double b){
        double answer = a + b;
        return answer;

    }
    private static double subtraction (double a, double b){
        double answer = a - b;
        return answer;
    }
    private static double multiplication( double a, double b){
        double answer = a * b;
        return answer;
    }
    private static double division( double a, double b){
        double answer = a / b;
        return answer;
    }
    private static double square( double a) {
        double answer = Math.pow(a,2);
        return answer;
    }
    private static double cube( double a) {
        double answer = Math.pow(a,3);
        return answer;
    }
    private static double power( double a, double b) {
        double answer = a * b;
        return answer;
    }
    public static void main(String[]args){
        String choice = args[0];
        double firstValue;
        double secondValue;
        double answer;

        switch (choice){
            case "addition":
                firstValue = Integer.parseInt(args[1]);
                secondValue = Integer.parseInt(args[2]);
                answer = addition(firstValue, secondValue);
                System.out.println(answer);
                break;
            case "subtraction":
                firstValue = Integer.parseInt(args[1]);
                secondValue = Integer.parseInt(args[2]);
                answer = subtraction(firstValue, secondValue);
                System.out.println(answer);
                break;
            case "multiplication":
                firstValue = Integer.parseInt(args[1]);
                secondValue = Integer.parseInt(args[2]);
                answer = multiplication(firstValue, secondValue);
                System.out.println(answer);
                break;
            case "division":
                firstValue = Integer.parseInt(args[1]);
                secondValue = Integer.parseInt(args[2]);
                answer = division(firstValue, secondValue);
                System.out.println(answer);
                break;
            case "square":
                firstValue = Integer.parseInt(args[1]);
                answer = square(firstValue);
                System.out.println(answer);
                break;
            case "cube":
                firstValue = Integer.parseInt(args[1]);
                answer = cube(firstValue);
                System.out.println(answer);
                break;
            case "power":
                firstValue = Integer.parseInt(args[1]);
                secondValue = Integer.parseInt(args[2]);
                answer = power(firstValue, secondValue);
                System.out.println(answer);
                break;
    }

    }
}
