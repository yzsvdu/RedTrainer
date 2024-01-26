package f;

public final class q90 {
  public final pe eI;
  
  public final pRn UJ0;
  
  public final pRn Kc;
  
  public q90(pe parampe, pRn parampRn1, pRn parampRn2) {
    if (parampRn2 == null)
      parampRn2 = parampRn1; 
    this.eI = parampe;
    this.UJ0 = fc0(parampRn1);
    this.Kc = fc0(parampRn2);
  }
  
  public static pRn fc0(pRn parampRn) {
    if (pRn.WHITE.equals(parampRn))
      parampRn = null; 
    return parampRn;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/q90.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */