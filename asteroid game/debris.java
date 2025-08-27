import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class debris here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class debris extends allrocks
{
    int hSpeed = Greenfoot.getRandomNumber(5)+1;
    int vSpeed = Greenfoot.getRandomNumber(5)+1;
    /**
     * Act - do whatever the debris wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public debris()
    {
        getImage().scale(getImage().getWidth()/3, getImage().getHeight()/3);
        setRotation(Greenfoot.getRandomNumber(360));
    }
    public void act()
    {
        move(3);
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
