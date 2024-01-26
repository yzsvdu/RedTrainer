package f;

public final class JT extends wk0 {
  public final Integer Sx(int... paramVarArgs) {
    int i = paramVarArgs[0];
    for (byte b = 1; b < paramVarArgs.length; b++)
      i = Math.min(i, paramVarArgs[b]); 
    return Integer.valueOf(i);
  }
  
  public final Float F5(float... paramVarArgs) {
    float f = paramVarArgs[0];
    for (byte b = 1; b < paramVarArgs.length; b++)
      f = Math.min(f, paramVarArgs[b]); 
    return Float.valueOf(f);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/JT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */