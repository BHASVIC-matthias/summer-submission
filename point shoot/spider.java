import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class spider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class spider extends Actor
{
    
    /**
     * Act - do whatever the spider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int mouseX;
    int mouseY;
    public void act()
    {
      followMouse();
      fireProjectile();
      if(isTouching(door.class))
      {
          Greenfoot.setWorld(new level2());
      }
    }
    public void move()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-5,getY());
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+5,getY());
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-5);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+5);
        }
    }
    public void followMouse()
    {
        if(Greenfoot.getMouseInfo() != null)
        {
         mouseX = Greenfoot.getMouseInfo().getX();
         mouseY = Greenfoot.getMouseInfo().getY();
        turnTowards(mouseX, mouseY);
    }
    }
    public void fireProjectile()
    {
        if(Greenfoot.mouseClicked(null))
        {
            projectile p = new projectile();
            getWorld().addObject(p, getX(), getY());
            p.setRotation(getRotation());
        }
    }
}
