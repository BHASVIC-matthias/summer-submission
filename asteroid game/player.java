import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int hSpeed = 0;
    int vSpeed = 0;
    boolean fired = false;
    boolean hitRock = false;
    public player()
    {
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
    }
    public void act()
    {
        turnCommand();
        accelerate();
        setLocation(getX() + hSpeed/3, getX() + vSpeed/3);
        //wrap();
        bounce();
        shoot();
        hitRock();
    }
    public void turnCommand()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setRotation(270);
        }
    }
    public void accelerate()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            if (getRotation() == 0)
            {
                hSpeed++;
            }
            if (getRotation() == 180)
            {
                hSpeed--;
            }
            if (getRotation() == 90)
            {
                vSpeed++;
            }
            if (getRotation() == 270)
            {
                vSpeed--;
            }
        }
    }
    public void wrap()
    {
        if(getX() == 0)
        {
            setLocation(598, getY());
        }
        if(getY() == 0)
        {
            setLocation(getX(), 398);
        }
        if(getX() == 599)
        {
            setLocation(2, getY());
        }
        if(getY() == 399)
        {
            setLocation(getX(), 2);
        }
    }
    public void bounce()
    {
        if(getX() == 0)
        {
            hSpeed = -hSpeed;
        }
        if(getY() == 0)
        {
            vSpeed = -vSpeed;
        }
        if(getX() == 599)
        {
            hSpeed = -hSpeed;
        }
        if(getY() == 399)
        {
            vSpeed = -vSpeed;
        }
    }
    public void shoot()
    {
        bullet bullet = new bullet();
        if(Greenfoot.isKeyDown("f")&&fired == false)
        {
           getWorld().addObject(bullet, getX(), getY()); 
           bullet.setRotation(getRotation());
           fired = true;
        }
        if(!Greenfoot.isKeyDown("f"))
        {
            fired = false;
        }
    }
    public void hitRock()
    {
        if(isTouching(allrocks.class) && hitRock == false)
        {
            MyWorld myWorld = (MyWorld)getWorld();
            healthbar healthbar = myWorld.getHealthBar();
            healthbar.health--;
            hitRock = true;
        }
        else if (isTouching(allrocks.class))
        {
            hitRock = false;
        }
    }
}
