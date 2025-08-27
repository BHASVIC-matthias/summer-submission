import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.List;
public class enemy extends Actor
{
    /**
     * Act - do whatever the enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MyWorld world;
    public int health = 5;
    public enemy(int level)
    {
        if(level == 1)
        {
            setImage("spider.png");
        }
        if(level == 2)
        {
            setImage("snake2.png");
        }
    }
    public void act()
    {
        move(2);
        List<road> road90 = getObjectsAtOffset(-30,0,road.class);
        for(road roads: road90)
        {
            if(roads.straight == false && getRotation() == 0)
            {
                setRotation(roads.turn);
            }
        }
        hit();
    }
    public void hit()
    {
        Actor projectile = getOneIntersectingObject(projectile.class);
        if(projectile != null)
        {
            health--;
            getWorld().removeObject(projectile); 
        }
        if(health<1)
        {
            world.money += 50;
            getWorld().removeObject(this);
        }
        else if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
}
