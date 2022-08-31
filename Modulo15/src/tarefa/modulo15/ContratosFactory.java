package exemplo.modulo15;

public class ContratosFactory extends Factory {


    @Override
    Car retrieveCar(String requestedGrade) {
        switch (requestedGrade) {
            case "A":
                return new CorolaCar(100, "álcool", "azul");
            case "B":
                return new VolsksCar(50, "diesel", "amarelo");
            case "C":
                return new Ferrari (150, "elétrico", "vermelhão");
        }
        return null;
    }
}
