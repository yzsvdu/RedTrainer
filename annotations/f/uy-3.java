package f;

import java.io.IOException;
import java.net.HttpURLConnection;

public final class uy {
  public final HttpURLConnection RV;
  
  public RH Mg;
  
  public uy(HttpURLConnection paramHttpURLConnection) {
    this.RV = paramHttpURLConnection;
    try {
      this.Mg = new RH(paramHttpURLConnection.getResponseCode());
    } catch (IOException iOException) {
      RH rH;
      this(-1);
      this.Mg = this;
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/uy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */