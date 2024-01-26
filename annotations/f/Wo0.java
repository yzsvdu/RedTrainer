/* 1 */ package f;public abstract class Wo0 implements Thread.UncaughtExceptionHandler { public static void u6(RD0 paramRD0) { Pw pw; if ((pw = km.wI0) != null) pw.Ta = true; 
/* 2 */     fl0.Kf(paramRD0, true); }
/*   */ 
/*   */   
/*   */   public static ik xn = C00.gd(Wo0.class);
/*   */   
/*   */   public final void uncaughtException(Thread paramThread, Throwable paramThrowable) {
/*   */     // Byte code:
/*   */     //   0: aload_2
/*   */     //   1: instanceof f/JU
/*   */     //   4: ifeq -> 33
/*   */     //   7: aload_0
/*   */     //   8: aload_2
/*   */     //   9: checkcast f/JU
/*   */     //   12: dup
/*   */     //   13: astore_0
/*   */     //   14: invokevirtual zT : (Lf/JU;)Z
/*   */     //   17: ifeq -> 21
/*   */     //   20: return
/*   */     //   21: aload_0
/*   */     //   22: invokevirtual getCause : ()Ljava/lang/Throwable;
/*   */     //   25: ifnull -> 33
/*   */     //   28: aload_0
/*   */     //   29: invokevirtual getCause : ()Ljava/lang/Throwable;
/*   */     //   32: astore_2
/*   */     //   33: ldc f/Cm0
/*   */     //   35: astore_0
/*   */     //   36: aload_2
/*   */     //   37: astore_1
/*   */     //   38: aload_1
/*   */     //   39: ifnull -> 61
/*   */     //   42: aload_0
/*   */     //   43: aload_1
/*   */     //   44: invokevirtual isInstance : (Ljava/lang/Object;)Z
/*   */     //   47: ifeq -> 53
/*   */     //   50: goto -> 63
/*   */     //   53: aload_1
/*   */     //   54: invokevirtual getCause : ()Ljava/lang/Throwable;
/*   */     //   57: astore_1
/*   */     //   58: goto -> 38
/*   */     //   61: aconst_null
/*   */     //   62: astore_1
/*   */     //   63: aload_1
/*   */     //   64: ifnull -> 160
/*   */     //   67: ldc java/lang/UnsatisfiedLinkError
/*   */     //   69: astore_0
/*   */     //   70: aload_2
/*   */     //   71: astore_1
/*   */     //   72: aload_1
/*   */     //   73: ifnull -> 95
/*   */     //   76: aload_0
/*   */     //   77: aload_1
/*   */     //   78: invokevirtual isInstance : (Ljava/lang/Object;)Z
/*   */     //   81: ifeq -> 87
/*   */     //   84: goto -> 97
/*   */     //   87: aload_1
/*   */     //   88: invokevirtual getCause : ()Ljava/lang/Throwable;
/*   */     //   91: astore_1
/*   */     //   92: goto -> 72
/*   */     //   95: aconst_null
/*   */     //   96: astore_1
/*   */     //   97: aload_1
/*   */     //   98: checkcast java/lang/UnsatisfiedLinkError
/*   */     //   101: dup
/*   */     //   102: astore_0
/*   */     //   103: ifnull -> 160
/*   */     //   106: aload_0
/*   */     //   107: invokevirtual getMessage : ()Ljava/lang/String;
/*   */     //   110: ldc 'GLIBC'
/*   */     //   112: invokevirtual contains : (Ljava/lang/CharSequence;)Z
/*   */     //   115: ifeq -> 160
/*   */     //   118: aload_0
/*   */     //   119: invokevirtual getMessage : ()Ljava/lang/String;
/*   */     //   122: ldc 'not found'
/*   */     //   124: invokevirtual contains : (Ljava/lang/CharSequence;)Z
/*   */     //   127: ifeq -> 160
/*   */     //   130: getstatic f/km.f70 : Lf/k7;
/*   */     //   133: bipush #34
/*   */     //   135: ldc 'PokeMMO requires a newer version of GLIBC/GLIBCXX than your operating system provides.\\nYou must upgrade your operating system to play.'
/*   */     //   137: invokestatic la : (ILjava/lang/String;)Ljava/lang/String;
/*   */     //   140: getstatic f/LP.Od0 : Lf/LP;
/*   */     //   143: astore_0
/*   */     //   144: <illegal opcode> run : ()Ljava/lang/Runnable;
/*   */     //   149: astore_1
/*   */     //   150: ldc 'Error'
/*   */     //   152: swap
/*   */     //   153: aload_0
/*   */     //   154: aload_1
/*   */     //   155: iconst_0
/*   */     //   156: invokevirtual iJ0 : (Ljava/lang/String;Ljava/lang/String;Lf/LP;Ljava/lang/Runnable;Z)V
/*   */     //   159: return
/*   */     //   160: getstatic f/G8.q9 : Z
/*   */     //   163: ifeq -> 178
/*   */     //   166: getstatic f/Wo0.xn : Lf/ik;
/*   */     //   169: ldc 'Fatal render error (Secondary).'
/*   */     //   171: aload_2
/*   */     //   172: invokeinterface error : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*   */     //   177: return
/*   */     //   178: aload_2
/*   */     //   179: iconst_1
/*   */     //   180: putstatic f/G8.q9 : Z
/*   */     //   183: instanceof java/lang/OutOfMemoryError
/*   */     //   186: ifne -> 529
/*   */     //   189: aload_2
/*   */     //   190: instanceof f/JU
/*   */     //   193: ifeq -> 218
/*   */     //   196: getstatic f/km.VH : Lf/Yj;
/*   */     //   199: aload_2
/*   */     //   200: checkcast f/JU
/*   */     //   203: astore_0
/*   */     //   204: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   207: pop
/*   */     //   208: aload_0
/*   */     //   209: invokestatic LpT5 : (Lf/JU;)Z
/*   */     //   212: ifeq -> 218
/*   */     //   215: goto -> 529
/*   */     //   218: getstatic f/Wo0.xn : Lf/ik;
/*   */     //   221: astore_0
/*   */     //   222: ldc 'State: Ingame '
/*   */     //   224: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   227: astore_1
/*   */     //   228: getstatic f/km.u4 : Lf/R8;
/*   */     //   231: ifnull -> 239
/*   */     //   234: iconst_1
/*   */     //   235: istore_3
/*   */     //   236: goto -> 241
/*   */     //   239: iconst_0
/*   */     //   240: istore_3
/*   */     //   241: aload_0
/*   */     //   242: aload_1
/*   */     //   243: iload_3
/*   */     //   244: invokevirtual append : (Z)Ljava/lang/StringBuilder;
/*   */     //   247: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   250: invokeinterface error : (Ljava/lang/String;)V
/*   */     //   255: getstatic f/Wo0.xn : Lf/ik;
/*   */     //   258: astore_0
/*   */     //   259: ldc 'State: Has World '
/*   */     //   261: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   264: astore_1
/*   */     //   265: getstatic f/km.a3 : Lf/vh0;
/*   */     //   268: ifnull -> 276
/*   */     //   271: iconst_1
/*   */     //   272: istore_3
/*   */     //   273: goto -> 278
/*   */     //   276: iconst_0
/*   */     //   277: istore_3
/*   */     //   278: aload_0
/*   */     //   279: aload_1
/*   */     //   280: iload_3
/*   */     //   281: invokevirtual append : (Z)Ljava/lang/StringBuilder;
/*   */     //   284: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   287: invokeinterface error : (Ljava/lang/String;)V
/*   */     //   292: getstatic f/Wo0.xn : Lf/ik;
/*   */     //   295: astore_0
/*   */     //   296: ldc 'State: Has Battle '
/*   */     //   298: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   301: astore_1
/*   */     //   302: getstatic f/km.MR : Lf/Gp0;
/*   */     //   305: ifnull -> 313
/*   */     //   308: iconst_1
/*   */     //   309: istore_3
/*   */     //   310: goto -> 315
/*   */     //   313: iconst_0
/*   */     //   314: istore_3
/*   */     //   315: aload_0
/*   */     //   316: aload_1
/*   */     //   317: iload_3
/*   */     //   318: invokevirtual append : (Z)Ljava/lang/StringBuilder;
/*   */     //   321: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   324: invokeinterface error : (Ljava/lang/String;)V
/*   */     //   329: getstatic f/km.a3 : Lf/vh0;
/*   */     //   332: ifnull -> 385
/*   */     //   335: getstatic f/Wo0.xn : Lf/ik;
/*   */     //   338: ldc 'State: Region '
/*   */     //   340: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   343: getstatic f/km.a3 : Lf/vh0;
/*   */     //   346: getfield eA : B
/*   */     //   349: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*   */     //   352: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   355: invokeinterface error : (Ljava/lang/String;)V
/*   */     //   360: getstatic f/Wo0.xn : Lf/ik;
/*   */     //   363: ldc 'State: Id '
/*   */     //   365: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   368: getstatic f/km.a3 : Lf/vh0;
/*   */     //   371: getfield yD : I
/*   */     //   374: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*   */     //   377: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   380: invokeinterface error : (Ljava/lang/String;)V
/*   */     //   385: getstatic f/Wo0.xn : Lf/ik;
/*   */     //   388: astore_0
/*   */     //   389: ldc 'Loaded libraries: '
/*   */     //   391: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   394: astore_1
/*   */     //   395: getstatic f/Di.MW : Ljava/lang/reflect/Field;
/*   */     //   398: pop
/*   */     //   399: invokestatic getSystemClassLoader : ()Ljava/lang/ClassLoader;
/*   */     //   402: getstatic f/Di.MW : Ljava/lang/reflect/Field;
/*   */     //   405: swap
/*   */     //   406: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   409: checkcast java/util/Set
/*   */     //   412: iconst_0
/*   */     //   413: anewarray java/lang/String
/*   */     //   416: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
/*   */     //   421: checkcast [Ljava/lang/String;
/*   */     //   424: astore_3
/*   */     //   425: goto -> 439
/*   */     //   428: pop
/*   */     //   429: iconst_1
/*   */     //   430: anewarray java/lang/String
/*   */     //   433: dup
/*   */     //   434: astore_3
/*   */     //   435: iconst_0
/*   */     //   436: ldc 'ERROR'
/*   */     //   438: aastore
/*   */     //   439: aload_0
/*   */     //   440: aload_1
/*   */     //   441: aload_3
/*   */     //   442: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
/*   */     //   445: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*   */     //   448: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   451: invokeinterface info : (Ljava/lang/String;)V
/*   */     //   456: getstatic f/Wo0.xn : Lf/ik;
/*   */     //   459: ldc_w 'Fatal render error.'
/*   */     //   462: aload_2
/*   */     //   463: invokeinterface error : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*   */     //   468: getstatic f/Bz.YM : Z
/*   */     //   471: ifeq -> 528
/*   */     //   474: aload_2
/*   */     //   475: invokestatic Xm0 : (Ljava/lang/Throwable;)Lf/hZ;
/*   */     //   478: bipush #41
/*   */     //   480: ldc_w 'Fatal render error has occurred.\\n\\nWould you like to submit an error report?'
/*   */     //   483: invokestatic la : (ILjava/lang/String;)Ljava/lang/String;
/*   */     //   486: astore_0
/*   */     //   487: getstatic f/km.f70 : Lf/k7;
/*   */     //   490: swap
/*   */     //   491: dup
/*   */     //   492: bipush #40
/*   */     //   494: ldc_w 'Fatal Render Error'
/*   */     //   497: invokestatic la : (ILjava/lang/String;)Ljava/lang/String;
/*   */     //   500: astore_1
/*   */     //   501: getstatic f/LP.Od0 : Lf/LP;
/*   */     //   504: astore_2
/*   */     //   505: <illegal opcode> run : (Lf/RD0;)Ljava/lang/Runnable;
/*   */     //   510: astore_3
/*   */     //   511: <illegal opcode> run : (Lf/RD0;)Ljava/lang/Runnable;
/*   */     //   516: astore #4
/*   */     //   518: aload_1
/*   */     //   519: aload_0
/*   */     //   520: aload_2
/*   */     //   521: aload_3
/*   */     //   522: aload #4
/*   */     //   524: iconst_1
/*   */     //   525: invokevirtual lpt3 : (Ljava/lang/String;Ljava/lang/String;Lf/LP;Ljava/lang/Runnable;Ljava/lang/Runnable;Z)V
/*   */     //   528: return
/*   */     //   529: invokestatic getRuntime : ()Ljava/lang/Runtime;
/*   */     //   532: dup
/*   */     //   533: dup
/*   */     //   534: astore_0
/*   */     //   535: invokevirtual totalMemory : ()J
/*   */     //   538: aload_0
/*   */     //   539: invokevirtual freeMemory : ()J
/*   */     //   542: lsub
/*   */     //   543: ldc2_w 1048576
/*   */     //   546: ldiv
/*   */     //   547: lstore_0
/*   */     //   548: invokevirtual maxMemory : ()J
/*   */     //   551: ldc2_w 1048576
/*   */     //   554: ldiv
/*   */     //   555: lstore_3
/*   */     //   556: getstatic f/Wo0.xn : Lf/ik;
/*   */     //   559: ldc_w 'Fatal out of memory error.'
/*   */     //   562: aload_2
/*   */     //   563: invokeinterface error : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*   */     //   568: getstatic f/km.f70 : Lf/k7;
/*   */     //   571: new java/lang/StringBuilder
/*   */     //   574: dup
/*   */     //   575: invokespecial <init> : ()V
/*   */     //   578: bipush #81
/*   */     //   580: ldc_w 'Fatal OutOfMemoryError.\\n\\nPlease restart the application and try again.\\nIf this persists please raise the memory allocation.\\nPlease visit https://pokemmo.eu/oom for more information.'
/*   */     //   583: invokestatic la : (ILjava/lang/String;)Ljava/lang/String;
/*   */     //   586: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   589: ldc_w '\\nMemory Info: '
/*   */     //   592: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   595: lload_0
/*   */     //   596: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*   */     //   599: ldc_w ' / '
/*   */     //   602: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   605: lload_3
/*   */     //   606: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*   */     //   609: ldc_w ' MB'
/*   */     //   612: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   615: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   618: getstatic f/LP.Od0 : Lf/LP;
/*   */     //   621: astore_0
/*   */     //   622: <illegal opcode> run : ()Ljava/lang/Runnable;
/*   */     //   627: astore_1
/*   */     //   628: ldc 'Error'
/*   */     //   630: swap
/*   */     //   631: aload_0
/*   */     //   632: aload_1
/*   */     //   633: iconst_0
/*   */     //   634: invokevirtual iJ0 : (Ljava/lang/String;Ljava/lang/String;Lf/LP;Ljava/lang/Runnable;Z)V
/*   */     //   637: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 44
/*   */     //   #2	-> 67
/*   */     //   #3	-> 78
/*   */     //   #4	-> 98
/*   */     //   #5	-> 150
/*   */     //   #6	-> 160
/*   */     //   #7	-> 222
/*   */     //   #8	-> 228
/*   */     //   #9	-> 259
/*   */     //   #10	-> 265
/*   */     //   #11	-> 296
/*   */     //   #12	-> 302
/*   */     //   #13	-> 338
/*   */     //   #14	-> 343
/*   */     //   #15	-> 346
/*   */     //   #16	-> 349
/*   */     //   #17	-> 363
/*   */     //   #18	-> 368
/*   */     //   #19	-> 371
/*   */     //   #20	-> 374
/*   */     //   #21	-> 389
/*   */     //   #22	-> 395
/*   */     //   #23	-> 399
/*   */     //   #24	-> 402
/*   */     //   #25	-> 442
/*   */     //   #26	-> 628
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   402	424	428	java/lang/Exception
/*   */   }
/*   */   
/*   */   public abstract boolean zT(JU paramJU); }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Wo0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */