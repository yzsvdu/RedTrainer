package f;

import java.nio.ByteBuffer;

public class dc {
  public String[] qJ0;
  
  public dc() {
    this.qJ0 = new String[0];
  }
  
  public dc(ByteBuffer paramByteBuffer) {
    int i;
    int[] arrayOfInt = new int[i = paramByteBuffer.getInt()];
    this.qJ0 = new String[paramByteBuffer.getInt()];
    byte b;
    for (b = 0; b < i; b++)
      arrayOfInt[b] = paramByteBuffer.getInt(); 
    b = 0;
    label22: while (b < i) {
      StringBuilder stringBuilder;
      if (arrayOfInt[b] == 0) {
        this.qJ0[b] = "";
        continue;
      } 
      this();
      paramByteBuffer.position(arrayOfInt[b]);
      while (true) {
        char c;
        if ((c = (char)paramByteBuffer.get()) == '\000') {
          this.qJ0[b] = stringBuilder.toString().trim();
          b++;
          continue label22;
        } 
        stringBuilder.append(c);
      } 
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/dc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */