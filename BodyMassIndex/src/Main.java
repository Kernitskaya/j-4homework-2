public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double total = service.calculate(68, 1.7);
        System.out.println(total);
    }
}
