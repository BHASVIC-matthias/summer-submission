import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class healthbar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class healthbar extends Actor
{
    int health = 20;
    int hbWidth = 80;
    int hbHeight = 10;
    int pixelsPerHP = hbWidth/health;
    /**
     * Act - do whatever the healthbar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public healthbar()
    {
        update();
    }
    public void act()
    {
        lose();
    }
    public void update()
    {
        setImage(new GreenfootImage(hbWidth + 2, hbHeight + 2));
        getImage().setColor(Color.WHITE);
        getImage().drawRect(0,0,hbWidth + 1, hbHeight + 1);
        getImage().setColor(Color.RED);
        getImage().fillRect(1,1,health * pixelsPerHP, hbHeight);
    }
    public void lose()
    {
       if(health ==0)
       {
           getWorld().addObject(new youlose(), 300, 200);
           Greenfoot.stop();
       }
    }
}
