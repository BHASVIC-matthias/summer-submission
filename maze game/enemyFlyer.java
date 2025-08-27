import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemyFlyer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemyFlyer extends enemies
{
    /**
     * Act - do whatever the enemyFlyer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public enemyFlyer()
    {
        getImage().scale(getImage().getWidth()/3, getImage().getHeight()/3);  
    }
    public void act()
    {
        move(5);
        wrap();
    }
    public void wrap()
    {
        int x = getX();
        int y = getY();
        int worldWidth = getWorld().getWidth() - 1;
        int worldHeight = getWorld().getHeight() - 1;
        if(x >= worldWidth)
        {
           setLocation(1, y); 
        }
        if(x <= 0)
        {
           setLocation(worldWidth - 1, y); 
        }
        if(y >= worldHeight)
        {
           setLocation(x, 1); 
        }
        if(y <= 0)
        {
           setLocation(x, worldHeight - 1); 
        }
    }
}
