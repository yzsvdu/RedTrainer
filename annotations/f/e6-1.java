package f;

import java.nio.ByteBuffer;

public abstract class e6 extends JH {
  public e6(int paramInt) {
    super(1, paramInt);
  }
  
  public e6() {}
  
  public static void Ti(String paramString, ByteBuffer paramByteBuffer) {
    if (paramString != null) {
      int i = paramString.length();
      for (byte b = 0; b < i; b++)
        paramByteBuffer.putChar(paramString.charAt(b)); 
    } 
    paramByteBuffer.putChar(false);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/e6.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */