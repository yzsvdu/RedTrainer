package f;

public final class Vk extends V4 {
  public V4[] Kf = new V4[4];
  
  public Vk(byte paramByte, V4... paramVarArgs) {
    super(paramByte);
    int i = paramVarArgs.length;
    for (byte b = 0; b < i; b++) {
      V4 v4 = paramVarArgs[b];
      this.Kf[v4.JA0()] = v4;
    } 
    i = 0;
    while (i < 4) {
      if (this.Kf[i] != null) {
        i++;
        continue;
      } 
      throw new RuntimeException();
    } 
  }
  
  public final V4 cs(byte paramByte) {
    if (paramByte < 0 || paramByte > 3)
      paramByte = 0; 
    return this.Kf[paramByte];
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Vk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */