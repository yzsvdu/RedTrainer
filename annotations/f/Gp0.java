/*  1 */ package f;public class Gp0 { public final void kS() { Uc0 uc0; if (sQ()) return;  if (Vg())
/*  2 */     { uc0 = km.u4.s40(this.Q3); }
/*  3 */     else { uc0 = km.u4.z2; }  if (uc0 != null) {
/*  4 */       cOm4[] arrayOfCOm4; int i; byte b; for (i = (arrayOfCOm4 = Xt0(this.EG0)).length, b = 0; b < i; ) {
/*  5 */         int j; cOm4 cOm41; jd0 jd0; if ((jd0 = (cOm41 = this[b]).gc) != null)
/*    */         
/*  7 */         { j = jd0.ta.q10; }
/*  8 */         else { j = cOm41.k60; }
/*  9 */          j40 j40; if ((j40 = uc0.de0(j)) != null)
/* 10 */         { short s; jd0 jd01; if ((jd01 = cOm41.gc) != null) { s = 1; } else { s = 0; }  if (s) { jd01
/* 11 */               .getClass();
/*    */             
/* 13 */             jd01.ta = j40.Zs;
/*    */             
/* 15 */             jd01.NI = On.v30().lpT3(jd01.ta.Cw0); jd01.Ih0 = j40.s5();
/*    */             
/* 17 */             jd01.hp0 = j40.Fq0.Mm(hR.Gg); jd01.KL0 = true;
/*    */             Q90 q90;
/* 19 */             jd01.IH0 = (q90 = jd01.ta).Vp; if ((s = jd01.y6) == -1) { jd01.y6 = q90.p10(); } else if (s != q90.p10()) { jd01.ta
/* 20 */                 .m80 = jd01.y6; }  jd01
/* 21 */               .pO(); }  }  b++;
/*    */       } 
/*    */     }  }
/*    */ 
/*    */   
/*    */   public static final short[][] iO;
/*    */   public final ky rx;
/*    */   public DK uo0 = null;
/*    */   public final yi i0;
/*    */   public final rK dd;
/*    */   public final aq0 Q3;
/*    */   public final boolean cB0;
/*    */   public byte iX = -1;
/*    */   public byte uh0 = -1;
/*    */   public byte N9;
/*    */   public final boolean Cu;
/*    */   public final CC0[] Wf;
/*    */   public final DO[] yd0;
/*    */   public Mn Ja = Mn.RR;
/*    */   public final byte EG0;
/*    */   public final byte Lp;
/*    */   public final boolean k5;
/*    */   public final QZ[] ta0;
/*    */   public hm0[][] cl;
/*    */   public final boolean[] py0;
/*    */   public final sw[] tr0;
/*    */   public boolean hl0 = false;
/*    */   public final LinkedList W = new LinkedList();
/*    */   public final LinkedList Oq0 = new LinkedList();
/*    */   public boolean uy0 = false;
/*    */   public boolean JS = false;
/*    */   public boolean Zu = false;
/*    */   public int z9 = 0;
/*    */   public boolean kI0 = false;
/*    */   public final Lw sH = new Lw();
/*    */   public short T20 = 0;
/*    */   public long I40 = 0L;
/*    */   public byte e9 = 0;
/*    */   public short CoM9 = 0;
/*    */   public byte iK = -1;
/*    */   public Fs[] gt = null;
/*    */   public Mx e30 = Mx.LM;
/*    */   public boolean for = false;
/*    */   public boolean D30 = false;
/*    */   public PE[] Ax;
/*    */   public cOm4[][] Aq;
/*    */   public eq0 CJ0 = null;
/*    */   public final byte kx;
/*    */   public final R00 q20;
/*    */   public final hR[] de0;
/*    */   public boolean ka0;
/*    */   
/*    */   public static byte Sr0(byte paramByte) {
/*    */     return (paramByte == 0) ? 1 : 0;
/*    */   }
/*    */   
/*    */   static {
/*    */     short[] arrayOfShort;
/*    */     (arrayOfShort = new short[5])[0] = 265;
/*    */     (new short[5])[1] = 266;
/*    */     (new short[5])[2] = 296;
/*    */     (new short[5])[3] = 297;
/*    */     (new short[5])[4] = 299;
/*    */     (new short[5][])[0] = arrayOfShort;
/*    */     (arrayOfShort = new short[10])[0] = 471;
/*    */     (new short[10])[1] = 475;
/*    */     (new short[10])[2] = 476;
/*    */     (new short[10])[3] = 477;
/*    */     (new short[10])[4] = 478;
/*    */     (new short[10])[5] = 481;
/*    */     (new short[10])[6] = 483;
/*    */     (new short[10])[7] = 508;
/*    */     (new short[10])[8] = 509;
/*    */     (new short[10])[9] = 511;
/*    */     (new short[5][])[1] = arrayOfShort;
/*    */     (arrayOfShort = new short[11])[0] = 1130;
/*    */     (new short[11])[1] = 1131;
/*    */     (new short[11])[2] = 1132;
/*    */     (new short[11])[3] = 1133;
/*    */     (new short[11])[4] = 1134;
/*    */     (new short[11])[5] = 1135;
/*    */     (new short[11])[6] = 1136;
/*    */     (new short[11])[7] = 1137;
/*    */     (new short[11])[8] = 1138;
/*    */     (new short[11])[9] = 1139;
/*    */     (new short[11])[10] = 1145;
/*    */     (new short[5][])[2] = arrayOfShort;
/*    */     (arrayOfShort = new short[8])[0] = 1115;
/*    */     (new short[8])[1] = 1117;
/*    */     (new short[8])[2] = 1120;
/*    */     (new short[8])[3] = 1123;
/*    */     (new short[8])[4] = 1124;
/*    */     (new short[8])[5] = 1134;
/*    */     (new short[8])[6] = 1136;
/*    */     (new short[8])[7] = 1202;
/*    */     (new short[5][])[3] = arrayOfShort;
/*    */     (arrayOfShort = new short[8])[0] = 1117;
/*    */     (new short[8])[1] = 1118;
/*    */     (new short[8])[2] = 1119;
/*    */     (new short[8])[3] = 1120;
/*    */     (new short[8])[4] = 1124;
/*    */     (new short[8])[5] = 1126;
/*    */     (new short[8])[6] = 1127;
/*    */     (new short[8])[7] = 1147;
/*    */     iO = new short[][] { null, null, null, null, arrayOfShort };
/*    */   }
/*    */   
/*    */   public Gp0(ky paramky, Mn paramMn, int paramInt, byte paramByte1, byte paramByte2, yi paramyi, rK paramrK, byte paramByte3, short paramShort, aq0 paramaq0, boolean paramBoolean1, byte paramByte4, byte paramByte5, byte paramByte6, DO[] paramArrayOfDO, CC0[] paramArrayOfCC0, R00 paramR00, hR[] paramArrayOfhR, byte paramByte7, byte paramByte8, boolean paramBoolean2, QZ[] paramArrayOfQZ, hm0[][] paramArrayOfhm0, boolean paramBoolean3) {
/*    */     this.rx = paramky;
/*    */     this.Ja = paramMn;
/*    */     this.I40 = System.currentTimeMillis() - paramInt * 1000L;
/*    */     this.e9 = paramByte1;
/*    */     this.i0 = paramyi;
/*    */     this.dd = paramrK;
/*    */     this.iK = paramByte3;
/*    */     this.CoM9 = paramShort;
/*    */     this.Q3 = paramaq0;
/*    */     this.cB0 = paramBoolean1;
/*    */     this.iX = paramByte4;
/*    */     this.uh0 = paramByte5;
/*    */     this.N9 = paramByte6;
/*    */     this.Cu = paramBoolean3;
/*    */     this.yd0 = paramArrayOfDO;
/*    */     this.Wf = paramArrayOfCC0;
/*    */     this.q20 = paramR00;
/*    */     this.de0 = paramArrayOfhR;
/*    */     this.EG0 = paramByte7;
/*    */     this.Lp = paramByte8;
/*    */     this.k5 = paramBoolean2;
/*    */     this.ta0 = paramArrayOfQZ;
/*    */     this.cl = paramArrayOfhm0;
/*    */     this.kx = paramByte2;
/*    */     this.py0 = new boolean[paramky.coM9(paramByte7)];
/*    */     this.tr0 = new sw[paramky.coM9(paramByte7)];
/*    */     byte b;
/*    */     this.Aq = new cOm4[b = (byte)this.cl.length][6];
/*    */     this.Ax = new PE[b];
/*    */     byte b1;
/*    */     for (b1 = 0; b1 < b; b1 = (byte)(b1 + 1)) {
/*    */       PE pE;
/*    */       this(b1);
/*    */       this.Ax[b1] = pE;
/*    */       byte b2;
/*    */       cOm4[] arrayOfCOm4;
/*    */       for (b2 = 0; b2 < (arrayOfCOm4 = this.Aq[b1]).length; b2 = (byte)(b2 + 1)) {
/*    */         cOm4 cOm41;
/*    */         this(paramArrayOfQZ[b1], b1, b2);
/*    */         arrayOfCOm4[b2] = cOm41;
/*    */       } 
/*    */       hm0[] arrayOfHm0;
/*    */       for (b2 = 0; b2 < (arrayOfHm0 = paramArrayOfhm0[b1]).length; b2 = (byte)(b2 + 1)) {
/*    */         hm0 hm01;
/*    */         if ((hm01 = arrayOfHm0[b2]) != null)
/*    */           hm01.k8(this.Aq[b1][hm01.FA()]); 
/*    */       } 
/*    */     } 
/*    */     if (!sQ()) {
/*    */       int i = paramArrayOfQZ.length;
/*    */       for (b1 = 0; b1 < i; b1++) {
/*    */         QZ qZ;
/*    */         if (qZ = paramArrayOfQZ[b1] instanceof BR)
/*    */           km.a3.cA0(((BR)qZ).HA0()); 
/*    */       } 
/*    */       if (!km.wI0.v4() && (yx0() || CA() > 0)) {
/*    */         km.wI0.Cr();
/*    */         if (h1.me0)
/*    */           km.pm0.fy((short)1617); 
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final ky Zo() {
/*    */     return this.rx;
/*    */   }
/*    */   
/*    */   public final DK me() {
/*    */     return this.uo0;
/*    */   }
/*    */   
/*    */   public final rK a2() {
/*    */     return this.dd;
/*    */   }
/*    */   
/*    */   public final byte hG0() {
/*    */     byte b;
/*    */     return ((b = this.EG0) < 0 && b >= -2) ? (byte)(b + 2) : ((b == -3) ? 0 : b);
/*    */   }
/*    */   
/*    */   public final byte nI() {
/*    */     return (byte)((hG0() == 1) ? 0 : 1);
/*    */   }
/*    */   
/*    */   public final byte H3() {
/*    */     return (byte)this.cl.length;
/*    */   }
/*    */   
/*    */   public final byte wI(byte paramByte) {
/*    */     return (byte)(this.cl[paramByte]).length;
/*    */   }
/*    */   
/*    */   public final hm0[] S10(byte paramByte) {
/*    */     return this.cl[paramByte];
/*    */   }
/*    */   
/*    */   public hm0 N0(byte paramByte1, byte paramByte2) {
/*    */     hm0[] arrayOfHm0;
/*    */     return (paramByte1 < 0 || paramByte1 > 1 || paramByte2 >= (arrayOfHm0 = this.cl[paramByte1]).length) ? null : this[paramByte2];
/*    */   }
/*    */   
/*    */   public final int Dr(byte paramByte) {
/*    */     byte b1;
/*    */     hm0[] arrayOfHm0;
/*    */     int i;
/*    */     byte b2;
/*    */     for (b1 = 0, i = (arrayOfHm0 = this.cl[paramByte]).length, b2 = 0; b2 < i; ) {
/*    */       hm0 hm01;
/*    */       if ((hm01 = arrayOfHm0[b2]) != null && !hm01.K0.AL() && hm01.K0.ta.tm0())
/*    */         b1++; 
/*    */       b2++;
/*    */     } 
/*    */     return b1;
/*    */   }
/*    */   
/*    */   public final boolean Ie(byte paramByte) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield ta0 : [Lf/QZ;
/*    */     //   4: iload_1
/*    */     //   5: aaload
/*    */     //   6: invokevirtual PN : ()Lf/ET;
/*    */     //   9: getstatic f/ET.gX : Lf/ET;
/*    */     //   12: if_acmpne -> 123
/*    */     //   15: aload_0
/*    */     //   16: getfield dd : Lf/rK;
/*    */     //   19: getstatic f/rK.Og0 : Lf/rK;
/*    */     //   22: if_acmpne -> 28
/*    */     //   25: goto -> 123
/*    */     //   28: aload_0
/*    */     //   29: getfield cl : [[Lf/hm0;
/*    */     //   32: iload_1
/*    */     //   33: aaload
/*    */     //   34: dup
/*    */     //   35: astore_0
/*    */     //   36: arraylength
/*    */     //   37: istore_1
/*    */     //   38: iconst_0
/*    */     //   39: istore_2
/*    */     //   40: iload_2
/*    */     //   41: iload_1
/*    */     //   42: if_icmpge -> 121
/*    */     //   45: aload_0
/*    */     //   46: iload_2
/*    */     //   47: aaload
/*    */     //   48: dup
/*    */     //   49: astore_3
/*    */     //   50: ifnull -> 115
/*    */     //   53: aload_3
/*    */     //   54: getfield K0 : Lf/jd0;
/*    */     //   57: invokevirtual AL : ()Z
/*    */     //   60: ifne -> 115
/*    */     //   63: aload_3
/*    */     //   64: invokevirtual Jx : ()S
/*    */     //   67: istore_3
/*    */     //   68: getstatic f/km.u4 : Lf/R8;
/*    */     //   71: getfield GN : [S
/*    */     //   74: astore #4
/*    */     //   76: iconst_0
/*    */     //   77: istore #5
/*    */     //   79: iload #5
/*    */     //   81: aload #4
/*    */     //   83: arraylength
/*    */     //   84: if_icmpge -> 105
/*    */     //   87: iload_3
/*    */     //   88: aload #4
/*    */     //   90: iload #5
/*    */     //   92: saload
/*    */     //   93: if_icmpne -> 99
/*    */     //   96: goto -> 108
/*    */     //   99: iinc #5, 1
/*    */     //   102: goto -> 79
/*    */     //   105: iconst_m1
/*    */     //   106: istore #5
/*    */     //   108: iload #5
/*    */     //   110: iflt -> 115
/*    */     //   113: iconst_1
/*    */     //   114: ireturn
/*    */     //   115: iinc #2, 1
/*    */     //   118: goto -> 40
/*    */     //   121: iconst_0
/*    */     //   122: ireturn
/*    */     //   123: iconst_0
/*    */     //   124: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 16
/*    */     //   #2	-> 19
/*    */     //   #3	-> 54
/*    */     //   #4	-> 64
/*    */     //   #5	-> 71
/*    */     //   #6	-> 83
/*    */   }
/*    */   
/*    */   public final QZ wB(byte paramByte) {
/*    */     QZ[] arrayOfQZ;
/*    */     return (paramByte < 0 || paramByte > (arrayOfQZ = this.ta0).length) ? null : this[paramByte];
/*    */   }
/*    */   
/*    */   public final mJ N00() {
/*    */     if (this.hl0)
/*    */       return null; 
/*    */     boolean[] arrayOfBoolean;
/*    */     for (byte b = 0; b < (arrayOfBoolean = this.py0).length; b = (byte)(b + 1)) {
/*    */       if (arrayOfBoolean[b] && this.tr0[b] == null)
/*    */         return mJ.Vs0(this.EG0, b); 
/*    */     } 
/*    */     return null;
/*    */   }
/*    */   
/*    */   public final void Bn(kf paramkf, byte paramByte) {
/*    */     hm0[] arrayOfHm0;
/*    */     int i;
/*    */     byte b;
/*    */     for (i = (arrayOfHm0 = this.cl[paramByte]).length, b = 0; b < i; ) {
/*    */       hm0 hm01;
/*    */       if ((hm01 = this[b]) != null && !hm01.K0.AL())
/*    */         paramkf.oD(hm01).Eh(); 
/*    */       b++;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final hm0 fa(int paramInt) {
/*    */     for (byte b = 0; b < H3(); ) {
/*    */       hm0[] arrayOfHm0;
/*    */       int i;
/*    */       byte b1;
/*    */       for (i = (arrayOfHm0 = this.cl[b]).length, b1 = 0; b1 < i; ) {
/*    */         hm0 hm01;
/*    */         if ((hm01 = arrayOfHm0[b1]) != null && hm01.ih() == paramInt)
/*    */           return hm01; 
/*    */         b1++;
/*    */       } 
/*    */       b = (byte)(b + 1);
/*    */     } 
/*    */     return null;
/*    */   }
/*    */   
/*    */   public final void tp(hm0 paramhm0) {
/*    */     for (byte b = 0; b < H3(); ) {
/*    */       hm0[] arrayOfHm0;
/*    */       for (byte b1 = 0; b1 < (arrayOfHm0 = this.cl[b]).length; ) {
/*    */         if (arrayOfHm0[b1] == paramhm0) {
/*    */           Runnable runnable;
/*    */           if ((runnable = paramhm0.gO) != null)
/*    */             runnable.run(); 
/*    */           paramhm0.lG0();
/*    */           this.cl[b][b1] = null;
/*    */         } 
/*    */         b1 = (byte)(b1 + 1);
/*    */       } 
/*    */       b = (byte)(b + 1);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void q60(byte paramByte1, hj[] paramArrayOfhj1, hj[] paramArrayOfhj2, int paramInt1, int paramInt2, hj[] paramArrayOfhj3, byte paramByte2) {
/*    */     if (this.dd == rK.Az) {
/*    */       this.uy0 = true;
/*    */       return;
/*    */     } 
/*    */     if (this.Ja == Mn.VK) {
/*    */       this.uy0 = true;
/*    */       return;
/*    */     } 
/*    */     if ((paramByte2 & 0x1) != 0) {
/*    */       this.JS = true;
/*    */       this.W.clear();
/*    */     } 
/*    */     this.W.add(new GP(paramByte1, paramArrayOfhj1, paramArrayOfhj2, paramInt1, paramInt2, paramArrayOfhj3));
/*    */     this.uy0 = true;
/*    */   }
/*    */   
/*    */   public byte rl0() {
/*    */     byte b;
/*    */     return ((b = this.iK) != -1) ? b : this.ta0[nI()].d5();
/*    */   }
/*    */   
/*    */   public short Ta() {
/*    */     short s;
/*    */     return ((s = this.CoM9) > 0) ? s : this.ta0[nI()].COm8();
/*    */   }
/*    */   
/*    */   public final boolean sQ() {
/*    */     return (this.EG0 < 0);
/*    */   }
/*    */   
/*    */   public final boolean RM() {
/*    */     return (this.EG0 == -3);
/*    */   }
/*    */   
/*    */   public final boolean h2() {
/*    */     return this.k5;
/*    */   }
/*    */   
/*    */   public final boolean yx0() {
/*    */     QZ[] arrayOfQZ;
/*    */     int i;
/*    */     byte b;
/*    */     for (i = (arrayOfQZ = this.ta0).length, b = 0; b < i; ) {
/*    */       QZ qZ;
/*    */       if ((qZ = this[b]) == null || !(qZ.PN()).nr)
/*    */         return false; 
/*    */       b++;
/*    */     } 
/*    */     return true;
/*    */   }
/*    */   
/*    */   public final boolean Vg() {
/*    */     return (this.Q3 != null);
/*    */   }
/*    */   
/*    */   public final short QK() {
/*    */     return this.T20;
/*    */   }
/*    */   
/*    */   public final long Fy() {
/*    */     return this.I40;
/*    */   }
/*    */   
/*    */   public final int CA() {
/*    */     return this.e9 * 60;
/*    */   }
/*    */   
/*    */   public final Mn DQ() {
/*    */     return this.Ja;
/*    */   }
/*    */   
/*    */   public final int ex(int paramInt, hm0 paramhm0) {
/*    */     if (paramhm0 == null)
/*    */       return paramInt; 
/*    */     byte b;
/*    */     if ((b = paramhm0.FT) != hG0()) {
/*    */       wB(b).getClass();
/*    */       if (wB(b) instanceof Yu) {
/*    */         paramInt++;
/*    */       } else {
/*    */         paramInt += 2;
/*    */       } 
/*    */     } 
/*    */     return paramInt;
/*    */   }
/*    */   
/*    */   public final int Q40(int paramInt, hm0 paramhm01, hm0 paramhm02) {
/*    */     if (paramhm01 != null && paramhm01.FT != hG0()) {
/*    */       wB(paramhm01.FT).getClass();
/*    */       if (wB(paramhm01.FT) instanceof Yu)
/*    */         return (paramhm02.FT == paramhm01.FT) ? (paramInt + 4) : (paramInt + 3); 
/*    */       return (paramhm02.FT == paramhm01.FT) ? (paramInt + 6) : (paramInt + 5);
/*    */     } 
/*    */     return ex(paramInt, paramhm02);
/*    */   }
/*    */   
/*    */   public final int iD(int paramInt, byte paramByte) {
/*    */     return (paramByte == hG0()) ? paramInt : (paramInt + 1);
/*    */   }
/*    */   
/*    */   public final cOm4 f70(int paramInt) {
/*    */     if (paramInt == 0)
/*    */       return null; 
/*    */     for (byte b = 0; b < this.Aq.length; ) {
/*    */       cOm4[] arrayOfCOm4;
/*    */       for (byte b1 = 0; b1 < (arrayOfCOm4 = this.Aq[b]).length; ) {
/*    */         boolean bool;
/*    */         cOm4 cOm41;
/*    */         jd0 jd0;
/*    */         if ((jd0 = (cOm41 = arrayOfCOm4[b1]).gc) != null) {
/*    */           bool = true;
/*    */         } else {
/*    */           bool = false;
/*    */         } 
/*    */         if (bool) {
/*    */           int i;
/*    */           if (jd0 != null) {
/*    */             i = jd0.ta.q10;
/*    */           } else {
/*    */             i = cOm41.k60;
/*    */           } 
/*    */           if (i == paramInt)
/*    */             return cOm41; 
/*    */         } 
/*    */         b1 = (byte)(b1 + 1);
/*    */       } 
/*    */       b = (byte)(b + 1);
/*    */     } 
/*    */     return null;
/*    */   }
/*    */   
/*    */   public final int lPt8(byte paramByte) {
/*    */     return (int)Stream.<cOm4>of(this.Aq[paramByte]).filter(cOm4::LF).count();
/*    */   }
/*    */   
/*    */   public final cOm4[] Xt0(byte paramByte) {
/*    */     cOm4[][] arrayOfCOm4;
/*    */     if (paramByte >= 0 && paramByte < (arrayOfCOm4 = this.Aq).length)
/*    */       return this[paramByte]; 
/*    */     throw new IllegalArgumentException(XD0.SD0("Malformed battle slot status request ", paramByte));
/*    */   }
/*    */   
/*    */   public final PE a0(byte paramByte) {
/*    */     return (paramByte < 0 || paramByte > this.ta0.length) ? null : this.Ax[paramByte];
/*    */   }
/*    */   
/*    */   public final cOm4 iC0(byte paramByte1, byte paramByte2, int paramInt) {
/*    */     cOm4 cOm41;
/*    */     if ((cOm41 = f70(paramInt)) != null)
/*    */       return cOm41; 
/*    */     cOm4[] arrayOfCOm4;
/*    */     cOm4[][] arrayOfCOm41;
/*    */     if (paramByte1 >= 0 && paramByte1 < (arrayOfCOm41 = this.Aq).length && paramByte2 >= 0 && paramByte2 < (arrayOfCOm4 = this[paramByte1]).length)
/*    */       return this[paramByte2]; 
/*    */     throw new IllegalArgumentException(RH0.KK("Malformed battle slot status request ", paramByte1, " ", paramByte2));
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Gp0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */