package jquerymobile;

/**
 *
 * @author willy
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import org.netbeans.api.editor.mimelookup.MimeRegistration;
import org.netbeans.spi.editor.completion.CompletionItem;
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
            protected void query(CompletionResultSet completionResultSet, Document document, int caretOffset) {
                                
                List<String> infoJQM = new ArrayList<String>();
                infoJQM.add( "jqm" );
                infoJQM.add( "hola" );
                infoJQM.add( "hola1" );
                infoJQM.add( "hola2" );
                infoJQM.add( "hola3" );
                infoJQM.add( "hola4" );
                
                for (String info : infoJQM) {
                    if(!info.equals("")){
                        completionResultSet.addItem((CompletionItem) new JqmCompletionItem(info, caretOffset));
                    }
                }
                
                completionResultSet.finish();
                
                //Locale[] locales = Locale.getAvailableLocales();
                //JqmLib[] jqmlibs;
                /*for(int i = 0; i < infoJQM.; i++){
                    List<String> info;
                    //final Locale locale = locales[i];
                    //final String info = locale.getdi
                }*/
                
            }
        },jtc);
    }

    @Override
    public int getAutoQueryTypes(JTextComponent component, String string) {
        return 0;
    }
    
}
