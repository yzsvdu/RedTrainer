package f;

import java.util.Comparator;

public class fm implements KG, Comparator {
  public ny pE;
  
  public final eo Bt;
  
  public final eo Oy;
  
  public fm() {
    eo eo1;
    this();
    this.Bt = this;
    this();
    this.Oy = this;
  }
  
  public void nN(ny paramny, fQ paramfQ) {
    this.pE = paramny;
    paramfQ.sort(this);
  }
  
  public int LPT5(Xw0 paramXw01, Xw0 paramXw02) {
    // Byte code:
    //   0: aload_1
    //   1: getfield bL : Lf/T0;
    //   4: getstatic f/zc.U7 : J
    //   7: dup2
    //   8: lstore_3
    //   9: invokevirtual gV : (J)Z
    //   12: ifeq -> 38
    //   15: aload_1
    //   16: getfield bL : Lf/T0;
    //   19: lload_3
    //   20: invokevirtual cOM1 : (J)Lf/dj;
    //   23: checkcast f/zc
    //   26: getfield lv0 : Z
    //   29: ifeq -> 38
    //   32: iconst_1
    //   33: istore #5
    //   35: goto -> 41
    //   38: iconst_0
    //   39: istore #5
    //   41: aload_2
    //   42: getfield bL : Lf/T0;
    //   45: lload_3
    //   46: invokevirtual gV : (J)Z
    //   49: ifeq -> 74
    //   52: aload_2
    //   53: getfield bL : Lf/T0;
    //   56: lload_3
    //   57: invokevirtual cOM1 : (J)Lf/dj;
    //   60: checkcast f/zc
    //   63: getfield lv0 : Z
    //   66: ifeq -> 74
    //   69: iconst_1
    //   70: istore_3
    //   71: goto -> 76
    //   74: iconst_0
    //   75: istore_3
    //   76: iload #5
    //   78: iload_3
    //   79: if_icmpeq -> 93
    //   82: iload #5
    //   84: ifeq -> 91
    //   87: iconst_1
    //   88: goto -> 92
    //   91: iconst_m1
    //   92: ireturn
    //   93: aload_0
    //   94: aload_1
    //   95: dup
    //   96: getfield kD0 : Lcom/badlogic/gdx/math/Matrix4;
    //   99: astore_1
    //   100: getfield L90 : Lf/COM6;
    //   103: getfield dK : Lf/eo;
    //   106: astore_3
    //   107: getfield Bt : Lf/eo;
    //   110: astore #4
    //   112: aload_3
    //   113: invokevirtual Kw0 : ()Z
    //   116: ifeq -> 129
    //   119: aload_1
    //   120: aload #4
    //   122: invokevirtual on0 : (Lf/eo;)Lf/eo;
    //   125: pop
    //   126: goto -> 207
    //   129: aload_1
    //   130: invokevirtual Hn : ()Z
    //   133: ifne -> 169
    //   136: aload_1
    //   137: aload #4
    //   139: invokevirtual on0 : (Lf/eo;)Lf/eo;
    //   142: aload_3
    //   143: dup
    //   144: dup
    //   145: getfield x : F
    //   148: fstore_1
    //   149: getfield y : F
    //   152: fstore_3
    //   153: getfield z : F
    //   156: fstore #4
    //   158: fload_1
    //   159: fload_3
    //   160: fload #4
    //   162: invokevirtual Tz : (FFF)Lf/eo;
    //   165: pop
    //   166: goto -> 207
    //   169: aload #4
    //   171: aload_3
    //   172: dup
    //   173: dup
    //   174: aload #4
    //   176: invokevirtual getClass : ()Ljava/lang/Class;
    //   179: pop
    //   180: getfield x : F
    //   183: fstore_3
    //   184: getfield y : F
    //   187: fstore #4
    //   189: getfield z : F
    //   192: fstore #6
    //   194: fload_3
    //   195: fload #4
    //   197: fload #6
    //   199: invokevirtual TG0 : (FFF)Lf/eo;
    //   202: aload_1
    //   203: invokevirtual eM : (Lcom/badlogic/gdx/math/Matrix4;)Lf/eo;
    //   206: pop
    //   207: aload_0
    //   208: aload_2
    //   209: dup
    //   210: getfield kD0 : Lcom/badlogic/gdx/math/Matrix4;
    //   213: astore_1
    //   214: getfield L90 : Lf/COM6;
    //   217: getfield dK : Lf/eo;
    //   220: astore_2
    //   221: getfield Oy : Lf/eo;
    //   224: astore_3
    //   225: aload_2
    //   226: invokevirtual Kw0 : ()Z
    //   229: ifeq -> 241
    //   232: aload_1
    //   233: aload_3
    //   234: invokevirtual on0 : (Lf/eo;)Lf/eo;
    //   237: pop
    //   238: goto -> 312
    //   241: aload_1
    //   242: invokevirtual Hn : ()Z
    //   245: ifne -> 278
    //   248: aload_1
    //   249: aload_3
    //   250: invokevirtual on0 : (Lf/eo;)Lf/eo;
    //   253: aload_2
    //   254: dup
    //   255: dup
    //   256: getfield x : F
    //   259: fstore_1
    //   260: getfield y : F
    //   263: fstore_2
    //   264: getfield z : F
    //   267: fstore_3
    //   268: fload_1
    //   269: fload_2
    //   270: fload_3
    //   271: invokevirtual Tz : (FFF)Lf/eo;
    //   274: pop
    //   275: goto -> 312
    //   278: aload_3
    //   279: aload_2
    //   280: dup
    //   281: dup
    //   282: aload_3
    //   283: invokevirtual getClass : ()Ljava/lang/Class;
    //   286: pop
    //   287: getfield x : F
    //   290: fstore_2
    //   291: getfield y : F
    //   294: fstore_3
    //   295: getfield z : F
    //   298: fstore #4
    //   300: fload_2
    //   301: fload_3
    //   302: fload #4
    //   304: invokevirtual TG0 : (FFF)Lf/eo;
    //   307: aload_1
    //   308: invokevirtual eM : (Lcom/badlogic/gdx/math/Matrix4;)Lf/eo;
    //   311: pop
    //   312: aload_0
    //   313: getfield pE : Lf/ny;
    //   316: getfield H : Lf/eo;
    //   319: aload_0
    //   320: getfield Bt : Lf/eo;
    //   323: invokevirtual ku : (Lf/eo;)F
    //   326: ldc 1000.0
    //   328: fmul
    //   329: f2i
    //   330: aload_0
    //   331: getfield pE : Lf/ny;
    //   334: getfield H : Lf/eo;
    //   337: aload_0
    //   338: getfield Oy : Lf/eo;
    //   341: invokevirtual ku : (Lf/eo;)F
    //   344: ldc 1000.0
    //   346: fmul
    //   347: f2i
    //   348: isub
    //   349: i2f
    //   350: dup
    //   351: fstore_0
    //   352: fconst_0
    //   353: fcmpg
    //   354: ifge -> 362
    //   357: iconst_m1
    //   358: istore_0
    //   359: goto -> 375
    //   362: fload_0
    //   363: fconst_0
    //   364: fcmpl
    //   365: ifle -> 373
    //   368: iconst_1
    //   369: istore_0
    //   370: goto -> 375
    //   373: iconst_0
    //   374: istore_0
    //   375: iload #5
    //   377: ifeq -> 383
    //   380: iload_0
    //   381: ineg
    //   382: istore_0
    //   383: iload_0
    //   384: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 113
    //   #2	-> 145
    //   #3	-> 176
    //   #4	-> 180
    //   #5	-> 203
    //   #6	-> 210
    //   #7	-> 226
    //   #8	-> 256
    //   #9	-> 283
    //   #10	-> 287
    //   #11	-> 308
    //   #12	-> 313
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/fm.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */