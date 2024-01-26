package f;

public final class oh0 implements hk0 {
  public oh0(wb paramwb, int paramInt) {}
  
  public final void Do(int paramInt, sh paramsh) {
    // Byte code:
    //   0: aload_0
    //   1: getfield LPT5 : Lf/wb;
    //   4: getfield pb : Lf/vH;
    //   7: dup
    //   8: dup
    //   9: astore_1
    //   10: aload_0
    //   11: getfield iw0 : I
    //   14: istore_0
    //   15: getfield Kt : Lf/NC0;
    //   18: dup
    //   19: fconst_0
    //   20: putfield x : F
    //   23: fconst_0
    //   24: putfield y : F
    //   27: getfield qc : Lcom/badlogic/gdx/graphics/Texture;
    //   30: dup
    //   31: astore_2
    //   32: ifnull -> 39
    //   35: aload_2
    //   36: invokevirtual dispose : ()V
    //   39: aload_1
    //   40: getfield We : Lf/yI;
    //   43: astore_2
    //   44: new f/vJ
    //   47: dup
    //   48: astore_3
    //   49: aload_2
    //   50: getfield t70 : Lf/S;
    //   53: iload_0
    //   54: iconst_3
    //   55: imul
    //   56: dup
    //   57: istore #4
    //   59: iconst_2
    //   60: iadd
    //   61: invokevirtual Em0 : (I)Lf/T7;
    //   64: invokespecial <init> : (Lf/T7;)V
    //   67: new f/ek0
    //   70: dup
    //   71: astore #5
    //   73: aload_2
    //   74: getfield t70 : Lf/S;
    //   77: iload #4
    //   79: iconst_1
    //   80: iadd
    //   81: invokevirtual Em0 : (I)Lf/T7;
    //   84: iconst_0
    //   85: invokespecial <init> : (Lf/T7;Z)V
    //   88: new f/FM
    //   91: dup
    //   92: dup2
    //   93: astore #6
    //   95: aload_2
    //   96: getfield t70 : Lf/S;
    //   99: iload #4
    //   101: invokevirtual Em0 : (I)Lf/T7;
    //   104: iconst_0
    //   105: invokespecial <init> : (Lf/T7;Z)V
    //   108: sipush #256
    //   111: dup
    //   112: istore_2
    //   113: putfield Sw0 : I
    //   116: getfield jA : I
    //   119: dup
    //   120: istore #4
    //   122: iconst_2
    //   123: if_icmpeq -> 132
    //   126: iload #4
    //   128: iconst_3
    //   129: if_icmpne -> 149
    //   132: iload_2
    //   133: aload #6
    //   135: getfield Gw : I
    //   138: dup
    //   139: istore_2
    //   140: if_icmpge -> 149
    //   143: aload #6
    //   145: iload_2
    //   146: putfield Sw0 : I
    //   149: iload_0
    //   150: bipush #8
    //   152: if_icmpeq -> 294
    //   155: iload_0
    //   156: bipush #9
    //   158: if_icmpeq -> 294
    //   161: iload_0
    //   162: bipush #11
    //   164: if_icmpeq -> 294
    //   167: iload_0
    //   168: bipush #23
    //   170: if_icmpeq -> 258
    //   173: iload_0
    //   174: bipush #25
    //   176: if_icmpeq -> 258
    //   179: iload_0
    //   180: bipush #34
    //   182: if_icmpeq -> 294
    //   185: iload_0
    //   186: tableswitch default -> 216, 29 -> 294, 30 -> 294, 31 -> 294, 32 -> 294
    //   216: iload #4
    //   218: aload #6
    //   220: sipush #200
    //   223: dup
    //   224: istore_0
    //   225: putfield ve0 : I
    //   228: iconst_2
    //   229: if_icmpeq -> 238
    //   232: iload #4
    //   234: iconst_3
    //   235: if_icmpne -> 330
    //   238: iload_0
    //   239: aload #6
    //   241: getfield Gw : I
    //   244: dup
    //   245: istore_0
    //   246: if_icmpge -> 330
    //   249: aload #6
    //   251: iload_0
    //   252: putfield ve0 : I
    //   255: goto -> 330
    //   258: iload #4
    //   260: aload #6
    //   262: sipush #256
    //   265: dup
    //   266: istore_0
    //   267: putfield ve0 : I
    //   270: iconst_2
    //   271: if_icmpeq -> 280
    //   274: iload #4
    //   276: iconst_3
    //   277: if_icmpne -> 330
    //   280: iload_0
    //   281: aload #6
    //   283: getfield Gw : I
    //   286: dup
    //   287: istore_0
    //   288: if_icmpge -> 330
    //   291: goto -> 249
    //   294: iload #4
    //   296: aload #6
    //   298: sipush #192
    //   301: dup
    //   302: istore_0
    //   303: putfield ve0 : I
    //   306: iconst_2
    //   307: if_icmpeq -> 316
    //   310: iload #4
    //   312: iconst_3
    //   313: if_icmpne -> 330
    //   316: iload_0
    //   317: aload #6
    //   319: getfield Gw : I
    //   322: dup
    //   323: istore_0
    //   324: if_icmpge -> 330
    //   327: goto -> 249
    //   330: aload_1
    //   331: dup
    //   332: dup
    //   333: aload #6
    //   335: aload_3
    //   336: aload #5
    //   338: invokevirtual VC0 : (Lf/vJ;Lf/ek0;)Lf/ZH;
    //   341: astore_0
    //   342: new com/badlogic/gdx/graphics/Texture
    //   345: dup
    //   346: dup
    //   347: aload_0
    //   348: swap
    //   349: aload_0
    //   350: invokespecial <init> : (Lf/ZH;)V
    //   353: invokevirtual dispose : ()V
    //   356: getstatic f/A00.OW : Lf/A00;
    //   359: dup
    //   360: invokevirtual setWrap : (Lf/A00;Lf/A00;)V
    //   363: putfield qc : Lcom/badlogic/gdx/graphics/Texture;
    //   366: getfield FH0 : Lf/NC0;
    //   369: dup
    //   370: fconst_0
    //   371: putfield x : F
    //   374: fconst_0
    //   375: putfield y : F
    //   378: getfield cH0 : Lcom/badlogic/gdx/graphics/Color;
    //   381: fconst_1
    //   382: putfield a : F
    //   385: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 15
    //   #2	-> 20
    //   #3	-> 24
    //   #4	-> 27
    //   #5	-> 44
    //   #6	-> 50
    //   #7	-> 61
    //   #8	-> 85
    //   #9	-> 88
    //   #10	-> 105
    //   #11	-> 113
    //   #12	-> 225
    //   #13	-> 267
    //   #14	-> 303
    //   #15	-> 338
    //   #16	-> 363
    //   #17	-> 371
    //   #18	-> 375
    //   #19	-> 378
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/oh0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */