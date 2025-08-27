import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class man here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class man extends Actor
{
    int speed = 2;
    /**
     * Act - do whatever the man wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
       
        
        
        
        
    
    public void act()
    {
        // Add your action code here.
        moveAround();
        hitEnemy();
        youWin();
    }
    public void moveAround()
    {
      move(speed);
        if (Greenfoot.isKeyDown("right"))
        {
            turn(4);
        }
         if (Greenfoot.isKeyDown("left"))
        {
            turn(-4);
        }  
        if (Greenfoot.isKeyDown("space"))
        {
            speed = 3;
        }
        else if (Greenfoot.isKeyDown("v"))
        {
            speed = 1;
        }
    }
    public void hitEnemy()
    {
        if (isTouching(bee.class))
        {
            getWorld().addObject(new youLose(), 400, 300);
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
    }
    public void youWin()
    {
       if(getY() >= 599)
       {
           getWorld().addObject(new youWin(), 400, 300);
       }
    }
    }
 
