import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Gegner.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Gegner extends Actor
{
    private int gegnerSpeed = Greenfoot.getRandomNumber(10);
    public Gegner()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 1000, image.getHeight() - 400);
        setImage(image);
    }
    public void act() 
    {
        setLocation(getX() - gegnerSpeed, getY());
        if(this.isTouching(Bullet.class)) {
            getWorld().removeObject(getOneIntersectingObject(Bullet.class));
            gegnerSpeed = Greenfoot.getRandomNumber(10);
            setLocation(1000, Greenfoot.getRandomNumber(200) + 400);
            MyWorld world = (MyWorld) getWorld(); 
            Bar bar = world.getBar(); 
            bar.bumpCount(5);
        }
        if(Greenfoot.getRandomNumber(40)>38){
             getWorld().addObject(new Bullet(false,10), getX()-180, getY() -25);

        }
    }    
}