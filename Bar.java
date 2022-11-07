import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Jan Allewelt & Lenujan Baskaran
 * @version 1 
 */
public class Bar extends Actor
{
    private int count = 0;
    private int tankLive = 100;
    public Bar() { 
        updateImage();
    } 
    public void bumpCount(int amount) { 
        count += amount; 
        updateImage();
    }
    public void removeLive(int amount){
        tankLive -= amount;
        updateImage();
    }
    public int getCounter(){
        return count;
    }
    public int getLive(){
        return tankLive;
    }
    private void updateImage(){
        setImage(new GreenfootImage("    " +count + " Points - " + tankLive + " Live    " , 50, Color.WHITE, Color.BLACK)); 

    }
}
