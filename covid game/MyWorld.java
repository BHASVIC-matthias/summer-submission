import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    button popButton = new button("population: ");
    button infectedButton = new button("infected: ");
    button recoveredButton = new button("recovered: ");
    button vulnerableButton = new button("vulnerable: ");
    public static int population = 0;
    public static int numInfected = 0;
    public static int numRecovered = 0;
    public static int numVulnerable = 0;
    public static boolean socialDistance = false;
    public static boolean maskOn = false;
    button socialDistanceButton = new button("social distance: ");
    button maskButton = new button("mask: ");
    String input;
    int time;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        addObject(popButton,100,50);
        showText(""+ population,200,50);
        addObject(infectedButton,100,100);
        showText(""+ numInfected,200,100);
        addObject(recoveredButton,100,100);
        showText(""+ numRecovered,200,150);
        addObject(vulnerableButton, 100, 200);
        showText(""+ (population - numInfected),200,200);
        addObject(socialDistanceButton, 100, 250);
        showText(""+socialDistance, 250, 250);
        addObject(maskButton, 100, 300);
        showText(""+maskOn, 250, 300);
        setPaintOrder(button.class, person.class);
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(popButton))
        {
            input = JOptionPane.showInputDialog("How many people in the world?");
            population = Integer.parseInt(input);
            populate(population);
        }
        if(Greenfoot.mouseClicked(socialDistanceButton))
        {
            socialDistance = !socialDistance;
        }
        if(Greenfoot.mouseClicked(maskButton))
        {
            maskOn = !maskOn;
        }
        showText(""+ population,200,50);
        showText(""+ numInfected,200,100);
        showText(""+ numRecovered,200,150);
        showText(""+ (population - (numInfected + numRecovered)),200,200);
        showText(""+socialDistance, 250, 250);
        showText(""+maskOn, 250, 300);
        showText("time: "+(time/60),600,50);
    }
    public void populate(int population)
    {
        this.population = population;
        for(int i = 0; i < population; i++)
        {
            addObject(new person(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        person person = new person();
        addObject(person,203,292);
        person person2 = new person();
        addObject(person2,265,423);
        person person3 = new person();
        addObject(person3,373,343);
        person person4 = new person();
        addObject(person4,288,125);
        person person5 = new person();
        addObject(person5,458,147);
        person person6 = new person();
        addObject(person6,521,248);
        person person7 = new person();
        addObject(person7,496,366);
        removeObject(person7);
        removeObject(person3);
        removeObject(person2);
        removeObject(person);
        removeObject(person4);
        removeObject(person5);
        removeObject(person6);
    }
}
