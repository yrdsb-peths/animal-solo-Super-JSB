import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
          
        Elephant elephant = new Elephant();
        addObject(elephant, 300 ,200);
        
        createApple();
    }
    
    
    //create a new apple at random location at the top of screen
    public void createApple()
    {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = Greenfoot.getRandomNumber(300);
        
        addObject(apple, x, y);
    }
}
