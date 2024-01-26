package f;

import java.nio.channels.ServerSocketChannel;
import java.util.ArrayList;

public final class pD {
  public static final ik Q6 = C00.gd(pD.class);
  
  public final ArrayList JG0;
  
  public Con T7;
  
  public int ex;
  
  public Con[] sD0;
  
  public final gL0 n0;
  
  public int Sb0;
  
  public rQ[] Tc;
  
  public boolean Ck;
  
  public pD(A1 paramA1, rQ... paramVarArgs) {
    ArrayList arrayList;
    this();
    this.JG0 = this;
    this.Ck = false;
    this.n0 = paramA1;
    this.Sb0 = 0;
    this.Tc = paramVarArgs;
  }
  
  public final void rr() {
    try {
      if (this.Ck)
        Q6.error("Already Started."); 
      int i = this.Sb0;
      mw(i, this.n0);
      boolean bool = false;
      rQ[] arrayOfRQ;
      if ((arrayOfRQ = this.Tc).length <= 0) {
        this.Ck = true;
        return;
      } 
      arrayOfRQ[bool];
      ServerSocketChannel.open().configureBlocking(false);
      throw null;
    } catch (Exception exception) {
      Q6.error(A9.lr0("FATAL"), "NIO Initialization Error: " + this, this);
      throw new Error("NIO Initialization Error", this);
    } 
  }
  
  public final Con lS() {
    Con[] arrayOfCon;
    if ((arrayOfCon = this.sD0) == null)
      return this.T7; 
    if (arrayOfCon.length == 1)
      return arrayOfCon[0]; 
    if (this.ex >= arrayOfCon.length)
      this.ex = 0; 
    int i;
    this.ex = (i = this.ex) + 1;
    return arrayOfCon[i];
  }
  
  public final void mw(int paramInt, gL0 paramgL0) {
    py0 py0;
    if (paramInt <= 0) {
      this("AcceptReadWrite Dispatcher", paramgL0);
      this.T7 = py0;
      (py0 = new py0()).start();
    } else {
      (this.T7 = new wz()).start();
      this.sD0 = new Con[py0];
      Con[] arrayOfCon;
      for (byte b = 0; b < (arrayOfCon = this.sD0).length; b++) {
        py0 py01;
        this("ReadWrite-" + b + " Dispatcher", paramgL0);
        arrayOfCon[b] = py01;
        this.sD0[b].start();
      } 
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/pD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */