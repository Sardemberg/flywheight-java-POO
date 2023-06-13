package tickets;

import javax.naming.NameNotFoundException;

public class FirstClass extends BaseTicket {
    public FirstClass(String namePassanger, String location) throws NameNotFoundException {
        super(namePassanger, location);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 650;
    }
}
