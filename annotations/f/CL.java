package f;

public final class CL extends ZK0 {
  public boolean QI;
  
  public CL(boolean paramBoolean) {
    this.QI = paramBoolean;
  }
  
  public final boolean sl0(xr0 paramxr0, tc paramtc, byte paramByte1, byte paramByte2) {
    boolean bool;
    if (!(paramtc instanceof Jo))
      return true; 
    if ((paramByte2 & 0x40) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return (!bool && this.QI && (paramByte1 == 1 || paramByte1 == 0)) ? true : ((!bool && !this.QI && (paramByte1 == 3 || paramByte1 == 2)) ? true : (!((Jo)paramtc).so0((byte)2)));
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/CL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */