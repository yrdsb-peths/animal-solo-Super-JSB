import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title screen
 * 
 * @author (your name) 
 * @version (may 5, 2026)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, 200);
        prepare();
    }

    public void act()
    {
        //satar the game if user press space
        if (Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }

    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,442,95);
        elephant.setLocation(492,127);
        Label label = new Label("Press <space> to start", 55);
        addObject(label,195,222);
        label.setLocation(323,222);
        label.setLocation(273,226);
        label.setLocation(272,225);
        Label label2 = new Label("use \u2190 and \u2192 to move", 50);
        addObject(label2,192,320);
        label2.setLocation(292,320);
    }
}
