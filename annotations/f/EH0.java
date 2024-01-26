package f;

public abstract class EH0 {
  private Xt0 resolver;
  
  public EH0(Xt0 paramXt0) {
    this.resolver = paramXt0;
  }
  
  public RD0 resolve(String paramString) {
    return this.resolver.resolve(paramString);
  }
  
  public abstract fQ getDependencies(String paramString, RD0 paramRD0, wP paramwP);
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/EH0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */