package tickets;

import javax.naming.NameNotFoundException;

public class Executive extends BaseTicket{
    public Executive(String namePassanger, String location) throws NameNotFoundException {
        super(namePassanger, location);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 450;
    }
}
