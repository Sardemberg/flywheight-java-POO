import agencies.Agency;
import agencies.AgencyFactory;
import tickets.Executive;
import tickets.FirstClass;
import tickets.Popular;
import tickets.Ticket;

import javax.naming.NameNotFoundException;
import java.text.MessageFormat;
import java.util.Scanner;

public class Main {
    private static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws NameNotFoundException {
        boolean wantBuy = true;

        while(wantBuy) {
            System.out.println("Digite o seu nome: ");
            String namePassanger = scn.nextLine();
            String destine = getDestinesProposes();
            Ticket ticket = getTicketProposes(namePassanger, destine);

            assert ticket != null;

            System.out.println(MessageFormat.format("{0}, sua viagem deu o valor de {1} reais", namePassanger, ticket.getPrice()));

            Agency agency = getAgency();

            System.out.println("Iniciando viagem...");

            agency.init_travel();

            int value = 0;

            while(value < 1 || value > 2) {
                System.out.println("Deseja fazer outra compra?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                value = scn.nextInt();

                scn.nextLine();
            }

            wantBuy = value == 1;
        }
    }

    private static String getDestinesProposes(){
        System.out.println("Em relação aos destinos, temos 3: ");
        System.out.println("1 - Amsterdam (R$ 3358.55)");
        System.out.println("2 - Acapulco (R$ 4500.55)");
        System.out.println("3 - Dubai (R$ 4000,00)");
        System.out.println("Qual você vai querer?");

        int value = scn.nextInt();

        switch (value) {
            case 1 -> {
                return "Amsterdam";
            }
            case 2 -> {
                return "Acapulco";
            }
            case 3 -> {
                return "Dubai";
            }
            default -> {
                System.out.println("Valor não encontrado!");
                getDestinesProposes();
            }
        }

        return null;
    }

    private static Ticket getTicketProposes(String namePassanger, String destine) throws NameNotFoundException {
        System.out.println("Em relação aos tipos de passagem, temos 3: ");
        System.out.println("1 - Primeira classe (R$ 1100,00)");
        System.out.println("2 - Executiva (R$ 900,00)");
        System.out.println("3 - Popular (R$ 700,00)");
        System.out.println("Qual você vai querer?");

        int value = scn.nextInt();

        switch (value) {
            case 1 -> {
                return new FirstClass(namePassanger, destine);
            }
            case 2 -> {
                return new Executive(namePassanger, destine);
            }
            case 3 -> {
                return new Popular(namePassanger, destine);
            }
            default -> {
                System.out.println("Valor não encontrado!");
                getTicketProposes(namePassanger, destine);
            }
        }

        return null;
    }

    private static Agency getAgency(){
        try {
            AgencyFactory agencyFactory = new AgencyFactory();

            String[] arr_agencies = agencyFactory.getAgencies();

            System.out.println("Escolha a agência do voo:");
            System.out.println("1 - Gol");
            System.out.println("2 - CVC");
            System.out.println("3 - RIP");

            int user_choice = scn.nextInt();
            Agency agency = agencyFactory.getAgency(arr_agencies[user_choice - 1]);

            return agency;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Općão inválida!");
            return getAgency();
        }
    }
}