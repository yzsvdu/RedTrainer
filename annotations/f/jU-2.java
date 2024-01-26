package f;

public final class jU extends Dy {
  public int w2 = -1;
  
  public jU(String paramString, int paramInt) {
    super(paramString, paramInt, false);
  }
  
  public final int C0(s40 params40) {
    int j;
    if ((j = this.w2) != -1)
      return j; 
    params40.pr().position(super.C0(params40));
    int i;
    if (pN.pk0(i = params40.pr().getInt()))
      return this.w2 = pN.tx0(i); 
    throw new RuntimeException("Invalid Offset");
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/jU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */