package f;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;

public final class H4 extends DataOutputStream {
  public final ByteArrayOutputStream kv;
  
  public final CRC32 Zj;
  
  public H4(int paramInt) {
    this(paramInt);
    ByteArrayOutputStream byteArrayOutputStream;
    CRC32 cRC32;
    this();
    this(this, cRC32);
  }
  
  public H4(ByteArrayOutputStream paramByteArrayOutputStream, CRC32 paramCRC32) {
    this(paramByteArrayOutputStream, paramCRC32);
    CheckedOutputStream checkedOutputStream;
    super(this);
    this.kv = paramByteArrayOutputStream;
    this.Zj = paramCRC32;
  }
  
  public final void tf0(DataOutputStream paramDataOutputStream) {
    flush();
    paramDataOutputStream.writeInt(this.kv.size() - 4);
    this.kv.writeTo(paramDataOutputStream);
    paramDataOutputStream.writeInt((int)this.Zj.getValue());
    this.kv.reset();
    this.Zj.reset();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/H4.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */