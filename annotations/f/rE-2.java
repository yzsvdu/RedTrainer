package f;

import java.nio.ByteBuffer;

public final class rE {
  public static final ik Dv = C00.gd(rE.class);
  
  public ByteBuffer L6;
  
  public rD[] Ha;
  
  public HE0[] LJ0;
  
  public ta[] Tu0;
  
  public un[] it0;
  
  public rE(T7 paramT7) {
    ByteBuffer byteBuffer = paramT7.l2();
    if (byteBuffer.getInt() != 347218) {
      Dv.info(paramT7.JP + " Not a valid pointdata file.");
      this.Ha = new rD[0];
      this.LJ0 = new HE0[0];
      this.Tu0 = new ta[0];
      this.it0 = new un[0];
      return;
    } 
    this.L6.getInt();
    int i = this.L6.getInt();
    int k = this.L6.getInt();
    int m = this.L6.getInt();
    this.L6.getInt();
    this.L6.getInt();
    this.L6.position(i);
    int j;
    this.Ha = new rD[i = ((j = this.L6.getInt()) - i) / 112];
    for (byte b = 0; b < i; b++)
      this.Ha[b] = new rD(b, this.L6); 
    if ((i = (k - j) / 72) <= 127) {
      this.LJ0 = new HE0[i];
      this.L6.position(j);
      for (j = 0; j < i; j = (byte)(j + 1))
        this.LJ0[j] = new HE0(j, this.L6); 
      this.Tu0 = new ta[j = (m - k) / 36];
      this.L6.position(k);
      for (k = 0; k < j; k++) {
        ta ta1;
        this(this.L6);
        this.Tu0[k] = ta1;
      } 
      this.it0 = new un[i];
      this.L6.position(m);
      j = 0;
      while (j < i) {
        un un1;
        this(this.L6);
        this.it0[j] = un1;
        byte b1 = (byte)(j + 1);
      } 
      return;
    } 
    throw new RuntimeException();
  }
  
  public static short tu(byte paramByte, short paramShort) {
    if (paramByte != 2)
      return -1; 
    switch (paramShort) {
      default:
        return -1;
      case 341:
        return 16;
      case 340:
        return 15;
      case 339:
        return 14;
      case 338:
        return 13;
      case 255:
        return 12;
      case 249:
        return 11;
      case 241:
      case 242:
      case 243:
      case 244:
        return 10;
      case 214:
        return 9;
      case 211:
        return 8;
      case 209:
        return 7;
      case 137:
        return 4;
      case 121:
        return 3;
      case 114:
        return 2;
      case 66:
        return 1;
      case 36:
        return 0;
      case 30:
        return 6;
      case 28:
        break;
    } 
    return 5;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/rE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */