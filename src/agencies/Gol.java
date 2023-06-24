package agencies;

import airplanes.Airplane;

public class Gol extends Agency{
    public Gol(Airplane airplane) {
        super(
                "Gol",
                "A Gol é uma renomada agência de viagens que oferece serviços completos de reserva" +
                        " e organização de viagens aéreas. Com um histórico de excelência no setor da aviação," +
                        " a Gol se destaca como uma das principais companhias aéreas do Brasil, proporcionando" +
                        " aos viajantes uma experiência de viagem segura, conveniente e confortável.",
                airplane
        );
    }
}
