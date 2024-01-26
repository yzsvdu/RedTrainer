package f;

public final class nt {
  public boolean rw = false;
  
  public String sG;
  
  public byte[] D8 = null;
  
  public nt(String paramString1, String paramString2) {
    this.sG = paramString1;
    if (paramString2 != null)
      try {
        boolean bool;
        if ((this.D8 = ez0.H2(paramString2)) != null) {
          bool = true;
        } else {
          bool = false;
        } 
        this.rw = bool;
      } catch (IllegalArgumentException illegalArgumentException) {} 
  }
  
  public final boolean equals(Object paramObject) {
    return !(paramObject instanceof nt) ? false : ((nt)paramObject).sG.equalsIgnoreCase(this.sG);
  }
  
  public final String toString() {
    return this.sG;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/nt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */