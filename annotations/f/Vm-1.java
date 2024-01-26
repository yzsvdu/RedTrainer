/* 1 */ package f;public final class Vm extends fZ { public long Ou0 = zm0.zg(); public final int Yi0; public final int r00; public final void tU(tH paramtH, int paramInt1, int paramInt2, int paramInt3) { if (paramInt1 == 10)
/* 2 */       return;  long l = zm0.u20 - this.Ou0; int j; if ((j = this.Yi0) > l) return;  int i; if (l > (i = this.r00 + j)) { if (l < (i + 75)) { i = 1; if (paramInt1 == 0) return;  } else if (l < (i + 150)) { i = 2; if (paramInt1 == 0) return;  } else if (l < (i + 225)) { i = 3; if (paramInt1 == 0) return;  } else { i = 4; }
/*   */ 
/*   */       
/* 5 */       Texture texture = G00.Av0.Cx0((byte)0, 167, false).LT(i).HA0(); float f1 = paramInt2, f2 = paramInt3; paramtH.VI(this, f1, f2); }  } public final tc XO; public final short GK0; public final short D8; public Vm(tc paramtc, int paramInt1, int paramInt2) { this.Yi0 = paramInt1; this.r00 = paramInt2; this.XO = paramtc; this.GK0 = paramtc.nul(); this.D8 = paramtc.zD(); paramtc.Sf(); paramtc.aT(); } public final boolean i2() { boolean bool; if (zm0.u20 - this.Ou0 > (this.r00 + 300 + this.Yi0)) { bool = true; } else { bool = false; }  G5 g5; if (((g5 = this.XO.HW).mm != this.GK0 || g5
/* 6 */       .Yu0 != this
/* 7 */       .D8) && g5
/* 8 */       .g50 == 0) bool = true;  return bool; }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Vm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */