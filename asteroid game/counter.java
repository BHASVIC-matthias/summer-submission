import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class counter extends Actor
{
    /**
     * Act - do whatever the counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int score = 0;
    public counter()
    {
        setImage(new GreenfootImage("score:" + score, 40, Color.BLUE, Color.WHITE));
    }
    public void act()
    {
        setImage(new GreenfootImage("score:" + score, 40, Color.BLUE, Color.WHITE));
        win();
    }
    public void win()
    {
        if(score == 10)
        {
        getWorld().addObject(new youwin(), 300, 200);
    }
    }
    public void addScore()
    {
        score++;
    }
}
