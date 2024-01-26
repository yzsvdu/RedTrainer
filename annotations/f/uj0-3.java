/* 1 */ package f;public final class uj0 extends me { public final void Ic0(float paramFloat) { if (!this.Gt)
/*   */     {
/* 3 */       for (Hc0 hc0 = km.wI0.iJ0.wN.r30(); hc0.hasNext(); ) { Ah ah; if ((ah = (Ah)hc0.next()).wg0.Ga != this.im0.Xg0()) continue;  for (Hc0 hc01 = ah.W7.r30(); hc01.hasNext(); ) { lpt1 lpt11; if ("aji_mech01".equals((lpt11 = (lpt1)hc01.next()).Zl0)) { this.WS[0] = lpt11; continue; }  if ("aji_mech02".equals(lpt11.Zl0)) { this.WS[1] = lpt11; continue; }  if ("aji_mech03".equals(lpt11.Zl0)) this.WS[2] = lpt11;  }  this.Gt = true; }  }  super.Ic0(paramFloat); }
/*   */ 
/*   */   
/*   */   public boolean Gt = false;
/*   */   public lpt1[] WS = new lpt1[3];
/*   */   
/*   */   public uj0(hB0 paramhB0) {
/*   */     super(paramhB0);
/*   */   }
/*   */   
/*   */   public final void Ad0(short[] paramArrayOfshort) {
/*   */     if (paramArrayOfshort.length < 1)
/*   */       return; 
/*   */     if (!this.Gt) {
/*   */       UB0.Kg0.fN(() -> Ad0(paramArrayOfshort));
/*   */       return;
/*   */     } 
/*   */     if (paramArrayOfshort[0] == 4704)
/*   */       for (byte b = 0; b < 3; ) {
/*   */         lpt1 lpt11;
/*   */         if ((lpt11 = this.WS[b]) != null) {
/*   */           boolean bool;
/*   */           short s;
/*   */           if ((s = paramArrayOfshort[b + 1]) == 0) {
/*   */             bool = true;
/*   */           } else {
/*   */             bool = false;
/*   */           } 
/*   */           lpt11.rd(s, bool, null);
/*   */         } 
/*   */         b++;
/*   */       }  
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/uj0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */