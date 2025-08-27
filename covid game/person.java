import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class person extends Actor
{
    public boolean infected = false;
    
    int recoveryTime = 0;
    int infectRadius = 20;
    MyWorld world;
    public person()
    {
        getImage().scale(40,40);
        setRotation(Greenfoot.getRandomNumber(360));
    }
    
    public void act()
    {
        move();
        contract();
        socialDistance(world.socialDistance);
        if(MyWorld.maskOn)
        {
         infectRadius = 10;
         getImage().setColor(Color.WHITE);
         getImage().fillOval(14,5,10,4);
        }
        if(!MyWorld.maskOn)
        {
          getImage().setColor(Color.BLACK);
         getImage().fillOval(14,5,10,4);
        }
    }
    public void contract()
    {
        List<person> people = getObjectsInRange(20, person.class);
        for(person person : people)
        {
            if(person.infected && infected == false)
            {
                infect();
                infected = true;
                
            }
        }
        if(infected)
        {
            recoveryTime++;
        }
        if(recoveryTime >=200 && infected == true)
        {
            heal();
            
        }
    }
    public void socialDistance(boolean enabled)
    {
        if(enabled){
        List<person> people = getObjectsInRange(60, person.class);
        for(person person : people)
        {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
    }
}
    public void move()
    {
        move(4);
        turn(Greenfoot.getRandomNumber(19) - 9); 
        if(isAtEdge())
            turn(30);
            
    }
    public void infect()
    {
        getImage().setColor(Color.RED);
        getImage().fillRect(5,0,10,20);
        getImage().fillRect(0,5,20,10);
        infected = true;
        world.numInfected++;
    }
    public void heal()
    {
        getImage().setColor(Color.GREEN);
        getImage().fillRect(5,0,10,20);
        getImage().fillRect(0,5,20,10);
        world.numRecovered++;
        world.numInfected--;
    }
}
