import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class movers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class movers extends Actor
{
    int speed = 4;
    /**
     * Act - do whatever the movers wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }

    public void maxSpeed()
    {
        if(speed>=7)
        {
            speed = 7;
        }
    }

    public void move()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
            move(speed);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
            move(speed);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setRotation(270);
            move(speed);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
            move(speed);
        }
    }

    public void slide()
    {
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(x+speed, y);
            if(hitWall())
            {
                setLocation(x-speed, y);  
            }
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(x-speed, y);
            if(hitWall())
            {
                setLocation(x+speed, y);  
            }
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(x, y-speed);
            if(hitWall())
            {
                setLocation(x, y+speed);  
            }
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(x, y+speed);
            if(hitWall())
            {
                setLocation(x, y-speed);  
            }
        }
    }

    public boolean hitWall()
    {
        if(isTouching(block.class))
        {
            return true;
        }
        else
        {
            return false;  
        }
    }

    public void collect()
    {
        if(isTouching(boost.class))
        {
            speed++;
            removeTouching(boost.class);
        }
    }

    public boolean hitEnemy()
    {
        if(isTouching(enemies.class))
        {
           return true; 
        }
        else
        {
            return false;
        }
    }
}
