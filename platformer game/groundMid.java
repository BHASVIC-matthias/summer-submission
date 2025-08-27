import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class groundMid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class groundMid extends Actor
{
    /**
     * Act - do whatever the groundMid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public groundMid()
    {
       getImage().scale(getImage().getWidth()*2, getImage().getHeight()/3); 
    }
    public void act()
    {
       if(Greenfoot.isKeyDown("right"))
        {
        move(-4);
    }
    if(Greenfoot.isKeyDown("left"))
        {
        move(4);
    }
    if(getX()==0)
    {
        setLocation(getWorld().getWidth()-1, Greenfoot.getRandomNumber(150)+300);
}
}
}
