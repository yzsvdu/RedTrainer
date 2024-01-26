package f;

import java.nio.ByteBuffer;

public final class f1 implements Cloneable {
  public final int lu0;
  
  public int[] LPT2;
  
  public int YQ;
  
  public f1(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer) {
    // Byte code:
    //   0: aload_3
    //   1: dup
    //   2: iload_2
    //   3: aload_0
    //   4: iload_1
    //   5: aload_0
    //   6: iload_1
    //   7: aload_0
    //   8: iload_2
    //   9: aload_0
    //   10: invokespecial <init> : ()V
    //   13: putfield YQ : I
    //   16: putfield lu0 : I
    //   19: invokestatic Kv0 : (I)I
    //   22: newarray int
    //   24: putfield LPT2 : [I
    //   27: invokevirtual position : (I)Ljava/nio/Buffer;
    //   30: pop
    //   31: iconst_2
    //   32: invokestatic va0 : (Ljava/nio/ByteBuffer;I)I
    //   35: ifle -> 210
    //   38: aload_0
    //   39: iload_2
    //   40: aload_3
    //   41: invokestatic sf : (ILjava/nio/ByteBuffer;)[B
    //   44: invokestatic wrap : ([B)Ljava/nio/ByteBuffer;
    //   47: getstatic java/nio/ByteOrder.LITTLE_ENDIAN : Ljava/nio/ByteOrder;
    //   50: invokevirtual order : (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   53: astore_1
    //   54: getfield LPT2 : [I
    //   57: arraylength
    //   58: aload_1
    //   59: invokevirtual capacity : ()I
    //   62: iconst_2
    //   63: idiv
    //   64: if_icmpge -> 79
    //   67: aload_0
    //   68: aload_1
    //   69: invokevirtual capacity : ()I
    //   72: iconst_2
    //   73: idiv
    //   74: newarray int
    //   76: putfield LPT2 : [I
    //   79: iconst_0
    //   80: istore_2
    //   81: iload_2
    //   82: aload_0
    //   83: getfield LPT2 : [I
    //   86: arraylength
    //   87: if_icmpge -> 341
    //   90: aload_1
    //   91: invokevirtual getShort : ()S
    //   94: ldc 65535
    //   96: iand
    //   97: dup
    //   98: sipush #1024
    //   101: idiv
    //   102: i2b
    //   103: dup
    //   104: istore_3
    //   105: sipush #1024
    //   108: imul
    //   109: isub
    //   110: dup
    //   111: bipush #32
    //   113: idiv
    //   114: i2b
    //   115: dup
    //   116: istore #4
    //   118: bipush #32
    //   120: imul
    //   121: isub
    //   122: iconst_1
    //   123: idiv
    //   124: i2b
    //   125: dup
    //   126: istore #5
    //   128: bipush #31
    //   130: if_icmple -> 137
    //   133: bipush #31
    //   135: istore #5
    //   137: iload #4
    //   139: bipush #31
    //   141: if_icmple -> 148
    //   144: bipush #31
    //   146: istore #4
    //   148: iload_3
    //   149: bipush #31
    //   151: if_icmple -> 157
    //   154: bipush #31
    //   156: istore_3
    //   157: aload_0
    //   158: getfield LPT2 : [I
    //   161: iload_2
    //   162: iload #5
    //   164: bipush #8
    //   166: imul
    //   167: sipush #255
    //   170: iand
    //   171: bipush #24
    //   173: ishl
    //   174: iload #4
    //   176: bipush #8
    //   178: imul
    //   179: sipush #255
    //   182: iand
    //   183: bipush #16
    //   185: ishl
    //   186: ior
    //   187: iload_3
    //   188: bipush #8
    //   190: imul
    //   191: sipush #255
    //   194: iand
    //   195: bipush #8
    //   197: ishl
    //   198: ior
    //   199: sipush #255
    //   202: ior
    //   203: iastore
    //   204: iinc #2, 1
    //   207: goto -> 81
    //   210: iconst_0
    //   211: istore_1
    //   212: iload_1
    //   213: aload_0
    //   214: getfield LPT2 : [I
    //   217: arraylength
    //   218: if_icmpge -> 341
    //   221: aload_3
    //   222: invokevirtual getShort : ()S
    //   225: ldc 65535
    //   227: iand
    //   228: dup
    //   229: sipush #1024
    //   232: idiv
    //   233: i2b
    //   234: dup
    //   235: istore_2
    //   236: sipush #1024
    //   239: imul
    //   240: isub
    //   241: dup
    //   242: bipush #32
    //   244: idiv
    //   245: i2b
    //   246: dup
    //   247: istore #4
    //   249: bipush #32
    //   251: imul
    //   252: isub
    //   253: iconst_1
    //   254: idiv
    //   255: i2b
    //   256: dup
    //   257: istore #5
    //   259: bipush #31
    //   261: if_icmple -> 268
    //   264: bipush #31
    //   266: istore #5
    //   268: iload #4
    //   270: bipush #31
    //   272: if_icmple -> 279
    //   275: bipush #31
    //   277: istore #4
    //   279: iload_2
    //   280: bipush #31
    //   282: if_icmple -> 288
    //   285: bipush #31
    //   287: istore_2
    //   288: aload_0
    //   289: getfield LPT2 : [I
    //   292: iload_1
    //   293: iload #5
    //   295: bipush #8
    //   297: imul
    //   298: sipush #255
    //   301: iand
    //   302: bipush #24
    //   304: ishl
    //   305: iload #4
    //   307: bipush #8
    //   309: imul
    //   310: sipush #255
    //   313: iand
    //   314: bipush #16
    //   316: ishl
    //   317: ior
    //   318: iload_2
    //   319: bipush #8
    //   321: imul
    //   322: sipush #255
    //   325: iand
    //   326: bipush #8
    //   328: ishl
    //   329: ior
    //   330: sipush #255
    //   333: ior
    //   334: iastore
    //   335: iinc #1, 1
    //   338: goto -> 212
    //   341: aload_0
    //   342: getfield LPT2 : [I
    //   345: dup
    //   346: astore_0
    //   347: arraylength
    //   348: ifle -> 359
    //   351: aload_0
    //   352: dup
    //   353: iconst_0
    //   354: iconst_0
    //   355: iastore
    //   356: iconst_0
    //   357: iconst_0
    //   358: iastore
    //   359: return
  }
  
  public final f1 Zm0() {
    try {
      ((f1)super.clone()).LPT2 = (int[])this.LPT2.clone();
      return (f1)super.clone();
    } catch (CloneNotSupportedException cloneNotSupportedException) {
      null.printStackTrace();
      return null;
    } 
  }
  
  public final f1 Ye() {
    try {
      f1 f11;
      (f11 = (f1)super.clone()).LPT2 = (int[])this.LPT2.clone();
      int[] arrayOfInt;
      for (byte b = 1; b < (arrayOfInt = f11.LPT2).length; b++) {
        int i = i >> 16 & 0xFF;
        int j = i >> 8 & 0xFF;
        arrayOfInt[b] = (i = (((i = arrayOfInt[b]) >> 24 & 0xFF) + i + j) / 3) << 24 | i << 16 | i << 8 | 0xFF;
      } 
      return f11;
    } catch (CloneNotSupportedException cloneNotSupportedException) {
      null.printStackTrace();
      return null;
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/f1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */