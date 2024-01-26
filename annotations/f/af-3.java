package f;

public final class af extends El {
  public static final ik UF = C00.gd(af.class);
  
  public boolean ev = false;
  
  public final void lPt2(boolean paramBoolean, String... paramVarArgs) {
    // Byte code:
    //   0: invokestatic Bf : ()Z
    //   3: ifne -> 7
    //   6: return
    //   7: aload_0
    //   8: dup
    //   9: monitorenter
    //   10: getfield ev : Z
    //   13: ifeq -> 19
    //   16: aload_0
    //   17: monitorexit
    //   18: return
    //   19: aload_0
    //   20: dup
    //   21: iconst_1
    //   22: putfield ev : Z
    //   25: monitorexit
    //   26: iconst_0
    //   27: istore_0
    //   28: ldc ''
    //   30: astore_3
    //   31: new java/io/File
    //   34: dup
    //   35: dup
    //   36: astore #4
    //   38: ldc 'pokemmo_updater.jar'
    //   40: invokespecial <init> : (Ljava/lang/String;)V
    //   43: invokevirtual isFile : ()Z
    //   46: ifeq -> 92
    //   49: aload #4
    //   51: invokevirtual exists : ()Z
    //   54: ifeq -> 92
    //   57: getstatic f/jX.G10 : Ljava/lang/String;
    //   60: ldc 'pokemmo_updater.jar'
    //   62: invokestatic r3 : (Ljava/lang/String;)Ljava/lang/String;
    //   65: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   68: ifeq -> 86
    //   71: getstatic f/af.UF : Lf/ik;
    //   74: ldc 'Using already existing pokemmo_updater.jar'
    //   76: invokeinterface info : (Ljava/lang/String;)V
    //   81: iconst_1
    //   82: istore_0
    //   83: goto -> 92
    //   86: aload #4
    //   88: invokevirtual delete : ()Z
    //   91: pop
    //   92: iload_0
    //   93: ifne -> 268
    //   96: getstatic f/jX.yr : Ljava/lang/String;
    //   99: invokevirtual isEmpty : ()Z
    //   102: ifne -> 115
    //   105: new f/Yo
    //   108: dup
    //   109: invokespecial <init> : ()V
    //   112: invokestatic setDefault : (Ljava/net/Authenticator;)V
    //   115: getstatic f/jX.tJ : [Ljava/lang/String;
    //   118: dup
    //   119: astore #5
    //   121: arraylength
    //   122: istore #6
    //   124: iconst_0
    //   125: istore #7
    //   127: iload #7
    //   129: iload #6
    //   131: if_icmpge -> 268
    //   134: aload #5
    //   136: iload #7
    //   138: aaload
    //   139: getstatic f/jX.sn0 : I
    //   142: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
    //   147: invokestatic ya : (Ljava/lang/String;)Z
    //   150: ifne -> 159
    //   153: ldc 'Failed to download file pokemmo_updater.jar.TEMPORARY'
    //   155: astore_3
    //   156: goto -> 260
    //   159: getstatic f/af.UF : Lf/ik;
    //   162: ldc 'Downloaded new pokemmo_updater.jar.TEMPORARY'
    //   164: invokeinterface info : (Ljava/lang/String;)V
    //   169: new java/io/File
    //   172: dup
    //   173: astore #8
    //   175: ldc 'pokemmo_updater.jar.TEMPORARY'
    //   177: invokespecial <init> : (Ljava/lang/String;)V
    //   180: ldc 'pokemmo_updater.jar.TEMPORARY'
    //   182: invokestatic r3 : (Ljava/lang/String;)Ljava/lang/String;
    //   185: astore #9
    //   187: getstatic f/jX.G10 : Ljava/lang/String;
    //   190: aload #9
    //   192: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   195: ifne -> 234
    //   198: aload #8
    //   200: getstatic f/jX.G10 : Ljava/lang/String;
    //   203: aload #9
    //   205: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   210: astore_3
    //   211: invokevirtual isFile : ()Z
    //   214: ifeq -> 260
    //   217: aload #8
    //   219: invokevirtual exists : ()Z
    //   222: ifeq -> 260
    //   225: aload #8
    //   227: invokevirtual delete : ()Z
    //   230: pop
    //   231: goto -> 260
    //   234: aload #8
    //   236: aload #4
    //   238: invokevirtual renameTo : (Ljava/io/File;)Z
    //   241: ifne -> 266
    //   244: aload #8
    //   246: invokevirtual getPath : ()Ljava/lang/String;
    //   249: aload #4
    //   251: invokevirtual getPath : ()Ljava/lang/String;
    //   254: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   259: astore_3
    //   260: iinc #7, 1
    //   263: goto -> 127
    //   266: iconst_1
    //   267: istore_0
    //   268: iload_0
    //   269: ifne -> 296
    //   272: aload_3
    //   273: invokevirtual isEmpty : ()Z
    //   276: ifeq -> 282
    //   279: ldc 'Unknown Error'
    //   281: astore_3
    //   282: aload_3
    //   283: new java/lang/RuntimeException
    //   286: dup
    //   287: astore_0
    //   288: invokespecial <init> : ()V
    //   291: aload_0
    //   292: invokestatic Uy0 : (Ljava/lang/String;Ljava/lang/Exception;)V
    //   295: return
    //   296: ldc 'java.home'
    //   298: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   301: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   306: astore_0
    //   307: new f/fQ
    //   310: dup
    //   311: dup2
    //   312: astore_3
    //   313: aload_0
    //   314: aload_3
    //   315: ldc java/lang/String
    //   317: invokespecial <init> : (Ljava/lang/Class;)V
    //   320: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   323: ldc '-jar'
    //   325: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   328: ldc 'pokemmo_updater.jar'
    //   330: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   333: getstatic f/jX.Os0 : Ljava/lang/String;
    //   336: invokevirtual isBlank : ()Z
    //   339: ifne -> 354
    //   342: aload_3
    //   343: getstatic f/jX.Os0 : Ljava/lang/String;
    //   346: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   351: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   354: getstatic f/jX.vR : Ljava/lang/String;
    //   357: invokevirtual isBlank : ()Z
    //   360: ifne -> 375
    //   363: aload_3
    //   364: getstatic f/jX.vR : Ljava/lang/String;
    //   367: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   372: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   375: getstatic f/jX.yr : Ljava/lang/String;
    //   378: invokevirtual isBlank : ()Z
    //   381: ifne -> 396
    //   384: aload_3
    //   385: getstatic f/jX.yr : Ljava/lang/String;
    //   388: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   393: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   396: iload_1
    //   397: ifeq -> 406
    //   400: aload_3
    //   401: ldc '-repair:true'
    //   403: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   406: aload_2
    //   407: arraylength
    //   408: istore_0
    //   409: iconst_0
    //   410: istore_1
    //   411: iload_1
    //   412: iload_0
    //   413: if_icmpge -> 434
    //   416: aload_3
    //   417: aload_2
    //   418: iload_1
    //   419: aaload
    //   420: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   425: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   428: iinc #1, 1
    //   431: goto -> 411
    //   434: invokestatic getRuntime : ()Ljava/lang/Runtime;
    //   437: aload_3
    //   438: invokevirtual toArray : ()[Ljava/lang/Object;
    //   441: checkcast [Ljava/lang/String;
    //   444: invokevirtual exec : ([Ljava/lang/String;)Ljava/lang/Process;
    //   447: pop
    //   448: getstatic f/UB0.Kg0 : Lf/Q50;
    //   451: invokevirtual EM : ()V
    //   454: return
    //   455: astore_0
    //   456: ldc 'Unable to start updater process.'
    //   458: aload_0
    //   459: invokestatic Uy0 : (Ljava/lang/String;Ljava/lang/Exception;)V
    //   462: getstatic f/af.UF : Lf/ik;
    //   465: ldc 'Unable to start updater process.'
    //   467: aload_0
    //   468: invokeinterface error : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   473: return
    //   474: astore_1
    //   475: aload_1
    //   476: aload_0
    //   477: monitorexit
    //   478: athrow
    // Exception table:
    //   from	to	target	type
    //   10	13	474	finally
    //   16	18	474	finally
    //   19	26	474	finally
    //   434	447	455	java/lang/Exception
    //   475	478	474	finally
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/af.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */