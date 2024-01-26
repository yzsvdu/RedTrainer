/*  1 */ package f;public final class hJ extends Or { public final boolean II0(Ih0 paramIh0, K70 paramK70, fo0 paramfo0, int paramInt, boolean paramBoolean) { if (((tw0)this.zS)
/*    */       
/*  3 */       .zH0 < 1) return true; 
/*  4 */     if (!this.Fb0.By0()) return true;  this.Fb0
/*  5 */       .qi0 = xi0.A90(1500, 2000);
/*    */     
/*    */     Xi xi;
/*  8 */     if (!(xi = km.wI0.iJ0 instanceof W9)) return true;
/*    */ 
/*    */ 
/*    */     
/* 12 */     short s1 = this.zS.HW.mm;
/* 13 */     short s2 = this.zS.HW.Yu0;
/* 14 */     int i = xi0.qX(3);
/* 15 */     float f1 = s1, f2 = s2; ((jp0)(xi = xi)).B5
/* 16 */       .TG0(f1, 0.0F, f2).uu(0.25F); for (Hc0 hc0 = xi.wN.r30(); hasNext();) { for (Hc0 hc01 = ((Ah)next()).W7.r30(); hc01.hasNext(); ) { Eb eb = lpt1.Of; ((jp0)xi).fY
/*    */           
/* 18 */           .JL(eb.sD);
/*    */ 
/*    */         
/* 21 */         float f3 = lpt1.Of.sD.x;
/* 22 */         float f4 = lpt1.Of.sD.z; lpt1 lpt1;
/* 23 */         if ((lpt1 = (lpt1)hc01.next()).Zl0.contains("tree") && ((jp0)xi).B5.Cl0(f3, 0.0F, f4) < 1.25F) lpt1
/* 24 */             .rd(i, false, null);  }  }  return true; }
/*    */ 
/*    */   
/*    */   public e2 Fb0;
/*    */   
/*    */   public hJ(tw0 paramtw0) {
/*    */     super(paramtw0);
/*    */     e2 e21;
/*    */     this(2000);
/*    */     this.Fb0 = this;
/*    */   }
/*    */   
/*    */   public final boolean t0(tH paramtH, int paramInt, boolean paramBoolean) {
/*    */     return true;
/*    */   }
/*    */   
/*    */   public final tc ns0() {
/*    */     return this.zS;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/hJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */