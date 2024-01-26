/*  1 */ package f;public final class Jm { public final void t0(AH0 paramAH0, Ym0 paramYm0) { K30 k30; if (!this.AC) { byte b; if (paramYm0.kb0 == 3) { b = 1; } else { b = 2; }  if (this
/*  2 */         .sg != null) { Va va1; this(0); this.Xp0 = va1; if (b == 2) { this(1); this.N30 = va1; }
/*  3 */          Ym0.bH[paramYm0.OB][paramYm0.x70];
/*  4 */         this.AC = true; } else { throw new RuntimeException("Output buffer was not set."); }  }
/*  5 */      Va va = null; int i; if ((i = paramYm0.f0) != 1) { if (i != 2) { if (i == 3) { if (this
/*  6 */             .JE0 == null) { oH oH2; va = this.Xp0; Va va1 = this.N30; qR qR1 = this.sg; this(paramAH0, paramYm0, va, va1, qR1); this.JE0 = oH2; }  oH oH1 = this.JE0; }  } else { if (this.cON == null) { this(); this.cON = cI; Va va1 = this.Xp0; va = this.N30; qR qR1 = this.sg; CI cI; (cI = new CI())
/*  7 */             .XI0 = paramAH0; (new CI()).O1 = paramYm0; (new CI()).dp0 = va1; (new CI()).s20 = va; (new CI()).o5 = qR1; (new CI()).EM = 0; }
/*  8 */          k30 = this.cON; }  } else { if (this.WB0 == null) { this(); this.WB0 = k301; Va va1 = this.Xp0; va = this.N30; qR qR1 = this.sg; K30 k301; (k301 = new K30())
/*  9 */           .XI0 = paramAH0; (new K30()).O1 = paramYm0; (new K30()).dp0 = va1; (new K30()).s20 = va; (new K30()).o5 = qR1; (new K30()).EM = 0; }
/* 10 */        k30 = this.WB0; }  if (k30 != null) { k30
/* 11 */         .t80(); return; }
/* 12 */      throw new OD(
/* 13 */         OD.f80(513)); }
/*    */ 
/*    */   
/*    */   public qR sg;
/*    */   public Va Xp0;
/*    */   public Va N30;
/*    */   public oH JE0;
/*    */   public CI cON;
/*    */   public K30 WB0;
/*    */   public boolean AC;
/*    */   
/*    */   public final void qO(qR paramqR) {
/*    */     this.sg = paramqR;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Jm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */