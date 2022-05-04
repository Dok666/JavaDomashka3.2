public class BmiService {
    public double calculate(int bodyMass, double growth) {
        double heightInSquareMeters = growth * growth;
        double BodyMassIndex = bodyMass / heightInSquareMeters ;
        return BodyMassIndex;
    }
}
