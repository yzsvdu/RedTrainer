package f;

import java.nio.ByteBuffer;

public final class uI extends eJ {
  public J[] fM0;
  
  public uI(E4 paramE4) {
    super(paramE4, i, paramE4.cW);
    ByteBuffer byteBuffer;
    (byteBuffer = te()).get(new byte[4]);
    te().getInt();
    int[] arrayOfInt = new int[8];
    for (byte b1 = 0; b1 < 8; b1++)
      arrayOfInt[b1] = byteBuffer.getInt(); 
    byteBuffer.position(byteBuffer.position() + 24);
    ut[] arrayOfUt;
    (arrayOfUt = new ut[8])[0] = t7::new;
    (new ut[8])[1] = Pe::new;
    (new ut[8])[2] = i40::new;
    (new ut[8])[3] = cV::new;
    (new ut[8])[4] = AB0::new;
    (new ut[8])[5] = Ys::new;
    (new ut[8])[6] = Fc::new;
    (new ut[8])[7] = mP::new;
    this.fM0 = new J[8];
    for (byte b2 = 0; b2 < 8; b2++) {
      byteBuffer.position(arrayOfInt[b2]);
      this.fM0[b2] = new J(byteBuffer, arrayOfUt[b2]);
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/uI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */