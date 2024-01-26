package f;

import java.io.ByteArrayOutputStream;

public final class C5 extends Hn {
  public C5(Xb0 paramXb0, RD0 paramRD0) {
    super(paramXb0);
    qp0 qp01;
    qp0 qp02;
    if (paramXb0.jj0)
      return; 
    paramXb0 = null;
    this(paramRD0.Yc());
    try {
      ByteArrayOutputStream byteArrayOutputStream;
      this(4096);
      byte[] arrayOfByte2 = new byte[2048];
      int j;
      while (!qp02.Cc() && (j = qp02.read(arrayOfByte2)) != -1)
        byteArrayOutputStream.write(arrayOfByte2, 0, j); 
      byte[] arrayOfByte1 = byteArrayOutputStream.toByteArray();
      int i = qp02.Z0();
      j = qp02.B6();
      oK0(arrayOfByte1, i, j);
      Ui.JC0(qp02);
      return;
    } finally {}
    Ui.JC0(qp01);
    throw null;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/C5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */