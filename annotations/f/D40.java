/* 1 */ package f;public final class D40 extends x60 { public static void OU(String paramString, int paramInt1, boolean paramBoolean, int paramInt2, cu0 paramcu0) { for (Iterator<tc> iterator = km.a3.iterator(); iterator.hasNext();) { if ((tc = iterator.next()).zl()) ((Or)tc.default()).COm5 = null;  }  hX hX; (hX = hX.IV()).getClass();
/* 2 */     String str = N.Gl0((new StringBuilder()).append(hX.dH).append("/model_LOD"), hX.hH, ".g3db");
/* 3 */     if ((hX.IV()).th0.Ek0(str)) hX.th0.zu(str); 
/* 4 */     hX.q2 = true; hX.dH = paramString; hX.rb = paramInt1; hX.hH = paramInt2; hX.ax0 = paramcu0; }
/*   */ 
/*   */   
/*   */   public D40() {
/*   */     super("/modeltest");
/*   */   }
/*   */   
/*   */   public final void Da0(String[] paramArrayOfString) {
/*   */     // Byte code:
/*   */     //   0: aload_1
/*   */     //   1: arraylength
/*   */     //   2: iconst_2
/*   */     //   3: if_icmpge -> 23
/*   */     //   6: iconst_0
/*   */     //   7: putstatic f/hX.q2 : Z
/*   */     //   10: getstatic f/km.u4 : Lf/R8;
/*   */     //   13: getstatic f/ZY.ih : Lf/ZY;
/*   */     //   16: ldc '/modeltest [model] [scale=64] [transparency=false] [lod=0] [filter=Nearest]'
/*   */     //   18: swap
/*   */     //   19: invokevirtual oD : (Ljava/lang/String;Lf/ZY;)V
/*   */     //   22: return
/*   */     //   23: aload_1
/*   */     //   24: iconst_1
/*   */     //   25: aaload
/*   */     //   26: dup
/*   */     //   27: astore_0
/*   */     //   28: invokevirtual isEmpty : ()Z
/*   */     //   31: ifne -> 402
/*   */     //   34: aload_0
/*   */     //   35: ldc '^[a-zA-Z0-9_\-]+$'
/*   */     //   37: invokevirtual matches : (Ljava/lang/String;)Z
/*   */     //   40: ifne -> 46
/*   */     //   43: goto -> 402
/*   */     //   46: aload_1
/*   */     //   47: bipush #64
/*   */     //   49: istore_2
/*   */     //   50: arraylength
/*   */     //   51: iconst_2
/*   */     //   52: if_icmple -> 78
/*   */     //   55: aload_1
/*   */     //   56: iconst_2
/*   */     //   57: aaload
/*   */     //   58: invokestatic parseInt : (Ljava/lang/String;)I
/*   */     //   61: istore_2
/*   */     //   62: goto -> 78
/*   */     //   65: pop
/*   */     //   66: getstatic f/km.u4 : Lf/R8;
/*   */     //   69: getstatic f/ZY.ih : Lf/ZY;
/*   */     //   72: ldc 'Invalid scale'
/*   */     //   74: swap
/*   */     //   75: invokevirtual oD : (Ljava/lang/String;Lf/ZY;)V
/*   */     //   78: aload_1
/*   */     //   79: iconst_0
/*   */     //   80: istore_3
/*   */     //   81: arraylength
/*   */     //   82: iconst_3
/*   */     //   83: if_icmple -> 109
/*   */     //   86: aload_1
/*   */     //   87: iconst_3
/*   */     //   88: aaload
/*   */     //   89: invokestatic parseBoolean : (Ljava/lang/String;)Z
/*   */     //   92: istore_3
/*   */     //   93: goto -> 109
/*   */     //   96: pop
/*   */     //   97: getstatic f/km.u4 : Lf/R8;
/*   */     //   100: getstatic f/ZY.ih : Lf/ZY;
/*   */     //   103: ldc 'Invalid transparency'
/*   */     //   105: swap
/*   */     //   106: invokevirtual oD : (Ljava/lang/String;Lf/ZY;)V
/*   */     //   109: aload_1
/*   */     //   110: iconst_0
/*   */     //   111: istore #4
/*   */     //   113: arraylength
/*   */     //   114: iconst_4
/*   */     //   115: if_icmple -> 142
/*   */     //   118: aload_1
/*   */     //   119: iconst_4
/*   */     //   120: aaload
/*   */     //   121: invokestatic parseInt : (Ljava/lang/String;)I
/*   */     //   124: istore #4
/*   */     //   126: goto -> 142
/*   */     //   129: pop
/*   */     //   130: getstatic f/km.u4 : Lf/R8;
/*   */     //   133: getstatic f/ZY.ih : Lf/ZY;
/*   */     //   136: ldc 'Invalid lod'
/*   */     //   138: swap
/*   */     //   139: invokevirtual oD : (Ljava/lang/String;Lf/ZY;)V
/*   */     //   142: aload_1
/*   */     //   143: getstatic f/cu0.Fh : Lf/cu0;
/*   */     //   146: astore #5
/*   */     //   148: arraylength
/*   */     //   149: iconst_5
/*   */     //   150: if_icmple -> 177
/*   */     //   153: aload_1
/*   */     //   154: iconst_5
/*   */     //   155: aaload
/*   */     //   156: invokestatic valueOf : (Ljava/lang/String;)Lf/cu0;
/*   */     //   159: astore #5
/*   */     //   161: goto -> 177
/*   */     //   164: pop
/*   */     //   165: getstatic f/km.u4 : Lf/R8;
/*   */     //   168: getstatic f/ZY.ih : Lf/ZY;
/*   */     //   171: ldc 'Invalid filter'
/*   */     //   173: swap
/*   */     //   174: invokevirtual oD : (Ljava/lang/String;Lf/ZY;)V
/*   */     //   177: getstatic f/km.u4 : Lf/R8;
/*   */     //   180: new java/lang/StringBuilder
/*   */     //   183: dup
/*   */     //   184: invokespecial <init> : ()V
/*   */     //   187: ldc 'Set model test to: ''
/*   */     //   189: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   192: aload_0
/*   */     //   193: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   196: ldc '' scale '
/*   */     //   198: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   201: iload_2
/*   */     //   202: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*   */     //   205: ldc ' transparency = '
/*   */     //   207: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   210: iload_3
/*   */     //   211: invokevirtual append : (Z)Ljava/lang/StringBuilder;
/*   */     //   214: ldc ' LOD '
/*   */     //   216: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   219: iload #4
/*   */     //   221: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*   */     //   224: ldc ' filter '
/*   */     //   226: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   229: aload #5
/*   */     //   231: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*   */     //   234: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   237: getstatic f/ZY.ih : Lf/ZY;
/*   */     //   240: invokevirtual oD : (Ljava/lang/String;Lf/ZY;)V
/*   */     //   243: getstatic f/hX.q2 : Z
/*   */     //   246: ifeq -> 272
/*   */     //   249: iconst_0
/*   */     //   250: putstatic f/hX.q2 : Z
/*   */     //   253: getstatic f/UB0.Kg0 : Lf/Q50;
/*   */     //   256: aload_0
/*   */     //   257: iload_2
/*   */     //   258: iload_3
/*   */     //   259: iload #4
/*   */     //   261: aload #5
/*   */     //   263: <illegal opcode> run : (Ljava/lang/String;IZILf/cu0;)Ljava/lang/Runnable;
/*   */     //   268: invokevirtual fN : (Ljava/lang/Runnable;)V
/*   */     //   271: return
/*   */     //   272: getstatic f/km.a3 : Lf/vh0;
/*   */     //   275: invokevirtual iterator : ()Ljava/util/Iterator;
/*   */     //   278: astore_1
/*   */     //   279: aload_1
/*   */     //   280: invokeinterface hasNext : ()Z
/*   */     //   285: ifeq -> 319
/*   */     //   288: aload_1
/*   */     //   289: invokeinterface next : ()Ljava/lang/Object;
/*   */     //   294: checkcast f/tc
/*   */     //   297: dup
/*   */     //   298: astore_3
/*   */     //   299: invokevirtual zl : ()Z
/*   */     //   302: ifeq -> 279
/*   */     //   305: aload_3
/*   */     //   306: invokevirtual default : ()Lf/static;
/*   */     //   309: checkcast f/Or
/*   */     //   312: aconst_null
/*   */     //   313: putfield COm5 : Lf/lpt1;
/*   */     //   316: goto -> 279
/*   */     //   319: invokestatic IV : ()Lf/hX;
/*   */     //   322: dup
/*   */     //   323: dup
/*   */     //   324: astore_1
/*   */     //   325: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   328: pop
/*   */     //   329: new java/lang/StringBuilder
/*   */     //   332: dup
/*   */     //   333: invokespecial <init> : ()V
/*   */     //   336: getstatic f/hX.dH : Ljava/lang/String;
/*   */     //   339: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   342: ldc '/model_LOD'
/*   */     //   344: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   347: getstatic f/hX.hH : I
/*   */     //   350: ldc '.g3db'
/*   */     //   352: invokestatic Gl0 : (Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;
/*   */     //   355: astore_3
/*   */     //   356: getfield th0 : Lf/sz0;
/*   */     //   359: aload_3
/*   */     //   360: invokevirtual Ek0 : (Ljava/lang/String;)Z
/*   */     //   363: ifeq -> 374
/*   */     //   366: aload_1
/*   */     //   367: getfield th0 : Lf/sz0;
/*   */     //   370: aload_3
/*   */     //   371: invokevirtual zu : (Ljava/lang/String;)V
/*   */     //   374: aload #5
/*   */     //   376: iload #4
/*   */     //   378: iload_2
/*   */     //   379: aload_0
/*   */     //   380: iconst_1
/*   */     //   381: putstatic f/hX.q2 : Z
/*   */     //   384: putstatic f/hX.dH : Ljava/lang/String;
/*   */     //   387: i2f
/*   */     //   388: putstatic f/hX.rb : F
/*   */     //   391: getstatic f/hX.q2 : Z
/*   */     //   394: pop
/*   */     //   395: putstatic f/hX.hH : I
/*   */     //   398: putstatic f/hX.ax0 : Lf/cu0;
/*   */     //   401: return
/*   */     //   402: iconst_0
/*   */     //   403: putstatic f/hX.q2 : Z
/*   */     //   406: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 329
/*   */     //   #2	-> 350
/*   */     //   #3	-> 356
/*   */     //   #4	-> 381
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   55	61	65	java/lang/NumberFormatException
/*   */     //   86	92	96	java/lang/NumberFormatException
/*   */     //   118	124	129	java/lang/NumberFormatException
/*   */     //   153	159	164	java/lang/Exception
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/D40.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */