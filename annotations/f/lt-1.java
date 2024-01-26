package f;

import java.util.Comparator;

public final class lt implements KG, Comparator {
  public ny fH0;
  
  public final eo iy0;
  
  public final eo uv0;
  
  public lt() {
    eo eo1;
    this();
    this.iy0 = this;
    this();
    this.uv0 = this;
  }
  
  public final void nN(ny paramny, fQ paramfQ) {
    this.fH0 = paramny;
    paramfQ.sort(this);
  }
  
  public final int compare(Object paramObject1, Object paramObject2) {
    // Byte code:
    //   0: aload_2
    //   1: aload_1
    //   2: checkcast f/Xw0
    //   5: astore_1
    //   6: checkcast f/Xw0
    //   9: astore_2
    //   10: aload_1
    //   11: getfield bL : Lf/T0;
    //   14: getstatic f/zc.U7 : J
    //   17: dup2
    //   18: lstore_3
    //   19: invokevirtual gV : (J)Z
    //   22: ifeq -> 48
    //   25: aload_1
    //   26: getfield bL : Lf/T0;
    //   29: lload_3
    //   30: invokevirtual cOM1 : (J)Lf/dj;
    //   33: checkcast f/zc
    //   36: getfield lv0 : Z
    //   39: ifeq -> 48
    //   42: iconst_1
    //   43: istore #5
    //   45: goto -> 51
    //   48: iconst_0
    //   49: istore #5
    //   51: aload_2
    //   52: getfield bL : Lf/T0;
    //   55: lload_3
    //   56: invokevirtual gV : (J)Z
    //   59: ifeq -> 85
    //   62: aload_2
    //   63: getfield bL : Lf/T0;
    //   66: lload_3
    //   67: invokevirtual cOM1 : (J)Lf/dj;
    //   70: checkcast f/zc
    //   73: getfield lv0 : Z
    //   76: ifeq -> 85
    //   79: iconst_1
    //   80: istore #6
    //   82: goto -> 88
    //   85: iconst_0
    //   86: istore #6
    //   88: iload #5
    //   90: iload #6
    //   92: if_icmpeq -> 103
    //   95: iload #5
    //   97: ifeq -> 211
    //   100: goto -> 206
    //   103: iload #5
    //   105: ifeq -> 175
    //   108: iload #6
    //   110: ifeq -> 175
    //   113: aload_1
    //   114: getfield bL : Lf/T0;
    //   117: lload_3
    //   118: invokevirtual cOM1 : (J)Lf/dj;
    //   121: checkcast f/zc
    //   124: getfield yg0 : F
    //   127: dup
    //   128: fstore #6
    //   130: aload_2
    //   131: getfield bL : Lf/T0;
    //   134: lload_3
    //   135: invokevirtual cOM1 : (J)Lf/dj;
    //   138: checkcast f/zc
    //   141: getfield yg0 : F
    //   144: fstore_3
    //   145: fconst_1
    //   146: fcmpl
    //   147: ifne -> 159
    //   150: fload_3
    //   151: fconst_1
    //   152: fcmpg
    //   153: ifge -> 159
    //   156: goto -> 211
    //   159: fload_3
    //   160: fconst_1
    //   161: fcmpl
    //   162: ifne -> 175
    //   165: fload #6
    //   167: fconst_1
    //   168: fcmpg
    //   169: ifge -> 175
    //   172: goto -> 206
    //   175: aload_1
    //   176: getfield bL : Lf/T0;
    //   179: getstatic f/Ra.SG0 : J
    //   182: dup2
    //   183: lstore_3
    //   184: invokevirtual gV : (J)Z
    //   187: dup
    //   188: istore #6
    //   190: aload_2
    //   191: getfield bL : Lf/T0;
    //   194: lload_3
    //   195: invokevirtual gV : (J)Z
    //   198: if_icmpeq -> 216
    //   201: iload #6
    //   203: ifeq -> 211
    //   206: iconst_1
    //   207: istore_0
    //   208: goto -> 506
    //   211: iconst_m1
    //   212: istore_0
    //   213: goto -> 506
    //   216: aload_0
    //   217: aload_1
    //   218: dup
    //   219: getfield kD0 : Lcom/badlogic/gdx/math/Matrix4;
    //   222: astore_1
    //   223: getfield L90 : Lf/COM6;
    //   226: getfield dK : Lf/eo;
    //   229: astore_3
    //   230: getfield iy0 : Lf/eo;
    //   233: astore #4
    //   235: aload_3
    //   236: invokevirtual Kw0 : ()Z
    //   239: ifeq -> 252
    //   242: aload_1
    //   243: aload #4
    //   245: invokevirtual on0 : (Lf/eo;)Lf/eo;
    //   248: pop
    //   249: goto -> 330
    //   252: aload_1
    //   253: invokevirtual Hn : ()Z
    //   256: ifne -> 292
    //   259: aload_1
    //   260: aload #4
    //   262: invokevirtual on0 : (Lf/eo;)Lf/eo;
    //   265: aload_3
    //   266: dup
    //   267: dup
    //   268: getfield x : F
    //   271: fstore_1
    //   272: getfield y : F
    //   275: fstore_3
    //   276: getfield z : F
    //   279: fstore #4
    //   281: fload_1
    //   282: fload_3
    //   283: fload #4
    //   285: invokevirtual Tz : (FFF)Lf/eo;
    //   288: pop
    //   289: goto -> 330
    //   292: aload #4
    //   294: aload_3
    //   295: dup
    //   296: dup
    //   297: aload #4
    //   299: invokevirtual getClass : ()Ljava/lang/Class;
    //   302: pop
    //   303: getfield x : F
    //   306: fstore_3
    //   307: getfield y : F
    //   310: fstore #4
    //   312: getfield z : F
    //   315: fstore #6
    //   317: fload_3
    //   318: fload #4
    //   320: fload #6
    //   322: invokevirtual TG0 : (FFF)Lf/eo;
    //   325: aload_1
    //   326: invokevirtual eM : (Lcom/badlogic/gdx/math/Matrix4;)Lf/eo;
    //   329: pop
    //   330: aload_0
    //   331: aload_2
    //   332: dup
    //   333: getfield kD0 : Lcom/badlogic/gdx/math/Matrix4;
    //   336: astore_1
    //   337: getfield L90 : Lf/COM6;
    //   340: getfield dK : Lf/eo;
    //   343: astore_2
    //   344: getfield uv0 : Lf/eo;
    //   347: astore_3
    //   348: aload_2
    //   349: invokevirtual Kw0 : ()Z
    //   352: ifeq -> 364
    //   355: aload_1
    //   356: aload_3
    //   357: invokevirtual on0 : (Lf/eo;)Lf/eo;
    //   360: pop
    //   361: goto -> 435
    //   364: aload_1
    //   365: invokevirtual Hn : ()Z
    //   368: ifne -> 401
    //   371: aload_1
    //   372: aload_3
    //   373: invokevirtual on0 : (Lf/eo;)Lf/eo;
    //   376: aload_2
    //   377: dup
    //   378: dup
    //   379: getfield x : F
    //   382: fstore_1
    //   383: getfield y : F
    //   386: fstore_2
    //   387: getfield z : F
    //   390: fstore_3
    //   391: fload_1
    //   392: fload_2
    //   393: fload_3
    //   394: invokevirtual Tz : (FFF)Lf/eo;
    //   397: pop
    //   398: goto -> 435
    //   401: aload_3
    //   402: aload_2
    //   403: dup
    //   404: dup
    //   405: aload_3
    //   406: invokevirtual getClass : ()Ljava/lang/Class;
    //   409: pop
    //   410: getfield x : F
    //   413: fstore_2
    //   414: getfield y : F
    //   417: fstore_3
    //   418: getfield z : F
    //   421: fstore #4
    //   423: fload_2
    //   424: fload_3
    //   425: fload #4
    //   427: invokevirtual TG0 : (FFF)Lf/eo;
    //   430: aload_1
    //   431: invokevirtual eM : (Lcom/badlogic/gdx/math/Matrix4;)Lf/eo;
    //   434: pop
    //   435: aload_0
    //   436: getfield fH0 : Lf/ny;
    //   439: getfield H : Lf/eo;
    //   442: aload_0
    //   443: getfield iy0 : Lf/eo;
    //   446: invokevirtual ku : (Lf/eo;)F
    //   449: ldc 1000.0
    //   451: fmul
    //   452: f2i
    //   453: aload_0
    //   454: getfield fH0 : Lf/ny;
    //   457: getfield H : Lf/eo;
    //   460: aload_0
    //   461: getfield uv0 : Lf/eo;
    //   464: invokevirtual ku : (Lf/eo;)F
    //   467: ldc 1000.0
    //   469: fmul
    //   470: f2i
    //   471: isub
    //   472: i2f
    //   473: dup
    //   474: fstore_0
    //   475: fconst_0
    //   476: fcmpg
    //   477: ifge -> 485
    //   480: iconst_m1
    //   481: istore_0
    //   482: goto -> 498
    //   485: fload_0
    //   486: fconst_0
    //   487: fcmpl
    //   488: ifle -> 496
    //   491: iconst_1
    //   492: istore_0
    //   493: goto -> 498
    //   496: iconst_0
    //   497: istore_0
    //   498: iload #5
    //   500: ifeq -> 506
    //   503: iload_0
    //   504: ineg
    //   505: istore_0
    //   506: iload_0
    //   507: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 11
    //   #2	-> 236
    //   #3	-> 268
    //   #4	-> 299
    //   #5	-> 303
    //   #6	-> 326
    //   #7	-> 333
    //   #8	-> 349
    //   #9	-> 379
    //   #10	-> 406
    //   #11	-> 410
    //   #12	-> 431
    //   #13	-> 436
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/lt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */