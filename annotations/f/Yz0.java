/* 1 */ package f;public final class Yz0 extends x60 { public final void Da0(String[] paramArrayOfString) { boolean bool; Wl wl; if ((wl = km.wI0.K7) == null) {
/* 2 */       km.u4.oD("Not in battle.", ZY.ih); return;
/*   */     } 
/*   */     ZY zY;
/* 5 */     km.u4.oD("Current render entry: " + yp0, zY = ZY.ih); R8 r8 = km.u4;
/* 6 */     StringBuilder stringBuilder = B40.df("Current render entry is finished: "); kf kf; yp0 yp0; if ((yp0 = (kf = this.LW).Te) == null || yp0
/* 7 */       .Ie()) { bool = true; } else { bool = false; }  r8.oD(stringBuilder.append(bool).toString(), zY); km.u4
/*   */       
/* 9 */       .oD(B40.df("GUI isbusy: ").append(kv()).toString(), zY); }
/*   */ 
/*   */   
/*   */   public Yz0() {
/*   */     super("/battlelockdebug", false);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Yz0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */