/*  1 */ package f;public final class vh0 implements Iterable, iq0 { public static int H90 = -1; public ConcurrentHashMap KO; public Ut0 Im0; public int yD; public Jo Ct; public byte XA; public long Bc0; public short ms0; public byte eA; public int rK; public vh0() { ConcurrentHashMap<Object, Object> concurrentHashMap; Ut0 ut0; this(); this.KO = concurrentHashMap; this(); this.Im0 = ut0; this.XA = 0; this.Bc0 = 0L; this.ms0 = 0; this.eA = -1; this.rK = -1; vh0 vh01; if ((vh01 = km.a3) != null) vh01.dispose();  km.a3 = this; } public static ArrayList Sh0() { this(); ArrayList arrayList; Xi xi; if ((xi = km.wI0.iJ0) == null || xi
/*  2 */       .UB0() == null)
/*    */     {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 18 */       return arrayList; }  float f1 = UB0.PU.XK0; float f2 = UB0.PU.ol; xi.UB0().getClass(); float f3 = UB0.M60.fG0(), f4 = UB0.M60.dL(); xi.UB0().Ix0((xi.UB0()).H90.xh.TG0(f1, f2, 0.0F), 0.0F, 0.0F, f3, f4); xi.UB0().Ix0((xi.UB0()).H90.N6.TG0(f1, f2, 1.0F), 0.0F, 0.0F, f3, f4); p10 p10; (p10 = (xi.UB0()).H90).N6.zy0(p10.xh).WC0(); p10 = (xi.UB0()).H90; xi.LB(km.a3.Ct, p10, arrayList); if (km.a3.Ct.nX() != 0) xi.LB(km.a3.Ct.Ae, p10, arrayList);  for (Iterator<tc> iterator = km.a3.iterator(); iterator.hasNext(); ) { tc tc; (tc = iterator.next()).getClass(); if (!((tc)iterator.next() instanceof Jo) && !km.D70(1)) continue;  xi.LB(tc, p10, arrayList); }  return arrayList; } public final void K80(int paramInt1, byte paramByte1, H10 paramH10, String paramString1, byte paramByte2, G5 paramG5, byte paramByte3, Z50 paramZ50, byte paramByte4, short paramShort1, short paramShort2, byte paramByte5, int paramInt2, String paramString2) { tc tc1; zk0 zk01; G5 g5; zk0 zk02; Object object1; Object object2; if (this.yD == paramInt1) { R8 r8; if ((r8 = km.u4) != null) r8.tN = false;  Jo jo; if ((jo = this.Ct) == null) { this(paramInt1, paramString1, paramByte2, paramByte1, paramH10, paramG5, paramByte3, paramZ50, paramByte4, paramShort1, paramShort2, paramByte5, paramString2); this.Ct = jo; (jo = new Jo()).na = true; R8 r81; vh0 vh01; if ((r81 = km.u4) != null && (vh01 = r81.Qa) != null && jo == vh01.Ct) if (((jo.G80 & 0x40) != 0)) { r81.R3.Fs0(-1, jo.ED0, (short)1001); } else { Dq0 dq0; qw0 qw0; int i = 1001; /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{f/qw0}, name=null} = FieldReferenceExpression{lastType=ObjectType{f/qw0}, expression=BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{f/Dq0}, name=null} = FieldReferenceExpression{lastType=ObjectType{f/Dq0}, expression=ClassFileLocalVariableReferenceExpression{type=ObjectType{f/R8}, name=null}, name=R3, descriptor=Lf/Dq0;}}, name=ph0, descriptor=Lf/qw0;}} */ try { object1 = null; qw0 qw01; if ((i = (qw01 = r81.R3.ph0).kc0(i)) >= 0) { object1 = qw01.TH0[i]; qw01.Id(i); }  } finally { this = null; /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{f/qw0}, name=null} */ }  }   boolean bool = true;
/* 19 */         if ((zk01 = this.Ct.Ae) != null) zk01
/* 20 */             .WC(paramShort2, bool, paramByte5); 
/* 21 */         this.Ct
/* 22 */           .pm
/* 23 */           .u3(); }
/* 24 */       else { G5 g51 = jo.HW;
/*    */ 
/*    */         
/* 27 */         byte b = g51.kD0;
/* 28 */         b = g51.kD0;
/*    */         
/* 30 */         b = paramG5.kD0; if (this.rK != Qx.Zg0(g51.FB, b, g51.vu0) && Qx.Zg0(g51.FB, b, g51.vu0) != Qx.Zg0(paramG5.FB, b, paramG5.vu0))
/* 31 */         { byte b1 = g51.kD0;
/* 32 */           this.rK = Qx.Zg0(g51.FB, b1, g51.vu0); }  Jo jo2; (jo2 = this.Ct)
/* 33 */           .na = true; R8 r81; vh0 vh01;
/* 34 */         if ((r81 = km.u4) != null && (
/* 35 */           vh01 = r81.Qa) != null && jo2 == vh01
/* 36 */           .Ct)
/* 37 */           if (((jo2.G80 & 0x40) != 0)) { r81
/* 38 */               .R3
/*    */               
/* 40 */               .Fs0(-1, jo2.ED0, (short)1001); }
/* 41 */           else { Dq0 dq0; qw0 qw0; int i = 1001; /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{f/qw0}, name=null} = FieldReferenceExpression{lastType=ObjectType{f/qw0}, expression=BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{f/Dq0}, name=null} = FieldReferenceExpression{lastType=ObjectType{f/Dq0}, expression=ClassFileLocalVariableReferenceExpression{type=ObjectType{f/R8}, name=null}, name=R3, descriptor=Lf/Dq0;}}, name=ph0, descriptor=Lf/qw0;}} */
/*    */             
/* 43 */             try { object2 = null;
/* 44 */               if ((i = (object1 = r81.R3.ph0).kc0(i)) >= 0) {
/* 45 */                 object2 = ((qw0)object1).TH0[i]; object1.Id(i);
/*    */               }  }
/* 47 */             finally { this = null; /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{f/qw0}, name=null} */ }  }
/* 48 */             this.Ct
/* 49 */           .pm
/* 50 */           .Cb0(paramG5); this.Ct
/* 51 */           .pm
/* 52 */           .u3(); boolean bool = true; zk0 zk0;
/* 53 */         if ((zk0 = this.Ct.Ae) != null) zk0
/* 54 */             .WC(paramShort2, bool, paramByte5);  this
/* 55 */           .Ct.DU(paramByte4, paramShort1); Jo jo1;
/* 56 */         g5 = zk0.We(jo1 = this.Ct);
/* 57 */         zk02
/* 58 */           .pm
/* 59 */           .Cb0(g5); if ((zk02 = this.Ct.Ae) != null && (tc1 = jo1.U0()) != null) tc1
/* 60 */             .pm
/* 61 */             .Cb0(g5); 
/* 62 */         this.Ct
/* 63 */           .d7 = paramString2;
/* 64 */         this.Ct.Iy();
/* 65 */         this.Ct
/* 66 */           .Eh0 = zk01;
/* 67 */         this.Ct.lB0
/* 68 */           .QM = zk01; }  return; }
/* 69 */      tc tc2; if ((tc2 = (tc)this.KO.get(Integer.valueOf(tc1))) == null) { super(tc1, (String)zk02, object1, zk01, (H10)g5, paramG5, object2, paramZ50, paramByte4, paramShort1, paramShort2, paramByte5, paramString2); this.KO.put(Integer.valueOf(tc1), tc2); (tc2 = new Jo())
/* 70 */         .pm
/* 71 */         .u3(); } else { this
/* 72 */         .ED0 = (String)zk02;
/* 73 */       this.CC = object1;
/* 74 */       this.Eh0 = zk01; this.lB0
/* 75 */         .QM = zk01;
/* 76 */       this.G80 = object2;
/* 77 */       q90(paramZ50); Jo jo; (jo = (Jo)tc2).DU(paramByte4, paramShort1); boolean bool = false;
/* 78 */       if ((zk01 = tc2.Ae) != null) zk01.WC(paramShort2, bool, paramByte5);  this
/* 79 */         .d7 = paramString2; Iy();
/* 80 */       this.HW
/* 81 */         .Ic(paramG5);
/* 82 */       tc2.pm
/* 83 */         .n3 = false;
/* 84 */       tc2.pm.u3();
/* 85 */       G5 g51 = zk0.We(tc2);
/* 86 */       zk0
/* 87 */         .pm
/* 88 */         .Cb0(this); zk0 zk0; tc tc; if ((zk0 = tc2.Ae) != null && (tc = tc2.U0()) != null) tc
/* 89 */           .pm
/* 90 */           .Cb0(this);  }
/*    */      }
/*    */ 
/*    */   
/*    */   public final void F4(KI paramKI, boolean paramBoolean) {
/*    */     if (paramBoolean) {
/*    */       Ut0 ut0;
/*    */       (ut0 = this.Im0).getClass();
/*    */       for (Iterator iterator = (new mt(ut0)).iterator(); ((DA0)iterator).hasNext(); ((KI)((iF0)iterator).AUX()).dispose());
/*    */       this.Im0.clear();
/*    */     } 
/*    */     byte b;
/*    */     if (this.eA != (b = paramKI.E10)) {
/*    */       this.eA = b;
/*    */       km.u4.Wp();
/*    */       km.u4.ow();
/*    */       this.rK = -1;
/*    */     } 
/*    */     b = paramKI.cA;
/*    */     KI kI;
/*    */     if ((kI = (KI)this.Im0.A3(Qx.Zg0(paramKI.E10, b, paramKI.VZ), paramKI)) != null)
/*    */       kI.dispose(); 
/*    */     if (paramKI.o50() && Mk0.sz0(paramKI.E10)) {
/*    */       short[] arrayOfShort;
/*    */       if (((Cy)(kI = paramKI)).hp) {
/*    */         Lw lw;
/*    */         this();
/*    */         for (byte b2 = 0; b2 < ((Cy)kI).xk0.X7; ) {
/*    */           for (byte b3 = 0; b3 < ((Cy)kI).xk0.cB0; ) {
/*    */             Ws0 ws0;
/*    */             short s;
/*    */             if ((ws0 = ((Cy)kI).UF[b2][b3]) != null && (s = ws0.Ga) > -1)
/*    */               lw.Ye0(s); 
/*    */             b3++;
/*    */           } 
/*    */           b2++;
/*    */         } 
/*    */         arrayOfShort = lw.YH();
/*    */       } else {
/*    */         arrayOfShort = new short[0];
/*    */       } 
/*    */       int i;
/*    */       byte b1;
/*    */       for (i = arrayOfShort.length, b1 = 0; b1 < i; ) {
/*    */         short s = arrayOfShort[b1];
/*    */         int j;
/*    */         KI kI1;
/*    */         if (!this.Im0.return(paramKI.E10 | (j = (s & 0xFFFF) << 8)) && (kI1 = (KI)this.Im0.A3(paramKI.E10 | j, paramKI)) != null)
/*    */           kI1.dispose(); 
/*    */         b1++;
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final KI Jr0() {
/*    */     Jo jo;
/*    */     if ((jo = this.Ct) == null)
/*    */       return null; 
/*    */     byte b1 = jo.HW.FB;
/*    */     byte b2 = jo.HW.kD0;
/*    */     byte b3 = jo.HW.vu0;
/*    */     return COm8(b1, b2, b3);
/*    */   }
/*    */   
/*    */   public final KI COm8(byte paramByte1, byte paramByte2, byte paramByte3) {
/*    */     return (KI)this.Im0.Z6(Qx.Zg0(paramByte1, paramByte2, paramByte3));
/*    */   }
/*    */   
/*    */   public final byte ui0() {
/*    */     return this.eA;
/*    */   }
/*    */   
/*    */   public final int XW() {
/*    */     return this.yD;
/*    */   }
/*    */   
/*    */   public final Jo wQ() {
/*    */     return this.Ct;
/*    */   }
/*    */   
/*    */   public final Iterator iterator() {
/*    */     return this.KO.values().iterator();
/*    */   }
/*    */   
/*    */   public final tc Xb(int paramInt) {
/*    */     Jo jo;
/*    */     if ((jo = this.Ct) != null && jo.Jg == paramInt)
/*    */       return jo; 
/*    */     return (tc)this.KO.get(Integer.valueOf(paramInt));
/*    */   }
/*    */   
/*    */   public final Jo et(String paramString) {
/*    */     for (Iterator<tc> iterator = this.KO.values().iterator(); iterator.hasNext(); ) {
/*    */       tc tc;
/*    */       (tc = iterator.next()).getClass();
/*    */       if ((tc)iterator.next() instanceof Jo && paramString.equalsIgnoreCase(tc.m()))
/*    */         return (Jo)tc; 
/*    */     } 
/*    */     Jo jo;
/*    */     if ((jo = this.Ct) != null && jo.ED0.equalsIgnoreCase(paramString))
/*    */       return this.Ct; 
/*    */     return null;
/*    */   }
/*    */   
/*    */   public final Jo J7(int paramInt) {
/*    */     tc tc;
/*    */     return (paramInt == this.yD) ? this.Ct : ((tc = (tc)this.KO.get(Integer.valueOf(paramInt)) instanceof Jo) ? (Jo)this : null);
/*    */   }
/*    */   
/*    */   public final void M00(int paramInt, byte paramByte) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: iload_1
/*    */     //   2: invokevirtual Xb : (I)Lf/tc;
/*    */     //   5: dup
/*    */     //   6: astore_0
/*    */     //   7: instanceof f/Jo
/*    */     //   10: ifeq -> 684
/*    */     //   13: aload_0
/*    */     //   14: dup
/*    */     //   15: checkcast f/Jo
/*    */     //   18: astore_1
/*    */     //   19: getfield G80 : B
/*    */     //   22: bipush #64
/*    */     //   24: iand
/*    */     //   25: ifeq -> 33
/*    */     //   28: iconst_1
/*    */     //   29: istore_3
/*    */     //   30: goto -> 35
/*    */     //   33: iconst_0
/*    */     //   34: istore_3
/*    */     //   35: aload_0
/*    */     //   36: dup
/*    */     //   37: iload_2
/*    */     //   38: aload_0
/*    */     //   39: invokevirtual XC : ()Z
/*    */     //   42: istore #4
/*    */     //   44: putfield G80 : B
/*    */     //   47: invokevirtual Pf : ()Z
/*    */     //   50: ifeq -> 657
/*    */     //   53: aload_0
/*    */     //   54: getstatic f/km.u4 : Lf/R8;
/*    */     //   57: getfield Lz : Lf/fH0;
/*    */     //   60: iload_2
/*    */     //   61: putfield Z60 : B
/*    */     //   64: invokevirtual UG : ()Z
/*    */     //   67: ifeq -> 188
/*    */     //   70: aload_0
/*    */     //   71: invokevirtual VO : ()Z
/*    */     //   74: ifne -> 188
/*    */     //   77: aload_0
/*    */     //   78: getfield HW : Lf/G5;
/*    */     //   81: getfield FB : B
/*    */     //   84: tableswitch default -> 120, 0 -> 175, 1 -> 162, 2 -> 149, 3 -> 136, 4 -> 123
/*    */     //   120: goto -> 408
/*    */     //   123: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   126: iconst_4
/*    */     //   127: sipush #1014
/*    */     //   130: invokevirtual Wk0 : (BS)V
/*    */     //   133: goto -> 408
/*    */     //   136: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   139: iconst_3
/*    */     //   140: sipush #1151
/*    */     //   143: invokevirtual Wk0 : (BS)V
/*    */     //   146: goto -> 408
/*    */     //   149: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   152: iconst_2
/*    */     //   153: sipush #1013
/*    */     //   156: invokevirtual Wk0 : (BS)V
/*    */     //   159: goto -> 408
/*    */     //   162: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   165: iconst_1
/*    */     //   166: sipush #365
/*    */     //   169: invokevirtual Wk0 : (BS)V
/*    */     //   172: goto -> 408
/*    */     //   175: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   178: iconst_0
/*    */     //   179: sipush #305
/*    */     //   182: invokevirtual Wk0 : (BS)V
/*    */     //   185: goto -> 408
/*    */     //   188: aload_0
/*    */     //   189: invokevirtual XC : ()Z
/*    */     //   192: ifeq -> 400
/*    */     //   195: iload #4
/*    */     //   197: ifne -> 400
/*    */     //   200: aload_0
/*    */     //   201: checkcast f/Jo
/*    */     //   204: getfield lB0 : Lf/OE0;
/*    */     //   207: getstatic f/Vp0.c6 : Lf/Vp0;
/*    */     //   210: invokevirtual JM : (Lf/Vp0;)S
/*    */     //   213: dup
/*    */     //   214: istore_2
/*    */     //   215: iconst_2
/*    */     //   216: if_icmpeq -> 282
/*    */     //   219: iload_2
/*    */     //   220: bipush #12
/*    */     //   222: if_icmpeq -> 270
/*    */     //   225: iload_2
/*    */     //   226: bipush #17
/*    */     //   228: if_icmpeq -> 244
/*    */     //   231: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   234: iconst_2
/*    */     //   235: sipush #1375
/*    */     //   238: invokevirtual bL : (BS)V
/*    */     //   241: goto -> 292
/*    */     //   244: bipush #25
/*    */     //   246: invokestatic qX : (I)I
/*    */     //   249: ifne -> 282
/*    */     //   252: getstatic f/A1.L7 : Lf/A1;
/*    */     //   255: <illegal opcode> run : ()Ljava/lang/Runnable;
/*    */     //   260: ldc2_w 450
/*    */     //   263: invokevirtual ac0 : (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
/*    */     //   266: pop
/*    */     //   267: goto -> 282
/*    */     //   270: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   273: bipush #10
/*    */     //   275: iconst_5
/*    */     //   276: invokevirtual bL : (BS)V
/*    */     //   279: goto -> 292
/*    */     //   282: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   285: bipush #10
/*    */     //   287: bipush #6
/*    */     //   289: invokevirtual bL : (BS)V
/*    */     //   292: aload_0
/*    */     //   293: getfield HW : Lf/G5;
/*    */     //   296: getfield FB : B
/*    */     //   299: tableswitch default -> 332, 0 -> 387, 1 -> 374, 2 -> 361, 3 -> 348, 4 -> 335
/*    */     //   332: goto -> 408
/*    */     //   335: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   338: iconst_4
/*    */     //   339: sipush #1013
/*    */     //   342: invokevirtual Wk0 : (BS)V
/*    */     //   345: goto -> 408
/*    */     //   348: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   351: iconst_3
/*    */     //   352: sipush #1152
/*    */     //   355: invokevirtual Wk0 : (BS)V
/*    */     //   358: goto -> 408
/*    */     //   361: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   364: iconst_2
/*    */     //   365: sipush #1012
/*    */     //   368: invokevirtual Wk0 : (BS)V
/*    */     //   371: goto -> 408
/*    */     //   374: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   377: iconst_1
/*    */     //   378: sipush #403
/*    */     //   381: invokevirtual Wk0 : (BS)V
/*    */     //   384: goto -> 408
/*    */     //   387: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   390: iconst_0
/*    */     //   391: sipush #282
/*    */     //   394: invokevirtual Wk0 : (BS)V
/*    */     //   397: goto -> 408
/*    */     //   400: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   403: iconst_0
/*    */     //   404: iconst_0
/*    */     //   405: invokevirtual Wk0 : (BS)V
/*    */     //   408: aload_0
/*    */     //   409: getfield G80 : B
/*    */     //   412: bipush #64
/*    */     //   414: iand
/*    */     //   415: ifeq -> 423
/*    */     //   418: iconst_1
/*    */     //   419: istore_2
/*    */     //   420: goto -> 425
/*    */     //   423: iconst_0
/*    */     //   424: istore_2
/*    */     //   425: iload_3
/*    */     //   426: iload_2
/*    */     //   427: if_icmpeq -> 657
/*    */     //   430: aload_1
/*    */     //   431: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   434: pop
/*    */     //   435: getstatic f/km.u4 : Lf/R8;
/*    */     //   438: dup
/*    */     //   439: astore_2
/*    */     //   440: ifnull -> 615
/*    */     //   443: aload_2
/*    */     //   444: getfield Qa : Lf/vh0;
/*    */     //   447: dup
/*    */     //   448: astore_3
/*    */     //   449: ifnull -> 615
/*    */     //   452: aload_1
/*    */     //   453: aload_3
/*    */     //   454: getfield Ct : Lf/Jo;
/*    */     //   457: if_acmpeq -> 463
/*    */     //   460: goto -> 615
/*    */     //   463: aload_1
/*    */     //   464: getfield G80 : B
/*    */     //   467: bipush #64
/*    */     //   469: iand
/*    */     //   470: ifeq -> 477
/*    */     //   473: iconst_1
/*    */     //   474: goto -> 478
/*    */     //   477: iconst_0
/*    */     //   478: ifeq -> 500
/*    */     //   481: aload_2
/*    */     //   482: getfield R3 : Lf/Dq0;
/*    */     //   485: aload_1
/*    */     //   486: getfield ED0 : Ljava/lang/String;
/*    */     //   489: iconst_m1
/*    */     //   490: swap
/*    */     //   491: sipush #1001
/*    */     //   494: invokevirtual Fs0 : (ILjava/lang/String;S)V
/*    */     //   497: goto -> 615
/*    */     //   500: aload_2
/*    */     //   501: getfield R3 : Lf/Dq0;
/*    */     //   504: dup
/*    */     //   505: dup
/*    */     //   506: astore_2
/*    */     //   507: sipush #1001
/*    */     //   510: istore_3
/*    */     //   511: getfield ph0 : Lf/qw0;
/*    */     //   514: dup
/*    */     //   515: astore #4
/*    */     //   517: monitorenter
/*    */     //   518: getfield ph0 : Lf/qw0;
/*    */     //   521: dup
/*    */     //   522: astore #5
/*    */     //   524: aconst_null
/*    */     //   525: astore #6
/*    */     //   527: iload_3
/*    */     //   528: invokevirtual kc0 : (S)I
/*    */     //   531: dup
/*    */     //   532: istore_3
/*    */     //   533: iflt -> 551
/*    */     //   536: aload #5
/*    */     //   538: iload_3
/*    */     //   539: aload #5
/*    */     //   541: getfield TH0 : [Ljava/lang/Object;
/*    */     //   544: iload_3
/*    */     //   545: aaload
/*    */     //   546: astore #6
/*    */     //   548: invokevirtual Id : (I)V
/*    */     //   551: aload #6
/*    */     //   553: ifnonnull -> 559
/*    */     //   556: goto -> 603
/*    */     //   559: getstatic f/P3.lF : Lf/P3;
/*    */     //   562: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   565: pop
/*    */     //   566: ldc_w f/ug
/*    */     //   569: invokestatic XP : (Ljava/lang/Class;)Ljava/util/List;
/*    */     //   572: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   577: astore_3
/*    */     //   578: aload_3
/*    */     //   579: invokeinterface hasNext : ()Z
/*    */     //   584: ifeq -> 603
/*    */     //   587: aload_3
/*    */     //   588: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   593: checkcast f/ug
/*    */     //   596: aload_2
/*    */     //   597: invokevirtual CM : (Lf/Dq0;)V
/*    */     //   600: goto -> 578
/*    */     //   603: aload #4
/*    */     //   605: monitorexit
/*    */     //   606: goto -> 615
/*    */     //   609: astore_0
/*    */     //   610: aload_0
/*    */     //   611: aload #4
/*    */     //   613: monitorexit
/*    */     //   614: athrow
/*    */     //   615: aload_0
/*    */     //   616: getstatic f/km.u4 : Lf/R8;
/*    */     //   619: astore_0
/*    */     //   620: getfield G80 : B
/*    */     //   623: bipush #64
/*    */     //   625: iand
/*    */     //   626: ifeq -> 634
/*    */     //   629: iconst_1
/*    */     //   630: istore_2
/*    */     //   631: goto -> 636
/*    */     //   634: iconst_0
/*    */     //   635: istore_2
/*    */     //   636: iload_2
/*    */     //   637: ifeq -> 646
/*    */     //   640: ldc_w 16777249
/*    */     //   643: goto -> 649
/*    */     //   646: ldc_w 16777250
/*    */     //   649: invokestatic OH0 : (I)Ljava/lang/String;
/*    */     //   652: aload_0
/*    */     //   653: swap
/*    */     //   654: invokevirtual Pq : (Ljava/lang/String;)V
/*    */     //   657: aload_1
/*    */     //   658: invokevirtual AJ0 : ()Z
/*    */     //   661: ifeq -> 684
/*    */     //   664: aload_1
/*    */     //   665: getfield Ae : Lf/zk0;
/*    */     //   668: dup
/*    */     //   669: astore_0
/*    */     //   670: ifnull -> 684
/*    */     //   673: aload_0
/*    */     //   674: getfield pm : Lf/d7;
/*    */     //   677: aload_1
/*    */     //   678: invokestatic We : (Lf/tc;)Lf/G5;
/*    */     //   681: invokevirtual Cb0 : (Lf/G5;)V
/*    */     //   684: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 19
/*    */     //   #2	-> 39
/*    */     //   #3	-> 44
/*    */     //   #4	-> 47
/*    */     //   #5	-> 57
/*    */     //   #6	-> 61
/*    */     //   #7	-> 64
/*    */     //   #8	-> 78
/*    */     //   #9	-> 81
/*    */     //   #10	-> 123
/*    */     //   #11	-> 204
/*    */     //   #12	-> 207
/*    */     //   #13	-> 252
/*    */     //   #14	-> 255
/*    */     //   #15	-> 293
/*    */     //   #16	-> 296
/*    */     //   #17	-> 335
/*    */     //   #18	-> 405
/*    */     //   #19	-> 409
/*    */     //   #20	-> 431
/*    */     //   #21	-> 435
/*    */     //   #22	-> 444
/*    */     //   #23	-> 454
/*    */     //   #24	-> 464
/*    */     //   #25	-> 482
/*    */     //   #26	-> 486
/*    */     //   #27	-> 494
/*    */     //   #28	-> 501
/*    */     //   #29	-> 511
/*    */     //   #30	-> 517
/*    */     //   #31	-> 528
/*    */     //   #32	-> 541
/*    */     //   #33	-> 559
/*    */     //   #34	-> 605
/*    */     //   #35	-> 616
/*    */     //   #36	-> 620
/*    */     //   #37	-> 649
/*    */     //   #38	-> 665
/*    */     //   #39	-> 674
/*    */     //   #40	-> 678
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   518	521	609	finally
/*    */     //   527	531	609	finally
/*    */     //   536	546	609	finally
/*    */     //   548	551	609	finally
/*    */     //   559	565	609	finally
/*    */     //   566	577	609	finally
/*    */     //   578	584	609	finally
/*    */     //   587	609	609	finally
/*    */     //   610	614	609	finally
/*    */   }
/*    */   
/*    */   public final byte Jy0() {
/*    */     return this.XA;
/*    */   }
/*    */   
/*    */   public final long nD0() {
/*    */     return this.Bc0;
/*    */   }
/*    */   
/*    */   public final short w40() {
/*    */     return this.ms0;
/*    */   }
/*    */   
/*    */   public final Kr0[] Bh(Kr0 paramKr0) {
/*    */     this();
/*    */     ArrayList<Kr0> arrayList;
/*    */     (arrayList = new ArrayList<>()).add(paramKr0);
/*    */     for (Iterator<tc> iterator = this.KO.values().iterator(); iterator.hasNext();) {
/*    */       if ((g51 = (tc = iterator.next()).HW).kD0 == (g52 = this.Ct.HW).kD0 && g51.vu0 == g52.vu0 && tc.zl() && tc != paramKr0 && ((Kr0)(tc = tc)).YP == paramKr0.YP)
/*    */         arrayList.add(tc); 
/*    */     } 
/*    */     return arrayList.<Kr0>toArray(new Kr0[0]);
/*    */   }
/*    */   
/*    */   public final void cA0(short paramShort) {
/*    */     for (Iterator iterator = this.KO.values().iterator(); hasNext();) {
/*    */       if (tc = (tc)next() instanceof Kr0 && ((Kr0)(tc = tc)).YP == paramShort)
/*    */         ((Kr0)tc).R3 = -1; 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void dispose() {
/*    */     Ut0 ut0;
/*    */     (ut0 = this.Im0).getClass();
/*    */     for (Iterator<KI> iterator = (new mt(ut0)).iterator(); iterator.hasNext(); ((KI)iterator.next()).dispose());
/*    */     this.Im0.clear();
/*    */   }
/*    */   
/*    */   public final boolean bk(byte paramByte, xr0 paramxr0) {
/*    */     if (paramxr0 == null)
/*    */       return false; 
/*    */     Iterator iterator = this.KO.values().iterator();
/*    */     while (hasNext()) {
/*    */       tc tc;
/*    */       if ((tc = (tc)next()).zl() && !tc.er() && tc.jC(paramByte, paramxr0))
/*    */         return true; 
/*    */     } 
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final ArrayList bm(int paramInt) {
/*    */     short s1 = -100, s2 = -100;
/*    */     Jo jo;
/*    */     if ((jo = this.Ct) != null) {
/*    */       s1 = jo.HW.mm;
/*    */       s2 = jo.HW.Yu0;
/*    */     } 
/*    */     this();
/*    */     ArrayList arrayList;
/*    */     for (Iterator<tc> iterator = this.KO.values().iterator(); iterator.hasNext(); ) {
/*    */       tc tc;
/*    */       (tc = iterator.next()).getClass();
/*    */       short s = tc.HW.mm;
/*    */       long l = (s - s1);
/*    */       l *= l;
/*    */       if (!((tc)iterator.next() instanceof Jo) || Math.sqrt(((tc.HW.Yu0 - s2) * (tc.HW.Yu0 - s2) + l)) > paramInt)
/*    */         continue; 
/*    */       add((E)tc);
/*    */     } 
/*    */     return this;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/vh0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */