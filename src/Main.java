public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bodyMass = 90; // Масса тела в кг.
        double growth = 1.82;  // Рост в метрах.
        double  BodyMassIndex = service.calculate(bodyMass, growth);
        System.out.println("ИМТ: " + BodyMassIndex);
    }
}
