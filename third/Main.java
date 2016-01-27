package lecture6.third;


public class Main {
    public static void main(String[] args) {

    try {
        Guitar guitar = new Guitar(6, "black");
        Piano piano = new Piano(40, "white");
        MusicalInstrument[] instruments = {guitar, piano};

        MusicShop shop = new MusicShop(instruments);

        if(guitar.getNumberOfStrings()<0){
            throw new WrongStringNumberException(guitar.getNumberOfStrings());
        }

    }catch (WrongStringNumberException ex){
        ex.printStackTrace();
    }catch (IllegalStateException ex){
        ex.printStackTrace();
    }

    }

}
