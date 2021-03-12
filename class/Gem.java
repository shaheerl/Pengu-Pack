import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Gem extends Actor
{
    public Gem()
    {
        GreenfootImage myImage = getImage();
        int BackgroundNewHeight = (int)myImage.getHeight()/10;
        int BackgroundNewWidth = (int)myImage.getWidth()/10;
        myImage.scale(BackgroundNewWidth, BackgroundNewHeight);
        
    }
    
    public void act() 
    {
        
    }    
}
