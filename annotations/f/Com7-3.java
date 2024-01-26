package f;

import java.nio.ByteBuffer;

public final class Com7 {
  public int Qh0;
  
  public eJ[] rb0;
  
  public Com7(E4 paramE4) {
    ByteBuffer byteBuffer;
    (byteBuffer = paramE4.R80()).position(paramE4.mJ0);
    paramE4.R80().get(new byte[4]);
    paramE4.R80().getInt();
    int i = paramE4.R80().getInt();
    this.rb0 = new eJ[i];
    for (i = 0; i < this.Qh0; i++) {
      eJ eJ1;
      int j = byteBuffer.getInt();
      this(paramE4, j, byteBuffer.getInt());
      this.rb0[i] = eJ1;
      byteBuffer.position(byteBuffer.position() + 8);
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Com7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */