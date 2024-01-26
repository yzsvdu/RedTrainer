/*  1 */ package f;public final class IG extends gy0 implements qs { public final void vu(boolean paramBoolean) { if (this.YD0 != paramBoolean) { int i; byte b2; this.YD0 = paramBoolean; LL lL; (lL = this.xY).getClass(); Object object; bF0 bF01 = (bF0)(object = this.NF); XJ0 xJ0;
/*  2 */       if ((xJ0 = this.cD0) != null) { i = xJ0.HK0(); } else { if ((i = ((bF0)i).ty0()) == 0) { b2 = 1; } else { b2 = 0; }  this.Pl = b2; }  if (this
/*  3 */         .YD0) { b2 = i; } else { b2 = 0; }  int k; for (bF0 bF03 = bF01.getParent(), bF02 = bF01; bF01 != null; ) { IG iG; if ((iG = (IG)gy0.Hr0((gy0[])lL.Xw, bF01)).cD0 == null) {
/*    */           
/*  5 */           this(64);
/*  6 */           iG.cD0 = xJ01;
/*  7 */           xJ01.dG0 = 1;
/*  8 */           int i1 = ((bF0)iG.NF).ty0(); XJ0 xJ01;
/*  9 */           if ((xJ01 = new XJ0()).mE0.length < i1) xJ01.mE0 = new int[i1];  xJ01.NW = i1; xJ01.kr(0, i1); xJ01.em0(0, i1);
/* 10 */         }  int m = ((bF0)iG.NF).S7(bF02); iG.cD0.dy0(m, k + 1); m = iG.cD0.HK0(); bF0 bF05 = bF01.getParent(); int n = m; bF0 bF04 = bF01; bF01 = bF05; }  lL
/*    */         
/* 12 */         .ge0 = lL.Vc.cD0.HK0(); int j = lL.RM((bF0)this.NF); if (this.YD0) { lL.av0(j + 1, i); } else { lL.KS(j + 1, i); }  byte b1 = 1; if (j >= 0 && b1 <= (
/* 13 */         k = lL.ge0) && j <= k - b1) { boolean bool; byte b; for (k = 0, b = 0; b < b1; ) { if (lL
/* 14 */             .F9 != null)
/* 15 */           { int m; bF0 bF0; int n; int i1; for (bF0 = lL.Oq0(m = j + b), n = 0, i1 = 0; i1 < lL.sm0; ) { xy0 xy0; if ((xy0 = lL.SH(m, i1, bF0)) != null) { n = Math.max(n, xy0.tj0()); i1 = Math.max(xy0.cf0() - 1, 0) + i1; }  i1++; }
/* 16 */              bool = k | lL.F9.dy0(m, n); }  byte b3 = 0; while (b3 < lL
/* 17 */             .sm0) { lL.bv(j + b, b3); b3++; }  b++; }  lL.rq0(); if (bool) lL.MJ0();  rS rS; if (this
/* 18 */           .YD0 && (rS = rS.ck(lL)) != null) { rS.uW(); i = lL.Zj0(j); j = lL.k20(j + i) - i; rS.Uo0(i, j, lL.XK / 2); }
/* 19 */          hm.Fz0(this.Ph0); }
/* 20 */       else { throw new IllegalArgumentException("row"); }
/*    */        }
/*    */      }
/*    */ 
/*    */   
/*    */   public final IG qD;
/*    */   public boolean YD0;
/*    */   public boolean Pl;
/*    */   public XJ0 cD0;
/*    */   public IG[] z4;
/*    */   public Runnable[] Ph0;
/*    */   public int oD0;
/*    */   
/*    */   public IG(LL paramLL, bF0 parambF0, IG paramIG) {
/*    */     super(parambF0);
/*    */     boolean bool;
/*    */     this.qD = paramIG;
/*    */     if (paramIG != null) {
/*    */       bool = paramIG.oD0 + 1;
/*    */     } else {
/*    */       bool = false;
/*    */     } 
/*    */     this.oD0 = bool;
/*    */     if (paramIG != null) {
/*    */       if (paramIG.z4 == null)
/*    */         paramIG.z4 = new IG[((bF0)paramIG.NF).ty0()]; 
/*    */       paramIG.z4[((bF0)paramIG.NF).S7(parambF0)] = this;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void Ac0(Runnable paramRunnable) {
/*    */     this.Ph0 = (Runnable[])hm.LpT6((Object[])this.Ph0, paramRunnable, Runnable.class);
/*    */   }
/*    */   
/*    */   public final void nq0(Runnable paramRunnable) {
/*    */     this.Ph0 = (Runnable[])hm.LL0(paramRunnable, (Object[])this.Ph0);
/*    */   }
/*    */   
/*    */   public final boolean getValue() {
/*    */     return this.YD0;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/IG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */