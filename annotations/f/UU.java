package f;

public final class UU extends XD {
  public final XD[] wr0;
  
  public final int j1;
  
  public final int XL0;
  
  public UU(XD[] paramArrayOfXD, int paramInt) {
    this.wr0 = paramArrayOfXD;
    this.j1 = paramInt;
    boolean bool;
    if ((bool = n40) || paramInt >= 0) {
      if (bool || paramArrayOfXD.length > 0) {
        int j = paramArrayOfXD.length;
        for (byte b = 0; b < j; b++) {
          XD xD = paramArrayOfXD[b];
          this.z00 += xD.z00;
        } 
        int i = this.z00;
        if (paramInt == 0) {
          this.z00 = Integer.MAX_VALUE;
        } else {
          this.z00 = i * paramInt;
        } 
        return;
      } 
      throw new AssertionError();
    } 
    throw new AssertionError();
  }
  
  public final int Ro0() {
    int i = 0;
    XD[] arrayOfXD;
    int j = (arrayOfXD = this.wr0).length;
    for (byte b = 0; b < j; b++)
      i = Math.max(i, arrayOfXD[b].Ro0()); 
    return i;
  }
  
  public final int AK0() {
    int i = 0;
    XD[] arrayOfXD;
    int j = (arrayOfXD = this.wr0).length;
    for (byte b = 0; b < j; b++)
      i = Math.max(i, arrayOfXD[b].AK0()); 
    return i;
  }
  
  public final pRN Ag0() {
    return this.wr0[0].Ag0();
  }
  
  public final void MC(int paramInt1, pRN parampRN, int paramInt2, int paramInt3, int paramInt4, int paramInt5, vu0 paramvu0, fB0 paramfB0) {
    int i;
    if ((i = this.XL0) == 0)
      return; 
    int j = 0;
    int k;
    if ((k = this.j1) == 0) {
      paramInt1 %= i;
    } else {
      paramInt1 -= Math.min(j = paramInt1 / i, k - 1) * this.XL0;
    } 
    XD xD = null;
    XD[] arrayOfXD;
    for (k = 0; k < (arrayOfXD = this.wr0).length; k++) {
      int m;
      if (paramInt1 < (m = (xD = arrayOfXD[k]).z00) && m > 0) {
        if (++k < arrayOfXD.length) {
          parampRN = arrayOfXD[k].Ag0();
          break;
        } 
        if ((k = this.j1) == 0 || j + 1 < k)
          parampRN = Ag0(); 
        break;
      } 
      paramInt1 -= m;
    } 
    if (xD != null)
      xD.MC(paramInt1, parampRN, paramInt2, paramInt3, paramInt4, paramInt5, paramvu0, paramfB0); 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/UU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */