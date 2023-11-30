package oops;
class Computer{
    public void playMusic(){
        System.out.println("playing music");
    }
    public String getMePen(int money){
        if(money>10)
        return "pen";

        return "Nothing";
    }
}
public class music {
    public static void main(String[] args){
        Computer cb = new Computer();
        cb.playMusic();      // playing music
        System.out.println(cb.getMePen(78));
    }
}
