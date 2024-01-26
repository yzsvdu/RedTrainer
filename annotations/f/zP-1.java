/*  1 */ package f;public final class zP { public String v30; public boolean D1; public boolean L; public final eo z7; public final TG0 Nq0; public final eo nH; public final void kJ0() { if (!this.L) { eo eo1 = this.z7; TG0 tG0 = this.Nq0; eo eo2 = this.nH; this.Bf0.mT(eo1, tG0, eo2); }  Matrix4 matrix4 = this.Bf0; zP zP1; if (this
/*  2 */       .D1 && (zP1 = this.coM1) != null) { matrix4 = zP1.AS; this.AS.getClass(); this.AS
/*  3 */         .Qw(matrix4.Z0)
/*  4 */         .lU(this.Bf0); } else { this.AS.getClass(); this.AS
/*  5 */         .Qw(matrix4.Z0); }
/*  6 */      for (Hc0 hc0 = this.cq.r30(); hasNext(); ((zP)next()).kJ0()); } public final Matrix4 Bf0; public final Matrix4 AS; public fQ zx0; public zP coM1; public final fQ cq; public zP() { eo eo2; TG0 tG0; eo eo1; Matrix4 matrix4; fQ fQ1; this.D1 = true; this(); this.z7 = this; this(0.0F, 0.0F, 0.0F, 1.0F); this.Nq0 = this; this(1.0F, 1.0F, 1.0F); this.nH = this; this(); this.Bf0 = this; this(); this.AS = this; this(2); this.zx0 = this; this(2); this.cq = this; } public static zP le0(fQ paramfQ, String paramString, boolean paramBoolean) { int i = paramfQ.Z8; for (byte b = 0; b < i; b++) { zP zP1; if ((zP1 = (zP)paramfQ.get(b)).v30.equals(paramString)) return zP1;  }  if (paramBoolean) for (paramBoolean = false; paramBoolean < i; paramBoolean++) { zP zP1; if ((zP1 = le0(((zP)paramfQ.get(paramBoolean)).cq, paramString, true)) != null) return zP1;  }   return null; } public final void x4() { for (Hc0 hc02 = this.zx0.r30(); hc02.hasNext(); ) { R70 r70; int i; eM eM; Matrix4[] arrayOfMatrix4; if ((eM = (r70 = (R70)hc02.next()).tm) == null || (arrayOfMatrix4 = r70.Nx) == null || (i = eM.uJ0) != arrayOfMatrix4.length) continue;  for (byte b = 0; b < i; ) { Matrix4 matrix4 = (((zP[])r70.tm.Jo)[b]).AS; r70.Nx[b].getClass(); r70.Nx[b].Qw(matrix4.Z0).lU(((Matrix4[])r70.tm.WD0)[b]); b++; }  }  for (Hc0 hc01 = this.cq.r30(); hasNext(); ((zP)next()).x4()); } public final zP F7() { this(); zP1.ZF(); zP1.v30 = this.v30; zP1.L = this.L; zP zP1; (zP1 = new zP()).D1 = this.D1; (new zP()).z7.JL(this.z7); (new zP()).Nq0.XL(this.Nq0); (new zP()).nH.JL(this.nH); Matrix4 matrix4 = this.Bf0; (new zP()).Bf0.getClass(); (new zP()).Bf0.Qw(matrix4.Z0); matrix4 = this.AS; (new zP()).AS.getClass(); (new zP()).AS.Qw(matrix4.Z0); (new zP()).zx0.clear(); for (Hc0 hc02 = this.zx0.r30(); hc02.hasNext(); ) { fQ fQ1 = zP1.zx0; R70 r701; (r701 = (R70)hc02.next()).getClass(); this(); r702
/*  7 */         .xn = new COM6(r701.xn); r702.Zz0 = r701.Zz0; R70 r702; (r702 = new R70()).cF = r701.cF; eM eM; if ((eM = ((R70)hc02.next()).tm) == null) { r702.tm = null; r702.Nx = null; } else { Matrix4 matrix41; eM eM2; if ((eM2 = r702.tm) == null) { this(true, eM.uJ0, zP.class, Matrix4.class); r702.tm = eM2; } else { eM2.clear(); }  eM eM1 = r702.tm; eM1.getClass(); byte b = 0; int i;
/*  8 */         if ((i = (eM = r701.tm).uJ0) + b <= i)
/*  9 */         { int j; if ((j = eM1.uJ0 + i - b) >= eM1.Jo.length) { j = Math.max(8, (int)(j * 1.75F));
/*    */ 
/*    */             
/* 12 */             int m = Math.min(eM1.uJ0, arrayOfObject4.length); System.arraycopy(eM1.Jo, 0, arrayOfObject4, 0, m); Object[] arrayOfObject4 = (Object[])Array.newInstance(eM1.Jo.getClass().getComponentType(), j);
/*    */             
/* 14 */             int k = Math.min(eM1.uJ0, arrayOfObject3.length); System.arraycopy(eM1.WD0, 0, arrayOfObject3, 0, k); Object[] arrayOfObject3 = (Object[])Array.newInstance(eM1.WD0.getClass().getComponentType(), j); }
/* 15 */            Object[] arrayOfObject2 = eM1.Jo; System.arraycopy(eM.Jo, b, arrayOfObject2, eM1.uJ0, i); Object[] arrayOfObject1 = eM1.WD0; System.arraycopy(eM.WD0, b, arrayOfObject1, eM1.uJ0, i); eM1.uJ0 += i; Matrix4[] arrayOfMatrix41;
/* 16 */           if ((arrayOfMatrix41 = r702.Nx) == null || arrayOfMatrix41.length != r702.tm.uJ0) r702.Nx = new Matrix4[r702.tm.uJ0];  Matrix4[] arrayOfMatrix42; for (byte b1 = 0; b1 < (arrayOfMatrix42 = r702.Nx).length; ) { if (arrayOfMatrix42[b1] == null) { this(); arrayOfMatrix42[b1] = matrix41; }  b1++; }
/*    */            }
/* 18 */         else { throw new IllegalArgumentException("offset + length must be <= size: " + b + " + " + i + " <= " + matrix41.uJ0); }  }  fQ1.Com3(r702); }  zP1
/* 19 */       .cq.clear();
/*    */     
/* 21 */     Hc0 hc01 = this.cq.r30();
/* 22 */     for (; hasNext(); zP1.V0(((zP)next()).F7())); return zP1; }
/*    */ 
/*    */   
/*    */   public final void dn(Eb paramEb) {
/*    */     int i;
/*    */     byte b;
/*    */     for (i = this.zx0.Z8, b = 0; b < i; ) {
/*    */       R70 r70;
/*    */       if ((r70 = (R70)this.zx0.get(b)).cF) {
/*    */         int j = cOM6.xI0, k = cOM6.Dr;
/*    */         Matrix4 matrix4 = this.AS;
/*    */         COM6 cOM6;
/*    */         (cOM6 = r70.xn).u90.kY(paramEb, j, k, matrix4);
/*    */       } 
/*    */       b++;
/*    */     } 
/*    */     for (i = this.cq.Z8, b = 0; b < i; ) {
/*    */       ((zP)this.cq.get(b)).dn(paramEb);
/*    */       b++;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void ZF() {
/*    */     zP zP1;
/*    */     if ((zP1 = this.coM1) != null) {
/*    */       if (zP1.cq.Ct(this, true))
/*    */         this.coM1 = null; 
/*    */       this.coM1 = null;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final zP kv0(int paramInt) {
/*    */     return (zP)this.cq.get(paramInt);
/*    */   }
/*    */   
/*    */   public final void V0(zP paramzP) {
/*    */     zP zP1;
/*    */     for (zP1 = this; zP1 != null; ) {
/*    */       if (zP1 != paramzP) {
/*    */         zP1 = zP1.coM1;
/*    */         continue;
/*    */       } 
/*    */       throw new JU("Cannot add a parent as a child");
/*    */     } 
/*    */     if ((zP1 = paramzP.coM1) != null) {
/*    */       boolean bool;
/*    */       if (!zP1.cq.Ct(paramzP, true)) {
/*    */         bool = false;
/*    */       } else {
/*    */         paramzP.coM1 = null;
/*    */         bool = true;
/*    */       } 
/*    */       if (!bool)
/*    */         throw new JU("Could not remove child from its current parent"); 
/*    */     } 
/*    */     this.cq.Com3(paramzP);
/*    */     paramzP.coM1 = this;
/*    */   }
/*    */   
/*    */   public final zP Z1() {
/*    */     return this.coM1;
/*    */   }
/*    */   
/*    */   public final boolean cL() {
/*    */     return (this.coM1 != null);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/zP.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */