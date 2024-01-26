package f;

import org.lwjgl.glfw.GLFWDropCallback;

public final class i30 extends GLFWDropCallback {
  public i30(MJ0 paramMJ0) {}
  
  public final void invoke(long paramLong1, int paramInt, long paramLong2) {
    String[] arrayOfString = new String[paramInt];
    for (byte b = 0; b < paramInt; b++)
      arrayOfString[b] = GLFWDropCallback.getName(paramLong2, b); 
    this.R30.AF(new Y0(this, arrayOfString));
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/i30.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */