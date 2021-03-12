import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
public class Cloud extends Actor
{
    public Cloud()
    
    {
        // Code to decrease size of pogo kid.
        GreenfootImage myImage = getImage();
        int CloudNewHeight = (int)myImage.getHeight()/2;
        int CloudNewWidth = (int)myImage.getWidth()/2;
        myImage.scale(CloudNewWidth, CloudNewHeight);
    }
    
    public void act()
    {
    }
    

}
