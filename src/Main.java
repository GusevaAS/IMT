public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 80;
        double height = 1.85;
        double imt = service.calculate(weight, height);
        System.out.printf("%.1f", imt);
    }
}