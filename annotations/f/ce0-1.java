/* 1 */ package f;public final class ce0 extends xk { public final boolean i2() { R30 r30; if ((r30 = this.Y40) == null) return false;  int i = (int)(this.fI / r30.aB); if (r30.Bs.length - 1 < i) { i = 1; } else { i = 0; }  return i; }
/*   */ 
/*   */   
/*   */   public final long oA0 = zm0.zg();
/*   */   public final int ZA;
/*   */   public final int tl0;
/*   */   public final int gB;
/*   */   public int Tb0 = 100;
/*   */   public byte xs0;
/*   */   public R30 Y40;
/*   */   public uT Gt0;
/*   */   public float fI;
/*   */   
/*   */   public ce0(byte paramByte, int paramInt1, int paramInt2, int paramInt3) {
/*   */     this.xs0 = paramByte;
/*   */     this.ZA = paramInt1;
/*   */     this.tl0 = paramInt2;
/*   */     this.gB = paramInt3;
/*   */   }
/*   */   
/*   */   public final void tZ(K70 paramK70, fo0 paramfo0, Ih0 paramIh0, float paramFloat1, float paramFloat2, float paramFloat3) {
/*   */     // Byte code:
/*   */     //   0: getstatic f/zm0.u20 : J
/*   */     //   3: aload_0
/*   */     //   4: getfield oA0 : J
/*   */     //   7: lsub
/*   */     //   8: aload_0
/*   */     //   9: getfield tl0 : I
/*   */     //   12: aload_0
/*   */     //   13: getfield ZA : I
/*   */     //   16: iadd
/*   */     //   17: i2l
/*   */     //   18: lcmp
/*   */     //   19: ifge -> 23
/*   */     //   22: return
/*   */     //   23: aload_0
/*   */     //   24: getfield Gt0 : Lf/uT;
/*   */     //   27: dup
/*   */     //   28: astore #7
/*   */     //   30: ifnull -> 146
/*   */     //   33: aload_0
/*   */     //   34: getfield xs0 : B
/*   */     //   37: dup
/*   */     //   38: istore #4
/*   */     //   40: iconst_2
/*   */     //   41: if_icmpeq -> 85
/*   */     //   44: iload #4
/*   */     //   46: iconst_3
/*   */     //   47: if_icmpeq -> 59
/*   */     //   50: iload #4
/*   */     //   52: iconst_4
/*   */     //   53: if_icmpeq -> 85
/*   */     //   56: goto -> 101
/*   */     //   59: aload #7
/*   */     //   61: aload_3
/*   */     //   62: getfield nj0 : Lf/eo;
/*   */     //   65: getstatic f/uT.HO : Lf/eo;
/*   */     //   68: dup
/*   */     //   69: astore_3
/*   */     //   70: fconst_0
/*   */     //   71: fconst_1
/*   */     //   72: fconst_0
/*   */     //   73: invokevirtual TG0 : (FFF)Lf/eo;
/*   */     //   76: pop
/*   */     //   77: aload_3
/*   */     //   78: swap
/*   */     //   79: invokevirtual W5 : (Lf/eo;Lf/eo;)V
/*   */     //   82: goto -> 101
/*   */     //   85: aload #7
/*   */     //   87: aload_3
/*   */     //   88: dup
/*   */     //   89: getfield H : Lf/eo;
/*   */     //   92: astore_3
/*   */     //   93: getfield nj0 : Lf/eo;
/*   */     //   96: aload_3
/*   */     //   97: swap
/*   */     //   98: invokevirtual si : (Lf/eo;Lf/eo;)V
/*   */     //   101: aload_1
/*   */     //   102: aload_0
/*   */     //   103: dup
/*   */     //   104: dup2
/*   */     //   105: getfield fI : F
/*   */     //   108: getstatic f/UB0.M60 : Lf/w70;
/*   */     //   111: getfield Qy : F
/*   */     //   114: fadd
/*   */     //   115: dup
/*   */     //   116: fstore_1
/*   */     //   117: putfield fI : F
/*   */     //   120: getfield Gt0 : Lf/uT;
/*   */     //   123: aload_0
/*   */     //   124: getfield Y40 : Lf/R30;
/*   */     //   127: fload_1
/*   */     //   128: invokevirtual Hf : (F)Ljava/lang/Object;
/*   */     //   131: checkcast f/pe0
/*   */     //   134: iconst_0
/*   */     //   135: invokevirtual sA0 : (Lf/pe0;Z)V
/*   */     //   138: getfield Gt0 : Lf/uT;
/*   */     //   141: aload_2
/*   */     //   142: invokevirtual q10 : (Lf/tk;Lf/fo0;)V
/*   */     //   145: return
/*   */     //   146: aload_0
/*   */     //   147: invokestatic vY : ()Lf/zp0;
/*   */     //   150: aload_0
/*   */     //   151: dup
/*   */     //   152: getfield xs0 : B
/*   */     //   155: istore_1
/*   */     //   156: getfield gB : I
/*   */     //   159: iload_1
/*   */     //   160: invokevirtual mF0 : (IB)[Lf/pe0;
/*   */     //   163: dup
/*   */     //   164: astore_1
/*   */     //   165: iconst_0
/*   */     //   166: aaload
/*   */     //   167: astore_2
/*   */     //   168: bipush #32
/*   */     //   170: bipush #32
/*   */     //   172: aload_2
/*   */     //   173: invokestatic xz : (IILf/pe0;)Lf/uT;
/*   */     //   176: dup
/*   */     //   177: astore_2
/*   */     //   178: aload_3
/*   */     //   179: dup
/*   */     //   180: aload_0
/*   */     //   181: aload_2
/*   */     //   182: putfield Gt0 : Lf/uT;
/*   */     //   185: getfield H : Lf/eo;
/*   */     //   188: astore_2
/*   */     //   189: getfield nj0 : Lf/eo;
/*   */     //   192: aload_2
/*   */     //   193: swap
/*   */     //   194: invokevirtual si : (Lf/eo;Lf/eo;)V
/*   */     //   197: getfield xs0 : B
/*   */     //   200: dup
/*   */     //   201: istore_2
/*   */     //   202: iconst_2
/*   */     //   203: if_icmpeq -> 387
/*   */     //   206: iload_2
/*   */     //   207: iconst_3
/*   */     //   208: if_icmpeq -> 271
/*   */     //   211: iload_2
/*   */     //   212: iconst_4
/*   */     //   213: if_icmpeq -> 219
/*   */     //   216: goto -> 418
/*   */     //   219: aload_0
/*   */     //   220: dup
/*   */     //   221: dup
/*   */     //   222: getfield Gt0 : Lf/uT;
/*   */     //   225: ldc 0.0125
/*   */     //   227: invokevirtual zO : (F)V
/*   */     //   230: getfield Gt0 : Lf/uT;
/*   */     //   233: fload #4
/*   */     //   235: fload #6
/*   */     //   237: fload #5
/*   */     //   239: ldc 0.24
/*   */     //   241: fadd
/*   */     //   242: fstore_2
/*   */     //   243: ldc 0.08
/*   */     //   245: fadd
/*   */     //   246: fload_2
/*   */     //   247: swap
/*   */     //   248: invokevirtual WQ : (FFF)V
/*   */     //   251: getfield Gt0 : Lf/uT;
/*   */     //   254: aload_3
/*   */     //   255: dup
/*   */     //   256: getfield H : Lf/eo;
/*   */     //   259: astore_2
/*   */     //   260: getfield nj0 : Lf/eo;
/*   */     //   263: aload_2
/*   */     //   264: swap
/*   */     //   265: invokevirtual si : (Lf/eo;Lf/eo;)V
/*   */     //   268: goto -> 418
/*   */     //   271: aload_0
/*   */     //   272: getfield gB : I
/*   */     //   275: bipush #9
/*   */     //   277: if_icmpne -> 343
/*   */     //   280: aload_0
/*   */     //   281: dup
/*   */     //   282: dup
/*   */     //   283: getfield Gt0 : Lf/uT;
/*   */     //   286: ldc 0.00755
/*   */     //   288: invokevirtual zO : (F)V
/*   */     //   291: getfield Gt0 : Lf/uT;
/*   */     //   294: fload #4
/*   */     //   296: fload #6
/*   */     //   298: fload #5
/*   */     //   300: ldc 0.04
/*   */     //   302: fadd
/*   */     //   303: fstore_2
/*   */     //   304: ldc 0.03
/*   */     //   306: fadd
/*   */     //   307: fload_2
/*   */     //   308: swap
/*   */     //   309: invokevirtual WQ : (FFF)V
/*   */     //   312: getfield Gt0 : Lf/uT;
/*   */     //   315: dup
/*   */     //   316: aload_3
/*   */     //   317: getfield nj0 : Lf/eo;
/*   */     //   320: astore_2
/*   */     //   321: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   324: pop
/*   */     //   325: getstatic f/uT.HO : Lf/eo;
/*   */     //   328: dup
/*   */     //   329: fconst_0
/*   */     //   330: fconst_1
/*   */     //   331: fconst_0
/*   */     //   332: invokevirtual TG0 : (FFF)Lf/eo;
/*   */     //   335: pop
/*   */     //   336: aload_2
/*   */     //   337: invokevirtual W5 : (Lf/eo;Lf/eo;)V
/*   */     //   340: goto -> 418
/*   */     //   343: aload_0
/*   */     //   344: dup
/*   */     //   345: dup
/*   */     //   346: getfield Gt0 : Lf/uT;
/*   */     //   349: ldc 0.0151
/*   */     //   351: invokevirtual zO : (F)V
/*   */     //   354: getfield Gt0 : Lf/uT;
/*   */     //   357: fload #4
/*   */     //   359: fload #6
/*   */     //   361: fload #5
/*   */     //   363: ldc 0.16
/*   */     //   365: fadd
/*   */     //   366: fstore_2
/*   */     //   367: ldc 0.025
/*   */     //   369: fsub
/*   */     //   370: fload_2
/*   */     //   371: swap
/*   */     //   372: invokevirtual WQ : (FFF)V
/*   */     //   375: getfield Gt0 : Lf/uT;
/*   */     //   378: dup
/*   */     //   379: aload_3
/*   */     //   380: getfield nj0 : Lf/eo;
/*   */     //   383: astore_2
/*   */     //   384: goto -> 321
/*   */     //   387: aload_0
/*   */     //   388: dup
/*   */     //   389: getfield Gt0 : Lf/uT;
/*   */     //   392: fload #4
/*   */     //   394: fload #6
/*   */     //   396: fload #5
/*   */     //   398: ldc 0.25
/*   */     //   400: fadd
/*   */     //   401: fstore_2
/*   */     //   402: ldc 0.075
/*   */     //   404: fadd
/*   */     //   405: fload_2
/*   */     //   406: swap
/*   */     //   407: invokevirtual WQ : (FFF)V
/*   */     //   410: getfield Gt0 : Lf/uT;
/*   */     //   413: ldc 0.01275
/*   */     //   415: invokevirtual zO : (F)V
/*   */     //   418: aload_0
/*   */     //   419: dup
/*   */     //   420: getfield Gt0 : Lf/uT;
/*   */     //   423: getstatic f/Xi.WB : Z
/*   */     //   426: invokevirtual lM : (Z)V
/*   */     //   429: getfield Y40 : Lf/R30;
/*   */     //   432: ifnonnull -> 463
/*   */     //   435: new f/R30
/*   */     //   438: dup
/*   */     //   439: aload_0
/*   */     //   440: swap
/*   */     //   441: dup
/*   */     //   442: aload_0
/*   */     //   443: getfield Tb0 : I
/*   */     //   446: i2f
/*   */     //   447: ldc 1000.0
/*   */     //   449: fdiv
/*   */     //   450: aload_1
/*   */     //   451: invokespecial <init> : (F[Ljava/lang/Object;)V
/*   */     //   454: putfield Y40 : Lf/R30;
/*   */     //   457: getstatic f/Qb.Oe : Lf/Qb;
/*   */     //   460: putfield sI : Lf/Qb;
/*   */     //   463: aload_0
/*   */     //   464: dup
/*   */     //   465: dup
/*   */     //   466: getfield fI : F
/*   */     //   469: getstatic f/UB0.M60 : Lf/w70;
/*   */     //   472: getfield Qy : F
/*   */     //   475: fadd
/*   */     //   476: dup
/*   */     //   477: fstore_1
/*   */     //   478: putfield fI : F
/*   */     //   481: getfield Gt0 : Lf/uT;
/*   */     //   484: aload_0
/*   */     //   485: getfield Y40 : Lf/R30;
/*   */     //   488: fload_1
/*   */     //   489: invokevirtual Hf : (F)Ljava/lang/Object;
/*   */     //   492: checkcast f/pe0
/*   */     //   495: iconst_0
/*   */     //   496: invokevirtual sA0 : (Lf/pe0;Z)V
/*   */     //   499: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 0
/*   */     //   #2	-> 4
/*   */     //   #3	-> 65
/*   */     //   #4	-> 89
/*   */     //   #5	-> 105
/*   */     //   #6	-> 111
/*   */     //   #7	-> 117
/*   */     //   #8	-> 138
/*   */     //   #9	-> 325
/*   */     //   #10	-> 346
/*   */     //   #11	-> 460
/*   */     //   #12	-> 466
/*   */     //   #13	-> 472
/*   */     //   #14	-> 478
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ce0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */