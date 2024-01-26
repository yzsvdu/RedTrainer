/*  1 */ package f;public final class Nb extends SI { public final void IA(tH paramtH) { long l; if (this.GP + 30L < (l = zm0.u20)) { this
/*  2 */         .GP = l;
/*  3 */       if (this.y00)
/*  4 */       { int m; if ((m = this.ZY) > 0) this.ZY = m - 10;  } else { int m; if ((m = this.ZY) < 180) this.ZY = m + 10;  }  }  if (this.ZY < 1) {
/*    */       return;
/*    */     }
/*    */     
/*  8 */     int j = (int)(km.wI0.iJ0.vD()).pp0.x / 64 * 64 + -64 - (int)(zm0.u20 / 60L % 64L);
/*    */     
/* 10 */     float f1 = this.ZY / 255.0F; paramtH.HK0(Xc0.Com4.cpy().mul(1.0F, 1.0F, 1.0F, f1)); Texture texture; (texture = (iU.mH()).KZ.HA0()).setWrap(A00.OW, A00.OW); f1 = j; float f2 = ((int)(km.wI0.iJ0.vD()).pp0.y / 64 * 64 + -64);
/* 11 */     int i = (int)(km.wI0.iJ0.vD()).LW.x + 512;
/* 12 */     int k = (int)(km.wI0.iJ0.vD()).LW.y + 512;
/* 13 */     paramtH.oS(texture, f1, f2, 0, 0, i, k); paramtH.og0(Xc0.Nn0); }
/*    */ 
/*    */   
/*    */   public long GP = zm0.zg();
/*    */   public int ZY = 0;
/*    */   
/*    */   public Nb(yE0 paramyE0, boolean paramBoolean) {
/*    */     super(paramyE0, paramBoolean);
/*    */   }
/*    */   
/*    */   public final void Zq() {
/*    */     boolean bool;
/*    */     if (this.CH0) {
/*    */       bool = true;
/*    */     } else {
/*    */       bool = false;
/*    */     } 
/*    */     this.ZY = bool;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Nb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */