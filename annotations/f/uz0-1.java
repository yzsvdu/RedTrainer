package f;

import java.nio.ByteBuffer;

public final class uz0 {
  public byte Nr;
  
  public short fv;
  
  public short DG;
  
  public byte Nx;
  
  public byte YI0;
  
  public uz0(byte paramByte, ByteBuffer paramByteBuffer) {
    paramByteBuffer.position();
    this.Nr = paramByte;
    if (paramByte == 2 || paramByte == 5) {
      this.fv = paramByteBuffer.getShort();
      this.DG = paramByteBuffer.getShort();
      paramByteBuffer.get();
      paramByteBuffer.get();
      this.Nx = paramByteBuffer.get();
      this.YI0 = paramByteBuffer.get();
      paramByteBuffer.get();
      paramByteBuffer.get();
      return;
    } 
    this.fv = paramByteBuffer.getShort();
    this.DG = paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
  }
  
  public final short oA() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Nr : B
    //   4: iconst_2
    //   5: if_icmpne -> 54
    //   8: aload_0
    //   9: getfield DG : S
    //   12: dup
    //   13: istore_0
    //   14: sipush #210
    //   17: if_icmpge -> 47
    //   20: iload_0
    //   21: iconst_2
    //   22: if_icmpge -> 27
    //   25: iconst_0
    //   26: ireturn
    //   27: iload_0
    //   28: iconst_2
    //   29: isub
    //   30: iload_0
    //   31: iconst_2
    //   32: isub
    //   33: iconst_1
    //   34: ishr
    //   35: bipush #30
    //   37: ishr
    //   38: iadd
    //   39: bipush #14
    //   41: ishl
    //   42: bipush #16
    //   44: ishr
    //   45: i2s
    //   46: ireturn
    //   47: iload_0
    //   48: sipush #210
    //   51: isub
    //   52: i2s
    //   53: ireturn
    //   54: aload_0
    //   55: getfield fv : S
    //   58: ireturn
  }
  
  public final short ez0() {
    return this.DG;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/uz0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */