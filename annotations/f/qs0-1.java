package f;

import java.io.Serializable;

public abstract class qs0 implements ik, Serializable {
  private static final long serialVersionUID = 7535258609338176893L;
  
  public Object readResolve() {
    return C00.R4("NOP");
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/qs0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */