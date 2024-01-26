package f;

public final class YL extends Nm0 {
  public final Nm0[] ki;
  
  public final boolean MQ;
  
  public final boolean Sa0;
  
  public YL(char paramChar, Nm0... paramVarArgs) {
    if (paramChar == '|' || paramChar == '+' || paramChar == '^') {
      boolean bool;
      this.ki = paramVarArgs;
      if (paramChar == '+') {
        bool = true;
      } else {
        bool = false;
      } 
      this.MQ = bool;
      if (paramChar == '^') {
        paramChar = '\001';
      } else {
        paramChar = Character.MIN_VALUE;
      } 
      this.Sa0 = paramChar;
      return;
    } 
    throw new IllegalArgumentException("kind");
  }
  
  public final boolean aU(fB0 paramfB0) {
    int i;
    int j = this.MQ ^ this.vS;
    Nm0[] arrayOfNm0;
    int k = (arrayOfNm0 = this.ki).length;
    for (byte b = 0; b < k; b++) {
      int m = arrayOfNm0[b].aU(paramfB0);
      if (this.Sa0) {
        i = j ^ m;
      } else if (this.MQ != m) {
        return i ^ 0x1;
      } 
    } 
    return i;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/YL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */