package f;

import java.util.Arrays;
import java.util.Objects;

public final class c90 extends JG0 implements iq0 {
  public final Gp0 pA0;
  
  public final jd0[] Wc;
  
  public j90[] oV = null;
  
  public boolean nu = false;
  
  public c90(Gp0 paramGp0) {
    this.pA0 = paramGp0;
    jd0[] arrayOfJd01 = (jd0[])Arrays.stream(paramGp0.Xt0(paramGp0.hG0())).map(cOm4::DV).filter(Objects::nonNull).toArray(c90::jy0);
    this.oV = new j90[arrayOfJd01.length];
    jd0[] arrayOfJd02;
    for (byte b = 0; b < (arrayOfJd02 = this.Wc).length; b++)
      this.oV[b] = new j90(paramGp0, arrayOfJd02[b]); 
  }
  
  public final void d40() {
    // Byte code:
    //   0: aload_0
    //   1: getfield oV : [Lf/j90;
    //   4: dup
    //   5: astore_1
    //   6: ifnonnull -> 10
    //   9: return
    //   10: aload_1
    //   11: arraylength
    //   12: istore_2
    //   13: iconst_0
    //   14: istore_3
    //   15: iload_3
    //   16: iload_2
    //   17: if_icmpge -> 49
    //   20: aload_1
    //   21: iload_3
    //   22: aaload
    //   23: dup
    //   24: astore #4
    //   26: getfield fr0 : Lf/JG0;
    //   29: ifnonnull -> 43
    //   32: aload_0
    //   33: dup
    //   34: invokevirtual Ub : ()I
    //   37: aload #4
    //   39: swap
    //   40: invokevirtual si : (Lf/JG0;I)V
    //   43: iinc #3, 1
    //   46: goto -> 15
    //   49: invokestatic XU : ()Z
    //   52: ifeq -> 90
    //   55: aload_0
    //   56: getfield pA0 : Lf/Gp0;
    //   59: getfield dd : Lf/rK;
    //   62: getstatic f/rK.Az : Lf/rK;
    //   65: if_acmpeq -> 90
    //   68: getstatic f/km.wI0 : Lf/Pw;
    //   71: invokevirtual dG : ()I
    //   74: istore_1
    //   75: iconst_0
    //   76: istore_2
    //   77: getstatic f/km.wI0 : Lf/Pw;
    //   80: invokevirtual k1 : ()I
    //   83: istore_3
    //   84: iconst_0
    //   85: istore #4
    //   87: goto -> 113
    //   90: getstatic f/cf.hf0 : I
    //   93: istore_1
    //   94: getstatic f/km.wI0 : Lf/Pw;
    //   97: invokevirtual dG : ()I
    //   100: iload_1
    //   101: isub
    //   102: iconst_2
    //   103: idiv
    //   104: istore_2
    //   105: getstatic f/cf.G30 : I
    //   108: istore_3
    //   109: bipush #50
    //   111: istore #4
    //   113: aload_0
    //   114: iconst_0
    //   115: istore #5
    //   117: iconst_0
    //   118: istore #6
    //   120: getfield oV : [Lf/j90;
    //   123: dup
    //   124: astore #7
    //   126: arraylength
    //   127: istore #8
    //   129: iconst_0
    //   130: istore #9
    //   132: iload #9
    //   134: iload #8
    //   136: if_icmpge -> 178
    //   139: aload #7
    //   141: iload #9
    //   143: aaload
    //   144: dup
    //   145: astore #10
    //   147: getfield HC : I
    //   150: dup
    //   151: istore #11
    //   153: iload #6
    //   155: iload #5
    //   157: aload #10
    //   159: getfield xY : I
    //   162: iadd
    //   163: istore #5
    //   165: if_icmple -> 172
    //   168: iload #11
    //   170: istore #6
    //   172: iinc #9, 1
    //   175: goto -> 132
    //   178: iload #5
    //   180: iload_1
    //   181: if_icmple -> 284
    //   184: invokestatic XU : ()Z
    //   187: ifeq -> 193
    //   190: goto -> 284
    //   193: iload_3
    //   194: iload #6
    //   196: iload_1
    //   197: iload #5
    //   199: i2d
    //   200: ldc2_w 0.5
    //   203: dmul
    //   204: d2i
    //   205: iconst_2
    //   206: iload_2
    //   207: invokestatic Se0 : (IIII)I
    //   210: istore_1
    //   211: iconst_2
    //   212: imul
    //   213: isub
    //   214: iconst_2
    //   215: idiv
    //   216: iload #4
    //   218: iadd
    //   219: istore_2
    //   220: iconst_0
    //   221: istore_3
    //   222: iload_1
    //   223: istore #4
    //   225: iload_3
    //   226: aload_0
    //   227: getfield oV : [Lf/j90;
    //   230: dup
    //   231: astore #5
    //   233: arraylength
    //   234: if_icmpge -> 343
    //   237: iload_3
    //   238: aload #5
    //   240: iload_3
    //   241: aaload
    //   242: iload #4
    //   244: iload_2
    //   245: invokevirtual ME : (II)Z
    //   248: pop
    //   249: iconst_2
    //   250: if_icmpne -> 264
    //   253: iload_2
    //   254: iload #6
    //   256: iadd
    //   257: istore_2
    //   258: iload_1
    //   259: istore #4
    //   261: goto -> 278
    //   264: iload #4
    //   266: aload_0
    //   267: getfield oV : [Lf/j90;
    //   270: iload_3
    //   271: aaload
    //   272: getfield xY : I
    //   275: iadd
    //   276: istore #4
    //   278: iinc #3, 1
    //   281: goto -> 225
    //   284: aload_0
    //   285: iload_3
    //   286: iload_1
    //   287: iload #5
    //   289: iconst_2
    //   290: iload_2
    //   291: invokestatic Se0 : (IIII)I
    //   294: istore_0
    //   295: iload #6
    //   297: iconst_2
    //   298: iload #4
    //   300: invokestatic Se0 : (IIII)I
    //   303: istore_1
    //   304: getfield oV : [Lf/j90;
    //   307: dup
    //   308: astore_2
    //   309: arraylength
    //   310: istore_3
    //   311: iconst_0
    //   312: istore #4
    //   314: iload #4
    //   316: iload_3
    //   317: if_icmpge -> 343
    //   320: iload_0
    //   321: aload_2
    //   322: iload #4
    //   324: aaload
    //   325: dup
    //   326: iload_0
    //   327: iload_1
    //   328: invokevirtual ME : (II)Z
    //   331: pop
    //   332: getfield xY : I
    //   335: iadd
    //   336: istore_0
    //   337: iinc #4, 1
    //   340: goto -> 314
    //   343: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 26
    //   #2	-> 34
    //   #3	-> 49
    //   #4	-> 59
    //   #5	-> 62
    //   #6	-> 147
    //   #7	-> 159
    //   #8	-> 184
    //   #9	-> 207
    //   #10	-> 215
    //   #11	-> 245
    //   #12	-> 267
    //   #13	-> 272
    //   #14	-> 291
    //   #15	-> 300
    //   #16	-> 304
    //   #17	-> 328
    //   #18	-> 332
  }
  
  public final void dispose() {
    j90[] arrayOfJ90;
    int i = (arrayOfJ90 = this.oV).length;
    for (byte b = 0; b < i; b++)
      this[b].dispose(); 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/c90.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */