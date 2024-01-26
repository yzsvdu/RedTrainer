/*  1 */ package f;public final class d7 { public tc OF0; public long HQ; public long nx; public long xc; public long Eq; public long rl0; public long yE; public boolean J4; public boolean eF; public int tD0; public nl Mv; private void UB() { (this.OF0.default()).Jg0 = false;
/*    */ 
/*    */     
/*  4 */     this.OF0.Ae.Y1
/*    */       
/*  6 */       .Jg0 = false;
/*  7 */     char c = 'Ǵ'; (ud.Bp())
/*  8 */       .qu
/*  9 */       .gz0(0, 255, c); } public long YJ; public byte QO; public boolean n3; public eo cOm3; public eo aA0; public eo AU; public Tb G0; public boolean pS; public eo zF; public final LinkedList ew0; public d7(tc paramtc) { eo eo1; LinkedList linkedList; this.HQ = 0L; this.nx = 0L; this.xc = 0L; this.Eq = 0L; this.rl0 = 0L; this.yE = 0L; this.J4 = false; this.eF = false; this.tD0 = 150; this.Mv = null; this.YJ = 0L; this.QO = 0; this.n3 = false; this(); this.cOm3 = this; this(); this.aA0 = this; this(); this.AU = this; this.G0 = null; this.pS = false; this(); this.zF = this; this(); this.ew0 = this; this.OF0 = paramtc; } public static void mB0(G5 paramG5) { km.u4.e20.W3(new t(paramG5, false, false)); } public final void Q80() { this.OF0.getClass(); if (this.OF0 instanceof zk0) { this.tD0 = ((zk0)this.OF0).jU.pm.tD0; return; }  xr0 xr0; int i; if ((xr0 = this.OF0.HW.CJ0()) != null && (i = xr0.hz().Pt(this.OF0.XC())) > 0) { this.tD0 = i; return; }  if (this.J4) { this.tD0 = 650; } else if (this.eF || this.OF0.VO()) { this.tD0 = 300; } else if (this.OF0.UG()) { this.tD0 = 100; } else if (this.OF0.XC()) { tc tc2; if ((tc2 = this.OF0).HW.FB == 3 && 
/* 10 */         !tc2.z80()) { this.tD0 = 125; } else { this.tD0 = 75; }  } else if (this.OF0.z80()) { this.tD0 = 175; } else { this.tD0 = 250; }
/* 11 */      tc tc1; zk0 zk0; if ((zk0 = (tc1 = this.OF0).Ae) != null)
/* 12 */       zk0.pm
/* 13 */         .tD0 = this.tD0;  if ((tc1 = tc1.U0()) != null)
/* 14 */       tc1.pm
/* 15 */         .tD0 = this.tD0;  } public final void d1(tc paramtc, xr0 paramxr0) { xr0 xr01; if (paramxr0 == null) return;  tc tc1; if ((tc1 = paramtc.U0()) != null) { xr01 = tc1.HW.CJ0(); ek0(paramtc, tc1, paramxr0); ek0(tc1, paramtc.Ae, this); } else { super.ek0(paramtc, paramtc.Ae, paramxr0); }  } public final void ek0(tc paramtc1, tc paramtc2, xr0 paramxr0) { if (paramtc2 == null || !paramtc2.pm.ew0.isEmpty()) return;  byte b2 = paramtc1.HW.g50; xr0 xr01; if ((xr01 = paramtc2.HW.CJ0()) != null) { byte b; for (b = 0; b < 4; ) { if (xr01.Q4().COm3(xr01, b, 1) == paramxr0) { b2 = b; break; }  b = (byte)(b + 1); }  }  d7 d71 = paramtc2.pm; G5 g5 = new G5(); byte b3 = (paramxr0.Q4()).E10; byte b4 = (paramxr0.Q4()).cA; byte b5 = (paramxr0.Q4()).VZ; boolean bool = paramxr0.Y00(); short s1 = paramxr0.Ka(), s2 = paramxr0.hA0(); if (paramxr0.bl0() < 0)
/*    */     
/* 17 */     { b1 = this.OF0.HW.Qf0; }
/* 18 */     else { b1 = paramxr0.bl0(); }  this(b3, b4, b5, bool, s1, s2, b1, b2); LinkedList linkedList; byte b1 = 0; /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/LinkedList}, name=null} */ 
/* 19 */     try { d71
/* 20 */         .ew0.add(new kG0(g5, b1));
/*    */       /* monitor exit BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/LinkedList}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/util/LinkedList}, expression=ClassFileLocalVariableReferenceExpression{type=ObjectType{f/d7}, name=null}, name=ew0, descriptor=Ljava/util/LinkedList;}} */
/*    */       return; }
/*    */     finally
/* 24 */     { Exception exception = null; /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/LinkedList}, name=null} */ }  } public final void j10(long paramLong) { long l; if ((l = zm0.u20) - this.HQ + this.tD0 > 250L) this.yE = l;  this.HQ = l + paramLong; } public final void Cb0(G5 paramG5) { LinkedList linkedList; byte b; /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/LinkedList}, name=null} */ try { this.ew0.clear(); /* monitor exit BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/LinkedList}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/util/LinkedList}, expression=ThisExpression{ObjectType{f/d7}}, name=ew0, descriptor=Ljava/util/LinkedList;}} */ (this.OF0.default()).Bm0.gL(); this.OF0.HW.Ic(paramG5); this.n3 = false; if (this.OF0 == km.a3.Ct) { R8 r8; if ((r8 = km.u4).sU) { if (!r8.NR()) j10(25L);  ud.Bp().Xk(500, true); if ((r8 = km.u4).tN) { r8.tN = false; UB0.Kg0.fN(new Jg()); }  (this.OF0.default()).Jg0 = true; }  byte b1 = paramG5.FB; b = paramG5.kD0; byte b2 = paramG5.vu0; short s1 = paramG5.mm; short s2 = paramG5.Yu0; km.u4.Lz.bv = b1; km.u4.Lz.GL0 = b; km.u4.Lz.oI = b2; km.u4.Lz.WM = s1; km.u4.Lz.bg0 = s2; }  return; } finally { this = null;
/*    */       /* monitor exit ClassFileLocalVariableReferenceExpression{type=PrimitiveType{primitive=byte}, name=null} */ }
/*    */      }
/*    */ 
/*    */   
/*    */   public final void Bg(xr0 paramxr0) {
/*    */     this.OF0.getClass();
/*    */     if (!(this.OF0 instanceof Jo))
/*    */       return; 
/*    */     if (!this.OF0.XC())
/*    */       return; 
/*    */     if (this.OF0.VO() || this.OF0.UG())
/*    */       return; 
/*    */     if (((Jo)this.OF0).lB0.JM(Vp0.c6) == 17) {
/*    */       qe0 qe0;
/*    */       byte b;
/*    */       if (Mk0.sz0(b = (paramxr0.Q4()).E10)) {
/*    */         this(b);
/*    */         paramxr0.TL0(qe0);
/*    */       } else {
/*    */         a50 a50;
/*    */         this();
/*    */         qe0.TL0(this);
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final boolean Dx0(xr0 paramxr01, xr0 paramxr02, byte paramByte, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: ifnull -> 377
/*    */     //   4: aload_1
/*    */     //   5: ifnonnull -> 11
/*    */     //   8: goto -> 377
/*    */     //   11: aload_2
/*    */     //   12: invokevirtual T9 : ()Z
/*    */     //   15: ifeq -> 20
/*    */     //   18: iconst_0
/*    */     //   19: ireturn
/*    */     //   20: aload_1
/*    */     //   21: invokevirtual hz : ()Lf/ZK0;
/*    */     //   24: iload_3
/*    */     //   25: invokevirtual nk : (B)Z
/*    */     //   28: ifeq -> 33
/*    */     //   31: iconst_1
/*    */     //   32: ireturn
/*    */     //   33: aload_1
/*    */     //   34: iload #4
/*    */     //   36: iload #5
/*    */     //   38: invokestatic ZB0 : (ZZ)B
/*    */     //   41: istore #4
/*    */     //   43: invokevirtual hz : ()Lf/ZK0;
/*    */     //   46: iload_3
/*    */     //   47: invokevirtual oO : (B)Z
/*    */     //   50: ifeq -> 56
/*    */     //   53: goto -> 74
/*    */     //   56: aload_2
/*    */     //   57: invokevirtual hz : ()Lf/ZK0;
/*    */     //   60: aload_2
/*    */     //   61: aload_0
/*    */     //   62: getfield OF0 : Lf/tc;
/*    */     //   65: iload_3
/*    */     //   66: iload #4
/*    */     //   68: invokevirtual sl0 : (Lf/xr0;Lf/tc;BB)Z
/*    */     //   71: ifeq -> 78
/*    */     //   74: iconst_0
/*    */     //   75: goto -> 79
/*    */     //   78: iconst_1
/*    */     //   79: ifne -> 84
/*    */     //   82: iconst_0
/*    */     //   83: ireturn
/*    */     //   84: aload_0
/*    */     //   85: getfield QO : B
/*    */     //   88: ifle -> 93
/*    */     //   91: iconst_0
/*    */     //   92: ireturn
/*    */     //   93: aload_2
/*    */     //   94: aload_0
/*    */     //   95: getfield OF0 : Lf/tc;
/*    */     //   98: getfield HW : Lf/G5;
/*    */     //   101: getfield Qf0 : B
/*    */     //   104: istore_3
/*    */     //   105: instanceof f/xW
/*    */     //   108: ifeq -> 284
/*    */     //   111: iload_3
/*    */     //   112: bipush #-10
/*    */     //   114: if_icmpne -> 154
/*    */     //   117: aload_1
/*    */     //   118: invokevirtual bl0 : ()B
/*    */     //   121: bipush #14
/*    */     //   123: if_icmpeq -> 154
/*    */     //   126: aload_1
/*    */     //   127: invokevirtual bl0 : ()B
/*    */     //   130: bipush #-2
/*    */     //   132: if_icmpeq -> 154
/*    */     //   135: aload_0
/*    */     //   136: getfield OF0 : Lf/tc;
/*    */     //   139: getfield HW : Lf/G5;
/*    */     //   142: dup
/*    */     //   143: aload_1
/*    */     //   144: invokevirtual bl0 : ()B
/*    */     //   147: putfield Qf0 : B
/*    */     //   150: aconst_null
/*    */     //   151: putfield lT : Lf/xr0;
/*    */     //   154: aload_0
/*    */     //   155: getfield OF0 : Lf/tc;
/*    */     //   158: getfield HW : Lf/G5;
/*    */     //   161: getfield Qf0 : B
/*    */     //   164: aload_2
/*    */     //   165: invokevirtual bl0 : ()B
/*    */     //   168: if_icmpeq -> 330
/*    */     //   171: aload_0
/*    */     //   172: getfield OF0 : Lf/tc;
/*    */     //   175: getfield HW : Lf/G5;
/*    */     //   178: getfield Qf0 : B
/*    */     //   181: ifne -> 195
/*    */     //   184: aload_2
/*    */     //   185: invokevirtual bl0 : ()B
/*    */     //   188: iconst_2
/*    */     //   189: if_icmpne -> 195
/*    */     //   192: goto -> 276
/*    */     //   195: aload_0
/*    */     //   196: getfield OF0 : Lf/tc;
/*    */     //   199: getfield HW : Lf/G5;
/*    */     //   202: getfield Qf0 : B
/*    */     //   205: bipush #-10
/*    */     //   207: if_icmpeq -> 276
/*    */     //   210: aload_1
/*    */     //   211: invokevirtual bl0 : ()B
/*    */     //   214: iconst_m1
/*    */     //   215: if_icmpeq -> 276
/*    */     //   218: aload_2
/*    */     //   219: invokevirtual bl0 : ()B
/*    */     //   222: iconst_m1
/*    */     //   223: if_icmpne -> 229
/*    */     //   226: goto -> 276
/*    */     //   229: aload_2
/*    */     //   230: invokevirtual bl0 : ()B
/*    */     //   233: bipush #14
/*    */     //   235: if_icmpeq -> 330
/*    */     //   238: aload_2
/*    */     //   239: invokevirtual bl0 : ()B
/*    */     //   242: bipush #-2
/*    */     //   244: if_icmpne -> 250
/*    */     //   247: goto -> 330
/*    */     //   250: iload #6
/*    */     //   252: ifeq -> 274
/*    */     //   255: aload_1
/*    */     //   256: invokevirtual bl0 : ()B
/*    */     //   259: iconst_4
/*    */     //   260: if_icmpne -> 274
/*    */     //   263: aload_2
/*    */     //   264: invokevirtual bl0 : ()B
/*    */     //   267: iconst_2
/*    */     //   268: if_icmpne -> 274
/*    */     //   271: goto -> 276
/*    */     //   274: iconst_0
/*    */     //   275: ireturn
/*    */     //   276: aload_2
/*    */     //   277: invokevirtual bl0 : ()B
/*    */     //   280: istore_3
/*    */     //   281: goto -> 330
/*    */     //   284: aload_2
/*    */     //   285: instanceof f/il
/*    */     //   288: ifeq -> 330
/*    */     //   291: aload_1
/*    */     //   292: invokevirtual i00 : ()F
/*    */     //   295: aload_2
/*    */     //   296: invokevirtual i00 : ()F
/*    */     //   299: fsub
/*    */     //   300: invokestatic abs : (F)F
/*    */     //   303: ldc_w 1.27
/*    */     //   306: fcmpl
/*    */     //   307: ifle -> 312
/*    */     //   310: iconst_0
/*    */     //   311: ireturn
/*    */     //   312: aload_2
/*    */     //   313: iconst_0
/*    */     //   314: invokevirtual Gc : (B)Z
/*    */     //   317: ifeq -> 330
/*    */     //   320: aload_1
/*    */     //   321: iconst_0
/*    */     //   322: invokevirtual Gc : (B)Z
/*    */     //   325: ifne -> 330
/*    */     //   328: iconst_0
/*    */     //   329: ireturn
/*    */     //   330: getstatic f/km.a3 : Lf/vh0;
/*    */     //   333: dup
/*    */     //   334: astore_1
/*    */     //   335: getfield yD : I
/*    */     //   338: aload_0
/*    */     //   339: getfield OF0 : Lf/tc;
/*    */     //   342: dup
/*    */     //   343: astore #4
/*    */     //   345: getfield Jg : I
/*    */     //   348: if_icmpeq -> 359
/*    */     //   351: aload #4
/*    */     //   353: instanceof f/Kr0
/*    */     //   356: ifeq -> 370
/*    */     //   359: aload_1
/*    */     //   360: iload_3
/*    */     //   361: aload_2
/*    */     //   362: invokevirtual bk : (BLf/xr0;)Z
/*    */     //   365: ifeq -> 370
/*    */     //   368: iconst_0
/*    */     //   369: ireturn
/*    */     //   370: aload_0
/*    */     //   371: aload_2
/*    */     //   372: invokevirtual nUL : (Lf/xr0;)V
/*    */     //   375: iconst_1
/*    */     //   376: ireturn
/*    */     //   377: iconst_0
/*    */     //   378: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 43
/*    */     //   #2	-> 85
/*    */     //   #3	-> 98
/*    */     //   #4	-> 101
/*    */     //   #5	-> 105
/*    */     //   #6	-> 139
/*    */     //   #7	-> 144
/*    */     //   #8	-> 147
/*    */     //   #9	-> 151
/*    */     //   #10	-> 155
/*    */     //   #11	-> 158
/*    */     //   #12	-> 161
/*    */     //   #13	-> 165
/*    */     //   #14	-> 175
/*    */     //   #15	-> 178
/*    */     //   #16	-> 185
/*    */     //   #17	-> 199
/*    */     //   #18	-> 202
/*    */     //   #19	-> 211
/*    */     //   #20	-> 335
/*    */     //   #21	-> 339
/*    */     //   #22	-> 345
/*    */     //   #23	-> 353
/*    */   }
/*    */   
/*    */   public final void u3() {
/*    */     nUL(this.OF0.HW.CJ0());
/*    */   }
/*    */   
/*    */   public final void nUL(xr0 paramxr0) {
/*    */     this.OF0.getClass();
/*    */     this.OF0.getClass();
/*    */     if ((!(this.OF0 instanceof Jo) && !(this.OF0 instanceof zk0)) || paramxr0 == null)
/*    */       return; 
/*    */     if (paramxr0 instanceof xW) {
/*    */       if (this.OF0.VO() && (paramxr0.Q4()).UZ != vF.Cv0)
/*    */         this.OF0.G80 = (byte)(this.OF0.G80 & 0xFFFFFFEF); 
/*    */       if (!this.OF0.VO() && (paramxr0.Q4()).UZ == vF.Cv0)
/*    */         this.OF0.G80 = (byte)(this.OF0.G80 | 0x10); 
/*    */     } else if (this.OF0.VO()) {
/*    */       this.OF0.G80 = (byte)(this.OF0.G80 & 0xFFFFFFEF);
/*    */     } 
/*    */     if (this.OF0.UG() && !paramxr0.Gc(this.OF0.HW.Qf0))
/*    */       this.OF0.sq(false); 
/*    */     if (!this.OF0.UG() && paramxr0.Gc(this.OF0.HW.Qf0))
/*    */       this.OF0.sq(true); 
/*    */   }
/*    */   
/*    */   public final boolean gD0() {
/*    */     if (this.n3)
/*    */       return false; 
/*    */     long l;
/*    */     if (this.Eq > (l = zm0.u20))
/*    */       return false; 
/*    */     return (this.HQ + this.tD0 > l) ? false : (!(this.nx + 100L > l));
/*    */   }
/*    */   
/*    */   public final synchronized boolean qz0(byte paramByte) {
/*    */     if (!gD0())
/*    */       return false; 
/*    */     if (paramByte != -1) {
/*    */       byte b1 = this.OF0.HW.FB;
/*    */       byte b2 = this.OF0.HW.kD0;
/*    */       byte b3 = this.OF0.HW.vu0;
/*    */       if (km.a3.COm8(b1, b2, b3) == null)
/*    */         return false; 
/*    */       xr0 xr0;
/*    */       if ((xr0 = this.OF0.HW.CJ0()) != null)
/*    */         xr0.hz().getClass(); 
/*    */     } 
/*    */     this.OF0.getClass();
/*    */     if (!(this.OF0 instanceof zk0))
/*    */       this.nx = zm0.u20; 
/*    */     this.OF0.HW.g50 = paramByte;
/*    */     if ((paramByte = this.QO) > 0)
/*    */       this.QO = (byte)(paramByte - 1); 
/*    */     return true;
/*    */   }
/*    */   
/*    */   public final void si0() {
/*    */     Xi xi;
/*    */     if ((xi = km.wI0.iJ0) == null || !xi.w6)
/*    */       return; 
/*    */     /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/LinkedList}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/util/LinkedList}, expression=ThisExpression{ObjectType{f/d7}}, name=ew0, descriptor=Ljava/util/LinkedList;}} */
/*    */     if (gD0()) {
/*    */       LinkedList linkedList;
/*    */       try {
/*    */       
/*    */       } finally {
/*    */         this = null;
/*    */         /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/LinkedList}, name=null} */
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final boolean vE(nl paramnl, boolean paramBoolean) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: dup
/*    */     //   2: aload_0
/*    */     //   3: getfield OF0 : Lf/tc;
/*    */     //   6: getfield HW : Lf/G5;
/*    */     //   9: dup
/*    */     //   10: dup
/*    */     //   11: getfield mm : S
/*    */     //   14: istore_3
/*    */     //   15: getfield Yu0 : S
/*    */     //   18: istore #4
/*    */     //   20: invokevirtual VI0 : ()F
/*    */     //   23: fstore #5
/*    */     //   25: getfield rb : B
/*    */     //   28: istore #6
/*    */     //   30: getstatic f/nl.coM2 : Lf/nl;
/*    */     //   33: if_acmpne -> 59
/*    */     //   36: aload_0
/*    */     //   37: getfield OF0 : Lf/tc;
/*    */     //   40: dup
/*    */     //   41: astore #7
/*    */     //   43: instanceof f/Kr0
/*    */     //   46: ifeq -> 59
/*    */     //   49: aload #7
/*    */     //   51: checkcast f/Kr0
/*    */     //   54: getfield Oh0 : B
/*    */     //   57: istore #6
/*    */     //   59: iload #6
/*    */     //   61: tableswitch default -> 92, 0 -> 154, 1 -> 134, 2 -> 118, 3 -> 102
/*    */     //   92: iload_3
/*    */     //   93: iload #4
/*    */     //   95: istore #8
/*    */     //   97: istore #7
/*    */     //   99: goto -> 171
/*    */     //   102: iload_3
/*    */     //   103: aload_1
/*    */     //   104: getfield sv : B
/*    */     //   107: iadd
/*    */     //   108: i2s
/*    */     //   109: istore #7
/*    */     //   111: iload #4
/*    */     //   113: istore #8
/*    */     //   115: goto -> 171
/*    */     //   118: iload_3
/*    */     //   119: aload_1
/*    */     //   120: getfield sv : B
/*    */     //   123: isub
/*    */     //   124: i2s
/*    */     //   125: istore #7
/*    */     //   127: iload #4
/*    */     //   129: istore #8
/*    */     //   131: goto -> 171
/*    */     //   134: iload #4
/*    */     //   136: aload_1
/*    */     //   137: getfield sv : B
/*    */     //   140: isub
/*    */     //   141: i2s
/*    */     //   142: istore #7
/*    */     //   144: iload_3
/*    */     //   145: iload #7
/*    */     //   147: istore #8
/*    */     //   149: istore #7
/*    */     //   151: goto -> 171
/*    */     //   154: iload #4
/*    */     //   156: aload_1
/*    */     //   157: getfield sv : B
/*    */     //   160: iadd
/*    */     //   161: i2s
/*    */     //   162: istore #7
/*    */     //   164: iload_3
/*    */     //   165: iload #7
/*    */     //   167: istore #8
/*    */     //   169: istore #7
/*    */     //   171: aload_1
/*    */     //   172: invokevirtual ordinal : ()I
/*    */     //   175: dup
/*    */     //   176: istore #9
/*    */     //   178: bipush #102
/*    */     //   180: if_icmpeq -> 259
/*    */     //   183: iload #9
/*    */     //   185: bipush #103
/*    */     //   187: if_icmpeq -> 209
/*    */     //   190: iload #9
/*    */     //   192: sipush #182
/*    */     //   195: if_icmpeq -> 259
/*    */     //   198: iload #9
/*    */     //   200: sipush #183
/*    */     //   203: if_icmpeq -> 209
/*    */     //   206: goto -> 287
/*    */     //   209: aload_0
/*    */     //   210: getfield OF0 : Lf/tc;
/*    */     //   213: invokevirtual default : ()Lf/static;
/*    */     //   216: invokevirtual DE0 : ()B
/*    */     //   219: iconst_m1
/*    */     //   220: if_icmpeq -> 244
/*    */     //   223: aload_0
/*    */     //   224: getfield OF0 : Lf/tc;
/*    */     //   227: dup
/*    */     //   228: astore #9
/*    */     //   230: getfield HW : Lf/G5;
/*    */     //   233: aload #9
/*    */     //   235: invokevirtual default : ()Lf/static;
/*    */     //   238: invokevirtual DE0 : ()B
/*    */     //   241: putfield g50 : B
/*    */     //   244: aload_0
/*    */     //   245: getfield OF0 : Lf/tc;
/*    */     //   248: invokevirtual default : ()Lf/static;
/*    */     //   251: astore #9
/*    */     //   253: iconst_m1
/*    */     //   254: istore #10
/*    */     //   256: goto -> 280
/*    */     //   259: aload_0
/*    */     //   260: dup
/*    */     //   261: getfield OF0 : Lf/tc;
/*    */     //   264: invokevirtual default : ()Lf/static;
/*    */     //   267: astore #9
/*    */     //   269: getfield OF0 : Lf/tc;
/*    */     //   272: getfield HW : Lf/G5;
/*    */     //   275: getfield g50 : B
/*    */     //   278: istore #10
/*    */     //   280: aload #9
/*    */     //   282: iload #10
/*    */     //   284: putfield G30 : B
/*    */     //   287: aload_1
/*    */     //   288: getstatic f/nl.t10 : Lf/nl;
/*    */     //   291: if_acmpne -> 373
/*    */     //   294: getstatic f/km.a3 : Lf/vh0;
/*    */     //   297: getfield Ct : Lf/Jo;
/*    */     //   300: dup
/*    */     //   301: astore #9
/*    */     //   303: ifnull -> 373
/*    */     //   306: aload #9
/*    */     //   308: getfield HW : Lf/G5;
/*    */     //   311: dup
/*    */     //   312: astore #9
/*    */     //   314: getfield mm : S
/*    */     //   317: dup
/*    */     //   318: istore #10
/*    */     //   320: iload #7
/*    */     //   322: if_icmple -> 331
/*    */     //   325: iconst_3
/*    */     //   326: istore #6
/*    */     //   328: goto -> 373
/*    */     //   331: iload #10
/*    */     //   333: iload #7
/*    */     //   335: if_icmpge -> 344
/*    */     //   338: iconst_2
/*    */     //   339: istore #6
/*    */     //   341: goto -> 373
/*    */     //   344: aload #9
/*    */     //   346: getfield Yu0 : S
/*    */     //   349: dup
/*    */     //   350: istore #9
/*    */     //   352: iload #8
/*    */     //   354: if_icmpge -> 363
/*    */     //   357: iconst_1
/*    */     //   358: istore #6
/*    */     //   360: goto -> 373
/*    */     //   363: iload #9
/*    */     //   365: iload #8
/*    */     //   367: if_icmple -> 373
/*    */     //   370: iconst_0
/*    */     //   371: istore #6
/*    */     //   373: iload #6
/*    */     //   375: iconst_m1
/*    */     //   376: if_icmpne -> 391
/*    */     //   379: aload_0
/*    */     //   380: getfield OF0 : Lf/tc;
/*    */     //   383: getfield HW : Lf/G5;
/*    */     //   386: getfield g50 : B
/*    */     //   389: istore #6
/*    */     //   391: getstatic f/km.a3 : Lf/vh0;
/*    */     //   394: aload_0
/*    */     //   395: getfield OF0 : Lf/tc;
/*    */     //   398: getfield HW : Lf/G5;
/*    */     //   401: dup
/*    */     //   402: dup
/*    */     //   403: getfield FB : B
/*    */     //   406: istore #9
/*    */     //   408: getfield kD0 : B
/*    */     //   411: istore #10
/*    */     //   413: getfield vu0 : B
/*    */     //   416: istore #11
/*    */     //   418: iload #9
/*    */     //   420: iload #10
/*    */     //   422: iload #11
/*    */     //   424: invokevirtual COm8 : (BBB)Lf/KI;
/*    */     //   427: dup
/*    */     //   428: astore #9
/*    */     //   430: ifnonnull -> 435
/*    */     //   433: iconst_0
/*    */     //   434: ireturn
/*    */     //   435: aload_0
/*    */     //   436: getfield OF0 : Lf/tc;
/*    */     //   439: getfield HW : Lf/G5;
/*    */     //   442: invokevirtual CJ0 : ()Lf/xr0;
/*    */     //   445: dup
/*    */     //   446: astore #10
/*    */     //   448: ifnull -> 490
/*    */     //   451: aload #10
/*    */     //   453: invokevirtual Y00 : ()Z
/*    */     //   456: ifeq -> 490
/*    */     //   459: iconst_0
/*    */     //   460: istore #7
/*    */     //   462: aload #10
/*    */     //   464: astore #8
/*    */     //   466: iload #7
/*    */     //   468: aload_1
/*    */     //   469: getfield sv : B
/*    */     //   472: if_icmpge -> 521
/*    */     //   475: aload #8
/*    */     //   477: iload #6
/*    */     //   479: invokevirtual Cx : (B)Lf/xr0;
/*    */     //   482: astore #8
/*    */     //   484: iinc #7, 1
/*    */     //   487: goto -> 466
/*    */     //   490: aload #10
/*    */     //   492: ifnonnull -> 501
/*    */     //   495: fconst_0
/*    */     //   496: fstore #11
/*    */     //   498: goto -> 508
/*    */     //   501: aload #10
/*    */     //   503: invokevirtual i00 : ()F
/*    */     //   506: fstore #11
/*    */     //   508: aload #9
/*    */     //   510: iload #7
/*    */     //   512: iload #8
/*    */     //   514: fload #11
/*    */     //   516: invokevirtual U30 : (SSF)Lf/xr0;
/*    */     //   519: astore #8
/*    */     //   521: aload #8
/*    */     //   523: ifnonnull -> 528
/*    */     //   526: iconst_0
/*    */     //   527: ireturn
/*    */     //   528: aload #8
/*    */     //   530: invokevirtual Y00 : ()Z
/*    */     //   533: ifeq -> 588
/*    */     //   536: aload #8
/*    */     //   538: invokevirtual hz : ()Lf/ZK0;
/*    */     //   541: dup
/*    */     //   542: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   545: pop
/*    */     //   546: instanceof f/mO
/*    */     //   549: ifeq -> 588
/*    */     //   552: aload #9
/*    */     //   554: aload #8
/*    */     //   556: invokevirtual j5 : ()Lf/eo;
/*    */     //   559: getfield x : F
/*    */     //   562: f2i
/*    */     //   563: i2s
/*    */     //   564: aload #8
/*    */     //   566: invokevirtual j5 : ()Lf/eo;
/*    */     //   569: getfield z : F
/*    */     //   572: f2i
/*    */     //   573: i2s
/*    */     //   574: iconst_0
/*    */     //   575: invokevirtual v50 : (III)Lf/xr0;
/*    */     //   578: dup
/*    */     //   579: astore #7
/*    */     //   581: ifnull -> 588
/*    */     //   584: aload #7
/*    */     //   586: astore #8
/*    */     //   588: aload_0
/*    */     //   589: getfield OF0 : Lf/tc;
/*    */     //   592: dup
/*    */     //   593: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   596: pop
/*    */     //   597: instanceof f/Jo
/*    */     //   600: ifeq -> 639
/*    */     //   603: aload_1
/*    */     //   604: getfield sv : B
/*    */     //   607: ifle -> 639
/*    */     //   610: aload_0
/*    */     //   611: aload #10
/*    */     //   613: aload_1
/*    */     //   614: getfield fv0 : Z
/*    */     //   617: istore #7
/*    */     //   619: aload #8
/*    */     //   621: iload #6
/*    */     //   623: iload #7
/*    */     //   625: iconst_0
/*    */     //   626: iconst_0
/*    */     //   627: invokevirtual Dx0 : (Lf/xr0;Lf/xr0;BZZZ)Z
/*    */     //   630: ifne -> 639
/*    */     //   633: iload_2
/*    */     //   634: ifne -> 639
/*    */     //   637: iconst_0
/*    */     //   638: ireturn
/*    */     //   639: iload_2
/*    */     //   640: ifne -> 887
/*    */     //   643: aload_1
/*    */     //   644: getfield sv : B
/*    */     //   647: ifle -> 887
/*    */     //   650: aload_0
/*    */     //   651: getfield OF0 : Lf/tc;
/*    */     //   654: instanceof f/Kr0
/*    */     //   657: ifeq -> 887
/*    */     //   660: aload #8
/*    */     //   662: invokevirtual Q4 : ()Lf/KI;
/*    */     //   665: getfield cA : B
/*    */     //   668: aload_0
/*    */     //   669: getfield OF0 : Lf/tc;
/*    */     //   672: getfield HW : Lf/G5;
/*    */     //   675: getfield kD0 : B
/*    */     //   678: if_icmpne -> 764
/*    */     //   681: aload #8
/*    */     //   683: invokevirtual Q4 : ()Lf/KI;
/*    */     //   686: getfield VZ : B
/*    */     //   689: aload_0
/*    */     //   690: getfield OF0 : Lf/tc;
/*    */     //   693: getfield HW : Lf/G5;
/*    */     //   696: getfield vu0 : B
/*    */     //   699: if_icmpne -> 764
/*    */     //   702: aload_0
/*    */     //   703: aload #10
/*    */     //   705: aload_1
/*    */     //   706: getfield fv0 : Z
/*    */     //   709: istore_2
/*    */     //   710: aload #8
/*    */     //   712: iload #6
/*    */     //   714: iload_2
/*    */     //   715: iconst_0
/*    */     //   716: iconst_0
/*    */     //   717: invokevirtual Dx0 : (Lf/xr0;Lf/xr0;BZZZ)Z
/*    */     //   720: ifeq -> 764
/*    */     //   723: getstatic f/km.a3 : Lf/vh0;
/*    */     //   726: aload_0
/*    */     //   727: getfield OF0 : Lf/tc;
/*    */     //   730: getfield HW : Lf/G5;
/*    */     //   733: getfield Qf0 : B
/*    */     //   736: istore_2
/*    */     //   737: getfield Ct : Lf/Jo;
/*    */     //   740: dup
/*    */     //   741: astore #7
/*    */     //   743: ifnonnull -> 751
/*    */     //   746: iconst_0
/*    */     //   747: istore_2
/*    */     //   748: goto -> 760
/*    */     //   751: aload #7
/*    */     //   753: iload_2
/*    */     //   754: aload #8
/*    */     //   756: invokevirtual jC : (BLf/xr0;)Z
/*    */     //   759: istore_2
/*    */     //   760: iload_2
/*    */     //   761: ifeq -> 887
/*    */     //   764: iload #6
/*    */     //   766: aload_0
/*    */     //   767: getfield OF0 : Lf/tc;
/*    */     //   770: getfield HW : Lf/G5;
/*    */     //   773: dup
/*    */     //   774: astore_2
/*    */     //   775: getfield g50 : B
/*    */     //   778: if_icmpeq -> 794
/*    */     //   781: aload_0
/*    */     //   782: aload_2
/*    */     //   783: iload #6
/*    */     //   785: putfield g50 : B
/*    */     //   788: getstatic f/zm0.u20 : J
/*    */     //   791: putfield nx : J
/*    */     //   794: aload_1
/*    */     //   795: getfield sv : B
/*    */     //   798: ifle -> 830
/*    */     //   801: aload_0
/*    */     //   802: aload #10
/*    */     //   804: aload_1
/*    */     //   805: getfield fv0 : Z
/*    */     //   808: istore_2
/*    */     //   809: aload #8
/*    */     //   811: iload #6
/*    */     //   813: iload_2
/*    */     //   814: iconst_0
/*    */     //   815: iconst_0
/*    */     //   816: invokevirtual Dx0 : (Lf/xr0;Lf/xr0;BZZZ)Z
/*    */     //   819: ifeq -> 830
/*    */     //   822: aload_0
/*    */     //   823: lconst_0
/*    */     //   824: invokevirtual j10 : (J)V
/*    */     //   827: goto -> 837
/*    */     //   830: aload_0
/*    */     //   831: getstatic f/zm0.u20 : J
/*    */     //   834: putfield nx : J
/*    */     //   837: aload_1
/*    */     //   838: getfield sv : B
/*    */     //   841: ifgt -> 851
/*    */     //   844: aload_1
/*    */     //   845: getfield Iy : Z
/*    */     //   848: ifeq -> 858
/*    */     //   851: aload_0
/*    */     //   852: getstatic f/zm0.u20 : J
/*    */     //   855: putfield xc : J
/*    */     //   858: aload_0
/*    */     //   859: dup
/*    */     //   860: dup
/*    */     //   861: aload_1
/*    */     //   862: getfield qf0 : I
/*    */     //   865: dup
/*    */     //   866: istore_0
/*    */     //   867: putfield tD0 : I
/*    */     //   870: iload_0
/*    */     //   871: i2l
/*    */     //   872: getstatic f/zm0.u20 : J
/*    */     //   875: dup2
/*    */     //   876: lstore_0
/*    */     //   877: ladd
/*    */     //   878: putfield Eq : J
/*    */     //   881: lload_0
/*    */     //   882: putfield rl0 : J
/*    */     //   885: iconst_0
/*    */     //   886: ireturn
/*    */     //   887: aload #10
/*    */     //   889: ifnull -> 936
/*    */     //   892: aload #10
/*    */     //   894: invokevirtual Y00 : ()Z
/*    */     //   897: ifeq -> 936
/*    */     //   900: aload_0
/*    */     //   901: dup
/*    */     //   902: getfield aA0 : Lf/eo;
/*    */     //   905: aload #10
/*    */     //   907: invokevirtual j5 : ()Lf/eo;
/*    */     //   910: invokevirtual JL : (Lf/eo;)Lf/eo;
/*    */     //   913: pop
/*    */     //   914: getfield aA0 : Lf/eo;
/*    */     //   917: dup
/*    */     //   918: dup2
/*    */     //   919: getfield y : F
/*    */     //   922: fstore_2
/*    */     //   923: getfield z : F
/*    */     //   926: putfield y : F
/*    */     //   929: fload_2
/*    */     //   930: putfield z : F
/*    */     //   933: goto -> 1208
/*    */     //   936: aload #10
/*    */     //   938: instanceof f/il
/*    */     //   941: ifeq -> 970
/*    */     //   944: aload_0
/*    */     //   945: getfield aA0 : Lf/eo;
/*    */     //   948: iload_3
/*    */     //   949: i2f
/*    */     //   950: ldc_w 0.5
/*    */     //   953: fadd
/*    */     //   954: iload #4
/*    */     //   956: i2f
/*    */     //   957: ldc_w 0.5
/*    */     //   960: fadd
/*    */     //   961: fload #5
/*    */     //   963: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   966: pop
/*    */     //   967: goto -> 1208
/*    */     //   970: aload_0
/*    */     //   971: getfield OF0 : Lf/tc;
/*    */     //   974: getfield HW : Lf/G5;
/*    */     //   977: getfield FB : B
/*    */     //   980: aload #8
/*    */     //   982: invokevirtual Q4 : ()Lf/KI;
/*    */     //   985: getfield E10 : B
/*    */     //   988: if_icmpne -> 1054
/*    */     //   991: aload_0
/*    */     //   992: getfield OF0 : Lf/tc;
/*    */     //   995: getfield HW : Lf/G5;
/*    */     //   998: getfield kD0 : B
/*    */     //   1001: aload #8
/*    */     //   1003: invokevirtual Q4 : ()Lf/KI;
/*    */     //   1006: getfield cA : B
/*    */     //   1009: if_icmpne -> 1054
/*    */     //   1012: aload_0
/*    */     //   1013: getfield OF0 : Lf/tc;
/*    */     //   1016: getfield HW : Lf/G5;
/*    */     //   1019: getfield vu0 : B
/*    */     //   1022: aload #8
/*    */     //   1024: invokevirtual Q4 : ()Lf/KI;
/*    */     //   1027: getfield VZ : B
/*    */     //   1030: if_icmpne -> 1054
/*    */     //   1033: aload_0
/*    */     //   1034: getfield aA0 : Lf/eo;
/*    */     //   1037: iload #4
/*    */     //   1039: iload_3
/*    */     //   1040: i2f
/*    */     //   1041: fstore_2
/*    */     //   1042: i2f
/*    */     //   1043: fload_2
/*    */     //   1044: swap
/*    */     //   1045: fload #5
/*    */     //   1047: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   1050: pop
/*    */     //   1051: goto -> 1208
/*    */     //   1054: iload #6
/*    */     //   1056: tableswitch default -> 1088, 0 -> 1181, 1 -> 1151, 2 -> 1121, 3 -> 1091
/*    */     //   1088: goto -> 1208
/*    */     //   1091: aload_0
/*    */     //   1092: getfield aA0 : Lf/eo;
/*    */     //   1095: aload #8
/*    */     //   1097: invokevirtual Ka : ()S
/*    */     //   1100: aload_1
/*    */     //   1101: getfield sv : B
/*    */     //   1104: isub
/*    */     //   1105: i2f
/*    */     //   1106: aload #8
/*    */     //   1108: invokevirtual hA0 : ()S
/*    */     //   1111: i2f
/*    */     //   1112: fload #5
/*    */     //   1114: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   1117: pop
/*    */     //   1118: goto -> 1208
/*    */     //   1121: aload_0
/*    */     //   1122: getfield aA0 : Lf/eo;
/*    */     //   1125: aload #8
/*    */     //   1127: invokevirtual Ka : ()S
/*    */     //   1130: aload_1
/*    */     //   1131: getfield sv : B
/*    */     //   1134: iadd
/*    */     //   1135: i2f
/*    */     //   1136: aload #8
/*    */     //   1138: invokevirtual hA0 : ()S
/*    */     //   1141: i2f
/*    */     //   1142: fload #5
/*    */     //   1144: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   1147: pop
/*    */     //   1148: goto -> 1208
/*    */     //   1151: aload_0
/*    */     //   1152: getfield aA0 : Lf/eo;
/*    */     //   1155: aload #8
/*    */     //   1157: invokevirtual Ka : ()S
/*    */     //   1160: i2f
/*    */     //   1161: aload #8
/*    */     //   1163: invokevirtual hA0 : ()S
/*    */     //   1166: aload_1
/*    */     //   1167: getfield sv : B
/*    */     //   1170: iadd
/*    */     //   1171: i2f
/*    */     //   1172: fload #5
/*    */     //   1174: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   1177: pop
/*    */     //   1178: goto -> 1208
/*    */     //   1181: aload_0
/*    */     //   1182: getfield aA0 : Lf/eo;
/*    */     //   1185: aload #8
/*    */     //   1187: invokevirtual Ka : ()S
/*    */     //   1190: i2f
/*    */     //   1191: aload #8
/*    */     //   1193: invokevirtual hA0 : ()S
/*    */     //   1196: aload_1
/*    */     //   1197: getfield sv : B
/*    */     //   1200: isub
/*    */     //   1201: i2f
/*    */     //   1202: fload #5
/*    */     //   1204: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   1207: pop
/*    */     //   1208: aload_1
/*    */     //   1209: aload_0
/*    */     //   1210: iconst_1
/*    */     //   1211: putfield n3 : Z
/*    */     //   1214: getfield sv : B
/*    */     //   1217: ifle -> 1230
/*    */     //   1220: aload_0
/*    */     //   1221: dup
/*    */     //   1222: getfield OF0 : Lf/tc;
/*    */     //   1225: aload #10
/*    */     //   1227: invokevirtual d1 : (Lf/tc;Lf/xr0;)V
/*    */     //   1230: aload #8
/*    */     //   1232: invokevirtual Q4 : ()Lf/KI;
/*    */     //   1235: invokevirtual o50 : ()Z
/*    */     //   1238: ifeq -> 1347
/*    */     //   1241: aload #8
/*    */     //   1243: invokevirtual Q4 : ()Lf/KI;
/*    */     //   1246: getfield E10 : B
/*    */     //   1249: invokestatic sz0 : (B)Z
/*    */     //   1252: ifeq -> 1347
/*    */     //   1255: aload_0
/*    */     //   1256: getfield OF0 : Lf/tc;
/*    */     //   1259: invokevirtual Pf : ()Z
/*    */     //   1262: ifeq -> 1347
/*    */     //   1265: aload #8
/*    */     //   1267: invokevirtual Q4 : ()Lf/KI;
/*    */     //   1270: checkcast f/Cy
/*    */     //   1273: dup
/*    */     //   1274: astore_2
/*    */     //   1275: aload #8
/*    */     //   1277: dup
/*    */     //   1278: invokevirtual Ka : ()S
/*    */     //   1281: istore_3
/*    */     //   1282: invokevirtual hA0 : ()S
/*    */     //   1285: istore #4
/*    */     //   1287: getfield et0 : I
/*    */     //   1290: dup
/*    */     //   1291: istore #5
/*    */     //   1293: iconst_1
/*    */     //   1294: if_icmplt -> 1331
/*    */     //   1297: aload_2
/*    */     //   1298: getfield ey : I
/*    */     //   1301: dup
/*    */     //   1302: istore #7
/*    */     //   1304: iconst_1
/*    */     //   1305: if_icmpge -> 1311
/*    */     //   1308: goto -> 1331
/*    */     //   1311: aload_2
/*    */     //   1312: iload #4
/*    */     //   1314: iload_3
/*    */     //   1315: iload #5
/*    */     //   1317: idiv
/*    */     //   1318: istore_3
/*    */     //   1319: iload #7
/*    */     //   1321: idiv
/*    */     //   1322: iload_3
/*    */     //   1323: swap
/*    */     //   1324: invokevirtual XJ0 : (II)Lf/Ws0;
/*    */     //   1327: astore_3
/*    */     //   1328: goto -> 1338
/*    */     //   1331: aload_2
/*    */     //   1332: iconst_0
/*    */     //   1333: iconst_0
/*    */     //   1334: invokevirtual XJ0 : (II)Lf/Ws0;
/*    */     //   1337: astore_3
/*    */     //   1338: aload_3
/*    */     //   1339: ifnull -> 1347
/*    */     //   1342: aload_2
/*    */     //   1343: aload_3
/*    */     //   1344: invokevirtual wy0 : (Lf/Ws0;)V
/*    */     //   1347: aload #8
/*    */     //   1349: dup
/*    */     //   1350: dup2
/*    */     //   1351: aload_0
/*    */     //   1352: dup
/*    */     //   1353: getfield OF0 : Lf/tc;
/*    */     //   1356: getfield HW : Lf/G5;
/*    */     //   1359: dup
/*    */     //   1360: aload #8
/*    */     //   1362: invokevirtual Q4 : ()Lf/KI;
/*    */     //   1365: getfield cA : B
/*    */     //   1368: aload #8
/*    */     //   1370: invokevirtual Q4 : ()Lf/KI;
/*    */     //   1373: getfield VZ : B
/*    */     //   1376: istore_2
/*    */     //   1377: putfield kD0 : B
/*    */     //   1380: iload_2
/*    */     //   1381: putfield vu0 : B
/*    */     //   1384: getfield OF0 : Lf/tc;
/*    */     //   1387: getfield HW : Lf/G5;
/*    */     //   1390: astore_2
/*    */     //   1391: invokevirtual Y00 : ()Z
/*    */     //   1394: istore_3
/*    */     //   1395: invokevirtual Ka : ()S
/*    */     //   1398: istore #4
/*    */     //   1400: invokevirtual hA0 : ()S
/*    */     //   1403: istore #5
/*    */     //   1405: invokevirtual bl0 : ()B
/*    */     //   1408: ifge -> 1426
/*    */     //   1411: aload_0
/*    */     //   1412: getfield OF0 : Lf/tc;
/*    */     //   1415: getfield HW : Lf/G5;
/*    */     //   1418: getfield Qf0 : B
/*    */     //   1421: istore #7
/*    */     //   1423: goto -> 1433
/*    */     //   1426: aload #8
/*    */     //   1428: invokevirtual bl0 : ()B
/*    */     //   1431: istore #7
/*    */     //   1433: iload #6
/*    */     //   1435: ifge -> 1450
/*    */     //   1438: aload_0
/*    */     //   1439: getfield OF0 : Lf/tc;
/*    */     //   1442: getfield HW : Lf/G5;
/*    */     //   1445: getfield g50 : B
/*    */     //   1448: istore #6
/*    */     //   1450: aload_1
/*    */     //   1451: aload_0
/*    */     //   1452: dup
/*    */     //   1453: aload_1
/*    */     //   1454: aload_0
/*    */     //   1455: aload_1
/*    */     //   1456: aload_2
/*    */     //   1457: iload_3
/*    */     //   1458: iload #4
/*    */     //   1460: iload #5
/*    */     //   1462: iload #7
/*    */     //   1464: iload #6
/*    */     //   1466: invokevirtual Zh : (ZSSBB)V
/*    */     //   1469: putfield Mv : Lf/nl;
/*    */     //   1472: getfield Qx0 : Z
/*    */     //   1475: putfield J4 : Z
/*    */     //   1478: getfield OF0 : Lf/tc;
/*    */     //   1481: aload_1
/*    */     //   1482: getfield fv0 : Z
/*    */     //   1485: putfield dh : Z
/*    */     //   1488: getfield sv : B
/*    */     //   1491: ifgt -> 1514
/*    */     //   1494: aload_1
/*    */     //   1495: getfield Iy : Z
/*    */     //   1498: ifeq -> 1504
/*    */     //   1501: goto -> 1514
/*    */     //   1504: aload_0
/*    */     //   1505: getstatic f/zm0.u20 : J
/*    */     //   1508: putfield nx : J
/*    */     //   1511: goto -> 1519
/*    */     //   1514: aload_0
/*    */     //   1515: lconst_0
/*    */     //   1516: invokevirtual j10 : (J)V
/*    */     //   1519: aload_1
/*    */     //   1520: getfield sv : B
/*    */     //   1523: ifgt -> 1533
/*    */     //   1526: aload_1
/*    */     //   1527: getfield Iy : Z
/*    */     //   1530: ifeq -> 1540
/*    */     //   1533: aload_0
/*    */     //   1534: getstatic f/zm0.u20 : J
/*    */     //   1537: putfield xc : J
/*    */     //   1540: aload #10
/*    */     //   1542: aload #8
/*    */     //   1544: aload_0
/*    */     //   1545: dup
/*    */     //   1546: dup
/*    */     //   1547: aload_1
/*    */     //   1548: getfield qf0 : I
/*    */     //   1551: dup
/*    */     //   1552: istore_2
/*    */     //   1553: putfield tD0 : I
/*    */     //   1556: iload_2
/*    */     //   1557: i2l
/*    */     //   1558: getstatic f/zm0.u20 : J
/*    */     //   1561: dup2
/*    */     //   1562: lstore_3
/*    */     //   1563: ladd
/*    */     //   1564: putfield Eq : J
/*    */     //   1567: lload_3
/*    */     //   1568: putfield rl0 : J
/*    */     //   1571: if_acmpeq -> 1635
/*    */     //   1574: aload #10
/*    */     //   1576: aload #8
/*    */     //   1578: aload_1
/*    */     //   1579: aload_0
/*    */     //   1580: aload #8
/*    */     //   1582: invokevirtual nUL : (Lf/xr0;)V
/*    */     //   1585: getfield fv0 : Z
/*    */     //   1588: iconst_0
/*    */     //   1589: invokestatic ZB0 : (ZZ)B
/*    */     //   1592: iconst_1
/*    */     //   1593: ior
/*    */     //   1594: i2b
/*    */     //   1595: istore_2
/*    */     //   1596: invokevirtual hz : ()Lf/ZK0;
/*    */     //   1599: aload #8
/*    */     //   1601: aload_0
/*    */     //   1602: getfield OF0 : Lf/tc;
/*    */     //   1605: aload #10
/*    */     //   1607: swap
/*    */     //   1608: iload_2
/*    */     //   1609: invokevirtual com4 : (Lf/xr0;Lf/xr0;Lf/tc;B)Z
/*    */     //   1612: pop
/*    */     //   1613: ifnull -> 1635
/*    */     //   1616: aload_0
/*    */     //   1617: aload #10
/*    */     //   1619: dup
/*    */     //   1620: invokevirtual hz : ()Lf/ZK0;
/*    */     //   1623: aload_0
/*    */     //   1624: getfield OF0 : Lf/tc;
/*    */     //   1627: aload #10
/*    */     //   1629: invokevirtual Uk0 : (Lf/tc;Lf/xr0;)V
/*    */     //   1632: invokevirtual Bg : (Lf/xr0;)V
/*    */     //   1635: aload_1
/*    */     //   1636: invokevirtual ordinal : ()I
/*    */     //   1639: tableswitch default -> 1668, 45 -> 1671, 46 -> 1671, 47 -> 1671, 48 -> 1671
/*    */     //   1668: goto -> 1676
/*    */     //   1671: aload_0
/*    */     //   1672: lconst_0
/*    */     //   1673: putfield HQ : J
/*    */     //   1676: getstatic f/km.a3 : Lf/vh0;
/*    */     //   1679: getfield eA : B
/*    */     //   1682: iconst_3
/*    */     //   1683: if_icmpne -> 1848
/*    */     //   1686: aload_1
/*    */     //   1687: getfield SB : B
/*    */     //   1690: dup
/*    */     //   1691: istore_2
/*    */     //   1692: bipush #-115
/*    */     //   1694: if_icmplt -> 1848
/*    */     //   1697: iload_2
/*    */     //   1698: bipush #-104
/*    */     //   1700: if_icmpgt -> 1848
/*    */     //   1703: iload_2
/*    */     //   1704: aload_0
/*    */     //   1705: lconst_0
/*    */     //   1706: putfield HQ : J
/*    */     //   1709: bipush #-115
/*    */     //   1711: if_icmplt -> 1737
/*    */     //   1714: iload_2
/*    */     //   1715: bipush #-112
/*    */     //   1717: if_icmpgt -> 1737
/*    */     //   1720: aload_0
/*    */     //   1721: getfield OF0 : Lf/tc;
/*    */     //   1724: getfield HW : Lf/G5;
/*    */     //   1727: aload_1
/*    */     //   1728: getfield rb : B
/*    */     //   1731: invokestatic rD : (B)B
/*    */     //   1734: putfield g50 : B
/*    */     //   1737: getstatic f/km.a3 : Lf/vh0;
/*    */     //   1740: aload_0
/*    */     //   1741: getfield OF0 : Lf/tc;
/*    */     //   1744: getfield HW : Lf/G5;
/*    */     //   1747: getfield Qf0 : B
/*    */     //   1750: istore_2
/*    */     //   1751: getfield KO : Ljava/util/concurrent/ConcurrentHashMap;
/*    */     //   1754: invokevirtual values : ()Ljava/util/Collection;
/*    */     //   1757: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   1762: astore_3
/*    */     //   1763: aload_3
/*    */     //   1764: invokeinterface hasNext : ()Z
/*    */     //   1769: ifeq -> 1810
/*    */     //   1772: aload_3
/*    */     //   1773: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   1778: checkcast f/tc
/*    */     //   1781: dup
/*    */     //   1782: astore #4
/*    */     //   1784: invokevirtual zl : ()Z
/*    */     //   1787: ifeq -> 1763
/*    */     //   1790: aload #4
/*    */     //   1792: iload_2
/*    */     //   1793: aload #8
/*    */     //   1795: invokevirtual jC : (BLf/xr0;)Z
/*    */     //   1798: ifeq -> 1763
/*    */     //   1801: aload #4
/*    */     //   1803: checkcast f/Kr0
/*    */     //   1806: astore_2
/*    */     //   1807: goto -> 1812
/*    */     //   1810: aconst_null
/*    */     //   1811: astore_2
/*    */     //   1812: aload_2
/*    */     //   1813: ifnull -> 1848
/*    */     //   1816: aload_2
/*    */     //   1817: getfield zH0 : S
/*    */     //   1820: bipush #118
/*    */     //   1822: if_icmpne -> 1848
/*    */     //   1825: aload_2
/*    */     //   1826: getfield Y1 : Lf/static;
/*    */     //   1829: checkcast f/Or
/*    */     //   1832: getfield COm5 : Lf/lpt1;
/*    */     //   1835: dup
/*    */     //   1836: astore_2
/*    */     //   1837: ifnull -> 1848
/*    */     //   1840: aload_2
/*    */     //   1841: ldc_w 'animation'
/*    */     //   1844: iconst_0
/*    */     //   1845: invokevirtual XT : (Ljava/lang/String;Z)V
/*    */     //   1848: aload_1
/*    */     //   1849: getstatic f/nl.g1 : Lf/nl;
/*    */     //   1852: if_acmpne -> 1876
/*    */     //   1855: aload_0
/*    */     //   1856: getfield OF0 : Lf/tc;
/*    */     //   1859: invokevirtual zl : ()Z
/*    */     //   1862: ifeq -> 1876
/*    */     //   1865: aload_0
/*    */     //   1866: getfield OF0 : Lf/tc;
/*    */     //   1869: checkcast f/Kr0
/*    */     //   1872: iconst_1
/*    */     //   1873: putfield Kv : Z
/*    */     //   1876: aload_0
/*    */     //   1877: getfield OF0 : Lf/tc;
/*    */     //   1880: getfield HW : Lf/G5;
/*    */     //   1883: dup
/*    */     //   1884: getfield g50 : B
/*    */     //   1887: putfield ZJ0 : B
/*    */     //   1890: iconst_1
/*    */     //   1891: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 6
/*    */     //   #2	-> 11
/*    */     //   #3	-> 15
/*    */     //   #4	-> 20
/*    */     //   #5	-> 25
/*    */     //   #6	-> 30
/*    */     //   #7	-> 54
/*    */     //   #8	-> 104
/*    */     //   #9	-> 172
/*    */     //   #10	-> 230
/*    */     //   #11	-> 235
/*    */     //   #12	-> 241
/*    */     //   #13	-> 245
/*    */     //   #14	-> 272
/*    */     //   #15	-> 275
/*    */     //   #16	-> 284
/*    */     //   #17	-> 288
/*    */     //   #18	-> 297
/*    */     //   #19	-> 308
/*    */     //   #20	-> 314
/*    */     //   #21	-> 346
/*    */     //   #22	-> 380
/*    */     //   #23	-> 383
/*    */     //   #24	-> 386
/*    */     //   #25	-> 391
/*    */     //   #26	-> 398
/*    */     //   #27	-> 403
/*    */     //   #28	-> 408
/*    */     //   #29	-> 413
/*    */     //   #30	-> 424
/*    */     //   #31	-> 439
/*    */     //   #32	-> 442
/*    */     //   #33	-> 469
/*    */     //   #34	-> 479
/*    */     //   #35	-> 546
/*    */     //   #36	-> 556
/*    */     //   #37	-> 597
/*    */     //   #38	-> 604
/*    */     //   #39	-> 614
/*    */     //   #40	-> 627
/*    */     //   #41	-> 644
/*    */     //   #42	-> 651
/*    */     //   #43	-> 665
/*    */     //   #44	-> 669
/*    */     //   #45	-> 672
/*    */     //   #46	-> 675
/*    */     //   #47	-> 683
/*    */     //   #48	-> 686
/*    */     //   #49	-> 690
/*    */     //   #50	-> 693
/*    */     //   #51	-> 696
/*    */     //   #52	-> 706
/*    */     //   #53	-> 717
/*    */     //   #54	-> 730
/*    */     //   #55	-> 733
/*    */     //   #56	-> 737
/*    */     //   #57	-> 756
/*    */     //   #58	-> 767
/*    */     //   #59	-> 770
/*    */     //   #60	-> 775
/*    */     //   #61	-> 785
/*    */     //   #62	-> 788
/*    */     //   #63	-> 791
/*    */     //   #64	-> 795
/*    */     //   #65	-> 805
/*    */     //   #66	-> 816
/*    */     //   #67	-> 824
/*    */     //   #68	-> 831
/*    */     //   #69	-> 834
/*    */     //   #70	-> 838
/*    */     //   #71	-> 845
/*    */     //   #72	-> 852
/*    */     //   #73	-> 855
/*    */     //   #74	-> 862
/*    */     //   #75	-> 867
/*    */     //   #76	-> 872
/*    */     //   #77	-> 878
/*    */     //   #78	-> 974
/*    */     //   #79	-> 977
/*    */     //   #80	-> 982
/*    */     //   #81	-> 985
/*    */     //   #82	-> 992
/*    */     //   #83	-> 995
/*    */     //   #84	-> 998
/*    */     //   #85	-> 1003
/*    */     //   #86	-> 1006
/*    */     //   #87	-> 1013
/*    */     //   #88	-> 1016
/*    */     //   #89	-> 1019
/*    */     //   #90	-> 1024
/*    */     //   #91	-> 1027
/*    */     //   #92	-> 1034
/*    */     //   #93	-> 1101
/*    */     //   #94	-> 1108
/*    */     //   #95	-> 1131
/*    */     //   #96	-> 1138
/*    */     //   #97	-> 1167
/*    */     //   #98	-> 1174
/*    */     //   #99	-> 1197
/*    */     //   #100	-> 1204
/*    */     //   #101	-> 1214
/*    */     //   #102	-> 1222
/*    */     //   #103	-> 1246
/*    */     //   #104	-> 1249
/*    */     //   #105	-> 1287
/*    */     //   #106	-> 1298
/*    */     //   #107	-> 1344
/*    */     //   #108	-> 1356
/*    */     //   #109	-> 1362
/*    */     //   #110	-> 1365
/*    */     //   #111	-> 1370
/*    */     //   #112	-> 1373
/*    */     //   #113	-> 1377
/*    */     //   #114	-> 1381
/*    */     //   #115	-> 1384
/*    */     //   #116	-> 1387
/*    */     //   #117	-> 1391
/*    */     //   #118	-> 1415
/*    */     //   #119	-> 1418
/*    */     //   #120	-> 1428
/*    */     //   #121	-> 1442
/*    */     //   #122	-> 1445
/*    */     //   #123	-> 1466
/*    */     //   #124	-> 1472
/*    */     //   #125	-> 1475
/*    */     //   #126	-> 1482
/*    */     //   #127	-> 1485
/*    */     //   #128	-> 1488
/*    */     //   #129	-> 1495
/*    */     //   #130	-> 1505
/*    */     //   #131	-> 1508
/*    */     //   #132	-> 1516
/*    */     //   #133	-> 1520
/*    */     //   #134	-> 1527
/*    */     //   #135	-> 1534
/*    */     //   #136	-> 1537
/*    */     //   #137	-> 1548
/*    */     //   #138	-> 1553
/*    */     //   #139	-> 1558
/*    */     //   #140	-> 1564
/*    */     //   #141	-> 1585
/*    */     //   #142	-> 1589
/*    */     //   #143	-> 1679
/*    */     //   #144	-> 1687
/*    */     //   #145	-> 1706
/*    */     //   #146	-> 1724
/*    */     //   #147	-> 1728
/*    */     //   #148	-> 1731
/*    */     //   #149	-> 1734
/*    */     //   #150	-> 1737
/*    */     //   #151	-> 1744
/*    */     //   #152	-> 1747
/*    */     //   #153	-> 1751
/*    */     //   #154	-> 1754
/*    */     //   #155	-> 1817
/*    */     //   #156	-> 1826
/*    */     //   #157	-> 1829
/*    */     //   #158	-> 1832
/*    */     //   #159	-> 1873
/*    */     //   #160	-> 1877
/*    */     //   #161	-> 1880
/*    */     //   #162	-> 1884
/*    */     //   #163	-> 1887
/*    */   }
/*    */   
/*    */   public final void tS() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield n3 : Z
/*    */     //   4: ifeq -> 271
/*    */     //   7: aload_0
/*    */     //   8: getstatic f/zm0.u20 : J
/*    */     //   11: aload_0
/*    */     //   12: getfield xc : J
/*    */     //   15: lsub
/*    */     //   16: l2f
/*    */     //   17: aload_0
/*    */     //   18: getfield tD0 : I
/*    */     //   21: i2f
/*    */     //   22: fdiv
/*    */     //   23: fstore_1
/*    */     //   24: getfield OF0 : Lf/tc;
/*    */     //   27: getfield HW : Lf/G5;
/*    */     //   30: invokevirtual CJ0 : ()Lf/xr0;
/*    */     //   33: dup
/*    */     //   34: astore_2
/*    */     //   35: ifnull -> 80
/*    */     //   38: aload_2
/*    */     //   39: invokevirtual Y00 : ()Z
/*    */     //   42: ifeq -> 80
/*    */     //   45: aload_0
/*    */     //   46: dup
/*    */     //   47: getfield AU : Lf/eo;
/*    */     //   50: aload_2
/*    */     //   51: invokevirtual j5 : ()Lf/eo;
/*    */     //   54: invokevirtual JL : (Lf/eo;)Lf/eo;
/*    */     //   57: pop
/*    */     //   58: getfield AU : Lf/eo;
/*    */     //   61: dup
/*    */     //   62: dup2
/*    */     //   63: getfield y : F
/*    */     //   66: fstore_2
/*    */     //   67: getfield z : F
/*    */     //   70: putfield y : F
/*    */     //   73: fload_2
/*    */     //   74: putfield z : F
/*    */     //   77: goto -> 170
/*    */     //   80: aload_2
/*    */     //   81: instanceof f/il
/*    */     //   84: ifeq -> 134
/*    */     //   87: aload_0
/*    */     //   88: getfield AU : Lf/eo;
/*    */     //   91: aload_0
/*    */     //   92: getfield OF0 : Lf/tc;
/*    */     //   95: dup
/*    */     //   96: getfield HW : Lf/G5;
/*    */     //   99: dup
/*    */     //   100: getfield mm : S
/*    */     //   103: i2f
/*    */     //   104: ldc_w 0.5
/*    */     //   107: fadd
/*    */     //   108: fstore_2
/*    */     //   109: getfield Yu0 : S
/*    */     //   112: i2f
/*    */     //   113: ldc_w 0.5
/*    */     //   116: fadd
/*    */     //   117: fstore_3
/*    */     //   118: invokevirtual aJ0 : ()F
/*    */     //   121: fstore #4
/*    */     //   123: fload_2
/*    */     //   124: fload_3
/*    */     //   125: fload #4
/*    */     //   127: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   130: pop
/*    */     //   131: goto -> 170
/*    */     //   134: aload_0
/*    */     //   135: getfield AU : Lf/eo;
/*    */     //   138: aload_0
/*    */     //   139: getfield OF0 : Lf/tc;
/*    */     //   142: dup
/*    */     //   143: getfield HW : Lf/G5;
/*    */     //   146: dup
/*    */     //   147: getfield mm : S
/*    */     //   150: i2f
/*    */     //   151: fstore_2
/*    */     //   152: getfield Yu0 : S
/*    */     //   155: i2f
/*    */     //   156: fstore_3
/*    */     //   157: invokevirtual aJ0 : ()F
/*    */     //   160: fstore #4
/*    */     //   162: fload_2
/*    */     //   163: fload_3
/*    */     //   164: fload #4
/*    */     //   166: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   169: pop
/*    */     //   170: fload_1
/*    */     //   171: fconst_1
/*    */     //   172: fcmpg
/*    */     //   173: ifge -> 271
/*    */     //   176: aload_0
/*    */     //   177: dup
/*    */     //   178: getfield cOm3 : Lf/eo;
/*    */     //   181: aload_0
/*    */     //   182: getfield aA0 : Lf/eo;
/*    */     //   185: invokevirtual JL : (Lf/eo;)Lf/eo;
/*    */     //   188: aload_0
/*    */     //   189: getfield AU : Lf/eo;
/*    */     //   192: fload_1
/*    */     //   193: invokevirtual x50 : (Lf/eo;F)Lf/eo;
/*    */     //   196: pop
/*    */     //   197: getfield J4 : Z
/*    */     //   200: ifeq -> 419
/*    */     //   203: fload_1
/*    */     //   204: ldc_w 0.5
/*    */     //   207: fcmpg
/*    */     //   208: ifge -> 228
/*    */     //   211: aload_0
/*    */     //   212: getfield cOm3 : Lf/eo;
/*    */     //   215: aload_0
/*    */     //   216: getfield aA0 : Lf/eo;
/*    */     //   219: getfield z : F
/*    */     //   222: putfield z : F
/*    */     //   225: goto -> 419
/*    */     //   228: aload_0
/*    */     //   229: getfield cOm3 : Lf/eo;
/*    */     //   232: aload_0
/*    */     //   233: dup
/*    */     //   234: getfield aA0 : Lf/eo;
/*    */     //   237: getfield z : F
/*    */     //   240: fstore_2
/*    */     //   241: getfield AU : Lf/eo;
/*    */     //   244: getfield z : F
/*    */     //   247: fload_2
/*    */     //   248: fload_1
/*    */     //   249: ldc_w 0.5
/*    */     //   252: fsub
/*    */     //   253: fconst_2
/*    */     //   254: fmul
/*    */     //   255: fstore_1
/*    */     //   256: getstatic f/nx0.Mc0 : Lf/W60;
/*    */     //   259: pop
/*    */     //   260: fload_1
/*    */     //   261: fload_2
/*    */     //   262: invokestatic df : (FFFF)F
/*    */     //   265: putfield z : F
/*    */     //   268: goto -> 419
/*    */     //   271: aload_0
/*    */     //   272: dup
/*    */     //   273: iconst_0
/*    */     //   274: putfield n3 : Z
/*    */     //   277: getfield OF0 : Lf/tc;
/*    */     //   280: getfield HW : Lf/G5;
/*    */     //   283: invokevirtual CJ0 : ()Lf/xr0;
/*    */     //   286: dup
/*    */     //   287: astore_1
/*    */     //   288: ifnull -> 333
/*    */     //   291: aload_1
/*    */     //   292: invokevirtual Y00 : ()Z
/*    */     //   295: ifeq -> 333
/*    */     //   298: aload_0
/*    */     //   299: dup
/*    */     //   300: getfield cOm3 : Lf/eo;
/*    */     //   303: aload_1
/*    */     //   304: invokevirtual j5 : ()Lf/eo;
/*    */     //   307: invokevirtual JL : (Lf/eo;)Lf/eo;
/*    */     //   310: pop
/*    */     //   311: getfield cOm3 : Lf/eo;
/*    */     //   314: dup
/*    */     //   315: dup2
/*    */     //   316: getfield y : F
/*    */     //   319: fstore_1
/*    */     //   320: getfield z : F
/*    */     //   323: putfield y : F
/*    */     //   326: fload_1
/*    */     //   327: putfield z : F
/*    */     //   330: goto -> 419
/*    */     //   333: aload_1
/*    */     //   334: instanceof f/il
/*    */     //   337: ifeq -> 385
/*    */     //   340: aload_0
/*    */     //   341: getfield cOm3 : Lf/eo;
/*    */     //   344: aload_0
/*    */     //   345: getfield OF0 : Lf/tc;
/*    */     //   348: dup
/*    */     //   349: getfield HW : Lf/G5;
/*    */     //   352: dup
/*    */     //   353: getfield mm : S
/*    */     //   356: i2f
/*    */     //   357: ldc_w 0.5
/*    */     //   360: fadd
/*    */     //   361: fstore_1
/*    */     //   362: getfield Yu0 : S
/*    */     //   365: i2f
/*    */     //   366: ldc_w 0.5
/*    */     //   369: fadd
/*    */     //   370: fstore_2
/*    */     //   371: invokevirtual aJ0 : ()F
/*    */     //   374: fstore_3
/*    */     //   375: fload_1
/*    */     //   376: fload_2
/*    */     //   377: fload_3
/*    */     //   378: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   381: pop
/*    */     //   382: goto -> 419
/*    */     //   385: aload_0
/*    */     //   386: getfield cOm3 : Lf/eo;
/*    */     //   389: aload_0
/*    */     //   390: getfield OF0 : Lf/tc;
/*    */     //   393: dup
/*    */     //   394: getfield HW : Lf/G5;
/*    */     //   397: dup
/*    */     //   398: getfield mm : S
/*    */     //   401: i2f
/*    */     //   402: fstore_1
/*    */     //   403: getfield Yu0 : S
/*    */     //   406: i2f
/*    */     //   407: fstore_2
/*    */     //   408: invokevirtual aJ0 : ()F
/*    */     //   411: fstore_3
/*    */     //   412: fload_1
/*    */     //   413: fload_2
/*    */     //   414: fload_3
/*    */     //   415: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   418: pop
/*    */     //   419: aload_0
/*    */     //   420: getfield G0 : Lf/Tb;
/*    */     //   423: dup
/*    */     //   424: astore_1
/*    */     //   425: ifnull -> 647
/*    */     //   428: aload_0
/*    */     //   429: aload_1
/*    */     //   430: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   433: astore_2
/*    */     //   434: getfield pS : Z
/*    */     //   437: ifeq -> 523
/*    */     //   440: aload_1
/*    */     //   441: aload_0
/*    */     //   442: getfield cOm3 : Lf/eo;
/*    */     //   445: aload_2
/*    */     //   446: getfield Z0 : [F
/*    */     //   449: bipush #13
/*    */     //   451: faload
/*    */     //   452: putfield z : F
/*    */     //   455: getfield vC0 : Lf/fQ;
/*    */     //   458: dup
/*    */     //   459: astore_1
/*    */     //   460: getfield Z8 : I
/*    */     //   463: ifle -> 497
/*    */     //   466: aload_0
/*    */     //   467: aload_1
/*    */     //   468: iconst_0
/*    */     //   469: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   472: checkcast f/zP
/*    */     //   475: getfield Bf0 : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   478: astore_1
/*    */     //   479: getfield cOm3 : Lf/eo;
/*    */     //   482: dup
/*    */     //   483: getfield z : F
/*    */     //   486: aload_1
/*    */     //   487: getfield Z0 : [F
/*    */     //   490: bipush #13
/*    */     //   492: faload
/*    */     //   493: fadd
/*    */     //   494: putfield z : F
/*    */     //   497: aload_0
/*    */     //   498: getfield cOm3 : Lf/eo;
/*    */     //   501: dup
/*    */     //   502: getfield z : F
/*    */     //   505: aload_0
/*    */     //   506: getfield zF : Lf/eo;
/*    */     //   509: getfield z : F
/*    */     //   512: fadd
/*    */     //   513: ldc_w 4.0
/*    */     //   516: fmul
/*    */     //   517: putfield z : F
/*    */     //   520: goto -> 647
/*    */     //   523: aload_0
/*    */     //   524: dup
/*    */     //   525: getfield cOm3 : Lf/eo;
/*    */     //   528: aload_2
/*    */     //   529: getfield Z0 : [F
/*    */     //   532: dup
/*    */     //   533: dup
/*    */     //   534: bipush #12
/*    */     //   536: faload
/*    */     //   537: fstore_1
/*    */     //   538: bipush #14
/*    */     //   540: faload
/*    */     //   541: fstore_2
/*    */     //   542: bipush #13
/*    */     //   544: faload
/*    */     //   545: fstore_3
/*    */     //   546: fload_1
/*    */     //   547: fload_2
/*    */     //   548: fload_3
/*    */     //   549: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   552: pop
/*    */     //   553: getfield G0 : Lf/Tb;
/*    */     //   556: getfield vC0 : Lf/fQ;
/*    */     //   559: dup
/*    */     //   560: astore_1
/*    */     //   561: getfield Z8 : I
/*    */     //   564: ifle -> 624
/*    */     //   567: aload_0
/*    */     //   568: aload_1
/*    */     //   569: iconst_0
/*    */     //   570: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   573: checkcast f/zP
/*    */     //   576: iconst_0
/*    */     //   577: invokevirtual kv0 : (I)Lf/zP;
/*    */     //   580: getfield Bf0 : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   583: astore_1
/*    */     //   584: getfield cOm3 : Lf/eo;
/*    */     //   587: aload_1
/*    */     //   588: getfield Z0 : [F
/*    */     //   591: dup
/*    */     //   592: dup
/*    */     //   593: bipush #12
/*    */     //   595: faload
/*    */     //   596: ldc_w 16.0
/*    */     //   599: fdiv
/*    */     //   600: fstore_1
/*    */     //   601: bipush #14
/*    */     //   603: faload
/*    */     //   604: ldc_w 16.0
/*    */     //   607: fdiv
/*    */     //   608: fstore_2
/*    */     //   609: bipush #13
/*    */     //   611: faload
/*    */     //   612: ldc_w 16.0
/*    */     //   615: fdiv
/*    */     //   616: fstore_3
/*    */     //   617: fload_1
/*    */     //   618: fload_2
/*    */     //   619: fload_3
/*    */     //   620: invokevirtual Tz : (FFF)Lf/eo;
/*    */     //   623: pop
/*    */     //   624: aload_0
/*    */     //   625: dup
/*    */     //   626: getfield cOm3 : Lf/eo;
/*    */     //   629: aload_0
/*    */     //   630: getfield zF : Lf/eo;
/*    */     //   633: invokevirtual zT : (Lf/eo;)Lf/eo;
/*    */     //   636: pop
/*    */     //   637: getfield cOm3 : Lf/eo;
/*    */     //   640: ldc_w 4.0
/*    */     //   643: invokevirtual uu : (F)Lf/eo;
/*    */     //   646: pop
/*    */     //   647: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 1
/*    */     //   #2	-> 8
/*    */     //   #3	-> 12
/*    */     //   #4	-> 27
/*    */     //   #5	-> 30
/*    */     //   #6	-> 96
/*    */     //   #7	-> 100
/*    */     //   #8	-> 109
/*    */     //   #9	-> 118
/*    */     //   #10	-> 143
/*    */     //   #11	-> 147
/*    */     //   #12	-> 152
/*    */     //   #13	-> 157
/*    */     //   #14	-> 280
/*    */     //   #15	-> 283
/*    */     //   #16	-> 349
/*    */     //   #17	-> 353
/*    */     //   #18	-> 362
/*    */     //   #19	-> 371
/*    */     //   #20	-> 394
/*    */     //   #21	-> 398
/*    */     //   #22	-> 403
/*    */     //   #23	-> 408
/*    */     //   #24	-> 420
/*    */     //   #25	-> 446
/*    */     //   #26	-> 451
/*    */     //   #27	-> 487
/*    */     //   #28	-> 492
/*    */     //   #29	-> 529
/*    */     //   #30	-> 536
/*    */     //   #31	-> 588
/*    */     //   #32	-> 595
/*    */   }
/*    */   
/*    */   public final void Kk(nl... paramVarArgs) {
/*    */     LinkedList linkedList;
/*    */     /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/LinkedList}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/util/LinkedList}, expression=ThisExpression{ObjectType{f/d7}}, name=ew0, descriptor=Ljava/util/LinkedList;}} */
/*    */     try {
/*    */       int i = paramVarArgs.length;
/*    */       return;
/*    */     } finally {
/*    */       this = null;
/*    */       /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/LinkedList}, name=null} */
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void nZ(Runnable paramRunnable) {
/*    */     LinkedList linkedList;
/*    */     /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/LinkedList}, name=null} */
/*    */     try {
/*    */       return;
/*    */     } finally {
/*    */       this = null;
/*    */       /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/LinkedList}, name=null} */
/*    */     } 
/*    */   }
/*    */   
/*    */   public final boolean Ci0(xr0 paramxr0, boolean paramBoolean, nl... paramVarArgs) {
/*    */     if (!(this.OF0 instanceof Jo))
/*    */       return false; 
/*    */     if (paramxr0 instanceof il) {
/*    */       paramBoolean = km.wI0.iJ0.we(paramxr0, true, false);
/*    */     } else if (!paramBoolean || !paramxr0.hz().bf0(paramxr0, this.OF0, false)) {
/*    */       paramBoolean = false;
/*    */     } 
/*    */     km.u4.tN = true;
/*    */     long l1 = 0L;
/*    */     if (paramBoolean) {
/*    */       nl nl1 = nl.Iu0;
/*    */       Kk(new nl[] { nl1 });
/*    */       l1 = nl1.qf0 + l1;
/*    */     } 
/*    */     Kk(paramVarArgs);
/*    */     int i;
/*    */     byte b;
/*    */     for (i = paramVarArgs.length, b = 0; b < i; ) {
/*    */       nl nl1;
/*    */       if ((nl1 = paramVarArgs[b]) != null)
/*    */         l1 += nl1.qf0; 
/*    */       b++;
/*    */     } 
/*    */     G5 g5 = this.OF0.HW.Ef0();
/*    */     Runnable runnable = g5::mB0;
/*    */     long l2 = l1 + 500L;
/*    */     A1.L7.ac0(runnable, l2);
/*    */     A1.L7.ac0(this::UB, l1);
/*    */     return true;
/*    */   }
/*    */   
/*    */   public final void Ko0(nl paramnl) {
/*    */     vE(paramnl, false);
/*    */   }
/*    */   
/*    */   public final void KC(lpt1 paramlpt1, boolean paramBoolean, eo parameo) {
/*    */     this.G0 = paramlpt1;
/*    */     this.pS = paramBoolean;
/*    */     getClass();
/*    */     float f1 = parameo.x, f2 = parameo.y, f3 = parameo.z;
/*    */     eo eo1;
/*    */     (eo1 = this.zF).TG0(f1, f2, f3);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/d7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */