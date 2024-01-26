package f;

public final class PS {
  public final pe ZU;
  
  public final pRn Kp;
  
  public final pRn f2;
  
  public PS(pe parampe, pRn parampRn1, pRn parampRn2) {
    if (parampRn2 == null)
      parampRn2 = parampRn1; 
    this.ZU = parampe;
    this.Kp = WA(parampRn1);
    this.f2 = WA(parampRn2);
  }
  
  public static pRn WA(pRn parampRn) {
    if (pRn.WHITE.equals(parampRn))
      parampRn = null; 
    return parampRn;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/PS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */