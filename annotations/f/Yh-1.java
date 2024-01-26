/*  1 */ package f;public final class Yh extends SI { public final void IA(tH paramtH) { long l; if (this.Z90 + 30L < (l = zm0.u20)) { this
/*  2 */         .Z90 = l;
/*  3 */       if (this.y00)
/*  4 */       { int i1; if ((i1 = this.eM) > 0) this.eM = i1 - 20;  } else { int i1; if ((i1 = this.eM) < 255) this.eM = i1 + 20;  }  }  if (this.eM < 1) {
/*    */       return;
/*    */     }
/*  7 */     zh0 zh0 = (iU.mH()).zk0[(int)(zm0.u20 / 1000L % 2L)];
/*    */     
/*  9 */     int j = (int)(km.wI0.iJ0.vD()).pp0.x / 64 * 64 + -64;
/*    */     
/* 11 */     int k = (int)(km.wI0.iJ0.vD()).pp0.y / 64 * 64 + -128 + (int)(zm0.u20 / 100L % 64L); pe0
/* 12 */       .G3
/* 13 */       .setWrap(A00.OW, A00.OW); float f1 = this.eM / 255.0F; paramtH.HK0(Xc0.Com4.cpy().mul(1.0F, 1.0F, 1.0F, f1));
/* 14 */     Texture texture = pe0.G3; float f2 = j, f3 = k; pe0 pe0;
/* 15 */     k = (pe0 = zh0.Uu0()).jg();
/* 16 */     int m = Math.round((zh0.Uu0()).WT * pe0.G3.getHeight());
/* 17 */     int i = (int)(km.wI0.iJ0.vD()).LW.x + 512;
/* 18 */     int n = (int)(km.wI0.iJ0.vD()).LW.y + 512;
/* 19 */     paramtH.oS(this, f2, f3, k, m, i, n); paramtH.og0(Xc0.Nn0); }
/*    */ 
/*    */   
/*    */   public long Z90 = zm0.zg();
/*    */   public int eM = 0;
/*    */   
/*    */   public Yh(yE0 paramyE0, boolean paramBoolean) {
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
/*    */     this.eM = bool;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Yh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */