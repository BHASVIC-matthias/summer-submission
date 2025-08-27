import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wallHeightSmall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wallHeightSmall extends walls
{
    /**
     * Act - do whatever the wallHeightSmall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public wallHeightSmall()
    {
        getImage().scale(getImage().getWidth() / 3, getImage().getHeight() * 3);
    }
    public void act()
    {
        // Add your action code here.
    }
}
