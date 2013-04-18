package jquerymobile;

import java.awt.Color;
import javax.swing.ImageIcon;
import org.openide.util.ImageUtilities;

/**
 *
 * @author willy
 */
public class JqmCompletionItem {

    private String info;
    private static ImageIcon fieldIcon =
            new ImageIcon(ImageUtilities.loadImage("jquerymobile/jqm.png"));
    private static Color fieldColor = Color.decode("0x0000B2");
    private int caretOffset;
    
    public JqmCompletionItem(String info, int caretOffset){
        this.info = info;
        this.caretOffset = caretOffset;
    }
    
    
    
}
