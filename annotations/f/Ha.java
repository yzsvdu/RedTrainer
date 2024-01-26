package f;

public final class Ha implements mX, VK0 {
  public final mX[] lq;
  
  public final int[] Mj;
  
  public final int[] fE0;
  
  public final uE0 Nd0;
  
  public final int O30;
  
  public final int Dl;
  
  public final int[] Qq;
  
  public final int[] O20;
  
  public final int u50;
  
  public final int s6;
  
  public Ha(mX[] paramArrayOfmX, int[] paramArrayOfint1, int[] paramArrayOfint2, uE0 paramuE0) {
    if (paramArrayOfint1.length != 0 && paramArrayOfint2.length != 0) {
      if (AL || paramArrayOfint1.length * paramArrayOfint2.length == paramArrayOfmX.length) {
        this.lq = paramArrayOfmX;
        this.Mj = paramArrayOfint1;
        this.fE0 = paramArrayOfint2;
        this.Nd0 = paramuE0;
        this.Qq = new int[paramArrayOfint1.length];
        this.O20 = new int[paramArrayOfint2.length];
        int i = 0;
        int k;
        for (k = 0; k < paramArrayOfint1.length; k++) {
          int n = 0;
          for (byte b = 0; b < paramArrayOfint2.length; b++)
            n = Math.max(n, On0(k, b).Vb()); 
          i += n;
          this.Qq[k] = n;
        } 
        this.O30 = i;
        i = 0;
        for (k = 0; k < paramArrayOfint2.length; k++) {
          int n = 0;
          for (byte b = 0; b < paramArrayOfint1.length; b++)
            n = Math.max(n, On0(b, k).wu0()); 
          i += n;
          this.O20[k] = n;
        } 
        this.Dl = i;
        i = 0;
        k = paramArrayOfint1.length;
        int m = 0;
        while (m < k) {
          int n;
          if ((n = paramArrayOfint1[m]) >= 0) {
            i += n;
            m++;
            continue;
          } 
          throw new IllegalArgumentException("negative weight in weightX");
        } 
        this.u50 = i;
        i = 0;
        int j = paramArrayOfint2.length;
        k = 0;
        while (k < j) {
          if ((m = paramArrayOfint2[k]) >= 0) {
            i += m;
            k++;
            continue;
          } 
          throw new IllegalArgumentException("negative weight in weightY");
        } 
        this.s6 = i;
        if (this.u50 > 0) {
          if (i > 0)
            return; 
          throw new IllegalArgumentException("zero weightX not allowed");
        } 
        throw new IllegalArgumentException("zero weightX not allowed");
      } 
      throw new AssertionError();
    } 
    throw new IllegalArgumentException("zero dimension size not allowed");
  }
  
  public Ha(mX[] paramArrayOfmX, Ha paramHa) {
    this.lq = paramArrayOfmX;
    this.Mj = paramHa.Mj;
    this.fE0 = paramHa.fE0;
    this.Nd0 = paramHa.Nd0;
    this.Qq = paramHa.Qq;
    this.O20 = paramHa.O20;
    this.u50 = paramHa.u50;
    this.s6 = paramHa.s6;
    this.O30 = paramHa.O30;
    this.Dl = paramHa.Dl;
  }
  
  public final int Vb() {
    return this.O30;
  }
  
  public final int wu0() {
    return this.Dl;
  }
  
  public final void Gt0(uP paramuP, int paramInt1, int paramInt2) {
    int i = this.O30;
    int j = this.Dl;
    W8(paramuP, paramInt1, paramInt2, i, j);
  }
  
  public final void W8(fB0 paramfB0, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt4 -= this.Dl;
    int i = this.s6;
    byte b1 = 0;
    byte b2 = 0;
    int[] arrayOfInt;
    while (b1 < (arrayOfInt = this.fE0).length) {
      int k = this.O20[b1];
      if (i > 0) {
        i = paramInt4 * (paramInt4 = arrayOfInt[b1]) / i;
        paramInt4 = i - paramInt4;
        k += i;
        i = paramInt4 - i;
        i = paramInt4;
        paramInt4 = i;
      } 
      int j = paramInt3 - this.O30;
      int m = this.u50;
      byte b = 0;
      int n = paramInt1;
      int[] arrayOfInt1;
      while (b < (arrayOfInt1 = this.Mj).length) {
        int i1 = this.Qq[b];
        if (m > 0) {
          m = j * (j = arrayOfInt1[b]) / m;
          j = m - j;
          i1 += m;
          m = j - m;
          j = m;
          m = j;
        } 
        this.lq[b2].W8(paramfB0, n, paramInt2, i1, k);
        n += i1;
        b++;
        b2++;
      } 
      paramInt2 += k;
      b1++;
    } 
  }
  
  public final uE0 mJ0() {
    return this.Nd0;
  }
  
  public final mX rv0(pRn parampRn) {
    int i;
    mX[] arrayOfMX = new mX[i = this.lq.length];
    for (byte b = 0; b < i; b++)
      arrayOfMX[b] = this.lq[b].rv0(parampRn); 
    return new Ha(arrayOfMX, this);
  }
  
  public final mX On0(int paramInt1, int paramInt2) {
    return this.lq[paramInt2 * this.Mj.length + paramInt1];
  }
  
  public final pe0 LPT8() {
    return null;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ha.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */