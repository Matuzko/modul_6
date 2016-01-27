package lecture6.first;




public class Main {

    public static void main(String[] args) {
        try {
            AudioFile song = new AudioFile("mp3", 200, true);
            ImageFile photo = new ImageFile("jpeg", 100, false);
            TextFile textFile = new TextFile("doc", 1028376, false);

            File[] files = {song, photo, textFile};


            Directory directory = new Directory(files);

            song.openFile();
            photo.openFile();
            textFile.openFile();

            if (song.getSize() < 0) {
                throw new WrongSizeException(song.getSize());
            }
        }catch (WrongSizeException ex){
            ex.printStackTrace();
        }catch (IllegalStateException ex){
            ex.printStackTrace();
        }
    }


}






