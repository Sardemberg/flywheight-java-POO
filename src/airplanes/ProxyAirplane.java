package airplanes;

public class ProxyAirplane implements Airplane{
    private ConcreteAirplane concreteAirplane;
    @Override
    public void voar(String agency_name) {
        if(concreteAirplane == null){
            concreteAirplane = new ConcreteAirplane();
        }

        concreteAirplane.voar(agency_name);
    }
}
