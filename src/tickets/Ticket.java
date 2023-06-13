package tickets;

import destines.Destine;

import java.util.UUID;

public interface Ticket {
    double getPrice();
    String getNamePassanger();
    UUID getCode();
    Destine getDestine();
}
