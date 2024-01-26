/* 1 */ package f;public abstract class cS { public static String Wc0(String paramString) { return Qd0(paramString, 80, null, false, 0); }
/*   */ 
/*   */   
/*   */   public static final Matcher Nu0 = Pattern.compile("\\p{L}").matcher("");
/*   */   public static final Matcher wm = Pattern.compile("(\\p{Zl}|\\s)").matcher("");
/*   */   
/*   */   public static String JF(int paramInt, String paramString) {
/*   */     return oF(paramInt, paramString, null, true);
/*   */   }
/*   */   
/*   */   public static String oF(int paramInt, String paramString1, String paramString2, boolean paramBoolean) {
/*   */     return Qd0(paramString1, paramInt, paramString2, paramBoolean, 0);
/*   */   }
/*   */   
/*   */   public static String Qd0(String paramString1, int paramInt1, String paramString2, boolean paramBoolean, int paramInt2) {
/*   */     // Byte code:
/*   */     //   0: iload_1
/*   */     //   1: ldc2_w 0.7
/*   */     //   4: dstore #5
/*   */     //   6: iconst_1
/*   */     //   7: if_icmplt -> 542
/*   */     //   10: aload_0
/*   */     //   11: ifnull -> 542
/*   */     //   14: aload_2
/*   */     //   15: ifnonnull -> 21
/*   */     //   18: ldc '\\n'
/*   */     //   20: astore_2
/*   */     //   21: iload_3
/*   */     //   22: ifeq -> 33
/*   */     //   25: aload_0
/*   */     //   26: aload_2
/*   */     //   27: ldc ' '
/*   */     //   29: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*   */     //   32: astore_0
/*   */     //   33: aload_0
/*   */     //   34: invokevirtual length : ()I
/*   */     //   37: iload_1
/*   */     //   38: if_icmpge -> 43
/*   */     //   41: aload_0
/*   */     //   42: areturn
/*   */     //   43: aload_0
/*   */     //   44: aload_2
/*   */     //   45: iload_1
/*   */     //   46: new java/lang/StringBuilder
/*   */     //   49: dup
/*   */     //   50: astore_3
/*   */     //   51: aload_0
/*   */     //   52: invokevirtual length : ()I
/*   */     //   55: bipush #8
/*   */     //   57: iadd
/*   */     //   58: invokespecial <init> : (I)V
/*   */     //   61: new java/lang/StringBuilder
/*   */     //   64: dup
/*   */     //   65: astore #7
/*   */     //   67: aload_0
/*   */     //   68: invokevirtual length : ()I
/*   */     //   71: invokespecial <init> : (I)V
/*   */     //   74: i2d
/*   */     //   75: dload #5
/*   */     //   77: dmul
/*   */     //   78: d2i
/*   */     //   79: istore_0
/*   */     //   80: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
/*   */     //   83: astore #5
/*   */     //   85: iconst_0
/*   */     //   86: istore #6
/*   */     //   88: iconst_0
/*   */     //   89: istore #8
/*   */     //   91: iload #8
/*   */     //   93: aload #5
/*   */     //   95: arraylength
/*   */     //   96: if_icmpge -> 537
/*   */     //   99: aload #5
/*   */     //   101: iload #8
/*   */     //   103: aaload
/*   */     //   104: dup
/*   */     //   105: astore #9
/*   */     //   107: invokestatic xK : (Ljava/lang/String;)Z
/*   */     //   110: ifeq -> 145
/*   */     //   113: iload #4
/*   */     //   115: iconst_1
/*   */     //   116: if_icmplt -> 136
/*   */     //   119: iload #6
/*   */     //   121: iload #4
/*   */     //   123: if_icmpge -> 129
/*   */     //   126: goto -> 136
/*   */     //   129: ldc ' '
/*   */     //   131: astore #9
/*   */     //   133: goto -> 152
/*   */     //   136: iinc #6, 1
/*   */     //   139: aload_2
/*   */     //   140: astore #9
/*   */     //   142: goto -> 152
/*   */     //   145: aload #9
/*   */     //   147: invokevirtual trim : ()Ljava/lang/String;
/*   */     //   150: astore #9
/*   */     //   152: aload #7
/*   */     //   154: dup
/*   */     //   155: iconst_0
/*   */     //   156: invokevirtual setLength : (I)V
/*   */     //   159: aload #9
/*   */     //   161: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   164: pop
/*   */     //   165: aload #7
/*   */     //   167: invokevirtual length : ()I
/*   */     //   170: ifle -> 531
/*   */     //   173: aload #7
/*   */     //   175: invokevirtual length : ()I
/*   */     //   178: iload_1
/*   */     //   179: if_icmpge -> 266
/*   */     //   182: aload #7
/*   */     //   184: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   187: dup
/*   */     //   188: astore #9
/*   */     //   190: invokestatic xK : (Ljava/lang/String;)Z
/*   */     //   193: dup
/*   */     //   194: istore #10
/*   */     //   196: ifne -> 206
/*   */     //   199: aload #9
/*   */     //   201: invokevirtual trim : ()Ljava/lang/String;
/*   */     //   204: astore #9
/*   */     //   206: iload #8
/*   */     //   208: aload #5
/*   */     //   210: aload_3
/*   */     //   211: aload #9
/*   */     //   213: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   216: pop
/*   */     //   217: arraylength
/*   */     //   218: iconst_1
/*   */     //   219: isub
/*   */     //   220: if_icmpeq -> 531
/*   */     //   223: iload #10
/*   */     //   225: ifne -> 531
/*   */     //   228: iload #4
/*   */     //   230: iconst_1
/*   */     //   231: if_icmplt -> 254
/*   */     //   234: iload #6
/*   */     //   236: iload #4
/*   */     //   238: if_icmpge -> 244
/*   */     //   241: goto -> 254
/*   */     //   244: aload_3
/*   */     //   245: ldc ' '
/*   */     //   247: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   250: pop
/*   */     //   251: goto -> 531
/*   */     //   254: aload_3
/*   */     //   255: aload_2
/*   */     //   256: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   259: pop
/*   */     //   260: iinc #6, 1
/*   */     //   263: goto -> 531
/*   */     //   266: aload #7
/*   */     //   268: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   271: dup
/*   */     //   272: astore #9
/*   */     //   274: invokestatic xK : (Ljava/lang/String;)Z
/*   */     //   277: ifeq -> 290
/*   */     //   280: aload #9
/*   */     //   282: invokevirtual length : ()I
/*   */     //   285: istore #9
/*   */     //   287: goto -> 351
/*   */     //   290: iconst_m1
/*   */     //   291: istore #10
/*   */     //   293: iconst_0
/*   */     //   294: istore #11
/*   */     //   296: iload #11
/*   */     //   298: aload #9
/*   */     //   300: invokevirtual length : ()I
/*   */     //   303: if_icmpge -> 347
/*   */     //   306: iload #11
/*   */     //   308: iload_1
/*   */     //   309: if_icmple -> 315
/*   */     //   312: goto -> 347
/*   */     //   315: getstatic f/cS.wm : Ljava/util/regex/Matcher;
/*   */     //   318: aload #9
/*   */     //   320: iload #11
/*   */     //   322: invokevirtual charAt : (I)C
/*   */     //   325: invokestatic toString : (C)Ljava/lang/String;
/*   */     //   328: invokevirtual reset : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
/*   */     //   331: invokevirtual matches : ()Z
/*   */     //   334: ifeq -> 341
/*   */     //   337: iload #11
/*   */     //   339: istore #10
/*   */     //   341: iinc #11, 1
/*   */     //   344: goto -> 296
/*   */     //   347: iload #10
/*   */     //   349: istore #9
/*   */     //   351: iload #9
/*   */     //   353: iconst_1
/*   */     //   354: if_icmplt -> 363
/*   */     //   357: iload #9
/*   */     //   359: iload_0
/*   */     //   360: if_icmpge -> 443
/*   */     //   363: aload #7
/*   */     //   365: invokevirtual length : ()I
/*   */     //   368: iload_0
/*   */     //   369: if_icmple -> 440
/*   */     //   372: aload #7
/*   */     //   374: iload_1
/*   */     //   375: aload #7
/*   */     //   377: invokevirtual length : ()I
/*   */     //   380: invokestatic min : (II)I
/*   */     //   383: iconst_0
/*   */     //   384: swap
/*   */     //   385: invokevirtual substring : (II)Ljava/lang/String;
/*   */     //   388: dup
/*   */     //   389: astore #10
/*   */     //   391: invokevirtual length : ()I
/*   */     //   394: iconst_1
/*   */     //   395: isub
/*   */     //   396: istore #11
/*   */     //   398: iload #11
/*   */     //   400: iflt -> 443
/*   */     //   403: getstatic f/cS.Nu0 : Ljava/util/regex/Matcher;
/*   */     //   406: dup
/*   */     //   407: aload #10
/*   */     //   409: iload #11
/*   */     //   411: invokevirtual charAt : (I)C
/*   */     //   414: invokestatic toString : (C)Ljava/lang/String;
/*   */     //   417: invokevirtual reset : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
/*   */     //   420: pop
/*   */     //   421: invokevirtual matches : ()Z
/*   */     //   424: ifeq -> 434
/*   */     //   427: iload #11
/*   */     //   429: istore #9
/*   */     //   431: goto -> 443
/*   */     //   434: iinc #11, -1
/*   */     //   437: goto -> 398
/*   */     //   440: iload_1
/*   */     //   441: istore #9
/*   */     //   443: aload #7
/*   */     //   445: dup
/*   */     //   446: iload #9
/*   */     //   448: aload #7
/*   */     //   450: invokevirtual length : ()I
/*   */     //   453: iconst_1
/*   */     //   454: swap
/*   */     //   455: invokestatic Uw0 : (III)I
/*   */     //   458: istore #9
/*   */     //   460: iconst_0
/*   */     //   461: iload #9
/*   */     //   463: invokevirtual substring : (II)Ljava/lang/String;
/*   */     //   466: invokevirtual trim : ()Ljava/lang/String;
/*   */     //   469: astore #10
/*   */     //   471: iconst_0
/*   */     //   472: iload #9
/*   */     //   474: invokevirtual delete : (II)Ljava/lang/StringBuilder;
/*   */     //   477: pop
/*   */     //   478: aload #10
/*   */     //   480: invokevirtual isEmpty : ()Z
/*   */     //   483: ifne -> 165
/*   */     //   486: iload #4
/*   */     //   488: aload_3
/*   */     //   489: aload #10
/*   */     //   491: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   494: pop
/*   */     //   495: iconst_1
/*   */     //   496: if_icmplt -> 519
/*   */     //   499: iload #6
/*   */     //   501: iload #4
/*   */     //   503: if_icmpge -> 509
/*   */     //   506: goto -> 519
/*   */     //   509: aload_3
/*   */     //   510: ldc ' '
/*   */     //   512: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   515: pop
/*   */     //   516: goto -> 165
/*   */     //   519: aload_3
/*   */     //   520: aload_2
/*   */     //   521: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   524: pop
/*   */     //   525: iinc #6, 1
/*   */     //   528: goto -> 165
/*   */     //   531: iinc #8, 1
/*   */     //   534: goto -> 91
/*   */     //   537: aload_3
/*   */     //   538: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   541: areturn
/*   */     //   542: new java/lang/IllegalArgumentException
/*   */     //   545: dup
/*   */     //   546: invokespecial <init> : ()V
/*   */     //   549: athrow
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 274
/*   */     //   #2	-> 365
/*   */   }
/*   */   
/*   */   public static boolean xK(String paramString) {
/*   */     if (paramString.isEmpty())
/*   */       return true; 
/*   */     for (byte b = 0; b < paramString.length(); b++) {
/*   */       int i;
/*   */       if ((i = paramString.codePointAt(b)) != 32 && i != 9 && !Character.isWhitespace(i))
/*   */         return false; 
/*   */     } 
/*   */     return true;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/cS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */