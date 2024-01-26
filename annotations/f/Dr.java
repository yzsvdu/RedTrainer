package f;

public final class Dr {
  public static void Rn0(int paramInt1, ZH paramZH, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: getstatic f/UB0.Kg0 : Lf/Q50;
    //   3: invokevirtual getClass : ()Ljava/lang/Class;
    //   6: pop
    //   7: getstatic f/Dp0.Ro0 : Lf/Dp0;
    //   10: dup
    //   11: astore #4
    //   13: getstatic f/Dp0.uM : Lf/Dp0;
    //   16: if_acmpeq -> 444
    //   19: aload #4
    //   21: getstatic f/UB0.Kg0 : Lf/Q50;
    //   24: invokevirtual getClass : ()Ljava/lang/Class;
    //   27: pop
    //   28: getstatic f/Dp0.Qn : Lf/Dp0;
    //   31: if_acmpeq -> 444
    //   34: aload #4
    //   36: getstatic f/UB0.Kg0 : Lf/Q50;
    //   39: invokevirtual getClass : ()Ljava/lang/Class;
    //   42: pop
    //   43: getstatic f/Dp0.QG : Lf/Dp0;
    //   46: if_acmpne -> 52
    //   49: goto -> 444
    //   52: getstatic f/UB0.M60 : Lf/w70;
    //   55: invokevirtual getClass : ()Ljava/lang/Class;
    //   58: pop
    //   59: ldc 'GL_ARB_framebuffer_object'
    //   61: invokestatic glfwExtensionSupported : (Ljava/lang/CharSequence;)Z
    //   64: ifne -> 377
    //   67: getstatic f/UB0.M60 : Lf/w70;
    //   70: invokevirtual getClass : ()Ljava/lang/Class;
    //   73: pop
    //   74: ldc 'GL_EXT_framebuffer_object'
    //   76: invokestatic glfwExtensionSupported : (Ljava/lang/CharSequence;)Z
    //   79: ifne -> 377
    //   82: getstatic f/UB0.re0 : Lf/hj0;
    //   85: invokevirtual getClass : ()Ljava/lang/Class;
    //   88: invokevirtual getName : ()Ljava/lang/String;
    //   91: ldc 'com.badlogic.gdx.backends.lwjgl3.Lwjgl3GLES20'
    //   93: invokevirtual equals : (Ljava/lang/Object;)Z
    //   96: ifne -> 377
    //   99: getstatic f/UB0.Je : Lf/ib;
    //   102: ifnull -> 108
    //   105: goto -> 377
    //   108: getstatic f/UB0.go : Lf/hj0;
    //   111: iload_0
    //   112: aload_1
    //   113: dup
    //   114: dup
    //   115: dup2
    //   116: invokevirtual PB : ()I
    //   119: istore #4
    //   121: getfield Con : Lcom/badlogic/gdx/graphics/g2d/Gdx2DPixmap;
    //   124: dup
    //   125: getfield ju : I
    //   128: istore #5
    //   130: getfield Og0 : I
    //   133: istore #6
    //   135: invokevirtual qf : ()I
    //   138: istore #7
    //   140: invokevirtual i5 : ()I
    //   143: istore #8
    //   145: invokevirtual tp0 : ()Ljava/nio/ByteBuffer;
    //   148: astore #9
    //   150: iconst_0
    //   151: iload #4
    //   153: iload #5
    //   155: iload #6
    //   157: iconst_0
    //   158: iload #7
    //   160: iload #8
    //   162: aload #9
    //   164: invokeinterface glTexImage2D : (IIIIIIIILjava/nio/Buffer;)V
    //   169: getstatic f/UB0.re0 : Lf/hj0;
    //   172: ifnonnull -> 193
    //   175: iload_2
    //   176: iload_3
    //   177: if_icmpne -> 183
    //   180: goto -> 193
    //   183: new f/JU
    //   186: dup
    //   187: ldc 'texture width and height must be square when using mipmapping.'
    //   189: invokespecial <init> : (Ljava/lang/String;)V
    //   192: athrow
    //   193: aload_1
    //   194: getfield Con : Lcom/badlogic/gdx/graphics/g2d/Gdx2DPixmap;
    //   197: dup
    //   198: getfield ju : I
    //   201: iconst_2
    //   202: idiv
    //   203: istore_2
    //   204: getfield Og0 : I
    //   207: iconst_2
    //   208: idiv
    //   209: istore_3
    //   210: iconst_1
    //   211: istore #4
    //   213: iload_2
    //   214: ifle -> 508
    //   217: iload_3
    //   218: ifle -> 508
    //   221: iload #4
    //   223: aload_1
    //   224: new f/ZH
    //   227: dup
    //   228: dup
    //   229: astore #5
    //   231: iload_2
    //   232: aload_1
    //   233: invokevirtual TU : ()Lf/Uc;
    //   236: iload_3
    //   237: swap
    //   238: invokespecial <init> : (IILf/Uc;)V
    //   241: getstatic f/y1.Zj : Lf/y1;
    //   244: invokevirtual r1 : (Lf/y1;)V
    //   247: getfield Con : Lcom/badlogic/gdx/graphics/g2d/Gdx2DPixmap;
    //   250: astore #6
    //   252: aload #5
    //   254: aload #6
    //   256: dup
    //   257: getfield ju : I
    //   260: istore #7
    //   262: getfield Og0 : I
    //   265: istore #8
    //   267: getfield Con : Lcom/badlogic/gdx/graphics/g2d/Gdx2DPixmap;
    //   270: aload #6
    //   272: iconst_0
    //   273: iconst_0
    //   274: iload #7
    //   276: iload #8
    //   278: iconst_0
    //   279: iconst_0
    //   280: iload_2
    //   281: iload_3
    //   282: invokevirtual fj : (Lcom/badlogic/gdx/graphics/g2d/Gdx2DPixmap;IIIIIIII)V
    //   285: iconst_1
    //   286: if_icmple -> 293
    //   289: aload_1
    //   290: invokevirtual dispose : ()V
    //   293: aload #5
    //   295: getstatic f/UB0.go : Lf/hj0;
    //   298: iload_0
    //   299: aload #5
    //   301: dup
    //   302: dup
    //   303: dup2
    //   304: invokevirtual PB : ()I
    //   307: istore_1
    //   308: getfield Con : Lcom/badlogic/gdx/graphics/g2d/Gdx2DPixmap;
    //   311: dup
    //   312: getfield ju : I
    //   315: istore_2
    //   316: getfield Og0 : I
    //   319: istore_3
    //   320: invokevirtual qf : ()I
    //   323: istore #6
    //   325: invokevirtual i5 : ()I
    //   328: istore #7
    //   330: invokevirtual tp0 : ()Ljava/nio/ByteBuffer;
    //   333: astore #8
    //   335: iload #4
    //   337: iload_1
    //   338: iload_2
    //   339: iload_3
    //   340: iconst_0
    //   341: iload #6
    //   343: iload #7
    //   345: aload #8
    //   347: invokeinterface glTexImage2D : (IIIIIIIILjava/nio/Buffer;)V
    //   352: getfield Con : Lcom/badlogic/gdx/graphics/g2d/Gdx2DPixmap;
    //   355: dup
    //   356: getfield ju : I
    //   359: iconst_2
    //   360: idiv
    //   361: istore_2
    //   362: getfield Og0 : I
    //   365: iconst_2
    //   366: idiv
    //   367: istore_3
    //   368: iinc #4, 1
    //   371: aload #5
    //   373: astore_1
    //   374: goto -> 213
    //   377: getstatic f/UB0.go : Lf/hj0;
    //   380: iload_0
    //   381: aload_1
    //   382: dup
    //   383: dup
    //   384: dup2
    //   385: invokevirtual PB : ()I
    //   388: istore_1
    //   389: getfield Con : Lcom/badlogic/gdx/graphics/g2d/Gdx2DPixmap;
    //   392: dup
    //   393: getfield ju : I
    //   396: istore_2
    //   397: getfield Og0 : I
    //   400: istore_3
    //   401: invokevirtual qf : ()I
    //   404: istore #4
    //   406: invokevirtual i5 : ()I
    //   409: istore #5
    //   411: invokevirtual tp0 : ()Ljava/nio/ByteBuffer;
    //   414: astore #6
    //   416: iconst_0
    //   417: iload_1
    //   418: iload_2
    //   419: iload_3
    //   420: iconst_0
    //   421: iload #4
    //   423: iload #5
    //   425: aload #6
    //   427: invokeinterface glTexImage2D : (IIIIIIIILjava/nio/Buffer;)V
    //   432: getstatic f/UB0.re0 : Lf/hj0;
    //   435: iload_0
    //   436: invokeinterface glGenerateMipmap : (I)V
    //   441: goto -> 508
    //   444: getstatic f/UB0.go : Lf/hj0;
    //   447: iload_0
    //   448: aload_1
    //   449: dup
    //   450: dup
    //   451: dup2
    //   452: invokevirtual PB : ()I
    //   455: istore_1
    //   456: getfield Con : Lcom/badlogic/gdx/graphics/g2d/Gdx2DPixmap;
    //   459: dup
    //   460: getfield ju : I
    //   463: istore_2
    //   464: getfield Og0 : I
    //   467: istore_3
    //   468: invokevirtual qf : ()I
    //   471: istore #4
    //   473: invokevirtual i5 : ()I
    //   476: istore #5
    //   478: invokevirtual tp0 : ()Ljava/nio/ByteBuffer;
    //   481: astore #6
    //   483: iconst_0
    //   484: iload_1
    //   485: iload_2
    //   486: iload_3
    //   487: iconst_0
    //   488: iload #4
    //   490: iload #5
    //   492: aload #6
    //   494: invokeinterface glTexImage2D : (IIIIIIIILjava/nio/Buffer;)V
    //   499: getstatic f/UB0.re0 : Lf/hj0;
    //   502: iload_0
    //   503: invokeinterface glGenerateMipmap : (I)V
    //   508: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 7
    //   #2	-> 13
    //   #3	-> 52
    //   #4	-> 59
    //   #5	-> 67
    //   #6	-> 74
    //   #7	-> 82
    //   #8	-> 108
    //   #9	-> 121
    //   #10	-> 125
    //   #11	-> 130
    //   #12	-> 135
    //   #13	-> 194
    //   #14	-> 198
    //   #15	-> 202
    //   #16	-> 204
    //   #17	-> 208
    //   #18	-> 247
    //   #19	-> 257
    //   #20	-> 262
    //   #21	-> 267
    //   #22	-> 290
    //   #23	-> 308
    //   #24	-> 312
    //   #25	-> 316
    //   #26	-> 320
    //   #27	-> 352
    //   #28	-> 356
    //   #29	-> 360
    //   #30	-> 362
    //   #31	-> 366
    //   #32	-> 377
    //   #33	-> 389
    //   #34	-> 393
    //   #35	-> 397
    //   #36	-> 401
    //   #37	-> 444
    //   #38	-> 456
    //   #39	-> 460
    //   #40	-> 464
    //   #41	-> 468
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Dr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */