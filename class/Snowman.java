import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Snowman extends Actor
{
    
     public Snowman()
    {
        // Code to decrease size of pogo kid.
        GreenfootImage myImage = getImage();
        int PogoNewHeight = (int)myImage.getHeight()/2;
        int PogoNewWidth = (int)myImage.getWidth()/2;
        myImage.scale(PogoNewWidth, PogoNewHeight);
    }
    
    public void act() 
    {
        if (getY() > 790)
        {
            getWorld().removeObject(this);
        }
    }    
}
