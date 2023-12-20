public class Main {
    public static void main(String[] args) {
        Camion camion = new Camion("123ABC", 1000, 5000);
        Bulto bulto1 = new Bulto(1, 20, 100, false);
        Bulto bulto2 = new Bulto(2, 30, 200, true);

        if (camion.sePuedePoner(bulto1)){
            System.out.println("Se puede llevar el bulto1");
        } else {
            System.out.println("No se puede llevar el bulto1");
        }

        if (camion.sePuedePoner(bulto2)){
            System.out.println("Se puede llevar el bulto2");
        } else {
            System.out.println("No se puede llevar el bulto2");
        }

        Bulto bultosMudanza[] = new Bulto[]{bulto1,bulto2};

        Mudanza mudanza = new Mudanza(11, 100, camion, bultosMudanza);
    }
}