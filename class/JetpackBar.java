import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class JetpackBar extends Actor
{
    private GreenfootImage bar;
    public int fuel = 1000;

    public JetpackBar()
    {
        bar = new GreenfootImage(100, 10);              
        bar.setColor(Color.GREEN);
        setImage(bar);
    }

    public void act() 
    {

        bar.clear();
        bar.fillRect(0, 0, fuel/10, 9);

        if (Greenfoot.isKeyDown("space"))
        {
            if (fuel > 0)
            {
                fuel = fuel - 10;
            }
        }
        if (!Greenfoot.isKeyDown("space"))
        {
            if (fuel < 999)
            {
                fuel = fuel + 2;
            }
        }
        if (fuel == 0)
        {
            fuel = 0;
        }

    }
}

   

