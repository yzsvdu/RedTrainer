package f;

import java.nio.ByteBuffer;

public final class SK {
  public boolean ll0 = false;
  
  public float Ok0 = 0.0F;
  
  public long Wv;
  
  public long T30;
  
  public float[] Ks;
  
  public SK(ByteBuffer paramByteBuffer, int paramInt1, boolean paramBoolean, int paramInt2) {
    if (paramBoolean) {
      this.Ok0 = dL.T50(paramByteBuffer.getInt());
      this.ll0 = true;
    } else {
      float[] arrayOfFloat;
      this.Wv = paramByteBuffer.getInt() & 0xFFFFFFFFL;
      this.T30 = paramByteBuffer.getInt() & 0xFFFFFFFFL;
      int i = paramByteBuffer.position();
      paramByteBuffer.position((int)(this.T30 + paramInt1));
      if ((this.Wv & 0x20000000L) != 0L) {
        this.Ks = new float[paramInt2];
        for (paramInt1 = 0; paramInt1 < (arrayOfFloat = this.Ks).length; paramInt1++)
          arrayOfFloat[paramInt1] = paramByteBuffer.getShort() / 4096.0F; 
      } else {
        this.Ks = new float[arrayOfFloat];
        for (paramInt1 = 0; paramInt1 < this.Ks.length; paramInt1++) {
          if (paramByteBuffer.hasRemaining()) {
            this.Ks[paramInt1] = paramByteBuffer.getInt() / 4096.0F;
          } else {
            paramByteBuffer.position(paramByteBuffer.position() - 4);
            this.Ks[paramInt1] = paramByteBuffer.getInt() / 4096.0F;
          } 
        } 
      } 
      paramByteBuffer.position(i);
    } 
  }
  
  public final float Xs(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ll0 : Z
    //   4: ifeq -> 12
    //   7: aload_0
    //   8: getfield Ok0 : F
    //   11: freturn
    //   12: aload_0
    //   13: getfield Wv : J
    //   16: dup2
    //   17: dup2
    //   18: lstore_2
    //   19: ldc2_w 536805376
    //   22: land
    //   23: bipush #16
    //   25: lshr
    //   26: l2i
    //   27: istore #4
    //   29: ldc2_w 3221225472
    //   32: land
    //   33: lconst_0
    //   34: lcmp
    //   35: ifne -> 47
    //   38: aload_0
    //   39: getfield Ks : [F
    //   42: iload_1
    //   43: faload
    //   44: goto -> 253
    //   47: lload_2
    //   48: ldc2_w 1073741824
    //   51: land
    //   52: lconst_0
    //   53: lcmp
    //   54: ifeq -> 120
    //   57: iload_1
    //   58: iconst_1
    //   59: iand
    //   60: ifeq -> 109
    //   63: iload_1
    //   64: iload #4
    //   66: if_icmple -> 83
    //   69: aload_0
    //   70: getfield Ks : [F
    //   73: iload #4
    //   75: iconst_1
    //   76: ishr
    //   77: iconst_1
    //   78: iadd
    //   79: faload
    //   80: goto -> 253
    //   83: aload_0
    //   84: getfield Ks : [F
    //   87: dup
    //   88: astore_0
    //   89: iload_1
    //   90: iconst_1
    //   91: ishr
    //   92: dup
    //   93: aload_0
    //   94: swap
    //   95: faload
    //   96: fconst_2
    //   97: fdiv
    //   98: fstore_0
    //   99: iconst_1
    //   100: iadd
    //   101: faload
    //   102: fconst_2
    //   103: fdiv
    //   104: fload_0
    //   105: fadd
    //   106: goto -> 253
    //   109: aload_0
    //   110: getfield Ks : [F
    //   113: iload_1
    //   114: iconst_1
    //   115: ishr
    //   116: faload
    //   117: goto -> 253
    //   120: lload_2
    //   121: ldc2_w 2147483648
    //   124: land
    //   125: lconst_0
    //   126: lcmp
    //   127: ifeq -> 252
    //   130: iload_1
    //   131: iconst_3
    //   132: iand
    //   133: dup
    //   134: istore_2
    //   135: ifeq -> 241
    //   138: iload_1
    //   139: iload #4
    //   141: if_icmple -> 158
    //   144: aload_0
    //   145: getfield Ks : [F
    //   148: iload #4
    //   150: iconst_2
    //   151: ishr
    //   152: iload_2
    //   153: iadd
    //   154: faload
    //   155: goto -> 253
    //   158: iload_1
    //   159: iconst_1
    //   160: iand
    //   161: ifeq -> 215
    //   164: iload_1
    //   165: iconst_2
    //   166: iand
    //   167: ifeq -> 181
    //   170: iload_1
    //   171: iconst_2
    //   172: ishr
    //   173: dup
    //   174: istore_1
    //   175: iconst_1
    //   176: iadd
    //   177: istore_2
    //   178: goto -> 189
    //   181: iload_1
    //   182: iconst_2
    //   183: ishr
    //   184: dup
    //   185: istore_2
    //   186: iconst_1
    //   187: iadd
    //   188: istore_1
    //   189: aload_0
    //   190: getfield Ks : [F
    //   193: dup
    //   194: astore_0
    //   195: iload_2
    //   196: faload
    //   197: dup
    //   198: dup
    //   199: fstore_2
    //   200: aload_0
    //   201: iload_1
    //   202: faload
    //   203: fstore_0
    //   204: fadd
    //   205: fload_2
    //   206: fadd
    //   207: fload_0
    //   208: fadd
    //   209: ldc 4.0
    //   211: fdiv
    //   212: goto -> 253
    //   215: aload_0
    //   216: getfield Ks : [F
    //   219: dup
    //   220: astore_0
    //   221: iload_1
    //   222: iconst_2
    //   223: ishr
    //   224: dup
    //   225: aload_0
    //   226: swap
    //   227: faload
    //   228: fconst_2
    //   229: fdiv
    //   230: fstore_0
    //   231: iconst_1
    //   232: iadd
    //   233: faload
    //   234: fconst_2
    //   235: fdiv
    //   236: fload_0
    //   237: fadd
    //   238: goto -> 253
    //   241: aload_0
    //   242: getfield Ks : [F
    //   245: iload_1
    //   246: iconst_2
    //   247: ishr
    //   248: faload
    //   249: goto -> 253
    //   252: fconst_0
    //   253: freturn
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/SK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */