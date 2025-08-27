import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rocket extends Actor
{
    boolean canFire = true;
    public rocket()
    {
        setRotation(-90);
    }
    /**
     * Act - do whatever the rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        fireBullet();
    }
    public void move()
    {
        if(Greenfoot.isKeyDown("right"))
        {
           setLocation(getX()+7, getY()); 
        }
        if(Greenfoot.isKeyDown("left"))
        {
           setLocation(getX()-7, getY()); 
        }
}
public void fireBullet()
{
    if (Greenfoot.isKeyDown("space") && canFire == true)
    {
        getWorld().addObject(new bullet(), getX(), getY() - 35);
        canFire = false;
    }
    else if (!Greenfoot.isKeyDown("space"))
    {
        canFire = true;
    }
}
}
