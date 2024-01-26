package f;

import java.nio.ByteBuffer;

public final class Mh0 {
  public int yn0;
  
  public short c50;
  
  public short iz;
  
  public byte t90;
  
  public short Ut0;
  
  public eo wp;
  
  public Q1 sD;
  
  public fQ Fe0;
  
  public fQ R8;
  
  public ByteBuffer ut0;
  
  public int fF0;
  
  public boolean kR;
  
  public Mh0() {
    fQ fQ1;
    this(4);
    this.Fe0 = this;
    this(4);
    this.R8 = this;
    this.kR = false;
  }
  
  public final void DI0() {
    if (this.kR)
      return; 
    this.ut0.position(this.fF0);
    this.sD = Q1.tB(this.ut0);
    Hc0 hc0 = this.R8.r30();
    while (hc0.hasNext()) {
      int i = ((Integer)hc0.next()).intValue();
      this.ut0.position(i);
      IK0 iK0;
      if ((iK0 = IK0.qB0(this.ut0)) != null)
        this.Fe0.Com3(iK0); 
    } 
    this.kR = true;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Mh0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */