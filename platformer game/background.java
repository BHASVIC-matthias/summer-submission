import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends World
{

    /**
     * Constructor for objects of class background.
     * 
     */
    public background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void act()
    {
        if(Greenfoot.getRandomNumber(500)<=5)
        {
            addObject(new coin(),getWidth()-1, Greenfoot.getRandomNumber(300)+180);
        }
    }
    
    private void prepare()
    {
        ground ground = new ground();
        addObject(ground,150,479);
        ground ground2 = new ground();
        addObject(ground2,421,326);
        ground ground3 = new ground();
        addObject(ground3,703,201);
        ground ground4 = new ground();
        addObject(ground4,377,88);
        player player = new player();
        addObject(player,150,427);
        ground2.setLocation(346,414);
        ground3.setLocation(612,359);
        ground4.setLocation(363,246);
        ground4.setLocation(446,251);
        cloud cloud = new cloud();
        addObject(cloud,120,94);
        cloud cloud2 = new cloud();
        addObject(cloud2,355,72);
        cloud cloud3 = new cloud();
        addObject(cloud3,642,93);
        tree tree = new tree();
        addObject(tree,116,196);
        tree tree2 = new tree();
        addObject(tree2,187,228);
        cloud2.setLocation(281,129);
        tree tree3 = new tree();
        addObject(tree3,281,129);
        tree tree4 = new tree();
        addObject(tree4,331,196);
        tree tree5 = new tree();
        addObject(tree5,478,193);
        tree tree6 = new tree();
        addObject(tree6,544,201);
        tree tree7 = new tree();
        addObject(tree7,582,220);
        tree tree8 = new tree();
        addObject(tree8,596,264);
        tree tree9 = new tree();
        addObject(tree9,768,337);
        tree tree10 = new tree();
        addObject(tree10,743,434);
        tree tree11 = new tree();
        addObject(tree11,638,417);
        tree tree12 = new tree();
        addObject(tree12,612,532);
        tree tree13 = new tree();
        addObject(tree13,717,531);
        tree tree14 = new tree();
        addObject(tree14,695,498);
        tree tree15 = new tree();
        addObject(tree15,541,454);
        tree tree16 = new tree();
        addObject(tree16,506,576);
        tree tree17 = new tree();
        addObject(tree17,341,556);
        tree tree18 = new tree();
        addObject(tree18,401,490);
        tree tree19 = new tree();
        addObject(tree19,437,499);
        tree tree20 = new tree();
        addObject(tree20,482,350);
        tree tree21 = new tree();
        addObject(tree21,385,356);
        tree tree22 = new tree();
        addObject(tree22,285,293);
        tree tree23 = new tree();
        addObject(tree23,264,352);
        tree tree24 = new tree();
        addObject(tree24,182,332);
        tree tree25 = new tree();
        addObject(tree25,56,306);
        tree tree26 = new tree();
        addObject(tree26,55,409);
        tree tree27 = new tree();
        addObject(tree27,56,596);
        tree tree28 = new tree();
        addObject(tree28,111,531);
        tree tree29 = new tree();
        addObject(tree29,209,537);
        removeObject(tree3);
        cloud2.setLocation(366,86);
        ground ground5 = new ground();
        addObject(ground5,742,487);
        ground ground6 = new ground();
        addObject(ground6,28,279);
        ground ground7 = new ground();
        addObject(ground7,472,518);
        ground ground8 = new ground();
        addObject(ground8,189,206);
        ground ground9 = new ground();
        addObject(ground9,742,221);
        coin coin = new coin();
        addObject(coin,613,300);
        coin coin2 = new coin();
        addObject(coin2,720,434);
        coin coin3 = new coin();
        addObject(coin3,412,193);
        removeObject(ground2);
        removeObject(ground3);
        removeObject(ground4);
        removeObject(tree25);
        removeObject(ground8);
        tree19.setLocation(430,510);
        removeObject(ground6);
        removeObject(ground9);
        tree.setLocation(101,192);
        groundHi groundHi = new groundHi();
        addObject(groundHi,101,192);
        cloud2.setLocation(433,142);
        groundHi groundHi2 = new groundHi();
        addObject(groundHi2,433,142);
        groundHi groundHi3 = new groundHi();
        addObject(groundHi3,692,220);
        groundMid groundMid = new groundMid();
        addObject(groundMid,239,332);
        groundMid groundMid2 = new groundMid();
        addObject(groundMid2,585,345);
    }
}
