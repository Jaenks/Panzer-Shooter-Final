import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * @author Jan Allewelt & Lenujan Baskaran
 * @version 1 
 */
public class MyWorld extends World
{
    private Bar bar = new Bar();
    public MyWorld()
    {    
        super(1000, 692, 1);
        addObject(new Panzer(), 150,600);
        addObject(new Gegner(), 1000, 600);
        addObject(bar, 200, 100);
        
    }
    public void act(){
        if(bar.getCounter() >=100){
            Greenfoot.setWorld(new WinScreen());
            Greenfoot.stop();
        }
        if(bar.getLive() <=0){
            Greenfoot.setWorld(new GameOverScreen());
            Greenfoot.stop();
        }
    }
    public Bar getBar(){
        return bar;        
    }
}