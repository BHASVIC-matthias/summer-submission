import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int enemyCount = 0;
    int enemyCount1 = 0; 
    counter counter = new counter();
    boolean bossLevel = false;
    healthbar healthbar = new healthbar();
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        setBackground("space.jpg");
        prepare();
    }
    public healthbar getHealthBar()
    {
        return healthbar;
    }
    public counter getCounter()
    {
        return counter;
    }
    public void boss()
    {
        if (counter.score == 25||counter.score == 26)
        {
            if (bossLevel == false)
            {
                addObject(new bosss(),300,0);
                bossLevel = true;
        }
        }
    }
    public void act()
    {
        enemyCount++;
        if(enemyCount>120)
        {
        addBot(); 
        enemyCount = 0;
    } 
        enemyCount1++;
        if(enemyCount1>180)
        {
        addSnake(); 
        enemyCount1 = 0;
    }
    boss();
    }
    public void addBot()
    {
       addObject(new bot(), Greenfoot.getRandomNumber(600), 0); 
    }
    public void addSnake()
    {
        addObject(new snake(), Greenfoot.getRandomNumber(600), 0);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(counter, 120, 50);
        addObject(healthbar, 280, 50);
        rocket rocket = new rocket();
        addObject(rocket,286,339);
        bot bot = new bot();
        addObject(bot,277,56);
        removeObject(rocket);
        removeObject(bot);
        new rocket();
        addObject(rocket,273,522);
        counter counter = new counter();
        addObject(counter,73,72);
        removeObject(counter);
        healthbar healthbar = new healthbar();
        addObject(healthbar,384,71);
        healthbar.setLocation(368,72);
        healthbar.setLocation(475,58);

        removeObject(healthbar);
    }
}
