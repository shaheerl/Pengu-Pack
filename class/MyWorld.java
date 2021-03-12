import java.util.List;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class MyWorld extends World 
{
    private Counter theCounter;
    private Lives PenguLives;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(650, 850, 1, false); 
        
        prepare();
    }
    
    public Counter getCounter()
    {
        return theCounter;
    }
    
    public Lives getLives()
    {
        return PenguLives;
    }
   
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PenguLives = new Lives();
        addObject(PenguLives, 100, 50);
        theCounter = new Counter();
        addObject(theCounter, 325, 50);
        JetpackBar bar = new JetpackBar();
        addObject(bar, 575, 50);
        Cloud cloud = new Cloud();
        addObject(cloud,212,145);
        cloud.setLocation(135,105);
        Cloud cloud2 = new Cloud();
        addObject(cloud2,559,255);
        cloud2.setLocation(558,238);
        Cloud cloud3 = new Cloud();
        addObject(cloud3,156,338);
        cloud3.setLocation(119,346);
        Cloud cloud4 = new Cloud();
        addObject(cloud4,540,417);
        cloud2.setLocation(524,43);
        cloud4.setLocation(540,257);
        Coin coin = new Coin();
        addObject(coin,263,439);
        Coin coin2 = new Coin();
        addObject(coin2,141,598);
        Coin coin3 = new Coin();
        addObject(coin3,552,438);
        Coin coin4 = new Coin();
        addObject(coin4,317,154);
        Coin coin5 = new Coin();
        addObject(coin5,536,154);
        Death death = new Death();
        addObject(death,331,815);
        Death death2 = new Death();
        addObject(death2,538,836);
        Death death3 = new Death();
        addObject(death3,125,838);
        death3.setLocation(98,817);
        death.setLocation(331,819);
        death2.setLocation(566,820);
        death3.setLocation(91,819);
        death2.setLocation(567,819);
        death.setLocation(333,819);
        death3.setLocation(94,820);
        death2.setLocation(573,820);
        death.setLocation(333,822);
        Ice ice = new Ice();
        addObject(ice,513,801);
        Ice ice2 = new Ice();
        addObject(ice2,201,811);
        ice2.setLocation(57,827);
        ice.setLocation(551,829);
        ice2.setLocation(160,829);
        ice.setLocation(543,829);
        Trees trees = new Trees();
        addObject(trees,139,583);
        trees.setLocation(65,623);
        trees.setLocation(33,632);
        coin2.setLocation(379,267);
        coin2.setLocation(99,273);
        trees.setLocation(94,616);
        SmallTrees smalltrees = new SmallTrees();
        addObject(smalltrees,484,644);
        SmallTrees smalltrees2 = new SmallTrees();
        addObject(smalltrees2,187,657);
        smalltrees2.setLocation(165,661);
        trees.setLocation(85,616);
        smalltrees2.setLocation(168,662);
        smalltrees.setLocation(486,659);
        Trees trees2 = new Trees();
        addObject(trees2,577,544);
        trees2.setLocation(575,619);
        Trees trees3 = new Trees();
        addObject(trees3,61,602);
        trees3.setLocation(247,619);
        Trees trees4 = new Trees();
        addObject(trees4,461,552);
        trees4.setLocation(401,623);
        SmallTrees smalltrees3 = new SmallTrees();
        addObject(smalltrees3,346,621);
        smalltrees3.setLocation(332,659);
        SmallTrees smalltrees4 = new SmallTrees();
        addObject(smalltrees4,43,665);
        smalltrees4.setLocation(14,663);
        trees2.setLocation(577,620);
        Pengu pengu = new Pengu();
        addObject(pengu,312,616);
        pengu.setLocation(322,673);
        Coin coin6 = new Coin();
        addObject(coin6,109,27);
        Igloo igloo = new Igloo();
        addObject(igloo,497,565);
        igloo.setLocation(548,635);
        igloo.setLocation(554,637);
        cloud2.setLocation(467,145);
    }
}