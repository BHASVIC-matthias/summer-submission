import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bullet extends Actor
{
    /**
     * Act - do whatever the bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(5);
        Actor rock = getOneIntersectingObject(rock.class);
        Actor debris = getOneIntersectingObject(debris.class);
        if (rock != null)
        {

            getWorld().removeObject(rock);
            getWorld().addObject(new debris(), getX(), getY());
            getWorld().addObject(new debris(), getX(), getY());
            MyWorld myWorld = (MyWorld)getWorld();
            counter counter = myWorld.getCounter();
            counter.addScore();
            getWorld().removeObject(this);
        }
        else if (debris != null)
        {
            getWorld().removeObject(debris);
            MyWorld myWorld = (MyWorld)getWorld();
            counter counter = myWorld.getCounter();
            counter.addScore();
            getWorld().removeObject(this);
        }
        else if(getX() == 0)
        {
            getWorld().removeObject(this);
        }
        else if(getY() == 0)
        {
            getWorld().removeObject(this);
        }
        else if(getX() == 599)
        {
            getWorld().removeObject(this);
        }
        else if(getY() == 399)
        {
            getWorld().removeObject(this);
        }
    }
}
