import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameOver extends World
{
    private GreenfootSound music = new GreenfootSound("tweety.mp3");

    public GameOver()
    {
        super(680, 600, 1); 
        GameOverText gmt = new GameOverText();
        addObject(gmt, 450, 150);
    }
    public void act()
    {
        music.playLoop();
    }
}
