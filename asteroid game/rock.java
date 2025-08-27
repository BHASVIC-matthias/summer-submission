import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class rock extends allrocks
{
    int hSpeed = Greenfoot.getRandomNumber(5)+1;
    int vSpeed = Greenfoot.getRandomNumber(5)+1;
    /**
     * Act - do whatever the rock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public rock()
    {
        if(Greenfoot.getRandomNumber(2) == 1)
        {
            hSpeed = -hSpeed;
        }
        if(Greenfoot.getRandomNumber(2) == 1)
        {
            vSpeed = -vSpeed;
        }
    }
    public void act()
    {
        setLocation(getX() + hSpeed/3, getX() + vSpeed/3);
        bounce();
    }
    public void bounce()
    {
        if(getX() == 0)
        {
            hSpeed = -hSpeed;
        }
        if(getY() == 0)
        {
            vSpeed = -vSpeed;
        }
        if(getX() == 599)
        {
            hSpeed = -hSpeed;
        }
        if(getY() == 399)
        {
            vSpeed = -vSpeed;
        }
    }
}
