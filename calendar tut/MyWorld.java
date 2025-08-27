import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Color color; 
    
    button red = new button(Color.RED, this);
    button blue = new button(Color.BLUE, this);
    button yellow = new button(Color.YELLOW, this);
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 600, 1);
        //bg color
        getBackground().setColor(Color.LIGHT_GRAY);
        getBackground().fill();
        
        //method calls
        drawCalendar();
        addButtons();
        
        addObject(new days(this), 50, 150);
        
    }

    public void drawCalendar()
    {
        GreenfootImage column = new GreenfootImage(2, 600);
        GreenfootImage row = new GreenfootImage(700, 2);
        column.setColor(Color.BLACK);
        row.setColor(Color.BLACK);
        column.fillRect(0,0,1,599);
        row.fillRect(0,0,699,1);
        for(int i = 0; i < 6; i++)
            getBackground().drawImage(column, i * 100 + 100, 100);
        for(int i = 0; i < 5; i++)
            getBackground().drawImage(row, 0, i * 100 + 100);

        //title
        getBackground().setColor(Color.GREEN);
        getBackground().fillRect(0,0, 699, 99);
        GreenfootImage title = new GreenfootImage("DECEMBER", 100, Color.RED, Color.GREEN, Color.BLACK);
        getBackground().drawImage(title, 125, 0);

        //corner dates
        int dayCount = 1;
        for(int Week = 0; Week < 5; Week++)
            for(int daysOfweek = 0; daysOfweek < 7; daysOfweek++)
            {
                if (dayCount < 32){
                    showText(""+dayCount, daysOfweek * 100 + 90, Week * 100 + 110);
                    addObject(new days(this), daysOfweek *100 + 50,Week * 100 + 150);
                    dayCount++;
                }
            }
    }
    public void addButtons()
    {
       addObject(red,20,20);
       addObject(blue,50,20);
       addObject(yellow,80,20);
       
    }
}

