/**
 * The purpose of this class is to model a television.
 * Amanda Yoresh  2/22/2020
 */



public class Television {

    //represents the Television's manufacturer
    String MANUFACTURER = "";
    //represents the screen size of the television
    int SCREEN_SIZE = 0;
    //represents if the television is turned on or turned off
    boolean powerOn;
    //represent the channel and volume of the television
    int channel, volume;


    /**
     * This constructor sets the manufacturer and screen size. It also sets the television to be powered off,
     * be on channel 2, and have a volume of 20.
     * @param MANUFACTURER
     * @param SCREEN_SIZE
     */
    Television(String MANUFACTURER, int SCREEN_SIZE){

        this.MANUFACTURER = MANUFACTURER;
        this.SCREEN_SIZE = SCREEN_SIZE;
        powerOn = false;
        volume = 20;
        channel = 2;

    }


    /**
     * Changes state of power. If power is on, turns power off. If power is off, turns power on.
     */
    public void power(){
        if (powerOn){
            powerOn = false;
        }
        else if (!powerOn){
            powerOn = true;
        }
    }

    /**
     * Increases volume by 1.
     */
    public void increaseVolume(){
        volume++;
    }

    /**
     * Decreases volume by 1.
     */
    public void decreaseVolume(){
        volume--;
    }

    /**
     * Sets channel to channel passed
     * @param channel
     */
    public void setChannel(int channel){
        this.channel = channel;
    }

    /**
     * Gets channel
     * @return
     */
    public int getChannel() {
        return channel;
    }

    /**
     * Gets volume
     * @return
     */
    public int getVolume(){
        return volume;
    }

    /**
     * Gets manufacturer
     * @return
     */
    public String getManufacturer(){
        return MANUFACTURER;
    }

    /**
     * Gets screen size
     * @return
     */
    public int getScreenSize(){
        return SCREEN_SIZE;
    }






}
