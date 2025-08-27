import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cloud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cloud extends Actor
{
    /**
     * Act - do whatever the cloud wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public cloud()
    {
        getImage().scale(getImage().getWidth()*4, getImage().getHeight()*4); 
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("right"))
        {
        move(-1);
    }
    if(Greenfoot.isKeyDown("left"))
        {
        move(1);
    }
    if(getX()==0)
    {
        setLocation(getWorld().getWidth()-1, Greenfoot.getRandomNumber(170)+30);
    }
}

}
