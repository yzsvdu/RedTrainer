package f;

public final class Pk0 extends ZH {
  public Pk0(int[] paramArrayOfint, int paramInt1, int paramInt2, Uc paramUc) {
    super(paramInt1, paramInt2, paramUc);
    for (byte b = 0; b < paramInt2; b++) {
      for (byte b1 = 0; b1 < paramInt1; b1++) {
        int i;
        WB0(b1, b, (i = paramArrayOfint[b * paramInt1 + b1]) >> 24 & 0xFF | i << 8 & 0xFFFFFF00);
      } 
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Pk0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */