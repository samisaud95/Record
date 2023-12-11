//Definisci un oggetto Record che rappresenti un Punto con le coordinate x & y

public class Main {
    public static void main(String[] args) {
        //Creo due coordinate
        Coordinate coordinateVe = new Coordinate(625255,6635230);
        Coordinate coordinateIt = new Coordinate(12495988,42495988);
        Coordinate coordinateBu = new Coordinate(625255,6635230);

       //Dichiaro una variabili per accedere alle coordinate
        Integer coordinataVeX = coordinateVe.x();
        Integer coordinataVeY = coordinateVe.y();
        //Stampo le coordinate
        System.out.println("Coordinati de Venezuela :" + coordinataVeX + " , "+ coordinataVeY);
        //ripito il pricesso

        Integer coordinataItX= coordinateIt.x();
        Integer coordinataItY= coordinateIt.y();

        System.out.println("Coordinati di Italia :" + coordinataItX + " , " + coordinataItY);
        //Comparo con equals, cosi possiamo vedere che possiamo entrare i metodi

        boolean sonoUguali = coordinataVeX.equals(coordinataVeY);
        System.out.println("Sono Uguali =" + sonoUguali);

        boolean sonoUguali2= coordinateVe.equals(coordinateBu);
        System.out.println("Sono Uguali =" + sonoUguali2);

    }

}