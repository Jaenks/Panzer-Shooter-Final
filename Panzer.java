import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * @author Jan Allewelt & Lenujan Baskaran
 * @version 1 
 */
public class Panzer extends Actor
{
    private int gunReloadTime;              // Die minimale Verzögerung zwischen den Schüssen.
    private int reloadDelayCount;           // Zeitspanne seit dem letzten Schuss.
    private int shotsFired;                 // Anzahl der abgefeuerten Schüsse.
    
    private GreenfootImage Panzer = new GreenfootImage("Panzer.png");


    public Panzer()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 800, image.getHeight() - 380);
        setImage(image);
        gunReloadTime = 50;
        reloadDelayCount = 0;
        shotsFired = 2;
    }
    public int getShotsFired()
    {
        return shotsFired;
    }
     public void setGunReloadTime(int reloadTime)
    {
        gunReloadTime = reloadTime;
    }
    public void act() 
    {
        if(reloadDelayCount>0)reloadDelayCount--;
        if(Greenfoot.isKeyDown("up"))
        {
                setLocation(getX(), getY()-5);
        }
        if (Greenfoot.isKeyDown("down"))
        {
                setLocation(getX(), getY()+5);
        }
        if(Greenfoot.isKeyDown("space") && reloadDelayCount == 0){
                getWorld().addObject(new Bullet(true, 30), getX()+120, getY() -25);
                reloadDelayCount = gunReloadTime;
        }  
            if(this.isTouching(Bullet.class)) {
            MyWorld world = (MyWorld) getWorld(); 
            Bar bar = world.getBar(); 
            bar.removeLive(25);
            getWorld().removeObject(getOneIntersectingObject(Bullet.class));
        }
         }
    }    