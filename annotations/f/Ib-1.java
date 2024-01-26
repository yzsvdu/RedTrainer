package f;

import java.io.PrintStream;

public abstract class Ib extends Exception {
  public Throwable k8;
  
  public Ib(String paramString, Exception paramException) {
    super(paramString);
    this.k8 = paramException;
  }
  
  public final void printStackTrace() {
    printStackTrace(System.err);
  }
  
  public final void printStackTrace(PrintStream paramPrintStream) {
    Throwable throwable;
    if ((throwable = this.k8) == null) {
      super.printStackTrace(paramPrintStream);
    } else {
      throwable.printStackTrace();
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ib.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */