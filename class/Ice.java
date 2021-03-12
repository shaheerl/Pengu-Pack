import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Ice extends Actor
{
    public Ice()
    {
        GreenfootImage myImage = getImage();
        int BackgroundNewHeight = (int)myImage.getHeight();
        int BackgroundNewWidth = (int)myImage.getWidth()*2;
        myImage.scale(BackgroundNewWidth, BackgroundNewHeight);
    }
    
    public void act() 
    {
         if (getY() > 845)
        {
            getWorld().removeObject(this);
        }
    }    
}
