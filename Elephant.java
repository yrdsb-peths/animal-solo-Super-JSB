import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Elephant class, our hero.
 * 
 * @author (Jessie Lu) 
 * @version (April 27th, 2026)
 */
public class Elephant extends Actor
{
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound elephantSound = new GreenfootSound("elephant_sound.mp3");
    GreenfootImage[] idle = new GreenfootImage[8];
    
    public Elephant ()
    {
        for(int i = 0; i < 8; i++) {
            idle[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            
        }
    }
    
    /*
     * animate the elephant
     */
    int imageIndex = 0;
    public void animateElephant()
    {
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-2);
        }
        else if (Greenfoot.isKeyDown("right"))
        {
            move(2);
        }
        
        eat();
        
        //Animate elephant
        animateElephant();
    }
    
    
    //eats the apple and spawn new apple if an apple is eaten
    public void eat()
    {
        //remove apple if it eats it
        if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld(); //calls an instance of world that the object lives in
            world.createApple();
            world.increaseScore();
            elephantSound.play();
        }
        
    }
}
