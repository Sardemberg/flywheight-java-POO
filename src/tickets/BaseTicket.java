package tickets;

import destines.DestineFactory;
import destines.Destine;

import javax.naming.NameNotFoundException;
import java.util.UUID;

public class BaseTicket implements Ticket{
    private String namePassanger;
    private UUID code;
    private Destine destine;

    public BaseTicket(String namePassanger, String location) throws NameNotFoundException {
        this.namePassanger = namePassanger;
        this.code = UUID.randomUUID();
        this.destine = DestineFactory.get(location);
    }

    @Override
    public double getPrice() {
        return getDestine().getPrice() + 450;
    }

    @Override
    public String getNamePassanger() {
        return namePassanger;
    }

    @Override
    public UUID getCode() {
        return code;
    }

    @Override
    public Destine getDestine() {
        return destine;
    }
}
