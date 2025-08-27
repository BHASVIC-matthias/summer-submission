import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static int money = 100;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    int basicTowerPrice = 50;
    
    int worldTime;
    
    int waveNumber = 1;
    
    int map[][] = {{0,0,0,0,0,0,0,0,0,0,0},
            {1,1,2,0,0,0,0,0,3,1,1},
            {0,0,1,0,0,3,1,1,4,0,0},
            {0,0,3,2,0,1,0,0,0,0,0},
            {0,0,0,1,0,1,0,0,0,0,0},
            {0,0,0,1,0,4,1,5,0,0,0},
            {0,0,0,1,0,0,0,1,0,0,0},
            {0,0,0,1,0,0,0,1,0,0,0},
            {0,0,0,3,1,1,1,4,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0},
        };

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(840, 600, 1);
        level1();
        prepare();
        addObject(new moneyDisplay(),720,30); 
    }

    public void act()
    {
        addTowers(); 
        worldTime++;
        spawnWave();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void level1()
    {
        for(int i = 0; i<10; i++) 
            for(int j = 0; j<10; j++)
            {
                if(map[j][i] == 1)
                {
                    addObject(new road(true), 30 + i * 60, 30 + j * 60);
                }
                if(map[j][i] == 2)
                {
                    addObject(new road(90), 30 + i * 60, 30 + j * 60);
                }
                if(map[j][i] == 3)
                {
                    addObject(new road(0), 30 + i * 60, 30 + j * 60);
                }
                if(map[j][i] == 4)
                {
                    addObject(new road(270), 30 + i * 60, 30 + j * 60);
                }
                if(map[j][i] == 5)
                {
                    addObject(new road(180), 30 + i * 60, 30 + j * 60);
                }
            }
        

    }
    public void spawnWave()
    {
        if(worldTime % 20 == 0)
        {
            addObject(new enemy(waveNumber),1,90);
        }
        if(worldTime % 400 == 399)
        {
            waveNumber++;
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        menu menu = new menu();
        addObject(menu,718,276);
        menu.setLocation(721,294);

        tower tower = new tower();
        addObject(tower,215,80);
        tower tower2 = new tower();
        addObject(tower2,268,371);
    }

    public void addTowers()
    {
        if(Greenfoot.mouseClicked(null) && Greenfoot.getMouseInfo().getActor() == null && money >= basicTowerPrice)
        {
            addObject(new tower(), (Greenfoot.getMouseInfo().getX()/ 60) * 60 + 30, (Greenfoot.getMouseInfo().getY()/ 60) * 60 + 30);
            money -= basicTowerPrice;
        }
    }
}
