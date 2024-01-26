/*  1 */ package f;public class YG extends DB0 { public final sF pi; public float xD0; public float ig0; public long VA0; public float U1; public long IL0; public boolean vr0; public int nP; public long Pa; public float CM; public float st; public int zD; public int PD; public boolean Cp0; public boolean Nc; public boolean Sj0; public final vP Fc; public float xb; public float G1; public long Lb; public NC0 qy; public final NC0 dg0; public final NC0 mv0; public final NC0 eh0; public final wD0 SH0; public YG(sF paramsF) { this(20.0F, 0.4F, 1.1F, 2.14748365E9F, paramsF); } public YG(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, sF paramsF) { this(paramFloat1, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramsF); } public YG(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, sF paramsF) { vP vP1; NC0 nC0; wD0 wD01; this(); this.Fc = vP1; this(); this.qy = nC0; this(); this.dg0 = nC0; this(); this.mv0 = nC0; this(); this.eh0 = nC0; this(this); this.SH0 = wD01; if (paramsF != null) { this.xD0 = paramFloat1; this.ig0 = paramFloat2; this.VA0 = (long)(paramFloat3 * 1.0E9F); this.U1 = paramFloat4; this.IL0 = (long)(paramFloat5 * 1.0E9F); this.pi = paramsF; return; }  throw new IllegalArgumentException("listener cannot be null."); } public boolean bD0(int paramInt1, int paramInt2, int paramInt3, int paramInt4) { float f1 = paramInt1; float f2 = paramInt2; return Eb(paramInt3, paramInt4, f1, f2); } public final boolean Eb(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2) { if (paramInt1 > 1) return false;  if (paramInt1 == 0) { this.qy.x = paramFloat1; this.qy
/*  2 */         .y = paramFloat2;
/*    */ 
/*    */       
/*  5 */       long l = UB0.PU.hl0.ip0;
/*  6 */       this.Fc.OE(paramFloat1, paramFloat2, l); UB0.PU.getClass(); this.vr0 = true; this.Nc = false; this.Cp0 = false; this.xb = paramFloat1; this.G1 = paramFloat2;
/*  7 */       if (!((this.SH0.co0 != null) ? 1 : 0))
/*  8 */       { wD0 wD01 = this.SH0; float f = this.U1;
/*  9 */         HC.k6().S(wD01, f); }  }
/* 10 */     else { this.dg0
/* 11 */         .x = paramFloat1;
/* 12 */       this.dg0.y = paramFloat2;
/* 13 */       this.vr0 = false; this.Nc = true; this.mv0.ON(this.qy); this.eh0.ON(this.dg0); this.SH0.uw0(); }  this.pi.V90(); return false; } public final boolean uH0(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2) { vP vP1; boolean bool; float f1, f2; sF sF1; if (paramInt1 > 1) return false;  if (this.vr0) { boolean bool2; float f3 = this.xb, f4 = this.G1; if (Math.abs(paramFloat1 - f3) < this.xD0 && Math.abs(paramFloat2 - f4) < this.ig0) { bool2 = true; } else { bool2 = false; }  if (!bool2) this.vr0 = false;  }  boolean bool1 = this.Sj0; this.Sj0 = false; this.SH0.uw0(); if (this.Cp0) return false;  if (this.vr0) { if (this.zD == paramInt2 && this.PD == paramInt1 && System.nanoTime() - this.Pa <= this.VA0) { float f3 = this.CM, f4 = this.st; if (Math.abs(paramFloat1 - f3) < this.xD0 && Math.abs(paramFloat2 - f4) < this.ig0) { bool1 = true; } else { bool1 = false; }  if (!bool1) { this.nP = 0; this.nP++; this.Pa = System.nanoTime(); this.CM = paramFloat1; this.st = paramFloat2; this.zD = paramInt2; this.PD = paramInt1; this.Lb = 0L; return this.pi.FN(paramFloat1, paramFloat2); }  this.nP++; this.Pa = System.nanoTime(); this.CM = paramFloat1; this.st = paramFloat2; this.zD = paramInt2; this.PD = paramInt1; this.Lb = 0L; return this.pi.FN(paramFloat1, paramFloat2); }  } else { long l1; if (this.Nc) { this.Nc = false; this.pi.Lo0(); this.Sj0 = true; vP1 = this.Fc; float f = this.dg0.x; f1 = this.dg0.y; vP1 = ((YG)super).Fc; f = ((YG)super).qy.x; f1 = ((YG)super).qy.y; l1 = ((paramInt1 == 0) ? UB0.PU : UB0.PU).hl0.ip0; OE(f, f1, l1); return false; }  paramInt1 = 0; if (bool1 && !((YG)super).Sj0) bool = ((YG)super).pi.Ux(l1, paramFloat2);  long l2; if ((l2 = UB0.PU.hl0.ip0) - ((YG)super)
/* 14 */         .Lb <= ((YG)super).IL0)
/* 15 */       { long l3, l4; float f3 = l1 - vP3.jn;
/* 16 */         vP3.up0 = paramFloat2 -= vP3.fM; vP3.jn = l1; vP3.fM = paramFloat2; vP vP3; (vP3 = ((YG)super).Fc).ew0 = l2 -= vP3.ew0; int m, n = (m = ((YG)super).Fc.H4) % 10; float[] arrayOfFloat2; (arrayOfFloat2 = ((YG)super).Fc.Ls0)[n] = f3; ((YG)super).Fc.pl[n] = paramFloat2; ((YG)super).Fc.IE[n] = l2; int i = m + 1;
/* 17 */         sF1 = ((YG)super).pi; float f6; int j;
/* 18 */         for (i = Math.min(10, i), f6 = 0.0F, j = 0; j < i; ) { f6 += arrayOfFloat2[j]; j++; }  f2 = f6 / i;
/* 19 */         long[] arrayOfLong1 = vP3.IE; long l5;
/* 20 */         for (j = Math.min(10, vP3.H4), l5 = 0L, n = 0; n < j; ) { l5 += arrayOfLong1[n]; n++; }  if (j == 0) { l3 = 0L; } else { l3 = l5 / j; }  float f5; if ((f5 = (float)l3 / 1.0E9F) == 0.0F) { f2 = 0.0F; } else { f2 /= f5; }
/*    */          vP vP2;
/* 22 */         float[] arrayOfFloat1 = (vP2 = ((YG)super).Fc).pl; int k;
/*    */         float f8;
/* 24 */         for (k = Math.min(10, ((YG)super).Fc.H4), f8 = 0.0F, n = 0; n < k; ) { f8 += arrayOfFloat1[n]; n++; }  float f4 = f8 / k;
/* 25 */         long[] arrayOfLong2 = vP2.IE; long l6; byte b;
/* 26 */         for (k = Math.min(10, vP2.H4), l6 = 0L, b = 0; b < k; ) { l6 += arrayOfLong2[b]; b++; }  if (k == 0) { l4 = 0L; } else { l4 = l6 / k; }  float f7; if ((f7 = (float)l4 / 1.0E9F) == 0.0F) { f4 = 0.0F; } else { f4 /= f7; }  if (sF1
/* 27 */           .KF(f1, f2, f4) || bool) { bool = true; ((YG)super).Lb = 0L; return bool; }  bool = false; }  ((YG)super).Lb = 0L; return bool; }
/*    */     
/*    */     ((YG)super).nP = 0;
/*    */     ((YG)super).nP++;
/*    */     ((YG)super).Pa = System.nanoTime();
/*    */     ((YG)super).CM = f2;
/*    */     ((YG)super).st = sF1;
/*    */     ((YG)super).zD = f1;
/*    */     ((YG)super).PD = bool;
/*    */     ((YG)super).Lb = 0L;
/*    */     return ((YG)super).pi.FN(f2, sF1); }
/*    */ 
/*    */   
/*    */   public boolean Xe(int paramInt1, int paramInt2, int paramInt3) {
/*    */     float f = paramInt1;
/*    */     return coM9(paramInt3, f, paramInt2);
/*    */   }
/*    */   
/*    */   public final boolean coM9(int paramInt, float paramFloat1, float paramFloat2) {
/*    */     NC0 nC01, nC02, nC03;
/*    */     if (paramInt > 1)
/*    */       return false; 
/*    */     if (this.Cp0)
/*    */       return false; 
/*    */     if (paramInt == 0) {
/*    */       nC01 = this.qy;
/*    */     } else {
/*    */       nC01 = this.dg0;
/*    */     } 
/*    */     nC01.x = paramFloat1;
/*    */     nC01.y = paramFloat2;
/*    */     if (this.Nc) {
/*    */       sF sF1;
/*    */       if ((sF1 = this.pi) != null) {
/*    */         NC0 nC04 = this.mv0;
/*    */         nC02 = this.eh0;
/*    */         nC03 = this.qy;
/*    */         NC0 nC05 = this.dg0;
/*    */         boolean bool = sF1.Uu(nC04, nC02, nC03, nC05);
/*    */         if (this.pi.me0(this.mv0.lS(this.eh0), this.qy.lS(this.dg0)) || bool)
/*    */           return true; 
/*    */       } 
/*    */       return false;
/*    */     } 
/*    */     float f1 = nC02 - vP1.jn;
/*    */     float f2 = nC03 - vP1.fM;
/*    */     vP1.jn = nC02;
/*    */     vP1.fM = nC03;
/*    */     long l = UB0.PU.hl0.ip0 - vP1.ew0;
/*    */     vP vP1;
/*    */     (vP1 = this.Fc).ew0 = UB0.PU.hl0.ip0;
/*    */     int i = j % 10;
/*    */     vP1.Ls0[i] = f1;
/*    */     vP1.pl[i] = f2;
/*    */     vP1.IE[i] = l;
/*    */     int j;
/*    */     this.Fc.H4 = (j = this.Fc.H4) + 1;
/*    */     if (this.vr0) {
/*    */       boolean bool;
/*    */       float f = this.xb;
/*    */       f1 = this.G1;
/*    */       if (Math.abs(nC02 - f) < this.xD0 && Math.abs(nC03 - f1) < this.ig0) {
/*    */         bool = true;
/*    */       } else {
/*    */         bool = false;
/*    */       } 
/*    */       if (!bool) {
/*    */         this.SH0.uw0();
/*    */         this.vr0 = false;
/*    */       } 
/*    */     } 
/*    */     if (!this.vr0) {
/*    */       this.Sj0 = true;
/*    */       float f3 = this.Fc.Ty0, f4 = this.Fc.up0;
/*    */       return this.pi.AL(nC02, nC03, f3, f4);
/*    */     } 
/*    */     return false;
/*    */   }
/*    */   
/*    */   public boolean Di(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*    */     float f1 = paramInt1;
/*    */     float f2 = paramInt2;
/*    */     return uH0(paramInt3, paramInt4, f1, f2);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/YG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */