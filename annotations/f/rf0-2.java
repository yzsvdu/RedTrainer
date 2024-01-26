/* 1 */ package f;public abstract class rf0 { public static final YE0 Gi0(String paramString, Object[] paramArrayOfObject) { YE0 yE0; Object object; if (((paramArrayOfObject != null && paramArrayOfObject.length != 0 && object = paramArrayOfObject[paramArrayOfObject.length - 1] instanceof Throwable) ? object : null) != null) if (paramArrayOfObject != null && paramArrayOfObject.length != 
/* 2 */         0) { int i; Object[] arrayOfObject = new Object[i = paramArrayOfObject.length - 1]; if (paramArrayOfObject.length - 1 > 0) System.arraycopy(paramArrayOfObject, 0, arrayOfObject, 0, i);  paramArrayOfObject = arrayOfObject; } else { throw new IllegalStateException("non-sensical empty or null argument array"); }   if (paramString == null)
/* 3 */     { this(null, paramArrayOfObject); } else { YE0 yE01; if (paramArrayOfObject == null)
/* 4 */       { this((String)yE0, null); yE0 = yE01; } else { StringBuilder stringBuilder; boolean bool = false;
/* 5 */         this(yE0.length() + 50); byte b = 0; while (true) { int i; if (b < yE01.length) { YE0 yE02; int j; if ((j = yE0.indexOf("{}", bool)) == -1) { if (!bool) { this((String)yE0, (Object[])yE01); yE0 = yE02; break; }  stringBuilder.append((CharSequence)yE0, yE02, yE0.length()); this(stringBuilder.toString(), (Object[])yE01); break; }  if ((j != 0 && yE0
/* 6 */               .charAt(j - 1) == '\\'))
/* 7 */             { if (!((j >= 2 && yE0.charAt(j - 2) == '\\') ? 1 : 0)) { b--; int k = j - 1; stringBuilder
/* 8 */                   .append((CharSequence)yE0, yE02, k); stringBuilder.append('{'); i = j + 1; } else { HashMap<Object, Object> hashMap; int k = j - 1; stringBuilder.append((CharSequence)yE0, i, k); YE0 yE03 = yE01[b]; this(); M90(stringBuilder, yE03, hashMap); i = j + 2; }  } else { HashMap<Object, Object> hashMap; stringBuilder.append((CharSequence)yE0, i, j); YE0 yE03 = yE01[b]; this(); M90(stringBuilder, yE03, hashMap); i = j + 2; }  b++; continue; }  stringBuilder.append((CharSequence)yE0, i, yE0.length()); this(stringBuilder.toString(), (Object[])yE01); break; }  }  }  return yE0; }
/*   */ 
/*   */   
/*   */   public static void M90(StringBuilder paramStringBuilder, Object paramObject, HashMap paramHashMap) {
/*   */     // Byte code:
/*   */     //   0: aload_1
/*   */     //   1: ifnonnull -> 12
/*   */     //   4: aload_0
/*   */     //   5: ldc 'null'
/*   */     //   7: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   10: pop
/*   */     //   11: return
/*   */     //   12: aload_1
/*   */     //   13: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   16: invokevirtual isArray : ()Z
/*   */     //   19: ifne -> 72
/*   */     //   22: aload_0
/*   */     //   23: aload_1
/*   */     //   24: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   27: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   30: pop
/*   */     //   31: goto -> 700
/*   */     //   34: astore_2
/*   */     //   35: aload_0
/*   */     //   36: ldc 'SLF4J: Failed toString() invocation on an object of type ['
/*   */     //   38: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   41: aload_1
/*   */     //   42: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   45: invokevirtual getName : ()Ljava/lang/String;
/*   */     //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   51: ldc ']'
/*   */     //   53: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   56: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   59: aload_2
/*   */     //   60: invokestatic SZ : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*   */     //   63: ldc '[FAILED toString()]'
/*   */     //   65: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   68: pop
/*   */     //   69: goto -> 700
/*   */     //   72: aload_1
/*   */     //   73: instanceof [Z
/*   */     //   76: ifeq -> 139
/*   */     //   79: aload_1
/*   */     //   80: checkcast [Z
/*   */     //   83: dup
/*   */     //   84: astore_1
/*   */     //   85: aload_0
/*   */     //   86: bipush #91
/*   */     //   88: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*   */     //   91: pop
/*   */     //   92: arraylength
/*   */     //   93: istore_2
/*   */     //   94: iconst_0
/*   */     //   95: istore_3
/*   */     //   96: iload_3
/*   */     //   97: iload_2
/*   */     //   98: if_icmpge -> 129
/*   */     //   101: iload_3
/*   */     //   102: iload_2
/*   */     //   103: aload_0
/*   */     //   104: aload_1
/*   */     //   105: iload_3
/*   */     //   106: baload
/*   */     //   107: invokevirtual append : (Z)Ljava/lang/StringBuilder;
/*   */     //   110: pop
/*   */     //   111: iconst_1
/*   */     //   112: isub
/*   */     //   113: if_icmpeq -> 123
/*   */     //   116: aload_0
/*   */     //   117: ldc ', '
/*   */     //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   122: pop
/*   */     //   123: iinc #3, 1
/*   */     //   126: goto -> 96
/*   */     //   129: aload_0
/*   */     //   130: bipush #93
/*   */     //   132: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*   */     //   135: pop
/*   */     //   136: goto -> 700
/*   */     //   139: aload_1
/*   */     //   140: instanceof [B
/*   */     //   143: ifeq -> 206
/*   */     //   146: aload_1
/*   */     //   147: checkcast [B
/*   */     //   150: dup
/*   */     //   151: astore_1
/*   */     //   152: aload_0
/*   */     //   153: bipush #91
/*   */     //   155: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*   */     //   158: pop
/*   */     //   159: arraylength
/*   */     //   160: istore_2
/*   */     //   161: iconst_0
/*   */     //   162: istore_3
/*   */     //   163: iload_3
/*   */     //   164: iload_2
/*   */     //   165: if_icmpge -> 196
/*   */     //   168: iload_3
/*   */     //   169: iload_2
/*   */     //   170: aload_0
/*   */     //   171: aload_1
/*   */     //   172: iload_3
/*   */     //   173: baload
/*   */     //   174: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*   */     //   177: pop
/*   */     //   178: iconst_1
/*   */     //   179: isub
/*   */     //   180: if_icmpeq -> 190
/*   */     //   183: aload_0
/*   */     //   184: ldc ', '
/*   */     //   186: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   189: pop
/*   */     //   190: iinc #3, 1
/*   */     //   193: goto -> 163
/*   */     //   196: aload_0
/*   */     //   197: bipush #93
/*   */     //   199: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*   */     //   202: pop
/*   */     //   203: goto -> 700
/*   */     //   206: aload_1
/*   */     //   207: instanceof [C
/*   */     //   210: ifeq -> 273
/*   */     //   213: aload_1
/*   */     //   214: checkcast [C
/*   */     //   217: dup
/*   */     //   218: astore_1
/*   */     //   219: aload_0
/*   */     //   220: bipush #91
/*   */     //   222: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*   */     //   225: pop
/*   */     //   226: arraylength
/*   */     //   227: istore_2
/*   */     //   228: iconst_0
/*   */     //   229: istore_3
/*   */     //   230: iload_3
/*   */     //   231: iload_2
/*   */     //   232: if_icmpge -> 263
/*   */     //   235: iload_3
/*   */     //   236: iload_2
/*   */     //   237: aload_0
/*   */     //   238: aload_1
/*   */     //   239: iload_3
/*   */     //   240: caload
/*   */     //   241: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*   */     //   244: pop
/*   */     //   245: iconst_1
/*   */     //   246: isub
/*   */     //   247: if_icmpeq -> 257
/*   */     //   250: aload_0
/*   */     //   251: ldc ', '
/*   */     //   253: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   256: pop
/*   */     //   257: iinc #3, 1
/*   */     //   260: goto -> 230
/*   */     //   263: aload_0
/*   */     //   264: bipush #93
/*   */     //   266: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*   */     //   269: pop
/*   */     //   270: goto -> 700
/*   */     //   273: aload_1
/*   */     //   274: instanceof [S
/*   */     //   277: ifeq -> 340
/*   */     //   280: aload_1
/*   */     //   281: checkcast [S
/*   */     //   284: dup
/*   */     //   285: astore_1
/*   */     //   286: aload_0
/*   */     //   287: bipush #91
/*   */     //   289: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*   */     //   292: pop
/*   */     //   293: arraylength
/*   */     //   294: istore_2
/*   */     //   295: iconst_0
/*   */     //   296: istore_3
/*   */     //   297: iload_3
/*   */     //   298: iload_2
/*   */     //   299: if_icmpge -> 330
/*   */     //   302: iload_3
/*   */     //   303: iload_2
/*   */     //   304: aload_0
/*   */     //   305: aload_1
/*   */     //   306: iload_3
/*   */     //   307: saload
/*   */     //   308: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*   */     //   311: pop
/*   */     //   312: iconst_1
/*   */     //   313: isub
/*   */     //   314: if_icmpeq -> 324
/*   */     //   317: aload_0
/*   */     //   318: ldc ', '
/*   */     //   320: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   323: pop
/*   */     //   324: iinc #3, 1
/*   */     //   327: goto -> 297
/*   */     //   330: aload_0
/*   */     //   331: bipush #93
/*   */     //   333: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*   */     //   336: pop
/*   */     //   337: goto -> 700
/*   */     //   340: aload_1
/*   */     //   341: instanceof [I
/*   */     //   344: ifeq -> 407
/*   */     //   347: aload_1
/*   */     //   348: checkcast [I
/*   */     //   351: dup
/*   */     //   352: astore_1
/*   */     //   353: aload_0
/*   */     //   354: bipush #91
/*   */     //   356: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*   */     //   359: pop
/*   */     //   360: arraylength
/*   */     //   361: istore_2
/*   */     //   362: iconst_0
/*   */     //   363: istore_3
/*   */     //   364: iload_3
/*   */     //   365: iload_2
/*   */     //   366: if_icmpge -> 397
/*   */     //   369: iload_3
/*   */     //   370: iload_2
/*   */     //   371: aload_0
/*   */     //   372: aload_1
/*   */     //   373: iload_3
/*   */     //   374: iaload
/*   */     //   375: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*   */     //   378: pop
/*   */     //   379: iconst_1
/*   */     //   380: isub
/*   */     //   381: if_icmpeq -> 391
/*   */     //   384: aload_0
/*   */     //   385: ldc ', '
/*   */     //   387: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   390: pop
/*   */     //   391: iinc #3, 1
/*   */     //   394: goto -> 364
/*   */     //   397: aload_0
/*   */     //   398: bipush #93
/*   */     //   400: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*   */     //   403: pop
/*   */     //   404: goto -> 700
/*   */     //   407: aload_1
/*   */     //   408: instanceof [J
/*   */     //   411: ifeq -> 474
/*   */     //   414: aload_1
/*   */     //   415: checkcast [J
/*   */     //   418: dup
/*   */     //   419: astore_1
/*   */     //   420: aload_0
/*   */     //   421: bipush #91
/*   */     //   423: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*   */     //   426: pop
/*   */     //   427: arraylength
/*   */     //   428: istore_2
/*   */     //   429: iconst_0
/*   */     //   430: istore_3
/*   */     //   431: iload_3
/*   */     //   432: iload_2
/*   */     //   433: if_icmpge -> 464
/*   */     //   436: iload_3
/*   */     //   437: iload_2
/*   */     //   438: aload_0
/*   */     //   439: aload_1
/*   */     //   440: iload_3
/*   */     //   441: laload
/*   */     //   442: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*   */     //   445: pop
/*   */     //   446: iconst_1
/*   */     //   447: isub
/*   */     //   448: if_icmpeq -> 458
/*   */     //   451: aload_0
/*   */     //   452: ldc ', '
/*   */     //   454: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   457: pop
/*   */     //   458: iinc #3, 1
/*   */     //   461: goto -> 431
/*   */     //   464: aload_0
/*   */     //   465: bipush #93
/*   */     //   467: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*   */     //   470: pop
/*   */     //   471: goto -> 700
/*   */     //   474: aload_1
/*   */     //   475: instanceof [F
/*   */     //   478: ifeq -> 541
/*   */     //   481: aload_1
/*   */     //   482: checkcast [F
/*   */     //   485: dup
/*   */     //   486: astore_1
/*   */     //   487: aload_0
/*   */     //   488: bipush #91
/*   */     //   490: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*   */     //   493: pop
/*   */     //   494: arraylength
/*   */     //   495: istore_2
/*   */     //   496: iconst_0
/*   */     //   497: istore_3
/*   */     //   498: iload_3
/*   */     //   499: iload_2
/*   */     //   500: if_icmpge -> 531
/*   */     //   503: iload_3
/*   */     //   504: iload_2
/*   */     //   505: aload_0
/*   */     //   506: aload_1
/*   */     //   507: iload_3
/*   */     //   508: faload
/*   */     //   509: invokevirtual append : (F)Ljava/lang/StringBuilder;
/*   */     //   512: pop
/*   */     //   513: iconst_1
/*   */     //   514: isub
/*   */     //   515: if_icmpeq -> 525
/*   */     //   518: aload_0
/*   */     //   519: ldc ', '
/*   */     //   521: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   524: pop
/*   */     //   525: iinc #3, 1
/*   */     //   528: goto -> 498
/*   */     //   531: aload_0
/*   */     //   532: bipush #93
/*   */     //   534: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*   */     //   537: pop
/*   */     //   538: goto -> 700
/*   */     //   541: aload_1
/*   */     //   542: instanceof [D
/*   */     //   545: ifeq -> 608
/*   */     //   548: aload_1
/*   */     //   549: checkcast [D
/*   */     //   552: dup
/*   */     //   553: astore_1
/*   */     //   554: aload_0
/*   */     //   555: bipush #91
/*   */     //   557: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*   */     //   560: pop
/*   */     //   561: arraylength
/*   */     //   562: istore_2
/*   */     //   563: iconst_0
/*   */     //   564: istore_3
/*   */     //   565: iload_3
/*   */     //   566: iload_2
/*   */     //   567: if_icmpge -> 598
/*   */     //   570: iload_3
/*   */     //   571: iload_2
/*   */     //   572: aload_0
/*   */     //   573: aload_1
/*   */     //   574: iload_3
/*   */     //   575: daload
/*   */     //   576: invokevirtual append : (D)Ljava/lang/StringBuilder;
/*   */     //   579: pop
/*   */     //   580: iconst_1
/*   */     //   581: isub
/*   */     //   582: if_icmpeq -> 592
/*   */     //   585: aload_0
/*   */     //   586: ldc ', '
/*   */     //   588: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   591: pop
/*   */     //   592: iinc #3, 1
/*   */     //   595: goto -> 565
/*   */     //   598: aload_0
/*   */     //   599: bipush #93
/*   */     //   601: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*   */     //   604: pop
/*   */     //   605: goto -> 700
/*   */     //   608: aload_2
/*   */     //   609: aload_0
/*   */     //   610: aload_1
/*   */     //   611: checkcast [Ljava/lang/Object;
/*   */     //   614: astore_1
/*   */     //   615: bipush #91
/*   */     //   617: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*   */     //   620: pop
/*   */     //   621: aload_1
/*   */     //   622: invokevirtual containsKey : (Ljava/lang/Object;)Z
/*   */     //   625: ifne -> 686
/*   */     //   628: aload_1
/*   */     //   629: aload_2
/*   */     //   630: aload_1
/*   */     //   631: aconst_null
/*   */     //   632: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   635: pop
/*   */     //   636: arraylength
/*   */     //   637: istore_3
/*   */     //   638: iconst_0
/*   */     //   639: istore #4
/*   */     //   641: iload #4
/*   */     //   643: iload_3
/*   */     //   644: if_icmpge -> 677
/*   */     //   647: iload #4
/*   */     //   649: iload_3
/*   */     //   650: aload_0
/*   */     //   651: aload_1
/*   */     //   652: iload #4
/*   */     //   654: aaload
/*   */     //   655: aload_2
/*   */     //   656: invokestatic M90 : (Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/util/HashMap;)V
/*   */     //   659: iconst_1
/*   */     //   660: isub
/*   */     //   661: if_icmpeq -> 671
/*   */     //   664: aload_0
/*   */     //   665: ldc ', '
/*   */     //   667: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   670: pop
/*   */     //   671: iinc #4, 1
/*   */     //   674: goto -> 641
/*   */     //   677: aload_2
/*   */     //   678: aload_1
/*   */     //   679: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   682: pop
/*   */     //   683: goto -> 693
/*   */     //   686: aload_0
/*   */     //   687: ldc '...'
/*   */     //   689: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   692: pop
/*   */     //   693: aload_0
/*   */     //   694: bipush #93
/*   */     //   696: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*   */     //   699: pop
/*   */     //   700: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 24
/*   */     //   #2	-> 36
/*   */     //   #3	-> 42
/*   */     //   #4	-> 73
/*   */     //   #5	-> 88
/*   */     //   #6	-> 140
/*   */     //   #7	-> 155
/*   */     //   #8	-> 207
/*   */     //   #9	-> 222
/*   */     //   #10	-> 274
/*   */     //   #11	-> 289
/*   */     //   #12	-> 341
/*   */     //   #13	-> 356
/*   */     //   #14	-> 408
/*   */     //   #15	-> 423
/*   */     //   #16	-> 475
/*   */     //   #17	-> 490
/*   */     //   #18	-> 542
/*   */     //   #19	-> 557
/*   */     //   #20	-> 611
/*   */     //   #21	-> 617
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   22	30	34	finally
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/rf0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */