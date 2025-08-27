import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class tower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tower extends Actor
{
    /**
     * Act - do whatever the tower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int fireRate = 0;
    public tower()
    {
        getImage().scale(60,60);
    }
    public void act()
    {
      enemyDetect();  
    }
    public void enemyDetect()
    {
        fireRate++;
        List<enemy> enemies = getObjectsInRange(100,enemy.class);
        for(enemy eachEnemy : enemies)
        {
            if(fireRate > 9)
            {
            projectile projectile = new projectile();
            getWorld().addObject(projectile, getX(), getY());
            projectile.turnTowards(eachEnemy.getX(),eachEnemy.getY());
            fireRate = 0;
        }
        }
    }
}
