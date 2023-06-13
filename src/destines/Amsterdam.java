package destines;

public class Amsterdam implements Destine {
    @Override
    public double getPrice() {
        return 3358.55;
    }

    @Override
    public String getInfo() {
        return "Amsterdam é a capital da Holanda, conhecida por seus canais, arquitetura histórica e atmosfera vibrante. A cidade oferece uma mistura única de charme antigo e modernidade, com museus renomados, como o Rijksmuseum e o Museu Van Gogh, além de uma vida cultural rica, cafés aconchegantes, bicicletas por toda parte e uma cena noturna animada.";
    }
}
