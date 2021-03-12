import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Death extends Actor
{
    public Death() 
    {

        // Code to decrease size of pogo kid.
        GreenfootImage myImage = getImage();
        int spikeheight = (int)myImage.getHeight()/2;
        int spikewidth = (int)myImage.getWidth();
        myImage.scale(spikewidth, spikeheight);

    }    
    
    public void act()
    {
        
    }
}
