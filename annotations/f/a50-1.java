/* 1 */ package f;public final class a50 extends fZ { public final void tU(tH paramtH, int paramInt1, int paramInt2, int paramInt3) { if (paramInt1 != 0)
/* 2 */       return;  LJ lJ = G00.Av0.Cx0((byte)10, 303, false);
/*   */     int i;
/* 4 */     if ((i = (int)((zm0.u20 - this.L3) / 75L)) < 0) { i = 0; } else if (i > 5) { i = 5; }  paramtH.HK0(Color.WHITE); float f1 = paramInt2 + 1.66F, f2 = paramInt3 + 6.33F; int j = lJ.LT(i).HA0().getWidth(); paramInt2 = lJ.LT(i).HA0().getHeight(); paramtH.P10(lJ.LT(i).HA0(), f1, f2, 12.0F, 12.0F, j, paramInt2, false, false); paramtH.og0(Xc0.Nn0); }
/*   */ 
/*   */   
/*   */   public final long L3 = zm0.zg();
/*   */   
/*   */   public final boolean i2() {
/*   */     return (zm0.u20 - this.L3 > 450L);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/a50.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */