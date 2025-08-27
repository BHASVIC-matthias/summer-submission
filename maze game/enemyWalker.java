import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemyWalker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemyWalker extends enemies
{
    /**
     * Act - do whatever the enemyWalker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean upDown;
    int speed = 2;
    public enemyWalker(boolean upAndDown)
    {
        getImage().scale(getImage().getWidth()/3, getImage().getHeight()/3);
        upDown = upAndDown; 
    }
    public void act()
    {
        moveAround();
        enemyHitWall();
    }
    public void enemyHitWall()
    {
    int worldWidth = getWorld().getWidth() - 1;
    int worldHeight = getWorld().getHeight() - 1;
    int x = getX();
       int y = getY();
       if(hitWall())
        {
          speed = -speed;  
        } 
        if(x >= worldWidth)
        {
           setLocation(1, y); 
        }
        if(x <= 0)
        {
           setLocation(worldWidth - 1, y); 
        }
        if(y >= worldHeight)
        {
           setLocation(x, 1); 
        }
        if(y <= 0)
        {
           setLocation(x, worldHeight - 1); 
        }
    }
    private void moveAround()
    {
       int x = getX();
       int y = getY();
       if(upDown)
       {
       setLocation(x,y + speed);
    }
    else if (!upDown)
    {
      setLocation(x + speed, y);  
    }
    }
}
