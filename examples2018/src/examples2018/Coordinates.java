
package examples2018;

import javax.swing.JLabel;

/**
 * Coordinates.java - 
 * @Class Computer Science grade 11
 * @author riley.w
 * @since 29-Oct-2018
 */
public class Coordinates {
        
    public int x;
    public int y;
    public int left;
    public int right;
    public int top;
    public int bottom;
    public int height;
    public int width;
    public int direction;
    public int amount;
    
    /**
     * default constructor for this class
     */
    public Coordinates() {
        x = y = left = right = top = bottom = height = width = direction = amount = 0;
    }
    
    /**
     * updates all coordinate data based on the location of the label
     * @param hitbox the label the game image is inside
     */
    public void update(JLabel hitbox) {
        x = hitbox.getX();
        y = hitbox.getY();
        width = hitbox.getWidth();
        height = hitbox.getHeight();
        recalculate();
    }
    /**
     * recalculates needed data
     */
    public void recalculate() {
        left = x;
        top = y;
        right = left + width;
        bottom = top + height;
    }
    
    
    
    
    
    
    
    
    
    
}
