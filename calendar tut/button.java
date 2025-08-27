import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class button extends Actor
{
    /**
     * Act - do whatever the button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Color color;
    MyWorld world;
    public button(Color color, MyWorld world)
    {
        this.color = color;
        this.world = world;
        getImage().setColor(color);
        getImage().scale(20,50);
        getImage().fillRect(0,0,10,50);
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            world.color=color;
        }
    }
}
