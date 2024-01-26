package f;

public final class vp0 extends ZK0 {
  public final boolean sl0(xr0 paramxr0, tc paramtc, byte paramByte1, byte paramByte2) {
    if (!(paramtc instanceof Jo))
      return true; 
    if (((Jo)paramtc).so0((byte)4)) {
      boolean bool;
      if ((paramByte2 & 0x40) != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool)
        return false; 
    } 
    return true;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/vp0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */