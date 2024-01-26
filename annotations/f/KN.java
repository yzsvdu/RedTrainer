package f;

public final class KN extends xc {
  public final int g50;
  
  public final int bD;
  
  public final int Qi;
  
  public final int mE0;
  
  public final bJ[] Os0;
  
  public final cR[] nx0;
  
  public KN(cR paramcR, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super(paramcR);
    if (paramInt1 >= 0) {
      if (paramInt2 >= 0) {
        this.g50 = paramInt1;
        this.bD = paramInt2;
        this.Qi = paramInt3;
        this.mE0 = paramInt4;
        this.Os0 = new bJ[paramInt2 * paramInt1];
        this.nx0 = new cR[paramInt2];
        return;
      } 
      throw new IllegalArgumentException("numRows");
    } 
    throw new IllegalArgumentException("numColumns");
  }
  
  public final bJ nF(int paramInt1, int paramInt2) {
    int i;
    if (paramInt2 >= 0 && paramInt2 < (i = this.g50)) {
      if (paramInt1 >= 0 && paramInt1 < this.bD)
        return this.Os0[paramInt1 * i + paramInt2]; 
      throw new IndexOutOfBoundsException("row");
    } 
    throw new IndexOutOfBoundsException("column");
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/KN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */