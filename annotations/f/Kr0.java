/*  1 */ package f;public class Kr0 extends tc { public static final nl[] X10 = new nl[] { nl.jC0, nl.Cl, nl.Bn, nl.Dz0 }; public byte hG0; public short zH0; public byte Oh0; public V4 PZ; public V4 Lq; public final byte n2; public final byte NH0; public final byte UU; public final byte yR; public short YP; public byte dX; public byte R3; public boolean Sg; public boolean UA0; public final void Do() { byte b; if ((b = this.hG0) == 10) { this.Y50 = 0; this.Jt0 = 0; return; }  short s1 = this.zH0; BE bE; if (b == 4 && (bE = km.mI0.yE) != null && (
/*  2 */       s1 = bE.xb.Z90(s1)) > 296) { this
/*  3 */         .Y50 = C90.eA((short)(s1 - 296 + 4095)); this.Jt0 = 0; return; }  if ((s1 = this.zH0) < 4095 || s1 > 8094) { this.Y50 = 0; this.Jt0 = 0; return; }  this.Y50 = C90.eA(s1); s1 = 0; short s2; if ((s2 = this.zH0) >= 6095 && s2 <= 7094) s1 = (byte)64;  if (s2 >= 7095 && s2 <= 8094) s1 = (byte)(s1 | 0xFFFFFF80);  this.Jt0 = s1; } public boolean jF; public LJ C5; public int Kp0 = 0; public long pr0 = -1L; public long pi = 0L; public final G5 xY; public boolean Kv = false; public boolean nx0 = false; public FV Wy0; public short Ks0 = -1; public byte mn; public boolean b50; public float Ku = 1.0F; public short Y50 = 0; public byte Jt0 = 0; public Kr0(int paramInt, byte paramByte1, short paramShort1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5, byte paramByte6, byte paramByte7, G5 paramG5, short paramShort2, byte paramByte8, boolean paramBoolean1, boolean paramBoolean2, FV paramFV, short paramShort3) { super(paramInt, paramG5, (byte)0); this.hG0 = paramByte1; this.zH0 = paramShort1; this.C5 = G00.Yj0().zp(paramShort1, paramByte1); if (paramByte1 == 1) { if (paramShort1 == 59 || paramShort1 == 82 || paramShort1 == 97 || paramShort1 == 114 || paramShort1 == 228 || paramShort1 == 86 || paramShort1 == 87) { paramInt = 0; int i = paramInt; }  if (paramShort1 >= 142 && paramShort1 <= 188) paramByte3 = 0;  }  this.Oh0 = paramByte2; V4 v4 = CJ0.nD().ew0(paramG5.Xr(), paramByte3, paramByte2); this.PZ = this; this.n2 = paramByte4; this.NH0 = paramByte5; this.UU = paramByte6; this.yR = paramByte7; this.YP = paramShort2; this.dX = paramByte8; this.R3 = paramByte8; this.Sg = paramBoolean1; this.UA0 = paramBoolean2; this.Wy0 = paramFV; this.Ks0 = paramShort3; this.xY = paramG5.Ef0(); h20().Mv(); Do(); } public static tA() { return new Or(this); } public final Or h20() { return (Or)this.Y1; } public final String m() { return B40.df("Npc").append(this.Jg).toString(); } public byte Os() { if (this.Kv) { boolean bool; if (this.C5.YB0 != 0) { bool = true; } else { bool = false; }  if (bool) return 0;  }  byte b; if ((b = this.UU) >= 0) return b;  if (this.hG0 == 2) return (km.mI0.AN.AuX(this.zH0)).Ob0;
/*    */     
/*  5 */     return this.C5.dc; } public byte Bh() { if (this.Kv) { boolean bool; if (this.C5.YB0 != 0) { bool = true; } else { bool = false; }  if (bool) return 0;  }  byte b; if ((b = this.yR) >= 0) return b;  if (this.hG0 == 2) return (km.mI0.AN.AuX(this.zH0)).kT;  return this.C5.Ap; } public final byte my() { return this.hG0; } public final short D4() { return this.zH0; } public final short nX() { return this.Y50; } public final byte wo() { return this.Jt0; } public final V4 zO() { return this.Lq; } public final void iV(byte paramByte) { byte b1 = this.HW.FB; byte b2 = this.Oh0; V4 v4 = CJ0.b5.ew0(b1, paramByte, b2); this.Kp0 = 0; this.pr0 = System.currentTimeMillis() + this.Lq.Y10(); this.HW
/*    */       
/*  7 */       .g50 = this.Oh0; } public final boolean zl() { return true; } public final byte jM() { return this.R3; }
/*  8 */   public final void EL(boolean paramBoolean) { super.EL(paramBoolean); if (paramBoolean && !this.Lq.hO()) return;  if (!this.Y1.v) return;  if (!this.pm.gD0() || this.pr0 > System.currentTimeMillis()) return;  short s; if (Mk0.n80(this.HW.FB) && (
/*  9 */       s = this.zH0) >= 92 && s <= 108)
/* 10 */       return;  int i = this.Kp0;
/* 11 */     byte b1 = this.n2;
/* 12 */     byte b2 = this.NH0; nl nl1;
/* 13 */     if ((nl1 = this.Lq.eD(i, b1, b2)) != null)
/* 14 */     { if ((b1 = nl1.sv) > 0)
/*    */       
/* 16 */       { short s2 = this.HW.mm;
/* 17 */         short s3 = this.HW.Yu0; byte b3;
/* 18 */         if ((b3 = nl1.rb) == 1 || b3 == 0) if (b3 == 1) { s3 = (short)(s3 - b1); } else { s3 = (short)(s3 + b1); }   if (b3 == 2 || b3 == 3) if (b3 == 2) { s2 = (short)(s2 - b1); } else { s2 = (short)(s2 + b1); }
/*    */            
/* 20 */         short s1 = this.xY.mm;
/* 21 */         s2 = this.xY.Yu0;
/* 22 */         b3 = this.n2;
/* 23 */         byte b4 = this.NH0;
/* 24 */         if (!this.Lq.fG0(s2, s3, s1, s2, b3, b4)) return;  }  this.pr0 = System.currentTimeMillis() + this.Lq.Y10(); if (this
/* 25 */         .pm
/* 26 */         .vE(nl1, false)) this.Kp0++;  } else { this.pr0 = System.currentTimeMillis() + this.Lq.Y10(); this.Kp0++; }
/*    */      }
/*    */ 
/*    */   
/*    */   public final float aJ0() {
/*    */     if (this.Kv)
/*    */       return this.HW.VI0() - 2.0F; 
/*    */     return this.HW.VI0();
/*    */   }
/*    */   
/*    */   public final boolean er() {
/*    */     return this.nx0;
/*    */   }
/*    */   
/*    */   public final float ub0() {
/*    */     return this.Ku;
/*    */   }
/*    */   
/*    */   public final static default() {
/*    */     return this.Y1;
/*    */   }
/*    */   
/*    */   public final void WC(short paramShort, boolean paramBoolean, byte paramByte) {
/*    */     zk0 zk0;
/*    */     if ((zk0 = this.Ae) == null) {
/*    */       this(this, zk0.We(this), paramShort, paramByte);
/*    */       this.Ae = zk0;
/*    */       (zk0 = new zk0()).vj = paramBoolean;
/*    */       return;
/*    */     } 
/*    */     if (zk0 != null)
/*    */       zk0.WC(paramShort, paramBoolean, paramByte); 
/*    */   }
/*    */   
/*    */   public final boolean kx(Jo paramJo, byte paramByte, ArrayList<nl> paramArrayList) {
/*    */     byte b1 = this.HW.FB;
/*    */     byte b2 = this.HW.kD0;
/*    */     byte b3 = this.HW.vu0;
/*    */     KI kI;
/*    */     if ((kI = km.a3.COm8(b1, b2, b3)) == null)
/*    */       return false; 
/*    */     xr0 xr01;
/*    */     if ((xr01 = paramJo.HW.CJ0()) == null)
/*    */       return false; 
/*    */     xr0 xr02;
/*    */     if ((xr02 = this.HW.CJ0()) == null)
/*    */       return false; 
/*    */     for (b3 = 0; b3 < this.R3; ) {
/*    */       xr0 xr0;
/*    */       if ((xr0 = kI.COm3(xr02, paramByte, 1)) == null || !this.pm.Dx0(xr02, xr0, this.HW.g50, false, false, false))
/*    */         return false; 
/*    */       if (xr02.bl0() != xr0.bl0() && xr02.bl0() != -1 && xr0.bl0() != -1)
/*    */         return false; 
/*    */       if (xr0.Y00() == xr01.Y00() && xr0.Ka() == xr01.Ka() && xr0.hA0() == xr01.hA0() && xr0.bl0() == xr01.bl0()) {
/*    */         G5 g5;
/*    */         if (paramByte != (g5 = this.HW).g50)
/*    */           this.g50 = paramByte; 
/*    */         return true;
/*    */       } 
/*    */       if (paramArrayList != null)
/*    */         paramArrayList.add(X10[paramByte]); 
/*    */       b3++;
/*    */       xr02 = xr0;
/*    */     } 
/*    */     return false;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Kr0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */