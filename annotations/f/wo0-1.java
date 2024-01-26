/*  1 */ package f;public final class wo0 extends Un implements r60 { public static wo0 on0; public rx0 kH0; public Prn yZ; private void La() { ah0 ah0 = this.kH0.bm0;
/*    */     
/*  3 */     ((BI)this).fJ
/*  4 */       .JK0
/*  5 */       .add(this.bh); } public BM Qf0; public u4 bh = null; public wo0[] AF; public wo0(rx0 paramrx0, BM paramBM) { Xu("button"); this.kH0 = paramrx0; this.Qf0 = paramBM; M90(); tW(() -> { wo0 wo01; if ((wo01 = on0) != null) { wo01.uw(); on0 = null; return; }  if (this.bh != null) { uw(); return; }  Bt0(); }); } public final void M90() { Prn prn; rx0 rx01; if ((rx01 = this.kH0) == null) { rx01 = null; } else { BM bM = this.Qf0; prn = (Prn)rx01.rc.get(bM); }  this.yZ = prn; if (prn == null) { s6("-"); } else { s6(prn.QH(this.kH0.bm0)); }  } public final void Bt0() { s6(Ml0.OH0(1323)); this.bh = new u4(this); on0 = this; UB0.Kg0.fN(this::La); } public final void Jx0(Prn paramPrn) { ah0 ah01; if (this.fr0 == null) { ah01 = this.kH0.bm0; ((BI)this).fJ
/*  6 */         .JK0
/*  7 */         .remove(this.bh); return; }
/*  8 */      ((wo0)super).kH0
/*  9 */       .rc
/*    */       
/* 11 */       .put(paramPrn.dL0, paramPrn);
/*    */ 
/*    */     
/* 14 */     s6(paramPrn.QH(((wo0)super).kH0.bm0));
/* 15 */     ah0 ah02 = ((wo0)super).kH0.bm0;
/*    */     
/* 17 */     ((BI)ah02).fJ
/* 18 */       .JK0
/* 19 */       .remove(((wo0)super).bh);
/* 20 */     ((wo0)super).bh = null; on0 = null; wo0[] arrayOfWo0;
/* 21 */     if ((arrayOfWo0 = ((wo0)super).AF) != null) { int i; byte b; for (i = arrayOfWo0.length, b = 0; b < i; ) { wo0 wo01; Prn prn1; Prn prn2; if ((wo01 = arrayOfWo0[b]) != this && (prn1 = wo01.yZ) != null && prn1
/* 22 */           .f5 == 
/* 23 */           (prn2 = ((wo0)super).yZ)
/* 24 */           .f5 && prn1
/* 25 */           .Com8 == prn2.Com8 && prn1
/* 26 */           .iD0 == prn2.iD0 && prn1
/* 27 */           .wd0 == prn2.wd0) wo01
/* 28 */             .uw();  b++; }
/*    */        }
/* 30 */      h1.cd0(g8.H70); }
/*    */ 
/*    */   
/*    */   public final void ym0(wo0[] paramArrayOfwo0) {
/*    */     this.AF = paramArrayOfwo0;
/*    */   }
/*    */   
/*    */   public final void ED0(throws paramthrows) {
/*    */     if (this.bh != null)
/*    */       uw(); 
/*    */     super.ED0(paramthrows);
/*    */   }
/*    */   
/*    */   public final boolean i2(oa0 paramoa0) {
/*    */     if (this.bh != null && B8.Wm0(paramoa0.cz0))
/*    */       return true; 
/*    */     return super.i2(paramoa0);
/*    */   }
/*    */   
/*    */   public final void uw() {
/*    */     ah0 ah02;
/*    */     if (this.fr0 == null) {
/*    */       ah02 = this.kH0.bm0;
/*    */       ((BI)this).fJ.JK0.remove(this.bh);
/*    */       on0 = null;
/*    */       return;
/*    */     } 
/*    */     rx0 rx01;
/*    */     if ((rx01 = ((wo0)super).kH0) == null)
/*    */       return; 
/*    */     BM bM = ((wo0)super).Qf0;
/*    */     rx01.rc.remove(this);
/*    */     s6("-");
/*    */     ah0 ah01 = ((wo0)super).kH0.bm0;
/*    */     ((BI)this).fJ.JK0.remove(((wo0)super).bh);
/*    */     ((wo0)super).bh = null;
/*    */     on0 = null;
/*    */     h1.cd0(g8.H70);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/wo0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */