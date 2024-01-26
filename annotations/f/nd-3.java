package f;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public abstract class nd {
  public static final XmlPullParserFactory Ky0;
  
  public static XmlPullParserException coM3;
  
  static {
    XmlPullParserFactory xmlPullParserFactory = null;
    try {
      (xmlPullParserFactory = XmlPullParserFactory.newInstance()).setNamespaceAware(false);
      XmlPullParserFactory.newInstance().setValidating(false);
    } catch (XmlPullParserException xmlPullParserException) {
      Logger.getLogger(xS.class.getName()).log(Level.SEVERE, "Unable to construct XmlPullParserFactory", (Throwable)xmlPullParserException);
      coM3 = xmlPullParserException;
    } 
    Ky0 = xmlPullParserFactory;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/nd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */