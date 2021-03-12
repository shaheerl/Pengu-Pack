import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Trees extends Actor
{
    public Trees()
    {
        GreenfootImage myImage = getImage();
        int CloudNewHeight = (int)myImage.getHeight()/2;
        int CloudNewWidth = (int)myImage.getWidth()/2;
        myImage.scale(CloudNewWidth, CloudNewHeight);
    }

    public void act() 
    {
        if (getY() > 845)
        {
            getWorld().removeObject(this);
        }

    }    
}
