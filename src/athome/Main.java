package athome;

public class Main {

    double calcY(double a, double b, double c, double x){
        if (x < 1.4) return a * x * x + b * x + c;
            else if (x == 1.4) return a / x + Math.sqrt(x * x + 1);
                else return (a + b * x) / Math.sqrt(x * x + 1);
        }

    private void printResults() {
        double a = 2.8;
        double b = -0.3;
        double c = 4.0;
        double x = 1.5;
        double y = calcY(a, b, c, x);
        System.out.println("while x = 1.5, y = " + y);

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.printResults();
    }
}
