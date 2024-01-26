package f;

public final class bw0 implements eB0 {
  public final jk0 sF0(oF0 paramoF0, cx0 paramcx0) {
    int i = paramoF0.yw0;
    int j;
    int k = paramoF0.ts0 - (j = i * 2);
    j = paramoF0.WW - j;
    int m = (int)paramcx0.af + i;
    int n = (int)paramcx0.sf0 + i;
    byte b = 0;
    int i1 = paramoF0.dA.Z8;
    while (b < i1) {
      xA xA1 = null;
      byte b1 = 0;
      lC0 lC01;
      int i2 = (lC01 = (lC0)paramoF0.dA.get(b)).HY.Z8 - 1;
      while (b1 < i2) {
        xA xA2;
        int i3;
        if ((xA2 = (xA)lC01.HY.get(b1)).A30 + m < k && xA2.Pr + n < j && n <= (i3 = xA2.ru0) && (xA1 == null || i3 < xA1.ru0))
          xA1 = xA2; 
        b1++;
      } 
      if (xA1 == null) {
        xA xA2;
        if ((i2 = (xA2 = (xA)lC01.HY.peek()).Pr) + n >= j)
          continue; 
        if (xA2.A30 + m < k) {
          xA2.ru0 = Math.max(xA2.ru0, n);
          xA1 = xA2;
        } else {
          int i3;
          if ((i3 = i2 + xA2.ru0) + n < j) {
            this();
            xA1.Pr = i3;
            (xA1 = new xA()).ru0 = n;
            lC01.HY.Com3(xA1);
          } 
        } 
      } 
      if (xA1 != null) {
        paramcx0.dA = i;
        paramcx0.zA0 = xA1.Pr;
        xA1.A30 = (i = xA1.A30) + m;
        return lC01;
      } 
      continue;
      b++;
    } 
    this(paramoF0);
    paramoF0.dA.Com3(lC0);
    this();
    xA.A30 = i + m;
    xA.Pr = i;
    xA xA;
    (xA = new xA()).ru0 = n;
    lC0.HY.Com3(xA);
    float f = i;
    paramcx0.zA0 = f;
    lC0 lC0;
    return lC0 = new lC0();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/bw0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */