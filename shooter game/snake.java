import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class snake extends enemy
{
    int timesHit = 2;
    /**
     * Act - do whatever the snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        hit();
      
}
public void hit()
    {
        Actor bullet = getOneIntersectingObject(bullet.class);
        if (bullet != null)
        {
            getWorld().removeObject(bullet);
            timesHit--;
        }
        if (timesHit == 0)
        {
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            counter counter = myWorld.getCounter();
            counter.addScore();
            counter.addScore();
            getWorld().removeObject(this);
        }
        else if (getY()==599)
        {
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            healthbar healthbar = myWorld.getHealthBar();
            healthbar.loseHealth();
            getWorld().removeObject(this);
        }
}

}
