package lecture6.second;

public class Main {
    public static void main(String[] args) throws Exception {

    try {
        Rose firstRose = new Rose(20, "red");
        Rose secondRose = new Rose(20, "red");
        Rose thirdRose = new Rose(20, "red");
        Rose foursRose = new Rose(20, "red");

        if(firstRose.getSize()<0){
            throw new WrongSizeException(firstRose.getSize());
        }

        Rose[] rosemassive = {firstRose, secondRose, thirdRose, foursRose};
        RoseBush roseBush = new RoseBush(firstRose.getSize(), firstRose.getColor(), rosemassive);

        Astra firstAstra = new Astra(15, "white");
        Chamomile firstChamomile = new Chamomile(15, "white");

        Flower[] flowers = {firstAstra, firstChamomile, firstRose, secondRose};

        Bouquet bouquet = new Bouquet(flowers);
    }catch (WrongSizeException ex){
        ex.printStackTrace();
    }catch (IllegalStateException ex){
        ex.printStackTrace();
    }


    }
}
