package f;

public final class Hz0 extends e90 {
  public final int tg(m6 paramm6, Object paramObject, float[][] paramArrayOffloat, int[] paramArrayOfint, int paramInt) {
    int i = 0;
    for (byte b = 0; b < paramInt; b++) {
      if (paramArrayOfint[b] != 0) {
        int j = i + 1;
        paramArrayOffloat[i] = paramArrayOffloat[b];
        i = j;
      } 
    } 
    return (i != 0) ? e90.Xe(paramm6, paramObject, paramArrayOffloat, i, 1) : 0;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Hz0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */