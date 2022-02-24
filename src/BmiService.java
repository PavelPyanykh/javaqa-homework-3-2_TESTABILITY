public class BmiService {
    public double calculate(double weightInKg, double heightInMeters) {

        // формула расчёта индекса массы тела
        return weightInKg / (heightInMeters * heightInMeters);
    }
}
