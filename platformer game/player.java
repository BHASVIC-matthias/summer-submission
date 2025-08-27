import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpHeight = -20;
    private int collect = 0;
    boolean tenCollected = false;
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        checkFalling();
        collect();
        nextLevel();
    }
    private void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    }
    public void move()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-4);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move(4);
        }
        if(Greenfoot.isKeyDown("space"))
        {
            if(onGround()==true || onGroundMid()==true || onGroundHi()==true)
           {
            vSpeed = jumpHeight;
            fall();
        }
        }
    }
    boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2,ground.class);
        return under != null;
    }
    boolean onGroundMid()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2,groundMid.class);
        return under != null;
    }
    boolean onGroundHi()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2,groundHi.class);
        return under != null;
    }
    public void checkFalling()
    {
        if(onGround()==false && onGroundMid()==false && onGroundHi()==false)
        {
            fall();
        }
        
        
    }
    public void collect()
    {
        Actor coin = getOneIntersectingObject(coin.class);
        if (coin!=null)
        {
            getWorld().removeObject(coin);
            collect++;
        }
        if (collect==10 && tenCollected==false)
        {
            getWorld().addObject(new door(), 750, 350);
            tenCollected = true;
        }
    }
    public void nextLevel()
    {
    Actor door = getOneIntersectingObject(door.class);
    if(door!=null)
    {
       Greenfoot.setWorld(new background2());     
    }
    }   
}
