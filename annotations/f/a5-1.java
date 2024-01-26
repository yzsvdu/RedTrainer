package f;

import org.lwjgl.glfw.GLFWWindowMaximizeCallback;

public final class a5 extends GLFWWindowMaximizeCallback {
  public a5(MJ0 paramMJ0) {}
  
  public final void invoke(long paramLong, boolean paramBoolean) {
    this.lG.AF(new e40(this, paramBoolean));
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/a5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */