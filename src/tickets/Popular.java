package tickets;

import javax.naming.NameNotFoundException;

public class Popular extends BaseTicket{
    public Popular(String namePassanger, String location) throws NameNotFoundException {
        super(namePassanger, location);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 250;
    }
}
