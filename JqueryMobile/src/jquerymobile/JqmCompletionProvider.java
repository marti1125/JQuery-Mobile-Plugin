package jquerymobile;

/**
 *
 * @author willy
 */

import javax.swing.text.JTextComponent;
import org.netbeans.spi.editor.completion.CompletionProvider;
import org.netbeans.spi.editor.completion.CompletionTask;

public class JqmCompletionProvider implements CompletionProvider {
    
    public JqmCompletionProvider() {
        
    }

    @Override
    public CompletionTask createTask(int i, JTextComponent jtc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getAutoQueryTypes(JTextComponent jtc, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}