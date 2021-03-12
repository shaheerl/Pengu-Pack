import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Coin extends Actor
{
    public Coin()
    {
        GreenfootImage myImage = getImage();
        int PlatNewHeight = (int)myImage.getHeight()/5;
        int PlatNewWidth = (int)myImage.getWidth()/5;
        myImage.scale(PlatNewWidth , PlatNewHeight);
    }

    /**
     * Method act
     *
     */
    public void act() 
    {

        if (getY() > 790)
        {
            getWorld().removeObject(this);
        }

    }
}

