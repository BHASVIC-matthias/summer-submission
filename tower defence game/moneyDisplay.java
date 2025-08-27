import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class money here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class moneyDisplay extends Actor
{
    /**
     * Act - do whatever the money wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MyWorld game;
    public moneyDisplay()
    {
        setImage(new GreenfootImage("Money: "+game.money,40 , Color.BLACK, new Color(0,0,0,0)));
    }
    public void act()
    {
        setImage(new GreenfootImage("Money: "+game.money,40 , Color.BLACK, new Color(0,0,0,0)));
        if(Greenfoot.mouseClicked(this))
            game.money = 100;
        
    }
}
