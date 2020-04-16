import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare() {
        TicTacToe ticTacToe = new TicTacToe();
        addObject(ticTacToe,150,250);
    }
    
    public void reset () 
    {
        List Alles = getObjects(null);
        removeObjects(Alles);
        setBackground(new GreenfootImage("Hintergraund.png")) ;
        prepare() ;
    }
    
    public void resume ()
    {
        removeObjects(getObjects(pausiert.class));
        removeObjects(getObjects(resume.class));
    }
    
    public void pause ()
    {
        pausiert pausiert = new pausiert();
        addObject(pausiert,500,300);
        resume resume = new resume();
        addObject(resume,500,350);
    }
    
    public void startvierGewinnt ()
    {
        setBackground(new GreenfootImage("viergewinntBackground.png"));
        List Spiele = getObjects(null);
        removeObjects(Spiele);
        felderbauen () ;
        startstop () ;
    }
    
    private void startstop ()
    {
      stop stop = new stop();
      addObject(stop,30,30);
      pause pause = new pause();
      addObject(pause, 65,30);
    }
    
    private void felderbauen() {
        Felder1 Felder1 = new Felder1();
        addObject(Felder1,350,150);

        Felder2 Felder2 = new Felder2();
        addObject(Felder2,400,150);
        
        Felder felder3 = new Felder();
        addObject(felder3,450,150);
        
        Felder felder4 = new Felder();
        addObject(felder4,500,150);
        
        Felder felder5 = new Felder();
        addObject(felder5,550,150);
        
        Felder felder6 = new Felder();
        addObject(felder6,600,150);
        
        Felder felder7 = new Felder();
        addObject(felder7,350,200);
        
        Felder felder8 = new Felder();
        addObject(felder8,400,200);
        
        Felder felder9 = new Felder();
        addObject(felder9,450,200);
        
        Felder felder10 = new Felder();
        addObject(felder10,500,200);
        
        Felder felder11 = new Felder();
        addObject(felder11,550,200);
        
        Felder felder12 = new Felder();
        addObject(felder12,600,200);
        
        Felder felder13 = new Felder();
        addObject(felder13,350,250);
        
        Felder felder14 = new Felder();
        addObject(felder14,400,250);
        
        Felder felder15 = new Felder();
        addObject(felder15,450,250);
        
        Felder felder16 = new Felder();
        addObject(felder16,500,250);
        
        Felder felder17 = new Felder();
        addObject(felder17,550,250);
        
        Felder felder18 = new Felder();
        addObject(felder18,600,250);
        
        Felder felder19 = new Felder();
        addObject(felder19,350,300);
        
        Felder felder20 = new Felder();
        addObject(felder20,400,300);
      
        Felder felder21 = new Felder();
        addObject(felder21,450,300);
        
        Felder felder22 = new Felder();
        addObject(felder22,500,300);
        
        Felder felder23 = new Felder();
        addObject(felder23,550,300);
        
        Felder felder24 = new Felder();
        addObject(felder24,600,300);
        
        Felder felder25 = new Felder();
        addObject(felder25,350,350);
        
        Felder felder26 = new Felder();
        addObject(felder26,400,350);
        
        Felder felder27 = new Felder();
        addObject(felder27,450,350);
        
        Felder felder28 = new Felder();
        addObject(felder28,500,350);
        
        Felder felder29 = new Felder();
        addObject(felder29,550,350);
        
        Felder felder30 = new Felder();
        addObject(felder30,600,350);
        
        Felder felder31 = new Felder();
        addObject(felder31,350,400);
        
        Felder felder32 = new Felder();
        addObject(felder32,400,400);
        
        Felder felder33 = new Felder();
        addObject(felder33,450,400);
        
        Felder felder34 = new Felder();
        addObject(felder34,500,400);
        
        Felder felder35 = new Felder();
        addObject(felder35,550,400);
        
        Felder felder36 = new Felder();
        addObject(felder36,600,400);
    }
}
