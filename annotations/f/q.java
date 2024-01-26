/* 1 */ package f;public final class q { public final void ng0(byte paramByte, boolean paramBoolean) { this.gT = paramByte;
/* 2 */     short arrayOfShort[][][], s = (arrayOfShort = sx0.Zo0)[this.Sa0][paramByte][0];
/* 3 */     xr0 xr0 = this.u00.im0.v50(s, (arrayOfShort = sx0.Zo0)[this.Sa0][paramByte][1], 0); il il1;
/* 4 */     if ((il1 = this.Wk) != null) il1
/* 5 */         .EC0 = (short)0; 
/* 6 */     (this.Wk = (il)xr0)
/* 7 */       .EC0 = (short)-128;
/* 8 */     this.E50.TG0(xr0.Ka() * 0.25F + 0.125F, 0.1F, xr0.hA0() * 0.25F + 0.125F); this.Z8 = paramBoolean; if (!paramBoolean) { float f1 = arrayOfShort[this.Sa0][paramByte][0] * 0.25F + 0.125F, f2 = arrayOfShort[this.Sa0][paramByte][1] * 0.25F + 0.125F; this.yY.mh.bb0(f1, 0.1F, f2); }
/*   */      }
/*   */ 
/*   */   
/*   */   public final byte Sa0;
/*   */   public byte gT;
/*   */   public byte TA0;
/*   */   public lpt1 yY;
/*   */   public eo E50;
/*   */   public il Wk;
/*   */   public boolean Z8;
/*   */   
/*   */   public q(sx0 paramsx0, byte paramByte, lpt1 paramlpt1) {
/*   */     eo eo1;
/*   */     this.Z8 = false;
/*   */     this.Sa0 = paramByte;
/*   */     this.TA0 = sx0.Ey[paramByte];
/*   */     this.yY = paramlpt1;
/*   */     this();
/*   */     this.E50 = new eo();
/*   */     paramlpt1.mh.on0(this);
/*   */     ng0(sx0.HJ0[paramByte], false);
/*   */   }
/*   */   
/*   */   public final void tG0(String paramString) {
/*   */     this.yY.co0(paramString, true, null);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */