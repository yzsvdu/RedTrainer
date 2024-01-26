package f;

public final class qg0 implements Xt0 {
  public Xt0[] DG0;
  
  public qg0(Xt0... paramVarArgs) {
    this.DG0 = paramVarArgs;
  }
  
  public final RD0 resolve(String paramString) {
    RD0 rD0 = null;
    Xt0[] arrayOfXt0;
    for (byte b = 0; b < (arrayOfXt0 = this.DG0).length; b++) {
      if ((rD0 = arrayOfXt0[b].resolve(paramString)) != null && rD0.L0())
        return rD0; 
    } 
    return rD0;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/qg0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */