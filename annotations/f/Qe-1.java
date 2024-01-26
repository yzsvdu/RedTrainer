package f;

import org.lwjgl.glfw.GLFWWindowPosCallbackI;

public final class Qe implements GLFWWindowPosCallbackI {
  public final void invoke(long paramLong, int paramInt1, int paramInt2) {
    if (h1.XO != paramInt1 || h1.da0 != paramInt2) {
      h1.XO = paramInt1;
      h1.da0 = paramInt2;
      h1.Gh0 = true;
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Qe.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */