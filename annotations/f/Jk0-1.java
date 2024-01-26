package f;

public final class Jk0 {
  public int xU;
  
  public int uR;
  
  public int YI;
  
  public int zq;
  
  public int h50;
  
  public float Yz0;
  
  public float ph0;
  
  public float J2;
  
  public float I20;
  
  public int eJ;
  
  public int Sx0;
  
  public int Ek;
  
  public byte[][] Wx;
  
  public int R80 = 0;
  
  public final void Js0(int paramInt1, int paramInt2) {
    if (this.Wx == null)
      this.Wx = new byte[128][]; 
    byte[][] arrayOfByte;
    int j;
    byte[] arrayOfByte1;
    if ((arrayOfByte1 = (arrayOfByte = this.Wx)[j = paramInt1 >>> 9]) == null) {
      arrayOfByte1 = new byte[512];
      this[j] = arrayOfByte1;
    } 
    int i = paramInt1 & 0x1FF;
    arrayOfByte1[i] = (byte)paramInt2;
  }
  
  public final String toString() {
    return Character.toString((char)this.xU);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Jk0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */