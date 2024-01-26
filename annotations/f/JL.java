package f;

import java.nio.ByteBuffer;

public final class JL extends Kl0 {
  public boolean Ds;
  
  public JL(c4 paramc4, ByteBuffer paramByteBuffer) {
    super(paramc4, paramByteBuffer);
  }
  
  public final void sM() {
    boolean bool;
    if (R00() == 1) {
      bool = true;
    } else {
      bool = false;
    } 
    this.Ds = bool;
  }
  
  public final void Cx() {
    r8().TA0(this.Ds);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/JL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */