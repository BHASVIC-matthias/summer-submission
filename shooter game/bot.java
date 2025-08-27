import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bot extends enemy
{
    /**
     * Act - do whatever the bot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public bot()
    {
        setRotation(90);
    }
    public void act()
    {
       move();
       hit();
    }
    public void hit()
    {
        Actor bullet = getOneIntersectingObject(bullet.class);
        if (bullet != null)
        {
            getWorld().removeObject(bullet);
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            counter counter = myWorld.getCounter();
            counter.addScore();
            getWorld().removeObject(this);
            
        }
        else if(getY()==599)
        {
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            healthbar healthbar = myWorld.getHealthBar();
            healthbar.loseHealth();
            getWorld().removeObject(this);
        }
    }
    
}
