package airplanes;

public class ConcreteAirplane implements Airplane{

    @Override
    public void voar(String agency_name) {
        System.out.println("Obrigado por finalizar sua compra, você está voando com a: " + agency_name);
    }
}
