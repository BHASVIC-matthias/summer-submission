import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mazeWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mazeWorld extends World
{

    /**
     * Constructor for objects of class mazeWorld.
     * 
     */
    public mazeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        block block = new block();
        addObject(block,0,11*50);
        block block2 = new block();
        addObject(block2,0,10*50);
        block block3 = new block();
        addObject(block3,0,9*50);
        block block4 = new block();
        addObject(block4,0,8*50);
        block block5 = new block();
        addObject(block5,0,7*50);
        block block6 = new block();
        addObject(block6,0,6*50);
        block block7 = new block();
        addObject(block7,0,5*50);
        block block8 = new block();
        addObject(block8,0,4*50);
        block block9 = new block();
        addObject(block9,1*50,4*50);
        block block10 = new block();
        addObject(block10,2*50,4*50);
        block block11 = new block();
        addObject(block11,3*50,4*50);
        block block12 = new block();
        addObject(block12,3*50,11*50);
        block block13 = new block();
        addObject(block13,3*50,10*50);
        block block14 = new block();
        addObject(block14,3*50,9*50);
        block block15 = new block();
        addObject(block15,3*50,8*50);
        block block16 = new block();
        addObject(block16,3*50,7*50);
        block block17 = new block();
        addObject(block17,4*50,7*50);
        block block18 = new block();
        addObject(block18,5*50,7*50);
        block block19 = new block();
        addObject(block19,6*50,7*50);
        block block20 = new block();
        addObject(block20,6*50,8*50);
        block block21 = new block();
        addObject(block21,6*50,9*50);
        block block22 = new block();
        addObject(block22,5*50,9*50);
        block block23 = new block();
        addObject(block23,5*50,11*50);
        block block24 = new block();
        addObject(block24,6*50,11*50);
        block block25 = new block();
        addObject(block25,7*50,11*50);
        block block26 = new block();
        addObject(block26,8*50,11*50);
        block block27 = new block();
        addObject(block27,9*50,11*50);
        block block28 = new block();
        addObject(block28,9*50,10*50);
        block block29 = new block();
        addObject(block29,9*50,9*50);
        block block30 = new block();
        addObject(block30,9*50,8*50);
        block block31 = new block();
        addObject(block31,9*50,7*50);
        block block32 = new block();
        addObject(block32,10*50,7*50);
        block block33 = new block();
        addObject(block33,10*50,8*50);
        block block34 = new block();
        addObject(block34,10*50,9*50);
        block block35 = new block();
        addObject(block35,10*50,10*50);
        block block36 = new block();
        addObject(block36,10*50,11*50);
        block block37 = new block();
        addObject(block37,10*50,6*50);
        block block38 = new block();
        addObject(block38,10*50,5*50);
        block block39 = new block();
        addObject(block39,9*50,5*50);
        block block40 = new block();
        addObject(block40,8*50,5*50);
        block block41 = new block();
        addObject(block41,8*50,4*50);
        block block42 = new block();
        addObject(block42,8*50,3*50);
        block block43 = new block();
        addObject(block43,9*50,3*50);
        block block44 = new block();
        addObject(block44,10*50,3*50);
        block block45 = new block();
        addObject(block45,10*50,2*50);
        block block46 = new block();
        addObject(block46,7*50,4*50);
        block block47 = new block();
        addObject(block47,6*50,4*50);
        block block48 = new block();
        addObject(block48,6*50,5*50);
        block block49 = new block();
        addObject(block49,1*50,7*50);
        block block50 = new block();
        addObject(block50,2*50,9*50);
        block block51 = new block();
        addObject(block51,1*50,11*50);
        block block52 = new block();
        addObject(block52,2*50,5*50);
        block block53 = new block();
        addObject(block53,4*50,4*50);
        block block54 = new block();
        addObject(block54,4*50,6*50);
        block block55 = new block();
        addObject(block55,7*50,8*50);
        block block56 = new block();
        addObject(block56,8*50,10*50);
        block block57 = new block();
        addObject(block57,11*50,2*50);
        block block58 = new block();
        addObject(block58,11*50,0*50);
        block block59 = new block();
        addObject(block59,10*50,0*50);
        block block60 = new block();
        addObject(block60,9*50,0*50);
        block block61 = new block();
        addObject(block61,8*50,0*50);
        block block62 = new block();
        addObject(block62,8*50,1*50);
        block block63 = new block();
        addObject(block63,7*50,1*50);
        block block64 = new block();
        addObject(block64,6*50,1*50);
        block block65 = new block();
        addObject(block65,6*50,2*50);
        block block66 = new block();
        addObject(block66,5*50,2*50);
        block block67 = new block();
        addObject(block67,4*50,2*50);
        block block68 = new block();
        addObject(block68,4*50,1*50);
        block block69 = new block();
        addObject(block69,4*50,0*50);
        block block70 = new block();
        addObject(block70,2*50,0*50);
        block block71 = new block();
        addObject(block71,3*50,0*50);
        block block72 = new block();
        addObject(block72,1*50,0*50);
        block block73 = new block();
        addObject(block73,0*50,0*50);
        block block74 = new block();
        addObject(block74,0*50,1*50);
        block block75 = new block();
        addObject(block75,0*50,2*50);
        block block76 = new block();
        addObject(block76,1*50,2*50);
        block block77 = new block();
        addObject(block77,2*50,2*50);
        block block78 = new block();
        addObject(block78,0*50,3*50);
        removeObject(block57);

        addObject(block57,11,2);
        removeObject(block37);

        boost boost = new boost();
        addObject(boost,561,438);
        boost boost2 = new boost();
        addObject(boost2,237,251);
        boost boost3 = new boost();
        addObject(boost3,58,43);
        enemyFlyer enemyFlyer = new enemyFlyer();
        addObject(enemyFlyer,248,295);
        enemyFlyer enemyFlyer2 = new enemyFlyer();
        addObject(enemyFlyer2,141,146);
        enemyWalker enemyWalker = new enemyWalker(true);
        addObject(enemyWalker,560,301);
        enemyWalker enemyWalker2 = new enemyWalker(false);
        addObject(enemyWalker2,140,48);
        enemyWalker.setLocation(398,365);

        youWin youWin = new youWin();
        addObject(youWin,569,61);
        player player = new player(5);
        addObject(player,104,576);
    }
}
