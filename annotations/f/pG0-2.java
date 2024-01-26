package f;

import org.lwjgl.glfw.GLFWFramebufferSizeCallback;

public final class pG0 extends GLFWFramebufferSizeCallback {
  public volatile boolean Fh0;
  
  public pG0(w70 paramw70) {}
  
  public final void invoke(long paramLong, int paramInt1, int paramInt2) {
    if (this.Fh0)
      return; 
    this.Fh0 = true;
    UB0.Kg0.fN(new Ni0(this, paramLong));
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/pG0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */