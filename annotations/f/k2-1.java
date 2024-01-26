/* 1 */ package f;public final class k2 extends Fy0 { public static byte AL0(qc0 paramqc0, UD0 paramUD0) { byte b1; byte b2; byte b3; for (b1 = -1, b2 = 0, b3 = 0; b3 < paramUD0.Uf; )
/* 2 */     { short s = paramUD0.AP;
/* 3 */       if (paramqc0.cu0((byte)0, b3, s) && b1 < 0) b1 = b3; 
/* 4 */       s = paramUD0.AP;
/* 5 */       if (paramqc0.cu0((byte)1, b3, s) && (b1 < 0 || !b2)) { b2 = b1 = 1; b1 = b3; }
/* 6 */        s = paramUD0.AP;
/* 7 */       if (paramqc0.cu0((byte)2, b3, s)) { b1 = b3; break; }  b3 = (byte)(b3 + 1); }  return (b1 < 0) ? 0 : b1; }
/*   */ 
/*   */   
/*   */   public k2(Hy paramHy, UD0 paramUD0, byte paramByte1, byte paramByte2) {
/*   */     // Byte code:
/*   */     //   0: ldc '999'
/*   */     //   2: astore #5
/*   */     //   4: invokestatic XU : ()Z
/*   */     //   7: ifeq -> 17
/*   */     //   10: bipush #96
/*   */     //   12: istore #6
/*   */     //   14: goto -> 21
/*   */     //   17: bipush #46
/*   */     //   19: istore #6
/*   */     //   21: invokestatic XU : ()Z
/*   */     //   24: ifeq -> 34
/*   */     //   27: bipush #96
/*   */     //   29: istore #7
/*   */     //   31: goto -> 38
/*   */     //   34: bipush #46
/*   */     //   36: istore #7
/*   */     //   38: aload_1
/*   */     //   39: dup
/*   */     //   40: dup2
/*   */     //   41: aload_0
/*   */     //   42: aload #5
/*   */     //   44: iload #6
/*   */     //   46: iload #7
/*   */     //   48: invokespecial <init> : (Ljava/lang/String;II)V
/*   */     //   51: invokevirtual H60 : ()Lf/qc0;
/*   */     //   54: aload_2
/*   */     //   55: invokevirtual Uf : ()S
/*   */     //   58: iconst_0
/*   */     //   59: swap
/*   */     //   60: invokevirtual JO : (BS)Z
/*   */     //   63: istore #5
/*   */     //   65: invokevirtual H60 : ()Lf/qc0;
/*   */     //   68: aload_2
/*   */     //   69: invokevirtual Uf : ()S
/*   */     //   72: iconst_1
/*   */     //   73: swap
/*   */     //   74: invokevirtual JO : (BS)Z
/*   */     //   77: istore #6
/*   */     //   79: invokevirtual H60 : ()Lf/qc0;
/*   */     //   82: aload_2
/*   */     //   83: invokevirtual Uf : ()S
/*   */     //   86: iconst_2
/*   */     //   87: swap
/*   */     //   88: invokevirtual JO : (BS)Z
/*   */     //   91: istore #7
/*   */     //   93: invokevirtual H60 : ()Lf/qc0;
/*   */     //   96: aload_2
/*   */     //   97: invokevirtual Uf : ()S
/*   */     //   100: iconst_3
/*   */     //   101: swap
/*   */     //   102: invokevirtual JO : (BS)Z
/*   */     //   105: ifeq -> 121
/*   */     //   108: iload #4
/*   */     //   110: bipush #-2
/*   */     //   112: if_icmpne -> 121
/*   */     //   115: iconst_1
/*   */     //   116: istore #8
/*   */     //   118: goto -> 124
/*   */     //   121: iconst_0
/*   */     //   122: istore #8
/*   */     //   124: aload_2
/*   */     //   125: invokevirtual Tb : ()B
/*   */     //   128: iconst_1
/*   */     //   129: if_icmple -> 264
/*   */     //   132: aload_1
/*   */     //   133: invokevirtual H60 : ()Lf/qc0;
/*   */     //   136: aload_2
/*   */     //   137: invokevirtual Uf : ()S
/*   */     //   140: invokevirtual hp0 : (S)I
/*   */     //   143: ifne -> 191
/*   */     //   146: iload_3
/*   */     //   147: ifge -> 152
/*   */     //   150: iconst_0
/*   */     //   151: istore_3
/*   */     //   152: iload #5
/*   */     //   154: ifeq -> 167
/*   */     //   157: iload_3
/*   */     //   158: ifne -> 167
/*   */     //   161: iconst_1
/*   */     //   162: istore #9
/*   */     //   164: goto -> 170
/*   */     //   167: iconst_0
/*   */     //   168: istore #9
/*   */     //   170: iload #6
/*   */     //   172: ifeq -> 185
/*   */     //   175: iload_3
/*   */     //   176: ifne -> 185
/*   */     //   179: iconst_1
/*   */     //   180: istore #6
/*   */     //   182: goto -> 268
/*   */     //   185: iconst_0
/*   */     //   186: istore #6
/*   */     //   188: goto -> 268
/*   */     //   191: iload_3
/*   */     //   192: ifge -> 204
/*   */     //   195: aload_1
/*   */     //   196: invokevirtual H60 : ()Lf/qc0;
/*   */     //   199: aload_2
/*   */     //   200: invokestatic AL0 : (Lf/qc0;Lf/UD0;)B
/*   */     //   203: istore_3
/*   */     //   204: aload_1
/*   */     //   205: dup
/*   */     //   206: dup
/*   */     //   207: invokevirtual H60 : ()Lf/qc0;
/*   */     //   210: aload_2
/*   */     //   211: invokevirtual Uf : ()S
/*   */     //   214: istore #6
/*   */     //   216: iconst_0
/*   */     //   217: iload_3
/*   */     //   218: iload #6
/*   */     //   220: invokevirtual cu0 : (BIS)Z
/*   */     //   223: istore #9
/*   */     //   225: invokevirtual H60 : ()Lf/qc0;
/*   */     //   228: aload_2
/*   */     //   229: invokevirtual Uf : ()S
/*   */     //   232: istore #6
/*   */     //   234: iconst_1
/*   */     //   235: iload_3
/*   */     //   236: iload #6
/*   */     //   238: invokevirtual cu0 : (BIS)Z
/*   */     //   241: istore #6
/*   */     //   243: invokevirtual H60 : ()Lf/qc0;
/*   */     //   246: aload_2
/*   */     //   247: invokevirtual Uf : ()S
/*   */     //   250: istore #7
/*   */     //   252: iconst_2
/*   */     //   253: iload_3
/*   */     //   254: iload #7
/*   */     //   256: invokevirtual cu0 : (BIS)Z
/*   */     //   259: istore #7
/*   */     //   261: goto -> 268
/*   */     //   264: iload #5
/*   */     //   266: istore #9
/*   */     //   268: iload #9
/*   */     //   270: aload_0
/*   */     //   271: invokevirtual zY : ()Lf/rH;
/*   */     //   274: iconst_1
/*   */     //   275: anewarray f/zh0
/*   */     //   278: dup
/*   */     //   279: invokestatic TK0 : ()Lf/um0;
/*   */     //   282: iload_3
/*   */     //   283: aload_2
/*   */     //   284: invokevirtual Uf : ()S
/*   */     //   287: invokestatic HZ : (BS)S
/*   */     //   290: iload #8
/*   */     //   292: iconst_0
/*   */     //   293: invokevirtual lb : (SZB)[Lf/zh0;
/*   */     //   296: iconst_0
/*   */     //   297: aaload
/*   */     //   298: iconst_0
/*   */     //   299: swap
/*   */     //   300: aastore
/*   */     //   301: invokevirtual sm : ([Lf/zh0;)V
/*   */     //   304: ifne -> 326
/*   */     //   307: aload_0
/*   */     //   308: invokevirtual zY : ()Lf/rH;
/*   */     //   311: new f/pRn
/*   */     //   314: dup
/*   */     //   315: iconst_0
/*   */     //   316: iconst_0
/*   */     //   317: iconst_0
/*   */     //   318: bipush #-76
/*   */     //   320: invokespecial <init> : (BBBB)V
/*   */     //   323: invokevirtual FB0 : (Lf/pRn;)V
/*   */     //   326: invokestatic XU : ()Z
/*   */     //   329: ifeq -> 355
/*   */     //   332: aload_0
/*   */     //   333: dup
/*   */     //   334: invokevirtual zY : ()Lf/rH;
/*   */     //   337: fconst_2
/*   */     //   338: invokevirtual Ii0 : (F)V
/*   */     //   341: invokevirtual zY : ()Lf/rH;
/*   */     //   344: bipush #11
/*   */     //   346: bipush #-6
/*   */     //   348: invokevirtual zT : (II)Lf/JG0;
/*   */     //   351: pop
/*   */     //   352: goto -> 366
/*   */     //   355: aload_0
/*   */     //   356: invokevirtual zY : ()Lf/rH;
/*   */     //   359: iconst_5
/*   */     //   360: bipush #-6
/*   */     //   362: invokevirtual zT : (II)Lf/JG0;
/*   */     //   365: pop
/*   */     //   366: iload #5
/*   */     //   368: aload_0
/*   */     //   369: ldc 'monsterdex-button'
/*   */     //   371: invokevirtual Xu : (Ljava/lang/String;)V
/*   */     //   374: ifne -> 390
/*   */     //   377: aload_0
/*   */     //   378: getstatic f/gm.By0 : Z
/*   */     //   381: pop
/*   */     //   382: ldc '???'
/*   */     //   384: invokevirtual Gq0 : (Ljava/lang/Object;)V
/*   */     //   387: goto -> 398
/*   */     //   390: aload_0
/*   */     //   391: aload_2
/*   */     //   392: invokevirtual wp : ()Ljava/lang/String;
/*   */     //   395: invokevirtual Gq0 : (Ljava/lang/Object;)V
/*   */     //   398: iload #8
/*   */     //   400: ifeq -> 412
/*   */     //   403: aload_0
/*   */     //   404: ldc 'monsterdex-button-caught-alpha'
/*   */     //   406: invokevirtual Xu : (Ljava/lang/String;)V
/*   */     //   409: goto -> 448
/*   */     //   412: iload #4
/*   */     //   414: bipush #-2
/*   */     //   416: if_icmpeq -> 448
/*   */     //   419: iload #7
/*   */     //   421: ifne -> 442
/*   */     //   424: iload #6
/*   */     //   426: getstatic f/gm.By0 : Z
/*   */     //   429: pop
/*   */     //   430: ifeq -> 448
/*   */     //   433: aload_0
/*   */     //   434: ldc 'monsterdex-button-caught'
/*   */     //   436: invokevirtual Xu : (Ljava/lang/String;)V
/*   */     //   439: goto -> 448
/*   */     //   442: aload_0
/*   */     //   443: ldc 'monsterdex-button-caught-ot'
/*   */     //   445: invokevirtual Xu : (Ljava/lang/String;)V
/*   */     //   448: aload_0
/*   */     //   449: dup
/*   */     //   450: aload_1
/*   */     //   451: aload_2
/*   */     //   452: aload_0
/*   */     //   453: new java/text/DecimalFormat
/*   */     //   456: dup
/*   */     //   457: astore_0
/*   */     //   458: aload_2
/*   */     //   459: iload #4
/*   */     //   461: aload_0
/*   */     //   462: ldc '000'
/*   */     //   464: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   467: invokevirtual PP : (B)S
/*   */     //   470: i2l
/*   */     //   471: invokevirtual format : (J)Ljava/lang/String;
/*   */     //   474: invokevirtual s6 : (Ljava/lang/String;)V
/*   */     //   477: iload_3
/*   */     //   478: <illegal opcode> run : (Lf/Hy;Lf/UD0;B)Ljava/lang/Runnable;
/*   */     //   483: invokevirtual tW : (Ljava/lang/Runnable;)V
/*   */     //   486: sipush #200
/*   */     //   489: invokevirtual Pb0 : (I)V
/*   */     //   492: return
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/k2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */