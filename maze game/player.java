import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends players
{
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int playerLives;
    public player(int lives)
    {
      getImage().scale(getImage().getWidth()/3, getImage().getHeight()/3);  
      playerLives = lives;
    }
    public void act()
    {
       //move();
       slide();
       collect();
       loseLife();
       playerHit();
       
    }
    public void playerHit()
    {
        if(hitEnemy() == true)
        {
             setLocation(40,585);
        }
    }
    public void loseLife()
    {
        if(hitEnemy())
        {
            playerLives--;
        }
    }
    public void youLose()
    {
        if(playerLives == 0)
        {
            getWorld().addObject(new youLose(), 300, 300);
        }
    }
}
