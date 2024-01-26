package f;

public abstract class SF {
  public final boolean[] Qu = new boolean[256];
  
  public final boolean[] t3 = new boolean[256];
  
  public final S4 QJ = new S4();
  
  public int Jr; // check if a key is being held down
  
  public boolean DI0;
  
  public final boolean Ak(int paramInt) {
    return (paramInt == -1) ? ((this.Jr > 0)) : ((paramInt < 0 || paramInt > 255) ? false : this.Qu[paramInt]);
  }
  
  public final boolean j2(int paramInt) {
    return (paramInt == -1) ? this.DI0 : ((paramInt < 0 || paramInt > 255) ? false : this.t3[paramInt]);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/SF.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */