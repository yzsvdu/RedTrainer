package f;

public final class eV implements eB0 {
  public static TM Yi(TM paramTM, cx0 paramcx0) {
    boolean bool;
    TM tM3;
    if (!(bool = paramTM.al) && (tM3 = paramTM.SN) != null && paramTM.Z60 != null) {
      if ((tM2 = Yi(tM3, paramcx0)) == null)
        tM2 = Yi(paramTM.Z60, paramcx0); 
      return tM2;
    } 
    if (tM2 != null)
      return null; 
    cx0 cx01;
    float f2;
    float f3;
    if ((f2 = (cx01 = paramTM.tb0).af) == (f3 = paramcx0.af) && cx01.sf0 == paramcx0.sf0)
      return paramTM; 
    if (f2 < f3 || cx01.sf0 < paramcx0.sf0)
      return null; 
    paramTM.SN = new TM();
    this();
    TM tM2;
    TM tM1;
    float f1;
    paramTM.Z60 = new TM();
    cx0 cx02;
    float f4;
    float f5;
    float f6;
    if ((int)(f3 = (cx02 = paramTM.tb0).af) - (int)(f4 = paramcx0.af) > (int)(f5 = cx02.sf0) - (int)(f6 = paramcx0.sf0)) {
      cx03.dA = cx02.dA;
      cx03.zA0 = cx02.zA0;
      cx03.af = f4;
      cx0 cx03;
      (cx03 = paramTM.SN.tb0).sf0 = f5;
      cx02.dA += f1 = paramcx0.af;
      cx03.zA0 = cx02.zA0;
      cx02.af -= f1;
      (cx03 = tM1.tb0).sf0 = cx02.sf0;
    } else {
      cx03.dA = cx02.dA;
      cx03.zA0 = cx02.zA0;
      cx03.af = f3;
      cx0 cx03;
      (cx03 = paramTM.SN.tb0).sf0 = f6;
      cx03.dA = cx02.dA;
      float f;
      cx02.zA0 += f = paramcx0.sf0;
      cx03.af = cx02.af;
      cx02.sf0 -= f;
    } 
    return Yi(paramTM.SN, paramcx0);
  }
  
  public final jk0 sF0(oF0 paramoF0, cx0 paramcx0) {
    Qk0 qk0;
    fQ fQ;
    if ((fQ = paramoF0.dA).Z8 == 0) {
      this(paramoF0);
      paramoF0.dA.Com3(this);
    } else {
      qk0 = (Qk0)peek();
    } 
    int i = paramoF0.yw0;
    float f4;
    paramcx0.af += f4 = i;
    paramcx0.sf0 += f4;
    TM tM;
    if ((tM = Yi(this.Vm, paramcx0)) == null) {
      this(paramoF0);
      paramoF0.dA.Com3(this);
      tM = Yi((qk0 = new Qk0()).Vm, paramcx0);
    } 
    tM.al = true;
    cx0 cx01;
    float f2 = (cx01 = tM.tb0).dA;
    float f3 = tM.tb0.zA0;
    float f1 = this.af - f4;
    f2 = this.sf0 - f4;
    paramcx0.jG(f2, f3, f1, f2);
    return this;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/eV.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */