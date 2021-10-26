
package ass1;


public class Ass1 {

    public static void main(String[] args) {
        TV tv=new TV(4,3,true);
       tv.setChannel(10);
       tv.setVolumLevel(2);
       tv.turnOn();
       tv.turnOff();
       tv.channelUp();
       tv.setChannel(10);
       tv.channelDown();
       tv.volumeUp();
       tv.setVolumLevel(2);
       tv.volumeDown();
    }
    
}
