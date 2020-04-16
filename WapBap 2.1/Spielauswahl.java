import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TicTacToe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spielauswahl extends Spiele
{
    private String[] Bilder = {"TicTacToeGRID.png","emptyGame.png"} ;
    private String Name;
    /**
     * Act - do whatever the TicTacToe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     
    */
    public Spielauswahl ()
    {
        
    }
    
    // public void skalieren ()
    // {
        // GreenfootImage image = getImage () ;
        // image.scale(image.getWidth() -530, image.getHeight() -530) ;
        // setImage (image);
    // }
    
    public Spielauswahl(GreenfootImage image, String name)
    {
        Name = name;
        image.scale(image.getWidth() -530, image.getHeight() -530) ;
        setImage (image);
    }
    
    public void act() 
    {
        
        if(Greenfoot.mouseClicked(this)) 
        {
            int x = (getX() -200) / 200;
            int y = (getY() -250) / 200;
            int nr = (x+4*y);

            MyWorld Welt = null;
            switch(nr)
            {
                case 0:
                    Welt = new FourWins();
                    break;
                case 1:
                    Welt = new Placeholder();
                    break;
                case 2:
                    Welt = new Placeholder();
                    break;
                case 3:
                    Welt = new Placeholder();
                    break;
                case 4:
                    Welt = new Placeholder();
                    break;
                case 5:
                    Welt = new Placeholder();
                    break;
                case 6:
                    Welt = new Placeholder();
                    break;
                case 7:
                    Welt = new Placeholder();
                    break;
                case 8:
                    Welt = new Placeholder();
                    break;
            }
            Greenfoot.setWorld(Welt);
        }
    } 
}
