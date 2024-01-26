/* 1 */ package f;public class Mj { public final Ui0 ne0; public int RG; public int wB0; public void hu0() { int i; if ((i = this.wB0) != this.oI)
/* 2 */     { float f2; if ((f2 = (float)(zm0.u20 - this.eC0) / this.q50) > 1.0F) f2 = 1.0F;  float f1 = this.RG; int j = (int)NUL.df(i, f1, f2, f1); this.ne0.t(j / 255.0F); }  } public int oI; public long eC0 = zm0.zg(); public int q50 = 500; public Mj(Ui0 paramUi0) { this.ne0 = paramUi0; paramUi0.t(false); this.wB0 = 0; } public final void gz0(int paramInt1, int paramInt2, int paramInt3) { if (paramInt2 > 255) { paramInt2 = 255; } else if (paramInt2 < 0) { paramInt2 = 0; }  this.q50 = paramInt3; this.eC0 = zm0.u20; this.wB0 = paramInt2; if (paramInt1 == -1) { this.RG = this.oI; } else { this.oI = paramInt1; this.RG = paramInt1; this.ne0.t(paramInt1 / 255.0F); }
/*   */      }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Mj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */