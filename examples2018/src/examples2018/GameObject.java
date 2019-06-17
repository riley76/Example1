
package examples2018;

import javax.swing.JLabel;

/**
 * GameObject.java - 
 * @Class Computer Science grade 11
 * @author riley.w
 * @since 6-Nov-2018
 */
public class GameObject {
        
    public Coordinates coordinates;
    public JLabel hitbox;
    
    /**
     * constructor method for this class sets class properties
     * @param hitbox the label the game image is inside
     */
    public GameObject(JLabel hitbox) {
        this.hitbox = hitbox;
        coordinates = new Coordinates();
        coordinates.update(hitbox);   
    }
    
    /**
     * determines if two game objects are overlapping (colliding) 
     * @param target the game object to check against 
     * @return if they are colliding or not 
     */ 
    public boolean isColliding(GameObject target) {
        if(isCollidingHorizontal(target) && isCollidingVertical(target)) return true;
        else  return false;
    }
    
    /**
     * determines if two game objects are colliding only horizontally
     * @param target the game object to check against 
     * @return if the colliding or not
     */
    private boolean isCollidingHorizontal(GameObject target) {
        if (this.coordinates.left >= target.coordinates.left 
                && this.coordinates.left <= target.coordinates.right) {
            return true;
        } else if (this.coordinates.right >= target.coordinates.left 
                && this.coordinates.right <= target.coordinates.right) {
            return true;
        } else if (target.coordinates.left >= this.coordinates.left 
                && target.coordinates.left <= this.coordinates.right) return true;
        else if (target.coordinates.right >= this.coordinates.left
                && target.coordinates.right <= this.coordinates.right) return true;
        else return false;
    }
    
    /**
     * determines if two game objects are colliding vertically
     * @param target the game object to check against 
     * @return if they are colliding or not
     */
    private boolean isCollidingVertical(GameObject target) {
        if (this.coordinates.top >= target.coordinates.top 
                && this.coordinates.top <= target.coordinates.bottom) {
            return true;
        } else if (this.coordinates.bottom >= target.coordinates.top 
                && this.coordinates.bottom <= target.coordinates.bottom) {
            return true;
        } else if (target.coordinates.top >= this.coordinates.top 
                && target.coordinates.top <= this.coordinates.bottom) return true;
        else if (target.coordinates.bottom >= this.coordinates.top
                && target.coordinates.bottom <= this.coordinates.bottom) return true;
        else return false;
    }
}
