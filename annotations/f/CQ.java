package f;

public final class CQ extends Gp0 {
  public DG uy0 = DG.qk0;
  
  public byte JH = 0;
  
  public CQ(ky paramky, Mn paramMn, int paramInt, byte paramByte1, yi paramyi, rK paramrK, aq0 paramaq0, DO[] paramArrayOfDO, CC0[] paramArrayOfCC0, byte paramByte2, byte paramByte3, boolean paramBoolean, QZ[] paramArrayOfQZ, hm0[][] paramArrayOfhm0) {
    super(paramky, paramMn, paramInt, paramByte1, (byte)0, paramyi, paramrK, (byte)-1, (short)0, paramaq0, false, (byte)-1, (byte)-1, (byte)0, paramArrayOfDO, paramArrayOfCC0, null, this, paramByte2, paramByte3, paramBoolean, paramArrayOfQZ, paramArrayOfhm0, false);
  }
  
  public final byte rl0() {
    return 1;
  }
  
  public final short Ta() {
    switch (this.uy0.ordinal()) {
      default:
        return super.Ta();
      case 4:
        return 392;
      case 3:
        return 396;
      case 2:
        return 395;
      case 1:
        return 394;
      case 0:
        break;
    } 
    return 393;
  }
  
  public final hm0 N0(byte paramByte1, byte paramByte2) {
    hm0[] arrayOfHm0;
    return (paramByte1 < 0 || paramByte1 > 3 || paramByte2 >= (arrayOfHm0 = this.cl[paramByte1]).length) ? null : this[paramByte2];
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/CQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */