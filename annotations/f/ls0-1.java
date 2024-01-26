package f;

public final class ls0 {
  public short uM = -1;
  
  public final void Zc0(int paramInt1, int paramInt2) {
    paramInt2 = 1 << paramInt2 - 1;
    do {
      boolean bool1;
      boolean bool2;
      short s;
      if (((s = this.uM) & 0x8000) == 0) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      if ((paramInt1 & paramInt2) == 0) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      if ((bool1 ^ bool2) != 0) {
        this.uM = (short)((short)(s << 1) ^ 0xFFFF8005);
      } else {
        this.uM = (short)(s << 1);
      } 
    } while ((paramInt2 >>>= 1) != 0);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ls0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */