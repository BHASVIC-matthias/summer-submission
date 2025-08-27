import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mouse extends Actor
{
    int speed = 3;
    int collect = 0;
    /**
     * Act - do whatever the mouse wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public mouse()
    {
     getImage().scale(getImage().getWidth() / 2, getImage().getHeight() / 2);   
    }
    public void act()
    {
        move();
        hitCake();
        win();
        lose();
    }
    public void move()
    {
        if (Greenfoot.isKeyDown("right"))
        {
           setLocation(getX() + 3, getY());  
           if (hitWall() == true)
           {
               setLocation(getX() -3, getY());
           }
        }
        if (Greenfoot.isKeyDown("left"))
        {
           setLocation(getX() - 3, getY()); 
           if (hitWall() == true)
           {
               setLocation(getX() +3, getY());
           }
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - 3); 
            if (hitWall() == true)
           {
               setLocation(getX(), getY() + 3);
           }
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + 3); 
            if (hitWall() == true)
           {
               setLocation(getX(), getY() -3);
           }
        }
    }
    public boolean hitWall()
    {
     if (isTouching(walls.class))
     {
         return true;
     }
     else
     {
         return false;
     }
    }
    public void hitCake()
    {
        if(getOneIntersectingObject(cake.class)!=null)
        {
            speed++;
            collect++;
            getWorld().removeObject(getOneIntersectingObject(cake.class));
        }
    }
    public boolean hitEnemy()
    {
        if(isTouching(spider.class))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean hitEnemy2()
    {
        if(isTouching(snake.class))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void lose()
    {
        if(hitEnemy() || hitEnemy2())
        {
            getWorld().addObject(new youLose(), 375, 275);
            Greenfoot.stop();
        }
    }
        public void win()
        {
            if(isTouching(youWin.class) && collect == 4)
            {
               getWorld().addObject(new youWin(), 375, 275);
               Greenfoot.stop();
            }
        }
    
}


