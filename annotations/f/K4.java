package f;

import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;

public final class K4 extends FilterInputStream {
  public int U40;
  
  public int eN;
  
  public int fL;
  
  public K4(RD0 paramRD0) {
    super(paramRD0.Yc());
    try {
      if (read() == 82 && read() == 73 && read() == 70 && read() == 70) {
        Zl0(4);
        if (read() == 87 && read() == 65 && read() == 86 && read() == 69) {
          String str;
          int i = lPt4('f', 'm', ' ');
          int j;
          if ((j = read() & 0xFF | (read() & 0xFF) << 8) != 1) {
            if (j != 2) {
              if (j != 3) {
                if (j != 6) {
                  if (j != 7) {
                    if (j != 65534) {
                    
                    } else {
                    
                    } 
                  } else {
                  
                  } 
                } else {
                
                } 
              } else {
              
              } 
            } else {
            
            } 
            str = "ADPCM";
            throw new JU("WAV files must be PCM, unsupported format: " + str + " (" + j + ")");
          } 
          this.U40 = j;
          if ((j = read() & 0xFF | (read() & 0xFF) << 8) == 1 || j == 2) {
            this.eN = read() & 0xFF | (read() & 0xFF) << 8 | (read() & 0xFF) << 16 | (read() & 0xFF) << 24;
            Zl0(6);
            if ((j = read() & 0xFF | (read() & 0xFF) << 8) == 16)
              return; 
            throw new JU("WAV files must have 16 bits per sample: " + j);
          } 
          throw new JU("WAV files must have 1 or 2 channels: " + this.U40);
        } 
        throw new JU("Invalid wave file header: " + paramRD0);
      } 
      throw new JU("RIFF header not found: " + paramRD0);
    } finally {
      Exception exception = null;
      Ui.JC0(this);
    } 
  }
  
  public final int read(byte[] paramArrayOfbyte) {
    if (this.fL == 0)
      return -1; 
    int i = 0;
    while (true) {
      int j;
      if ((j = Math.min(read(paramArrayOfbyte, i, paramArrayOfbyte.length - i), this.fL)) == -1)
        return (i > 0) ? i : -1; 
      this.fL -= j;
      if ((i += j) >= paramArrayOfbyte.length)
        return i; 
    } 
  }
  
  public final int lPt4(char paramChar1, char paramChar2, char paramChar3) {
    byte b = 116;
    while (true) {
      int i;
      if (read() == paramChar1) {
        i = 1;
      } else {
        i = 0;
      } 
      if (read() == paramChar2) {
        j = 1;
      } else {
        j = 0;
      } 
      i &= j;
      if (read() == b) {
        j = 1;
      } else {
        j = 0;
      } 
      i &= j;
      if (read() == paramChar3) {
        j = 1;
      } else {
        j = 0;
      } 
      i &= j;
      int j;
      if ((j = read() & 0xFF | (read() & 0xFF) << 8 | (read() & 0xFF) << 16 | (read() & 0xFF) << 24) != -1) {
        if (i != 0)
          return j; 
        Zl0(j);
        continue;
      } 
      throw new IOException("Chunk not found: " + paramChar1 + paramChar2 + b + paramChar3);
    } 
  }
  
  public final void Zl0(int paramInt) {
    while (paramInt > 0) {
      long l1;
      long l2;
      if ((l2 = this.in.skip(l1 = paramInt)) > 0L) {
        paramInt = (int)(l1 - l2);
        continue;
      } 
      throw new EOFException("Unable to skip.");
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/K4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */