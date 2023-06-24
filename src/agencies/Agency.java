package agencies;

import airplanes.Airplane;

public class Agency {
    String name;
    String description;
    Airplane airplane;
    public Agency(String name, String description, Airplane airplane){
        this.name = name;
        this.description = description;
        this.airplane = airplane;
    }

    public void init_travel(){
        this.airplane.voar(this.name + ", " + this.description);
    }
}
