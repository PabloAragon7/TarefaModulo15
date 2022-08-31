package exemplo.modulo15;

public class SemContratosFactory extends Factory {


    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Brasilia(45, "a gás", "verde");
        }else
            return new Parati(25,"gasolina", "cinza");
    }

}
