import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Jan Allewelt & Lenujan Baskaran
 * @version 1 
 */
public class Bullet extends Actor
{
    private int bulletSpeed = 20;
    private boolean toRight = true;
    public Bullet(boolean toRight, int bulletSpeed){
        this.toRight = toRight;
        this.bulletSpeed = bulletSpeed;
    }
    public void act()
    {
        if(toRight){
            setLocation(getX()+ bulletSpeed, getY());
        }
        if(!toRight){
            setLocation(getX()- bulletSpeed, getY());
        }
        if(getX() > 950 || getX() < 50) getWorld().removeObject(this);
    }
}
