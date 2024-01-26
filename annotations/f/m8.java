package f;

import java.io.IOException;

public final class m8 extends RuntimeException {
  private static final long serialVersionUID = 0L;
  
  public m8(String paramString) {
    super(paramString);
  }
  
  public m8(String paramString, Exception paramException) {
    super(paramString, paramException);
  }
  
  public m8(IOException paramIOException) {
    super(paramIOException.getMessage(), paramIOException);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/m8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */