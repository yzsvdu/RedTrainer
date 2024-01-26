package f;

import java.io.IOException;
import java.net.URL;
import org.xmlpull.v1.XmlPullParserException;

public final class TD extends IOException {
  public final uH pI0;
  
  public TD(String paramString, URL paramURL, int paramInt1, int paramInt2, XmlPullParserException paramXmlPullParserException) {
    super(paramString);
    uH uH1;
    this(paramURL, paramInt1, paramInt2);
    this.pI0 = this;
    initCause((Throwable)paramXmlPullParserException);
  }
  
  public final String getMessage() {
    this(super.getMessage());
    StringBuilder stringBuilder;
    String str = "\n           in ";
    for (uH uH1 = this.pI0; uH1 != null; uH1 = uH1.d) {
      stringBuilder.append(this).append(uH1.Lm0).append(" @").append(uH1.Er0).append(':').append(uH1.kq);
      str = "\n  included by ";
    } 
    return stringBuilder.toString();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/TD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */