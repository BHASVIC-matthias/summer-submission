import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class counter extends Actor
{
    int score = 0;
    /**
     * Act - do whatever the counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public counter()
    {
       setImage(new GreenfootImage("score:"+score, 50, Color.GREEN, Color.BLACK));
    }
    public void act()
    {
        setImage(new GreenfootImage("score:"+score, 50, Color.GREEN, Color.BLACK));
        youWin();
    }
    public void addScore()
    {
        score++;
    }
    public void youWin()
    {
        if (score >= 50)
        {
            getWorld().addObject(new youwin(), 300, 300);
        }
    }
}
