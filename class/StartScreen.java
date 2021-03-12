import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class StartScreen extends World
{
    private GreenfootSound music = new GreenfootSound("ingame.mp3");
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(650, 850, 1); 
        prepare();
        Greenfoot.start();
    }
    
    private void prepare()
    {
        Pengu pengu = new Pengu();
        addObject(pengu,346,542);
        Instructions instructions = new Instructions();
        addObject(instructions, getWidth()/2, getHeight()/2);
    }


    public void act()
    {
        music.playLoop();
        
        if (Greenfoot.isKeyDown("enter"))
        {
              Greenfoot.setWorld(new MyWorld());
        }
    }
}