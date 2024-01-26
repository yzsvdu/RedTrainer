/* 1 */ package f;public final class PC0 extends GS implements Np0 { public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) { Gp0 gp0; if ((gp0 = km.MR) == null) return;  Wl wl = km.wI0.K7;
/* 2 */     PE pE = gp0.a0(gp0.hG0()); byte b; if ((b = this.lx) != 0) { if (b != 1) { if (b == 2) { paramkf.Kq(Ml0.Go(200426, paramhm02.coM1())); paramhm02.qt0(true); }  } else { paramkf.Kq(Ml0.Go(200502, paramhm02.coM1())); paramhm02.qt0(false); }  } else { paramkf.Kq(Ml0.OH0(200500)); pE
/* 3 */         .Au = true;
/* 4 */       yw0(gp0.hG0(), (short)-551); }
/*   */      }
/*   */ 
/*   */   
/*   */   public final byte lx;
/*   */   
/*   */   public PC0(byte paramByte) {
/*   */     this.lx = paramByte;
/*   */   }
/*   */   
/*   */   public final byte YG0() {
/*   */     return 112;
/*   */   }
/*   */   
/*   */   public final boolean Lt() {
/*   */     byte b;
/*   */     return ((b = this.lx) != 0) ? ((b != 1 && b != 2) ? super.Lt() : true) : false;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/PC0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */