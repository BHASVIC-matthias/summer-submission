import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class days here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class days extends Actor
{
    /**
     * Act - do whatever the days wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MyWorld world;
    public days(MyWorld world)
    {
       getImage().scale(100,100);
       getImage().clear();
       this.world = world;
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            getImage().setColor(world.color);
            getImage().fillRect(0,0,99,99);
        }
    }
}
