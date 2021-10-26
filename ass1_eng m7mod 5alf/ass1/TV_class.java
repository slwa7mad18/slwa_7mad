
package ass1;

public class TV {
    
  private int channel;
  private int volumeLevel;
  private boolean on;

    public TV(int channel,int volumeLevel,boolean on) {
        
        channel=5;
        volumeLevel=5;
        on=true;
    }
    
    public void turnOn()
    {
    on=true;
    System.out.println("tv is on "+on);
    }
    public void turnOff()
    {
    on=false;
     System.out.println("tv is off "+on);

    }

    public void setChannel(int channel) {
        if (channel>=1&&channel<=120) {
             this.channel = channel;
          System.out.println("the channel is " +channel);

        }
       
    }

    public void setVolumLevel(int volumeLevel) {
        if (volumeLevel>=1&&volumeLevel<=7) {
             this.volumeLevel = volumeLevel;
            System.out.println("the volume is "+volumeLevel);

        }
    }
     public void channelUp() {
         if (channel<120) {
          channel++;
         System.out.println("the level of channel is " +channel);

         }
    }

    public void channelDown() {
        if (channel>1) {
          channel--;
         System.out.println("the level of channel is " +channel);

         }
    }
     public void volumeUp() {
         if (volumeLevel<7) {
            volumeLevel++; 
        System.out.println("the level of volume is "+volumeLevel);
         }
       
    }

    public void volumeDown() {
        if (volumeLevel>1) {
            volumeLevel--; 
         System.out.println("the level of volume is "+volumeLevel);
         }
    }
    
}
