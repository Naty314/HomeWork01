import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        CarrotSeller marekNovotny = new CarrotSeller("Marek Novotný");
        marekNovotny.setCityName("5 Května, Praha");
        System.out.println(marekNovotny.getName()); // First seller

        CarrotSeller martinNovak = new CarrotSeller("Martin Novak");
        martinNovak.setCityName("20 Opatovická, Praha");
        System.out.println(martinNovak.getName()); // Second seller

    }
}