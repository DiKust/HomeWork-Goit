package Kust.Task7.MP3;

public abstract class MP3 {

    public String songName;
    private final int price;

    public MP3(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

//    public String getSong() {
//        return song;
//    }

    public void playSong(){
        System.out.print("Playing: " + songName);

    }







}
