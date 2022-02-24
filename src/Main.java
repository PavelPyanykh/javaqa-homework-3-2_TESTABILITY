public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();
        double bmi = service.calculate(69.5, 1.78); // масса тела в килограммах, рост в метрах
        System.out.println("Индекс массы тела составляет: " + bmi + " кг/м²"); // индекс массы тела в кг/м²
    }
}
