import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class snake extends Actor
{
    int speed = 2;
    /**
     * Act - do whatever the snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public snake()
    {
        getImage().scale(getImage().getWidth() / 2, getImage().getHeight() / 2);
    }
    public void act()
    {
        move();
    }
    public void move()
    {
        setLocation(getX(),getY() + speed);
        if (isTouching(walls.class))
        {
            speed=-speed;
        }
    }
}
