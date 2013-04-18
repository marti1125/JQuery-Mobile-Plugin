package jquerymobile;

/**
 *
 * @author willy
 */

import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import org.netbeans.api.editor.mimelookup.MimeRegistration;
import org.netbeans.spi.editor.completion.CompletionProvider;
import org.netbeans.spi.editor.completion.CompletionResultSet;
import org.netbeans.spi.editor.completion.CompletionTask;
import org.netbeans.spi.editor.completion.support.AsyncCompletionQuery;
import org.netbeans.spi.editor.completion.support.AsyncCompletionTask;

@MimeRegistration(mimeType = "text/html", service = CompletionProvider.class)
public class JqmCompletionProvider implements CompletionProvider {
    
    public JqmCompletionProvider() {
        
    }

    @Override
    public CompletionTask createTask(int queryType, JTextComponent jtc) {
        
        if(queryType != CompletionProvider.COMPLETION_QUERY_TYPE){
            return null;
        }
        
        return new AsyncCompletionTask(new AsyncCompletionQuery() {

            @Override
            protected void query(CompletionResultSet crs, Document dcmnt, int i) {
                
            }
        });
    }

    @Override
    public int getAutoQueryTypes(JTextComponent jtc, String string) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
