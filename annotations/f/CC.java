package f;

public final class CC {
  public int B5 = 0;
  
  public int br = 0;
  
  public int vP = 0;
  
  public final int[] UZ = new int[32768];
  
  public final int F30(int paramInt) {
    this.br += paramInt;
    int i = 0;
    int j;
    if ((j = this.vP) + paramInt < 32768) {
      while (paramInt-- > 0) {
        byte b;
        i <<= 1;
        if (this.UZ[j++] != 0) {
          b = 1;
        } else {
          b = 0;
        } 
        i |= b;
      } 
    } else {
      while (paramInt-- > 0) {
        byte b;
        i <<= 1;
        if (this.UZ[j] != 0) {
          b = 1;
        } else {
          b = 0;
        } 
        i |= b;
        j = j + 1 & 0x7FFF;
      } 
    } 
    this.vP = j;
    return i;
  }
  
  public final int Cp() {
    this.br++;
    this.vP = i + 1 & 0x7FFF;
    int i;
    return this.UZ[i = this.vP];
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/CC.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */