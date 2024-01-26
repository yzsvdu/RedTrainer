/*  1 */ package f;public final class gf extends Un implements r60 { public final gO nUL; public final int Ki0; public final n3 V0; private void x(gO paramgO) { this.V0
/*  2 */       .H0(0);
/*    */     Zq zq;
/*  4 */     int i = (zq = this.V0.M50()).RS(); i = this.V0.M50().qF() / 2 + i; int j = this.V0.M50().e3(); paramgO.lf0(i, Hy() / 2 + j); } public final YA0 o20; public int Ba0; public gf(gO paramgO, Iq0 paramIq0, YA0 paramYA0, n3 paramn3, int paramInt) { // Byte code:
/*    */     //   0: iload #5
/*    */     //   2: aload_0
/*    */     //   3: dup
/*    */     //   4: dup
/*    */     //   5: dup2
/*    */     //   6: invokespecial <init> : ()V
/*    */     //   9: aload_1
/*    */     //   10: putfield nUL : Lf/gO;
/*    */     //   13: iload #5
/*    */     //   15: putfield Ki0 : I
/*    */     //   18: aload_3
/*    */     //   19: putfield o20 : Lf/YA0;
/*    */     //   22: aload #4
/*    */     //   24: putfield V0 : Lf/n3;
/*    */     //   27: iconst_m1
/*    */     //   28: if_icmpne -> 45
/*    */     //   31: aload_0
/*    */     //   32: aload_1
/*    */     //   33: invokevirtual ZK0 : ()[Lf/nJ0;
/*    */     //   36: arraylength
/*    */     //   37: iconst_1
/*    */     //   38: isub
/*    */     //   39: putfield Ba0 : I
/*    */     //   42: goto -> 55
/*    */     //   45: aload_0
/*    */     //   46: aload_2
/*    */     //   47: iload #5
/*    */     //   49: invokevirtual cm0 : (I)I
/*    */     //   52: putfield Ba0 : I
/*    */     //   55: aload_0
/*    */     //   56: dup
/*    */     //   57: dup
/*    */     //   58: aload_1
/*    */     //   59: aload_0
/*    */     //   60: aload_2
/*    */     //   61: iload #5
/*    */     //   63: i2b
/*    */     //   64: invokevirtual Kg : (B)Ljava/lang/String;
/*    */     //   67: invokevirtual s6 : (Ljava/lang/String;)V
/*    */     //   70: <illegal opcode> run : (Lf/gf;Lf/gO;)Ljava/lang/Runnable;
/*    */     //   75: invokevirtual tW : (Ljava/lang/Runnable;)V
/*    */     //   78: invokevirtual rs : ()V
/*  4 */     //   81: return } public final void fa0(int paramInt) { gf gf1; if (this.Ki0 == -1) return;  if (paramInt < 0) return;  nJ0[] arrayOfNJ0; if (paramInt >= (arrayOfNJ0 = this.nUL.fH).length - 1) return;  int i; if ((i = this.Ba0) == paramInt) return;  if (i > paramInt) { gf1 = (gf)(arrayOfNJ0[i]).ZX; arrayOfNJ0[i].cd(null); int k; for (int j = this.Ba0; k <= j; ) {
/*    */         
/*  6 */         gf gf2 = (gf)(arrayOfNJ0[k]).ZX; arrayOfNJ0[k].cd(gf1);
/*  7 */         if (gf1.Ki0 != -1 && k != -1) gf1
/*  8 */             .Ba0 = k;  int m = k + 1; gf1 = gf2; k = m;
/*    */       }  }
/*    */     else
/* 11 */     { gf1 = (gf)(arrayOfNJ0[gf1]).ZX;
/*    */       
/* 13 */       gf gf2 = (gf)(arrayOfNJ0[paramInt]).ZX; arrayOfNJ0[paramInt].cd(null); for (int j = paramInt - 1; j >= this.Ba0; )
/*    */       
/* 15 */       { gf gf3 = (gf)(arrayOfNJ0[j]).ZX; arrayOfNJ0[j].cd(gf2);
/* 16 */         if (gf2.Ki0 != -1 && j != -1) gf2
/* 17 */             .Ba0 = j;  j--; gf2 = gf3; }  arrayOfNJ0[paramInt]
/* 18 */         .cd(gf1); }  if (this
/* 19 */       .Ki0 != -1 && paramInt != -1) this.Ba0 = paramInt;  gO gO1;
/*    */     byte[] arrayOfByte;
/*    */     byte b;
/* 22 */     for (arrayOfByte = new byte[paramInt = (gO1 = this.nUL).fH.length - 1], b = 0; b < paramInt; ) { arrayOfByte[b] = 
/*    */ 
/*    */         
/* 25 */         (byte)((gf)(this.fH[b]).ZX).Ki0;
/* 26 */       b++; }
/*    */     
/* 28 */     if (!Arrays.equals(this.LPt7.K4, arrayOfByte)) { this.LPt7
/* 29 */         .K4 = arrayOfByte;
/* 30 */       km.u4
/* 31 */         .e20
/* 32 */         .W3(new DQ(arrayOfByte)); }
/*    */      }
/*    */ 
/*    */   
/*    */   public final String TI() {
/*    */     return "pc-box-button";
/*    */   }
/*    */   
/*    */   public final boolean i2(oa0 paramoa0) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: invokevirtual Cz0 : ()Z
/*    */     //   4: ifeq -> 352
/*    */     //   7: aload_1
/*    */     //   8: getfield cz0 : I
/*    */     //   11: dup
/*    */     //   12: istore_2
/*    */     //   13: bipush #6
/*    */     //   15: if_icmpne -> 244
/*    */     //   18: aload_0
/*    */     //   19: aload_1
/*    */     //   20: dup
/*    */     //   21: getfield aK : I
/*    */     //   24: istore_1
/*    */     //   25: getfield gk0 : I
/*    */     //   28: iload_1
/*    */     //   29: aload_0
/*    */     //   30: dup
/*    */     //   31: dup
/*    */     //   32: getfield o20 : Lf/YA0;
/*    */     //   35: getfield HC : I
/*    */     //   38: istore_1
/*    */     //   39: getfield nUL : Lf/gO;
/*    */     //   42: getfield fH : [Lf/nJ0;
/*    */     //   45: iconst_0
/*    */     //   46: aaload
/*    */     //   47: getfield ZX : Ljava/lang/Object;
/*    */     //   50: checkcast f/gf
/*    */     //   53: dup
/*    */     //   54: getfield Kd : I
/*    */     //   57: istore_2
/*    */     //   58: getfield er0 : I
/*    */     //   61: istore_3
/*    */     //   62: getfield xY : I
/*    */     //   65: istore #4
/*    */     //   67: iload_2
/*    */     //   68: isub
/*    */     //   69: istore #5
/*    */     //   71: iload_3
/*    */     //   72: isub
/*    */     //   73: istore #6
/*    */     //   75: getfield er0 : I
/*    */     //   78: iload_3
/*    */     //   79: isub
/*    */     //   80: iload_1
/*    */     //   81: iconst_2
/*    */     //   82: idiv
/*    */     //   83: dup
/*    */     //   84: istore_1
/*    */     //   85: if_icmpne -> 92
/*    */     //   88: iconst_1
/*    */     //   89: goto -> 93
/*    */     //   92: iconst_0
/*    */     //   93: ifeq -> 112
/*    */     //   96: aload_0
/*    */     //   97: getfield HC : I
/*    */     //   100: iconst_2
/*    */     //   101: idiv
/*    */     //   102: iload #6
/*    */     //   104: iadd
/*    */     //   105: iload_1
/*    */     //   106: if_icmple -> 130
/*    */     //   109: goto -> 125
/*    */     //   112: iload #6
/*    */     //   114: aload_0
/*    */     //   115: getfield HC : I
/*    */     //   118: iconst_2
/*    */     //   119: idiv
/*    */     //   120: isub
/*    */     //   121: iload_1
/*    */     //   122: if_icmple -> 130
/*    */     //   125: iconst_1
/*    */     //   126: istore_1
/*    */     //   127: goto -> 132
/*    */     //   130: iconst_0
/*    */     //   131: istore_1
/*    */     //   132: iload #5
/*    */     //   134: i2f
/*    */     //   135: iload #4
/*    */     //   137: i2f
/*    */     //   138: fdiv
/*    */     //   139: fconst_0
/*    */     //   140: ldc 13.0
/*    */     //   142: invokestatic SA0 : (FFF)F
/*    */     //   145: dup
/*    */     //   146: fstore_3
/*    */     //   147: aload_0
/*    */     //   148: getfield Kd : I
/*    */     //   151: iload_2
/*    */     //   152: isub
/*    */     //   153: iload #4
/*    */     //   155: idiv
/*    */     //   156: istore_2
/*    */     //   157: ldc 0.5
/*    */     //   159: fadd
/*    */     //   160: f2d
/*    */     //   161: ldc2_w 16384.0
/*    */     //   164: dadd
/*    */     //   165: d2i
/*    */     //   166: sipush #16384
/*    */     //   169: isub
/*    */     //   170: iload_2
/*    */     //   171: if_icmpge -> 181
/*    */     //   174: fload_3
/*    */     //   175: f2i
/*    */     //   176: istore #4
/*    */     //   178: goto -> 184
/*    */     //   181: iload_2
/*    */     //   182: istore #4
/*    */     //   184: fload_3
/*    */     //   185: ldc 0.5
/*    */     //   187: fsub
/*    */     //   188: f2d
/*    */     //   189: ldc2_w 16384.0
/*    */     //   192: dadd
/*    */     //   193: d2i
/*    */     //   194: sipush #16384
/*    */     //   197: isub
/*    */     //   198: iload_2
/*    */     //   199: if_icmple -> 206
/*    */     //   202: fload_3
/*    */     //   203: f2i
/*    */     //   204: istore #4
/*    */     //   206: iload_1
/*    */     //   207: ifeq -> 216
/*    */     //   210: bipush #13
/*    */     //   212: istore_1
/*    */     //   213: goto -> 218
/*    */     //   216: iconst_0
/*    */     //   217: istore_1
/*    */     //   218: aload_0
/*    */     //   219: dup
/*    */     //   220: dup
/*    */     //   221: iload #4
/*    */     //   223: iload_1
/*    */     //   224: iadd
/*    */     //   225: invokevirtual fa0 : (I)V
/*    */     //   228: invokestatic c90 : (Lf/JG0;)Z
/*    */     //   231: pop
/*    */     //   232: getfield nUL : Lf/gO;
/*    */     //   235: aload_0
/*    */     //   236: getfield Ba0 : I
/*    */     //   239: putfield s5 : I
/*    */     //   242: iconst_1
/*    */     //   243: ireturn
/*    */     //   244: iload_2
/*    */     //   245: iconst_4
/*    */     //   246: if_icmpne -> 730
/*    */     //   249: aload_0
/*    */     //   250: getfield nUL : Lf/gO;
/*    */     //   253: dup
/*    */     //   254: astore_2
/*    */     //   255: getfield fH : [Lf/nJ0;
/*    */     //   258: arraylength
/*    */     //   259: iconst_1
/*    */     //   260: isub
/*    */     //   261: dup
/*    */     //   262: istore_3
/*    */     //   263: newarray byte
/*    */     //   265: astore #4
/*    */     //   267: iconst_0
/*    */     //   268: istore #5
/*    */     //   270: iload #5
/*    */     //   272: iload_3
/*    */     //   273: if_icmpge -> 304
/*    */     //   276: aload #4
/*    */     //   278: iload #5
/*    */     //   280: aload_2
/*    */     //   281: getfield fH : [Lf/nJ0;
/*    */     //   284: iload #5
/*    */     //   286: aaload
/*    */     //   287: getfield ZX : Ljava/lang/Object;
/*    */     //   290: checkcast f/gf
/*    */     //   293: getfield Ki0 : I
/*    */     //   296: i2b
/*    */     //   297: bastore
/*    */     //   298: iinc #5, 1
/*    */     //   301: goto -> 270
/*    */     //   304: aload_2
/*    */     //   305: getfield LPt7 : Lf/Iq0;
/*    */     //   308: getfield K4 : [B
/*    */     //   311: aload #4
/*    */     //   313: invokestatic equals : ([B[B)Z
/*    */     //   316: ifne -> 346
/*    */     //   319: aload_2
/*    */     //   320: getfield LPt7 : Lf/Iq0;
/*    */     //   323: aload #4
/*    */     //   325: putfield K4 : [B
/*    */     //   328: getstatic f/km.u4 : Lf/R8;
/*    */     //   331: getfield e20 : Lf/c4;
/*    */     //   334: new f/DQ
/*    */     //   337: dup
/*    */     //   338: aload #4
/*    */     //   340: invokespecial <init> : ([B)V
/*    */     //   343: invokevirtual W3 : (Lf/Bi;)V
/*    */     //   346: aload_0
/*    */     //   347: aload_1
/*    */     //   348: invokespecial i2 : (Lf/oa0;)Z
/*    */     //   351: ireturn
/*    */     //   352: aload_1
/*    */     //   353: getfield cz0 : I
/*    */     //   356: invokestatic Wm0 : (I)Z
/*    */     //   359: ifeq -> 730
/*    */     //   362: aload_1
/*    */     //   363: invokevirtual oO : ()Z
/*    */     //   366: ifeq -> 730
/*    */     //   369: aload_1
/*    */     //   370: aload_0
/*    */     //   371: getfield O : Lf/Sa0;
/*    */     //   374: getstatic f/Un.NI : Lf/Ll;
/*    */     //   377: invokevirtual z60 : (Lf/Ll;)Z
/*    */     //   380: istore_2
/*    */     //   381: getfield GG0 : I
/*    */     //   384: getstatic f/BM.Oq : Lf/BM;
/*    */     //   387: invokestatic J20 : (ILf/BM;)Z
/*    */     //   390: ifeq -> 447
/*    */     //   393: iload_2
/*    */     //   394: ifne -> 412
/*    */     //   397: aload_0
/*    */     //   398: getfield nUL : Lf/gO;
/*    */     //   401: aload_0
/*    */     //   402: getfield Ba0 : I
/*    */     //   405: iconst_1
/*    */     //   406: isub
/*    */     //   407: invokevirtual XH0 : (I)V
/*    */     //   410: iconst_1
/*    */     //   411: ireturn
/*    */     //   412: aload_0
/*    */     //   413: dup
/*    */     //   414: dup
/*    */     //   415: dup2
/*    */     //   416: getfield Ba0 : I
/*    */     //   419: iconst_1
/*    */     //   420: isub
/*    */     //   421: invokevirtual fa0 : (I)V
/*    */     //   424: getfield TG0 : Lf/protected;
/*    */     //   427: iconst_0
/*    */     //   428: invokevirtual Bq : (Z)V
/*    */     //   431: invokestatic c90 : (Lf/JG0;)Z
/*    */     //   434: pop
/*    */     //   435: getfield nUL : Lf/gO;
/*    */     //   438: aload_0
/*    */     //   439: getfield Ba0 : I
/*    */     //   442: putfield s5 : I
/*    */     //   445: iconst_1
/*    */     //   446: ireturn
/*    */     //   447: aload_1
/*    */     //   448: getfield GG0 : I
/*    */     //   451: getstatic f/BM.M8 : Lf/BM;
/*    */     //   454: invokestatic J20 : (ILf/BM;)Z
/*    */     //   457: ifeq -> 514
/*    */     //   460: iload_2
/*    */     //   461: ifne -> 479
/*    */     //   464: aload_0
/*    */     //   465: getfield nUL : Lf/gO;
/*    */     //   468: aload_0
/*    */     //   469: getfield Ba0 : I
/*    */     //   472: iconst_1
/*    */     //   473: iadd
/*    */     //   474: invokevirtual XH0 : (I)V
/*    */     //   477: iconst_1
/*    */     //   478: ireturn
/*    */     //   479: aload_0
/*    */     //   480: dup
/*    */     //   481: dup
/*    */     //   482: dup2
/*    */     //   483: getfield Ba0 : I
/*    */     //   486: iconst_1
/*    */     //   487: iadd
/*    */     //   488: invokevirtual fa0 : (I)V
/*    */     //   491: getfield TG0 : Lf/protected;
/*    */     //   494: iconst_0
/*    */     //   495: invokevirtual Bq : (Z)V
/*    */     //   498: invokestatic c90 : (Lf/JG0;)Z
/*    */     //   501: pop
/*    */     //   502: getfield nUL : Lf/gO;
/*    */     //   505: aload_0
/*    */     //   506: getfield Ba0 : I
/*    */     //   509: putfield s5 : I
/*    */     //   512: iconst_1
/*    */     //   513: ireturn
/*    */     //   514: aload_1
/*    */     //   515: getfield GG0 : I
/*    */     //   518: getstatic f/BM.ni : Lf/BM;
/*    */     //   521: invokestatic J20 : (ILf/BM;)Z
/*    */     //   524: ifeq -> 590
/*    */     //   527: aload_0
/*    */     //   528: getfield Ba0 : I
/*    */     //   531: dup
/*    */     //   532: istore_1
/*    */     //   533: bipush #13
/*    */     //   535: if_icmpge -> 540
/*    */     //   538: iconst_1
/*    */     //   539: ireturn
/*    */     //   540: iload_2
/*    */     //   541: ifne -> 557
/*    */     //   544: aload_0
/*    */     //   545: getfield nUL : Lf/gO;
/*    */     //   548: iload_1
/*    */     //   549: bipush #13
/*    */     //   551: isub
/*    */     //   552: invokevirtual XH0 : (I)V
/*    */     //   555: iconst_1
/*    */     //   556: ireturn
/*    */     //   557: aload_0
/*    */     //   558: dup
/*    */     //   559: dup2
/*    */     //   560: iload_1
/*    */     //   561: bipush #13
/*    */     //   563: isub
/*    */     //   564: invokevirtual fa0 : (I)V
/*    */     //   567: getfield TG0 : Lf/protected;
/*    */     //   570: iconst_0
/*    */     //   571: invokevirtual Bq : (Z)V
/*    */     //   574: invokestatic c90 : (Lf/JG0;)Z
/*    */     //   577: pop
/*    */     //   578: getfield nUL : Lf/gO;
/*    */     //   581: aload_0
/*    */     //   582: getfield Ba0 : I
/*    */     //   585: putfield s5 : I
/*    */     //   588: iconst_1
/*    */     //   589: ireturn
/*    */     //   590: aload_1
/*    */     //   591: getfield GG0 : I
/*    */     //   594: getstatic f/BM.N70 : Lf/BM;
/*    */     //   597: invokestatic J20 : (ILf/BM;)Z
/*    */     //   600: ifeq -> 730
/*    */     //   603: aload_0
/*    */     //   604: getfield Ba0 : I
/*    */     //   607: dup
/*    */     //   608: istore_1
/*    */     //   609: bipush #13
/*    */     //   611: if_icmpge -> 679
/*    */     //   614: aload_0
/*    */     //   615: getfield nUL : Lf/gO;
/*    */     //   618: dup
/*    */     //   619: astore_3
/*    */     //   620: getfield fH : [Lf/nJ0;
/*    */     //   623: arraylength
/*    */     //   624: bipush #13
/*    */     //   626: if_icmpgt -> 632
/*    */     //   629: goto -> 679
/*    */     //   632: iload_2
/*    */     //   633: ifne -> 646
/*    */     //   636: aload_3
/*    */     //   637: iload_1
/*    */     //   638: bipush #13
/*    */     //   640: iadd
/*    */     //   641: invokevirtual XH0 : (I)V
/*    */     //   644: iconst_1
/*    */     //   645: ireturn
/*    */     //   646: aload_0
/*    */     //   647: dup
/*    */     //   648: dup2
/*    */     //   649: iload_1
/*    */     //   650: bipush #13
/*    */     //   652: iadd
/*    */     //   653: invokevirtual fa0 : (I)V
/*    */     //   656: getfield TG0 : Lf/protected;
/*    */     //   659: iconst_0
/*    */     //   660: invokevirtual Bq : (Z)V
/*    */     //   663: invokestatic c90 : (Lf/JG0;)Z
/*    */     //   666: pop
/*    */     //   667: getfield nUL : Lf/gO;
/*    */     //   670: aload_0
/*    */     //   671: getfield Ba0 : I
/*    */     //   674: putfield s5 : I
/*    */     //   677: iconst_1
/*    */     //   678: ireturn
/*    */     //   679: iload_2
/*    */     //   680: ifne -> 728
/*    */     //   683: aload_0
/*    */     //   684: dup
/*    */     //   685: getfield Kd : I
/*    */     //   688: aload_0
/*    */     //   689: getfield nUL : Lf/gO;
/*    */     //   692: getfield fH : [Lf/nJ0;
/*    */     //   695: iconst_0
/*    */     //   696: aaload
/*    */     //   697: getfield ZX : Ljava/lang/Object;
/*    */     //   700: checkcast f/gf
/*    */     //   703: getfield Kd : I
/*    */     //   706: isub
/*    */     //   707: aload_0
/*    */     //   708: getfield V0 : Lf/n3;
/*    */     //   711: invokevirtual MY : ()[Lf/Zq;
/*    */     //   714: iconst_0
/*    */     //   715: aaload
/*    */     //   716: getfield xY : I
/*    */     //   719: idiv
/*    */     //   720: istore_0
/*    */     //   721: getfield V0 : Lf/n3;
/*    */     //   724: iload_0
/*    */     //   725: invokevirtual H0 : (I)V
/*    */     //   728: iconst_1
/*    */     //   729: ireturn
/*    */     //   730: aload_0
/*    */     //   731: aload_1
/*    */     //   732: invokespecial i2 : (Lf/oa0;)Z
/*    */     //   735: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 8
/*    */     //   #2	-> 21
/*    */     //   #3	-> 25
/*    */     //   #4	-> 32
/*    */     //   #5	-> 35
/*    */     //   #6	-> 39
/*    */     //   #7	-> 42
/*    */     //   #8	-> 46
/*    */     //   #9	-> 47
/*    */     //   #10	-> 50
/*    */     //   #11	-> 54
/*    */     //   #12	-> 58
/*    */     //   #13	-> 62
/*    */     //   #14	-> 75
/*    */     //   #15	-> 82
/*    */     //   #16	-> 97
/*    */     //   #17	-> 101
/*    */     //   #18	-> 115
/*    */     //   #19	-> 119
/*    */     //   #20	-> 148
/*    */     //   #21	-> 155
/*    */     //   #22	-> 239
/*    */     //   #23	-> 250
/*    */     //   #24	-> 255
/*    */     //   #25	-> 258
/*    */     //   #26	-> 287
/*    */     //   #27	-> 290
/*    */     //   #28	-> 293
/*    */     //   #29	-> 297
/*    */     //   #30	-> 308
/*    */     //   #31	-> 313
/*    */     //   #32	-> 325
/*    */     //   #33	-> 328
/*    */     //   #34	-> 331
/*    */     //   #35	-> 334
/*    */     //   #36	-> 348
/*    */     //   #37	-> 353
/*    */     //   #38	-> 363
/*    */     //   #39	-> 371
/*    */     //   #40	-> 374
/*    */     //   #41	-> 381
/*    */     //   #42	-> 384
/*    */     //   #43	-> 424
/*    */     //   #44	-> 428
/*    */     //   #45	-> 442
/*    */     //   #46	-> 448
/*    */     //   #47	-> 451
/*    */     //   #48	-> 491
/*    */     //   #49	-> 495
/*    */     //   #50	-> 509
/*    */     //   #51	-> 515
/*    */     //   #52	-> 518
/*    */     //   #53	-> 567
/*    */     //   #54	-> 571
/*    */     //   #55	-> 585
/*    */     //   #56	-> 591
/*    */     //   #57	-> 594
/*    */     //   #58	-> 620
/*    */     //   #59	-> 623
/*    */     //   #60	-> 656
/*    */     //   #61	-> 660
/*    */     //   #62	-> 674
/*    */     //   #63	-> 685
/*    */     //   #64	-> 689
/*    */     //   #65	-> 692
/*    */     //   #66	-> 696
/*    */     //   #67	-> 697
/*    */     //   #68	-> 700
/*    */     //   #69	-> 703
/*    */     //   #70	-> 708
/*    */     //   #71	-> 716
/*    */     //   #72	-> 719
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/gf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */