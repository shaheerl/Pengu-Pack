import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Lives extends Actor
{
    int totalCount = 3;

    public Lives()
    {
        setImage(new GreenfootImage("Lives: 3", 30, Color.WHITE, new Color(0,0,0,0)));
    }

    public void livesRemaining(int lost)
    {
        totalCount += lost;
        setImage(new GreenfootImage("Lives:" + totalCount, 30, Color.WHITE, new Color(0,0,0,0)));
    } 
}

