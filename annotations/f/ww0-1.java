package f;

public class ww0 extends ZK0 {
  public final byte[] tD0;
  
  public final byte[] Ut0;
  
  public ww0(byte... paramVarArgs) {
    this.tD0 = paramVarArgs;
    this.Ut0 = new byte[paramVarArgs.length];
    for (byte b = 0; b < paramVarArgs.length; b++)
      this.Ut0[b] = LF.IW(paramVarArgs[b]); 
  }
  
  public final boolean oO(byte paramByte) {
    byte[] arrayOfByte;
    int i = (arrayOfByte = this.tD0).length;
    for (byte b = 0; b < i; b++) {
      if (paramByte == this[b])
        return true; 
    } 
    return false;
  }
  
  public final boolean sl0(xr0 paramxr0, tc paramtc, byte paramByte1, byte paramByte2) {
    byte[] arrayOfByte;
    int i = (arrayOfByte = this.Ut0).length;
    for (byte b = 0; b < i; b++) {
      if (paramByte1 == this[b])
        return true; 
    } 
    return false;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ww0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */