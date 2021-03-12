import greenfoot.*;
import java.util.List;
/**
 * Shaheer & Fahad
 * POGO JUMPER
 */
public class Pengu extends Actor
{
    int totalOffset = 0;
    int livesleft = 3;
  
    //size code
    public Pengu()
    {
        // Code to decrease size of pogo kid.
        GreenfootImage myImage = getImage();
        int PogoNewHeight = (int)myImage.getHeight()/12;
        int PogoNewWidth = (int)myImage.getWidth()/12;
        myImage.scale(PogoNewWidth, PogoNewHeight);
    }
    

    private int ySpeed;
    private int xSpeed;

    public void act() 
    {

        //movement code
        if (Greenfoot.isKeyDown("left"))
        {
            move(-12);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            move(12);

        }

        //Landing on Platform and grass
        int groundLevel = getWorld().getHeight() - getImage().getHeight()/2;
        boolean onGround = (getY() == groundLevel);

        if (this.isTouching(Coin.class)) {
            onGround = true;
            Actor coin = getOneIntersectingObject(Coin.class);
            getWorld().removeObject(coin);
            Greenfoot.playSound("coin.wav");
            Counter counter = ((MyWorld) getWorld()).getCounter();
            counter.bumpCount(5);
        }
        if (this.isTouching(Gem.class)) {
            onGround = true;
            Actor gem = getOneIntersectingObject(Gem.class);
            getWorld().removeObject(gem);
            Greenfoot.playSound("gem.wav");
            Counter counter = ((MyWorld) getWorld()).getCounter();
            counter.bumpCount(15);
        }
        if (this.isTouching(Death.class))
        {
            
            onGround = true;
            Greenfoot.playSound("Death.wav");
            Greenfoot.setWorld(new GameOver());
        }
        if (this.isTouching(Ice.class)) 
        {
            onGround = true;
        }
        if (this.isTouching(Snowman.class)) 
        {
            onGround = true;
            Actor Snowman= getOneIntersectingObject(Snowman.class);
            getWorld().removeObject(Snowman);
            Greenfoot.playSound("lostlife.wav");
            Lives lives = ((MyWorld) getWorld()).getLives();
            lives.livesRemaining(-1);
            livesleft -= 1;
            if (livesleft < 1)
            {
                Greenfoot.stop();
                Greenfoot.setWorld(new GameOver());
            }
        }

        // on ground code and gravity code
        if (!onGround) // in middle of jump
        {
            ySpeed++; // adds gravity effect
            setLocation(getX(),getY()+ySpeed); // fall (rising slower or falling faster)

            if (getY()>=groundLevel) // has landed (reached ground level)
            {
                setLocation(getX(), groundLevel); // set on ground
                Greenfoot.getKey(); // clears any key pressed during jump
            }
        }
        else // on ground
        {
            ySpeed = -20; // add jump speed
            setLocation(getX(),getY()+ySpeed); // leave ground
        }

        // Scrolling of player and Spawning of objects
        if (getY() < (850 / 2)) {
            int offset =(850 / 2) - getY();
            totalOffset += offset;
            if (totalOffset >= 175)
            {
                Coin coin = new Coin();
                int coinX = Greenfoot.getRandomNumber(getWorld().getWidth());
                getWorld().addObject(coin, coinX, 0);
                totalOffset = 0;
            }

            if (totalOffset >= 174)
            {
                Gem gem = new Gem();
                int gemX = Greenfoot.getRandomNumber(getWorld().getWidth());
                getWorld().addObject(gem, gemX, 0);
                totalOffset = 0;
            }

            if (totalOffset >= 173)
            {
                Snowman snowman = new Snowman();
                int snowmanX = Greenfoot.getRandomNumber(getWorld().getWidth());
                getWorld().addObject(snowman, snowmanX, 0);
                totalOffset = 0;
            }
            World world = this.getWorld();
            List <Coin> coins = world.getObjects(Coin.class);
            List <Ice> ices = world.getObjects(Ice.class);
            List <Trees> trees = world.getObjects(Trees.class);
            List <SmallTrees> smalltrees = world.getObjects(SmallTrees.class);
            List <Gem> gems = world.getObjects(Gem.class);
            List <Snowman> snowman = world.getObjects(Snowman.class);
            List <Igloo> igloos = world.getObjects(Igloo.class);
            for (int i = 0; i < coins.size(); i++) 
            {
                Coin c = coins.get(i);
                c.setLocation(c.getX(), c.getY()+offset);
            }
            for (int i = 0; i < gems.size(); i++) 
            {
                Gem g = gems.get(i);
                g.setLocation(g.getX(), g.getY()+offset);
            }
            for (int i = 0; i < ices.size(); i++) 
            {
                Ice ice = ices.get(i);
                ice.setLocation(ice.getX(), ice.getY()+offset);
            }
            for (int i = 0; i < trees.size(); i++) 
            {
                Trees t = trees.get(i);
                t.setLocation(t.getX(), t.getY()+offset);
            }
            for (int i = 0; i < smalltrees.size(); i++) 
            {
                SmallTrees st = smalltrees.get(i);
                st.setLocation(st.getX(), st.getY()+offset);
            }
            for (int i = 0; i < snowman.size(); i++) 
            {
                Snowman snow = snowman.get(i);
                snow.setLocation(snow.getX(), snow.getY()+offset);
            }
            for (int i = 0; i < igloos.size(); i++) 
            {
                Igloo ig = igloos.get(i);
                ig.setLocation(ig.getX(), ig.getY()+offset);
            }
            setLocation(getX(), getY()+offset);

        }

        if (Greenfoot.isKeyDown("space"))
        {
            if (!onGround) 
            {
                if(getWorld().getObjects(JetpackBar.class).get(0).fuel > 0)
                {
                    ySpeed -= 1;
                    setLocation(getX(),getY()-ySpeed-20); 
                    Greenfoot.getKey();
                    Greenfoot.playSound("jetpack.wav");
                }
            }
        }

    }
}

