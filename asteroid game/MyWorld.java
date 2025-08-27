import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    counter counter = new counter();
    healthbar healthbar = new healthbar();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    public counter getCounter()
    {
        return counter;
    }
    public healthbar getHealthBar()
    {
        return healthbar;
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        player player = new player();
        addObject(player,247,281);
        rock rock = new rock();
        addObject(rock, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        rock rock2 = new rock();
        addObject(rock2, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        rock rock3 = new rock();
        addObject(rock3, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        rock rock4 = new rock();
        addObject(rock4, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));

        addObject(counter,75,58);
        
        addObject(healthbar,226,62);
    }
    
}
