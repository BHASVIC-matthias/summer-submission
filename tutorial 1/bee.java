import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bee extends Actor
{
    /**
     * Act - do whatever the bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
    }
    public void moveAround()
    {
        move(2);
        if (getX() >= 599)
        {
            setLocation(0, getY());
        }
        else if (getY() >= 399)
        {
            setLocation(getX(), 20); 
        }
        if (Greenfoot.isKeyDown("left"))
        {
            //turn(-1);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            //turn(1);
        }
            
        }
    }

