
package examples2018;


import javax.swing.Icon;
import javax.swing.JOptionPane;
/**
 * Examples2018.java - 
 * @Class Computer Science grade 11
 * @author riley.w
 * @since 6-Nov-2018
 * @instructor Mr. Wachs
 */
public class Examples2018 {

    final static String APP_TITLE = "Name of App Goes Here";
    final static String APP_DISCRIPTION = "Description goes here";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        start();    
        play();     
        end(); 
    }

    /**
     * intro message explaining the program
     */
    private static void start() {
        JOptionPane.showMessageDialog(null, "Welcome to " + APP_TITLE
                + "\n This Program " + APP_DISCRIPTION, APP_TITLE, 1);
    }

    /**
     * ends the program with an exit message
     */
    private static void end() {
        JOptionPane.showMessageDialog(null, "Thank You for Playing " + APP_TITLE + ", "
                + "\n Play Again soon", APP_TITLE, 1);
        System.exit(0);
    }
    /**
     * plays a round of the game or program while the player wants to keep playing
     */
    private static void play() {

        do {
            
            

        } while (keepPlaying());

    }

    /**
     * sees if the user wants to keep playing
     * @return whether the user wants to keep playing or not
     */
    private static boolean keepPlaying() {

        int result = JOptionPane.showConfirmDialog(null,
                "do you want to play again",
                APP_TITLE,
                JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            return true;
        } else {
            return false;
        }
    }


}
