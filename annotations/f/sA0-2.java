/*    */ package f;
/*    */ public final class sA0 implements iq0 { public int G40; public final short UH; public final short Ug; public final boolean y3; public final byte Lg0; public boolean IM; public float zz; public Ih0 tA0;
/*  3 */   public static void iG(j40 paramj40) { D0.MJ0(paramj40.Zs.Cw0); } public fo0 aD0; public K70 hN; public fQ Xl; public boolean tG; public Runnable LN; public sA0(short paramShort, boolean paramBoolean, byte paramByte) { fQ fQ1; this.IM = false; this.zz = 0.0F; this(); this.Xl = this; this.tG = false; this.LN = null; this.G40 = 3; this.UH = -1; this.Ug = paramShort; this.y3 = paramBoolean; this.Lg0 = paramByte; W3(); Ix0(); } public sA0(int paramInt, short paramShort1, short paramShort2) { fQ fQ1; this.IM = false; this.zz = 0.0F; this(); this.Xl = this; this.tG = false; this.LN = null; this.G40 = paramInt; this.UH = paramShort1; this.Ug = paramShort2; this.y3 = false; this.Lg0 = 0; W3(); Ix0(); } public sA0() { fQ fQ1; this.IM = false; this.zz = 0.0F; this(); this.Xl = this; this.tG = false; this.LN = null; this.G40 = 3; this.UH = -1; this.Ug = -1; this.IM = true; this.y3 = false; this.Lg0 = 0; W3(); Ix0(); } public final zh0 UD0() { j40 j40; short s; if ((s = this.Ug) < 0) { s = (short)(s & 0xFFF); this(0); Q90 q90; (q90 = new Q90()).Cw0 = s; if (this.y3) { q90
/*  4 */           .eH = (byte)(q90.eH | 0x1); q90.xH = mA.Wh0; } else { q90.eH = (byte)(q90.eH & 0xFFFFFFF6); if (q90.xH == mA.Wh0) q90.xH = mA.uZ;  }  q90
/*    */         
/*  6 */         .Vp = this.Lg0;
/*  7 */       this(q90); } else { j40 j401 = null; j40[] arrayOfJ40; int i = (arrayOfJ40 = km.u4.s40(aq0.LI).lPt3()).length; byte b1 = 0; while (true) { if (b1 < i)
/*    */         { j40 j402; short s1;
/*  9 */           if (!(j402 = arrayOfJ40[b1]).Zs.YC() && ((
/* 10 */             s1 = ((sA0)super).UH) < 1 || j402
/* 11 */             .Zs
/* 12 */             .Xj(s1)))
/* 13 */           { if (j402.Zs
/* 14 */               .Tl0 == ((sA0)super)
/* 15 */               .Ug) { j40 = j402; break; }  j401 = j402; }  b1++; continue; }  j40 = j401; break; }  }  if (this == null)
/* 16 */       return zh0.Ac0; 
/* 17 */     A1.L7
/* 18 */       .ac0(this::iG, 500L);
/*    */     
/* 20 */     s = this.Zs.Cw0;
/*    */ 
/*    */ 
/*    */     
/* 24 */     byte b = s5();
/*    */     
/* 26 */     return um0.Kt0.T00(um0.HZ(this.Zs.Vp, s), this.Zs.tm0(), b)[0]; } public final void W3() { this.tA0 = new Ih0(); (this.aD0 = new fo0()).Tz0(new qo(qo.iu0, 1.0F, 1.0F, 1.0F, 1.0F)); this(); Ql ql; f3 f3; X3 x3; ig ig; T7 t7; lpt1 lpt1; int[] arrayOfInt; (new Ql()).xu = 32; this(ql); this(); this.hN = new K70(x3, f3); this(wo.TI.B8("/a/1/1/5")); E80.Mx0(); Wo wo; int i; HI hI; ByteBuffer byteBuffer; int j; if ((i = Fq.cL0(byteBuffer = (hI = ((wo = km.mI0.AN).TI.B8("/a/1/1/7")).bP).GA0(), t7.XL)) == (j = 1129464142)) { T7 t71; int k = u80.Lx0(byteBuffer); i = wd.TG0(byteBuffer.getInt(), 8, byteBuffer.position(), byteBuffer); i = byteBuffer.position() + i; E80.Mx0(); int m; ByteBuffer byteBuffer1; byte b; if ((m = Fq.cL0(byteBuffer1 = (wo.TI.B8("/a/1/2/9")).bP.GA0(), t71.XL)) == (b = 1129464142)) { byteBuffer1.position(); byteBuffer1.getInt(); byteBuffer1.getInt(); m = byteBuffer1.position(); byteBuffer1.position(byteBuffer1.getInt() * 8 + m); byteBuffer1.getInt(); byteBuffer1.getInt(); byteBuffer1.position(); lpt1[] arrayOfLpt1 = new lpt1[k = 2]; int i1 = byteBuffer.getInt(k + 12 + (b = m * 8)); i = i1 + i; int n = WW.Rq0(k, 12, 4, b, byteBuffer) - i1;
/* 27 */         String[] arrayOfString = nN.Wj; if ((m = this.G40) < 400) { arrayOfString[m]; } else { Integer.toString(m); }
/* 28 */          ByteBuffer byteBuffer3; (byteBuffer3 = hI.GA0()).position(i); if (n > 0)
/* 29 */           V8.Pp0(i, n, byteBuffer3.limit(), byteBuffer3);  ByteBuffer byteBuffer2;
/* 30 */         (byteBuffer2 = byteBuffer3.slice().order(ByteOrder.LITTLE_ENDIAN))
/* 31 */           .getShort(); byteBuffer3.slice().order(ByteOrder.LITTLE_ENDIAN).getShort(); byteBuffer3.slice().order(ByteOrder.LITTLE_ENDIAN).getShort(); byteBuffer3.slice().order(ByteOrder.LITTLE_ENDIAN).getShort(); short s = byteBuffer3.slice().order(ByteOrder.LITTLE_ENDIAN).getShort(); n = byteBuffer3.slice().order(ByteOrder.LITTLE_ENDIAN).getShort(); byteBuffer3.slice().order(ByteOrder.LITTLE_ENDIAN).getShort(); byteBuffer3.slice().order(ByteOrder.LITTLE_ENDIAN).getShort(); for (arrayOfInt = new int[4], b = 0; b < 4; ) { arrayOfInt[b] = byteBuffer2.getShort(); b++; }  if (s != -1) { eI.Lj().getClass(); arrayOfLpt1[0] = eI.L4(ig, s, arrayOfInt); }  for (s = 0; s < 4; ) { arrayOfInt[s] = byteBuffer2.getShort(); s++; }  if (n != -1) { eI.Lj().getClass(); arrayOfLpt1[1] = eI.L4(ig, n, arrayOfInt); }  for (byte b1 = 0; b1 < k; )
/* 32 */         { if ((lpt1 = arrayOfLpt1[b1]) != null) { int i2; if ((i2 = this.G40) == 3 && b1 == 0) { if (!this.IM) { ((O80)((T0)lpt1.xl0.get(0))
/* 33 */                   .cOM1(O80.Jg0))
/* 34 */                   .ID(UD0().Uu0()); } else { ((T0)lpt1.xl0.get(0)).Tz0(new zc(0.0F)); }  } else if (i2 == 3 && this.IM) { lpt1.mh.GJ(1.0F, 0.5F, 1.0F); }  lpt1 = arrayOfLpt1[b1]; this
/* 35 */               .Xl.Com3(lpt1); }  b1++; }  return; }
/* 36 */        throw new RuntimeException(
/* 37 */           RH0.KK("Header magic mismatch = ", arrayOfInt, " vs expected ", b)); }
/* 38 */      throw new RuntimeException(
/* 39 */         RH0.KK("Header magic mismatch = ", lpt1, " vs expected ", arrayOfInt)); }
/*    */ 
/*    */   
/*    */   public final void Ix0() {
/*    */     Hc0 hc0;
/*    */     for (this.zz = 0.0F, hc0 = this.Xl.r30(); hasNext(); ) {
/*    */       lpt1 lpt1;
/*    */       (lpt1 = (lpt1)next()).uq();
/*    */       boolean bool;
/*    */       byte b;
/*    */       for (bool = false, b = 0; b < lpt1.lz.Z8; ) {
/*    */         lpt1.rd(b, bool, null);
/*    */         b++;
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void dispose() {
/*    */     Hc0 hc0 = this.Xl.r30();
/*    */     while (hc0.hasNext())
/*    */       ((lpt1)hc0.next()).Ea0(); 
/*    */     this.Xl.clear();
/*    */     this.hN.dispose();
/*    */     Runnable runnable;
/*    */     if ((runnable = this.LN) != null)
/*    */       run(); 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/sA0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */