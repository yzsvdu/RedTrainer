/*  1 */ package f;public abstract class kD0 extends Qa0 { public JG0 Bm0; public Un ki0 = null; public uB0 ab0; public Fy0 vi = null; public String NUL; public String f90; public final void uW() { if (!this.ab0.dP) { if (this
/*  2 */         .Kd + this
/*  3 */         .xY > 
/*  4 */         km.wI0.dG())
/*  5 */       { int i = km.wI0.dG() - this.xY;
/*    */         
/*  7 */         ME(i, this.er0); }  if (this
/*  8 */         .er0 + this
/*  9 */         .HC > 
/* 10 */         km.wI0.k1())
/*    */       {
/*    */ 
/*    */         
/* 14 */         ME(this.Kd, km.wI0.k1() - this.HC); }  }  super
/* 15 */       .uW(); }
/* 16 */   public int Ay = 0; public int x70 = 0; public int Hm = 0; public kD0(String paramString) { this(paramString, false); } public kD0(String paramString, boolean paramBoolean) { super(paramBoolean, false); this.NUL = paramString; this.f90 = "shared-minimized"; Xu(paramString); if (km.XU()) { uB0 uB01; this(350, 120); this.ab0 = uB01; } else { uB0 uB01; this(212, 40); this.ab0 = uB01; }  this.ab0.Xu("dialoglayout"); } public void d40() { mM(); this.Bm0.mM(); super.d40(); } public final void LJ0(boolean paramBoolean1, boolean paramBoolean2) { if (paramBoolean1) { xI0(); this.Ay = this.Kd; this.x70 = this.er0; this.Hm = this.Xo; EP(1); } else { Fy0 fy0; if ((fy0 = this.vi) != null) fy0.As.w70 = false;  if (this.Ay > km.wI0.dG() || this.x70 > km.wI0.k1()) { ME(km.wI0.dG() / 2 - this.xY / 2, km.wI0.k1() / 2 - this.HC / 2); } else { int j = this.Ay; ME(j, this.x70); }
/* 17 */        int i; if ((i = this.Hm) != 0) EP(i);  }  if (km.XU()) if (!paramBoolean1 && this.eh)
/* 18 */       { js.vu0
/* 19 */           .Ih0(this); }
/* 20 */       else { js.vu0
/* 21 */           .ye
/* 22 */           .Ct(this, true); }
/* 23 */         Un un; if ((un = this.ki0) != null) un.wI0(paramBoolean1 ^ true);  this.ab0.wI0(paramBoolean1); this.vi.wI0(paramBoolean2); if (paramBoolean1) { jf0(this.Bm0); } else { JG0 jG0; if ((jG0 = this.Bm0)
/* 24 */         .fr0 == null)
/* 25 */         si(jG0, Ub());  }
/* 26 */      MJ0(); if (paramBoolean1) { Xu(this.f90); } else { Xu(this.NUL); }  cZ(); }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/kD0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */