import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Counter extends Actor
{
    private int totalCount;

    public Counter()
    {
        setImage(new GreenfootImage("Score: 0", 30, Color.WHITE, new Color(0,0,0,0)));
    }

    public void bumpCount(int amount)
    {
        totalCount += amount;
        setImage(new GreenfootImage("Score:" + totalCount, 30, Color.WHITE, new Color(0,0,0,0)));
    } 
}
