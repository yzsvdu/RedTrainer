package f;

public final class aA extends x60 {
  public aA() {
    super("/sysgc");
  }
  
  public final void Da0(String[] paramArrayOfString) {
    ZY zY = ZY.ih;
    km.u4.oD("--- Garbage Collection Initiated ---", this);
    System.gc();
    km.u4.oD("--- Garbage Collection Finished ---", this);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/aA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */