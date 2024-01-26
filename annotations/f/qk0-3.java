/*  1 */ package f;public class qk0 extends SI { public int Gp; public Ui0 sK0 = null; public void Zq() { this
/*  2 */       .sK0 = new Ui0((interface.ZZ()).kO); if (this.CH0) { this.Gp = 50; } else { this.Gp = 0; }  } public long d90 = -1L; public qk0(yE0 paramyE0, boolean paramBoolean) { super(paramyE0, paramBoolean); } public void IA(tH paramtH) { long l; if (this.d90 + 100L < (l = zm0.u20)) { this.d90 = l;
/*  3 */       if (this.y00)
/*  4 */       { int i; if ((i = this.Gp) > 0) this.Gp = i - 2;  if (this.Gp < 0) this.Gp = 0;  } else { int i; if ((i = this.Gp) < 50) this.Gp = i + 2;  if (this.Gp > 50) this.Gp = 50;  }  this.sK0.t(this.Gp / 255.0F); }  if (this.Gp < 1)
/*    */       return; 
/*  6 */     Eb eb = km.wI0.iJ0.vD();
/*    */     
/*  8 */     float f2 = this.LW.x;
/*    */     
/* 10 */     this.sK0.Kf(f2, this.LW.y); float f1 = this.pp0.x; this.sK0.Hc0(f1, this.pp0.y); this.sK0.Ne(paramtH); }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/qk0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */