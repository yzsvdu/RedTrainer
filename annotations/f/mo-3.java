/* 1 */ package f;public abstract class mo implements iq0 { public final void end() { int i = UB0.M60.sL;
/*   */     
/* 3 */     int j = UB0.M60.kL;
/* 4 */     UB0.re0.glBindFramebuffer(36160, XI0);
/* 5 */     UB0.re0.glViewport(0, 0, i, j); }
/*   */ 
/*   */   
/*   */   public static final HashMap fD0 = new HashMap<>();
/*   */   public static int XI0;
/*   */   public static boolean xQ = false;
/*   */   public fQ x6;
/*   */   public int EE0;
/*   */   public int ef;
/*   */   public int UA0;
/*   */   public int LJ;
/*   */   public boolean Vs0;
/*   */   public boolean V0;
/*   */   public wl0 E80;
/*   */   
/*   */   public mo() {
/*   */     fQ fQ1;
/*   */     this();
/*   */     this.x6 = this;
/*   */   }
/*   */   
/*   */   public mo(wl0 paramwl0) {
/*   */     fQ fQ1;
/*   */     this();
/*   */     this.x6 = this;
/*   */     this.E80 = paramwl0;
/*   */     NF();
/*   */   }
/*   */   
/*   */   public final zp P10() {
/*   */     return (zp)this.x6.first();
/*   */   }
/*   */   
/*   */   public abstract Texture a40(s9 params9);
/*   */   
/*   */   public abstract void bc(zp paramzp);
/*   */   
/*   */   public abstract void G60(zp paramzp);
/*   */   
/*   */   public final void NF() {
/*   */     // Byte code:
/*   */     //   0: getstatic f/UB0.re0 : Lf/hj0;
/*   */     //   3: astore_1
/*   */     //   4: getstatic f/UB0.M60 : Lf/w70;
/*   */     //   7: getfield j60 : Lf/ib;
/*   */     //   10: ifnull -> 17
/*   */     //   13: iconst_1
/*   */     //   14: goto -> 18
/*   */     //   17: iconst_0
/*   */     //   18: ifne -> 81
/*   */     //   21: aload_0
/*   */     //   22: dup
/*   */     //   23: getfield E80 : Lf/wl0;
/*   */     //   26: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   29: pop
/*   */     //   30: getfield E80 : Lf/wl0;
/*   */     //   33: getfield dK0 : Lf/fQ;
/*   */     //   36: dup
/*   */     //   37: astore_2
/*   */     //   38: getfield Z8 : I
/*   */     //   41: iconst_1
/*   */     //   42: if_icmpgt -> 71
/*   */     //   45: aload_2
/*   */     //   46: invokevirtual r30 : ()Lf/Hc0;
/*   */     //   49: astore_2
/*   */     //   50: aload_2
/*   */     //   51: invokevirtual hasNext : ()Z
/*   */     //   54: ifeq -> 81
/*   */     //   57: aload_2
/*   */     //   58: invokevirtual next : ()Ljava/lang/Object;
/*   */     //   61: checkcast f/s9
/*   */     //   64: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   67: pop
/*   */     //   68: goto -> 50
/*   */     //   71: new f/JU
/*   */     //   74: dup
/*   */     //   75: ldc 'Multiple render targets not available on GLES 2.0'
/*   */     //   77: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   80: athrow
/*   */     //   81: getstatic f/mo.xQ : Z
/*   */     //   84: ifne -> 146
/*   */     //   87: iconst_1
/*   */     //   88: putstatic f/mo.xQ : Z
/*   */     //   91: getstatic f/UB0.Kg0 : Lf/Q50;
/*   */     //   94: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   97: pop
/*   */     //   98: getstatic f/Dp0.Ro0 : Lf/Dp0;
/*   */     //   101: getstatic f/Dp0.QG : Lf/Dp0;
/*   */     //   104: if_acmpne -> 142
/*   */     //   107: bipush #64
/*   */     //   109: invokestatic allocateDirect : (I)Ljava/nio/ByteBuffer;
/*   */     //   112: invokestatic nativeOrder : ()Ljava/nio/ByteOrder;
/*   */     //   115: invokevirtual order : (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
/*   */     //   118: invokevirtual asIntBuffer : ()Ljava/nio/IntBuffer;
/*   */     //   121: dup
/*   */     //   122: astore_2
/*   */     //   123: aload_1
/*   */     //   124: ldc 36006
/*   */     //   126: aload_2
/*   */     //   127: invokeinterface glGetIntegerv : (ILjava/nio/IntBuffer;)V
/*   */     //   132: iconst_0
/*   */     //   133: invokevirtual get : (I)I
/*   */     //   136: putstatic f/mo.XI0 : I
/*   */     //   139: goto -> 146
/*   */     //   142: iconst_0
/*   */     //   143: putstatic f/mo.XI0 : I
/*   */     //   146: aload_0
/*   */     //   147: aload_1
/*   */     //   148: aload_0
/*   */     //   149: aload_1
/*   */     //   150: invokeinterface glGenFramebuffer : ()I
/*   */     //   155: dup
/*   */     //   156: istore_2
/*   */     //   157: putfield EE0 : I
/*   */     //   160: ldc 36160
/*   */     //   162: iload_2
/*   */     //   163: invokeinterface glBindFramebuffer : (II)V
/*   */     //   168: getfield E80 : Lf/wl0;
/*   */     //   171: dup
/*   */     //   172: dup
/*   */     //   173: getfield rS : I
/*   */     //   176: istore_2
/*   */     //   177: getfield Z : I
/*   */     //   180: istore_3
/*   */     //   181: getfield vV : Z
/*   */     //   184: ifeq -> 231
/*   */     //   187: aload_1
/*   */     //   188: aload_0
/*   */     //   189: aload_1
/*   */     //   190: aload_0
/*   */     //   191: aload_1
/*   */     //   192: invokeinterface glGenRenderbuffer : ()I
/*   */     //   197: dup
/*   */     //   198: istore #4
/*   */     //   200: putfield ef : I
/*   */     //   203: ldc 36161
/*   */     //   205: iload #4
/*   */     //   207: invokeinterface glBindRenderbuffer : (II)V
/*   */     //   212: getfield E80 : Lf/wl0;
/*   */     //   215: getfield DQ : Lf/Ak;
/*   */     //   218: getfield kR : I
/*   */     //   221: ldc 36161
/*   */     //   223: swap
/*   */     //   224: iload_2
/*   */     //   225: iload_3
/*   */     //   226: invokeinterface glRenderbufferStorage : (IIII)V
/*   */     //   231: aload_0
/*   */     //   232: getfield E80 : Lf/wl0;
/*   */     //   235: getfield aB0 : Z
/*   */     //   238: ifeq -> 285
/*   */     //   241: aload_1
/*   */     //   242: aload_0
/*   */     //   243: aload_1
/*   */     //   244: aload_0
/*   */     //   245: aload_1
/*   */     //   246: invokeinterface glGenRenderbuffer : ()I
/*   */     //   251: dup
/*   */     //   252: istore #4
/*   */     //   254: putfield UA0 : I
/*   */     //   257: ldc 36161
/*   */     //   259: iload #4
/*   */     //   261: invokeinterface glBindRenderbuffer : (II)V
/*   */     //   266: getfield E80 : Lf/wl0;
/*   */     //   269: getfield t10 : Lf/Ak;
/*   */     //   272: getfield kR : I
/*   */     //   275: ldc 36161
/*   */     //   277: swap
/*   */     //   278: iload_2
/*   */     //   279: iload_3
/*   */     //   280: invokeinterface glRenderbufferStorage : (IIII)V
/*   */     //   285: aload_0
/*   */     //   286: dup
/*   */     //   287: getfield E80 : Lf/wl0;
/*   */     //   290: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   293: pop
/*   */     //   294: getfield E80 : Lf/wl0;
/*   */     //   297: getfield dK0 : Lf/fQ;
/*   */     //   300: dup
/*   */     //   301: astore #4
/*   */     //   303: getfield Z8 : I
/*   */     //   306: iconst_1
/*   */     //   307: if_icmple -> 316
/*   */     //   310: iconst_1
/*   */     //   311: istore #5
/*   */     //   313: goto -> 319
/*   */     //   316: iconst_0
/*   */     //   317: istore #5
/*   */     //   319: iload #5
/*   */     //   321: aload_0
/*   */     //   322: iload #5
/*   */     //   324: putfield V0 : Z
/*   */     //   327: iconst_0
/*   */     //   328: istore #5
/*   */     //   330: ifeq -> 415
/*   */     //   333: aload #4
/*   */     //   335: invokevirtual r30 : ()Lf/Hc0;
/*   */     //   338: astore #4
/*   */     //   340: aload #4
/*   */     //   342: invokevirtual hasNext : ()Z
/*   */     //   345: ifeq -> 454
/*   */     //   348: aload_1
/*   */     //   349: aload_0
/*   */     //   350: aload #4
/*   */     //   352: invokevirtual next : ()Ljava/lang/Object;
/*   */     //   355: checkcast f/s9
/*   */     //   358: dup
/*   */     //   359: astore #6
/*   */     //   361: invokevirtual a40 : (Lf/s9;)Lcom/badlogic/gdx/graphics/Texture;
/*   */     //   364: dup
/*   */     //   365: astore #7
/*   */     //   367: iload #5
/*   */     //   369: aload #6
/*   */     //   371: aload_0
/*   */     //   372: getfield x6 : Lf/fQ;
/*   */     //   375: aload #7
/*   */     //   377: invokevirtual Com3 : (Ljava/lang/Object;)V
/*   */     //   380: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   383: pop
/*   */     //   384: ldc 36064
/*   */     //   386: iadd
/*   */     //   387: istore #6
/*   */     //   389: invokevirtual getTextureObjectHandle : ()I
/*   */     //   392: istore #7
/*   */     //   394: ldc 36160
/*   */     //   396: iload #6
/*   */     //   398: sipush #3553
/*   */     //   401: iload #7
/*   */     //   403: iconst_0
/*   */     //   404: invokeinterface glFramebufferTexture2D : (IIIII)V
/*   */     //   409: iinc #5, 1
/*   */     //   412: goto -> 340
/*   */     //   415: aload_1
/*   */     //   416: aload_0
/*   */     //   417: aload #4
/*   */     //   419: invokevirtual first : ()Ljava/lang/Object;
/*   */     //   422: checkcast f/s9
/*   */     //   425: invokevirtual a40 : (Lf/s9;)Lcom/badlogic/gdx/graphics/Texture;
/*   */     //   428: dup
/*   */     //   429: dup
/*   */     //   430: aload_0
/*   */     //   431: getfield x6 : Lf/fQ;
/*   */     //   434: swap
/*   */     //   435: invokevirtual Com3 : (Ljava/lang/Object;)V
/*   */     //   438: getfield glTarget : I
/*   */     //   441: istore #4
/*   */     //   443: invokevirtual getTextureObjectHandle : ()I
/*   */     //   446: iload #4
/*   */     //   448: swap
/*   */     //   449: invokeinterface glBindTexture : (II)V
/*   */     //   454: aload_0
/*   */     //   455: getfield V0 : Z
/*   */     //   458: ifeq -> 517
/*   */     //   461: iload #5
/*   */     //   463: invokestatic mt0 : (I)Ljava/nio/IntBuffer;
/*   */     //   466: astore #4
/*   */     //   468: iconst_0
/*   */     //   469: istore #6
/*   */     //   471: iload #6
/*   */     //   473: iload #5
/*   */     //   475: if_icmpge -> 495
/*   */     //   478: aload #4
/*   */     //   480: iload #6
/*   */     //   482: ldc 36064
/*   */     //   484: iadd
/*   */     //   485: invokevirtual put : (I)Ljava/nio/IntBuffer;
/*   */     //   488: pop
/*   */     //   489: iinc #6, 1
/*   */     //   492: goto -> 471
/*   */     //   495: aload #4
/*   */     //   497: iconst_0
/*   */     //   498: invokevirtual position : (I)Ljava/nio/Buffer;
/*   */     //   501: pop
/*   */     //   502: getstatic f/UB0.Je : Lf/ib;
/*   */     //   505: iload #5
/*   */     //   507: aload #4
/*   */     //   509: invokeinterface Hs : (ILjava/nio/IntBuffer;)V
/*   */     //   514: goto -> 531
/*   */     //   517: aload_0
/*   */     //   518: dup
/*   */     //   519: getfield x6 : Lf/fQ;
/*   */     //   522: invokevirtual first : ()Ljava/lang/Object;
/*   */     //   525: checkcast f/zp
/*   */     //   528: invokevirtual G60 : (Lf/zp;)V
/*   */     //   531: aload_0
/*   */     //   532: getfield E80 : Lf/wl0;
/*   */     //   535: getfield vV : Z
/*   */     //   538: ifeq -> 561
/*   */     //   541: aload_1
/*   */     //   542: aload_0
/*   */     //   543: getfield ef : I
/*   */     //   546: istore #4
/*   */     //   548: ldc 36160
/*   */     //   550: ldc 36096
/*   */     //   552: ldc 36161
/*   */     //   554: iload #4
/*   */     //   556: invokeinterface glFramebufferRenderbuffer : (IIII)V
/*   */     //   561: aload_0
/*   */     //   562: getfield E80 : Lf/wl0;
/*   */     //   565: getfield aB0 : Z
/*   */     //   568: ifeq -> 592
/*   */     //   571: aload_1
/*   */     //   572: aload_0
/*   */     //   573: getfield UA0 : I
/*   */     //   576: istore #4
/*   */     //   578: ldc 36160
/*   */     //   580: ldc_w 36128
/*   */     //   583: ldc 36161
/*   */     //   585: iload #4
/*   */     //   587: invokeinterface glFramebufferRenderbuffer : (IIII)V
/*   */     //   592: aload_0
/*   */     //   593: aload_1
/*   */     //   594: aload_0
/*   */     //   595: getfield E80 : Lf/wl0;
/*   */     //   598: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   601: pop
/*   */     //   602: ldc 36161
/*   */     //   604: iconst_0
/*   */     //   605: invokeinterface glBindRenderbuffer : (II)V
/*   */     //   610: getfield x6 : Lf/fQ;
/*   */     //   613: invokevirtual r30 : ()Lf/Hc0;
/*   */     //   616: astore #4
/*   */     //   618: aload #4
/*   */     //   620: invokevirtual hasNext : ()Z
/*   */     //   623: ifeq -> 647
/*   */     //   626: aload_1
/*   */     //   627: aload #4
/*   */     //   629: invokevirtual next : ()Ljava/lang/Object;
/*   */     //   632: checkcast f/zp
/*   */     //   635: getfield glTarget : I
/*   */     //   638: iconst_0
/*   */     //   639: invokeinterface glBindTexture : (II)V
/*   */     //   644: goto -> 618
/*   */     //   647: aload_1
/*   */     //   648: ldc 36160
/*   */     //   650: invokeinterface glCheckFramebufferStatus : (I)I
/*   */     //   655: dup
/*   */     //   656: istore #4
/*   */     //   658: ldc_w 36061
/*   */     //   661: if_icmpne -> 872
/*   */     //   664: aload_0
/*   */     //   665: getfield E80 : Lf/wl0;
/*   */     //   668: dup
/*   */     //   669: astore #5
/*   */     //   671: getfield vV : Z
/*   */     //   674: ifeq -> 872
/*   */     //   677: aload #5
/*   */     //   679: getfield aB0 : Z
/*   */     //   682: ifeq -> 872
/*   */     //   685: getstatic f/UB0.M60 : Lf/w70;
/*   */     //   688: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   691: pop
/*   */     //   692: ldc_w 'GL_OES_packed_depth_stencil'
/*   */     //   695: invokestatic glfwExtensionSupported : (Ljava/lang/CharSequence;)Z
/*   */     //   698: ifne -> 717
/*   */     //   701: getstatic f/UB0.M60 : Lf/w70;
/*   */     //   704: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   707: pop
/*   */     //   708: ldc_w 'GL_EXT_packed_depth_stencil'
/*   */     //   711: invokestatic glfwExtensionSupported : (Ljava/lang/CharSequence;)Z
/*   */     //   714: ifeq -> 872
/*   */     //   717: aload_0
/*   */     //   718: getfield E80 : Lf/wl0;
/*   */     //   721: getfield vV : Z
/*   */     //   724: ifeq -> 742
/*   */     //   727: aload_0
/*   */     //   728: aload_1
/*   */     //   729: aload_0
/*   */     //   730: getfield ef : I
/*   */     //   733: invokeinterface glDeleteRenderbuffer : (I)V
/*   */     //   738: iconst_0
/*   */     //   739: putfield ef : I
/*   */     //   742: aload_0
/*   */     //   743: getfield E80 : Lf/wl0;
/*   */     //   746: getfield aB0 : Z
/*   */     //   749: ifeq -> 767
/*   */     //   752: aload_0
/*   */     //   753: aload_1
/*   */     //   754: aload_0
/*   */     //   755: getfield UA0 : I
/*   */     //   758: invokeinterface glDeleteRenderbuffer : (I)V
/*   */     //   763: iconst_0
/*   */     //   764: putfield UA0 : I
/*   */     //   767: aload_1
/*   */     //   768: dup
/*   */     //   769: aload_0
/*   */     //   770: aload_1
/*   */     //   771: aload_0
/*   */     //   772: aload_1
/*   */     //   773: dup
/*   */     //   774: dup
/*   */     //   775: aload_0
/*   */     //   776: dup
/*   */     //   777: aload_1
/*   */     //   778: aload_0
/*   */     //   779: getfield E80 : Lf/wl0;
/*   */     //   782: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   785: pop
/*   */     //   786: invokeinterface glGenRenderbuffer : ()I
/*   */     //   791: dup
/*   */     //   792: istore #4
/*   */     //   794: putfield LJ : I
/*   */     //   797: iconst_1
/*   */     //   798: putfield Vs0 : Z
/*   */     //   801: ldc 36161
/*   */     //   803: iload #4
/*   */     //   805: invokeinterface glBindRenderbuffer : (II)V
/*   */     //   810: ldc 36161
/*   */     //   812: ldc_w 35056
/*   */     //   815: iload_2
/*   */     //   816: iload_3
/*   */     //   817: invokeinterface glRenderbufferStorage : (IIII)V
/*   */     //   822: ldc 36161
/*   */     //   824: iconst_0
/*   */     //   825: invokeinterface glBindRenderbuffer : (II)V
/*   */     //   830: getfield LJ : I
/*   */     //   833: istore_2
/*   */     //   834: ldc 36160
/*   */     //   836: ldc 36096
/*   */     //   838: ldc 36161
/*   */     //   840: iload_2
/*   */     //   841: invokeinterface glFramebufferRenderbuffer : (IIII)V
/*   */     //   846: getfield LJ : I
/*   */     //   849: istore_2
/*   */     //   850: ldc 36160
/*   */     //   852: ldc_w 36128
/*   */     //   855: ldc 36161
/*   */     //   857: iload_2
/*   */     //   858: invokeinterface glFramebufferRenderbuffer : (IIII)V
/*   */     //   863: ldc 36160
/*   */     //   865: invokeinterface glCheckFramebufferStatus : (I)I
/*   */     //   870: istore #4
/*   */     //   872: iload #4
/*   */     //   874: aload_1
/*   */     //   875: getstatic f/mo.XI0 : I
/*   */     //   878: ldc 36160
/*   */     //   880: swap
/*   */     //   881: invokeinterface glBindFramebuffer : (II)V
/*   */     //   886: ldc_w 36053
/*   */     //   889: if_icmpeq -> 1083
/*   */     //   892: aload_0
/*   */     //   893: getfield x6 : Lf/fQ;
/*   */     //   896: invokevirtual r30 : ()Lf/Hc0;
/*   */     //   899: astore_2
/*   */     //   900: aload_2
/*   */     //   901: invokevirtual hasNext : ()Z
/*   */     //   904: ifeq -> 921
/*   */     //   907: aload_0
/*   */     //   908: aload_2
/*   */     //   909: invokevirtual next : ()Ljava/lang/Object;
/*   */     //   912: checkcast f/zp
/*   */     //   915: invokevirtual bc : (Lf/zp;)V
/*   */     //   918: goto -> 900
/*   */     //   921: aload_0
/*   */     //   922: getfield Vs0 : Z
/*   */     //   925: ifeq -> 941
/*   */     //   928: aload_1
/*   */     //   929: aload_0
/*   */     //   930: getfield LJ : I
/*   */     //   933: invokeinterface glDeleteBuffer : (I)V
/*   */     //   938: goto -> 981
/*   */     //   941: aload_0
/*   */     //   942: getfield E80 : Lf/wl0;
/*   */     //   945: getfield vV : Z
/*   */     //   948: ifeq -> 961
/*   */     //   951: aload_1
/*   */     //   952: aload_0
/*   */     //   953: getfield ef : I
/*   */     //   956: invokeinterface glDeleteRenderbuffer : (I)V
/*   */     //   961: aload_0
/*   */     //   962: getfield E80 : Lf/wl0;
/*   */     //   965: getfield aB0 : Z
/*   */     //   968: ifeq -> 981
/*   */     //   971: aload_1
/*   */     //   972: aload_0
/*   */     //   973: getfield UA0 : I
/*   */     //   976: invokeinterface glDeleteRenderbuffer : (I)V
/*   */     //   981: iload #4
/*   */     //   983: aload_1
/*   */     //   984: aload_0
/*   */     //   985: getfield EE0 : I
/*   */     //   988: invokeinterface glDeleteFramebuffer : (I)V
/*   */     //   993: ldc_w 36054
/*   */     //   996: if_icmpeq -> 1072
/*   */     //   999: iload #4
/*   */     //   1001: ldc_w 36057
/*   */     //   1004: if_icmpeq -> 1061
/*   */     //   1007: iload #4
/*   */     //   1009: ldc_w 36055
/*   */     //   1012: if_icmpeq -> 1050
/*   */     //   1015: iload #4
/*   */     //   1017: ldc_w 36061
/*   */     //   1020: if_icmpne -> 1034
/*   */     //   1023: new java/lang/IllegalStateException
/*   */     //   1026: dup
/*   */     //   1027: ldc_w 'Frame buffer couldn't be constructed: unsupported combination of formats'
/*   */     //   1030: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   1033: athrow
/*   */     //   1034: new java/lang/IllegalStateException
/*   */     //   1037: dup
/*   */     //   1038: ldc_w 'Frame buffer couldn't be constructed: unknown error '
/*   */     //   1041: iload #4
/*   */     //   1043: invokestatic SD0 : (Ljava/lang/String;I)Ljava/lang/String;
/*   */     //   1046: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   1049: athrow
/*   */     //   1050: new java/lang/IllegalStateException
/*   */     //   1053: dup
/*   */     //   1054: ldc_w 'Frame buffer couldn't be constructed: missing attachment'
/*   */     //   1057: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   1060: athrow
/*   */     //   1061: new java/lang/IllegalStateException
/*   */     //   1064: dup
/*   */     //   1065: ldc_w 'Frame buffer couldn't be constructed: incomplete dimensions'
/*   */     //   1068: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   1071: athrow
/*   */     //   1072: new java/lang/IllegalStateException
/*   */     //   1075: dup
/*   */     //   1076: ldc_w 'Frame buffer couldn't be constructed: incomplete attachment'
/*   */     //   1079: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   1082: athrow
/*   */     //   1083: getstatic f/UB0.Kg0 : Lf/Q50;
/*   */     //   1086: astore_1
/*   */     //   1087: getstatic f/mo.fD0 : Ljava/util/HashMap;
/*   */     //   1090: dup
/*   */     //   1091: astore_2
/*   */     //   1092: aload_1
/*   */     //   1093: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   1096: checkcast f/fQ
/*   */     //   1099: dup
/*   */     //   1100: astore_3
/*   */     //   1101: ifnonnull -> 1112
/*   */     //   1104: new f/fQ
/*   */     //   1107: dup
/*   */     //   1108: astore_3
/*   */     //   1109: invokespecial <init> : ()V
/*   */     //   1112: aload_2
/*   */     //   1113: aload_3
/*   */     //   1114: aload_0
/*   */     //   1115: invokevirtual Com3 : (Ljava/lang/Object;)V
/*   */     //   1118: aload_1
/*   */     //   1119: aload_3
/*   */     //   1120: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   1123: pop
/*   */     //   1124: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 4
/*   */     //   #2	-> 7
/*   */     //   #3	-> 23
/*   */     //   #4	-> 81
/*   */     //   #5	-> 98
/*   */     //   #6	-> 101
/*   */     //   #7	-> 692
/*   */     //   #8	-> 701
/*   */     //   #9	-> 708
/*   */     //   #10	-> 718
/*   */     //   #11	-> 1038
/*   */     //   #12	-> 1046
/*   */     //   #13	-> 1087
/*   */   }
/*   */   
/*   */   public final void dispose() {
/*   */     hj0 hj0 = UB0.re0;
/*   */     Hc0 hc0 = this.x6.r30();
/*   */     while (hc0.hasNext())
/*   */       bc((zp)hc0.next()); 
/*   */     if (this.Vs0) {
/*   */       hj0.glDeleteRenderbuffer(this.LJ);
/*   */     } else {
/*   */       if (this.E80.vV)
/*   */         hj0.glDeleteRenderbuffer(this.ef); 
/*   */       if (this.E80.aB0)
/*   */         hj0.glDeleteRenderbuffer(this.UA0); 
/*   */     } 
/*   */     hj0.glDeleteFramebuffer(this.EE0);
/*   */     HashMap<?, ?> hashMap;
/*   */     if ((hashMap = fD0).get(UB0.Kg0) != null)
/*   */       ((fQ)hashMap.get(UB0.Kg0)).Ct(this, true); 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/mo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */