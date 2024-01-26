/* 1 */ package f;public final class K1 extends YG { public boolean m30; public int wS; public float qT; public float qk; public int Yx0; public boolean LPt7; public float QP; public float SF; public boolean P8; public eo XD0; public boolean he; public boolean xE; public int sp; public boolean Tx; public int Xf0; public boolean F2; public int b4; public boolean ig; public int Lk; public boolean rR; public int fr0; public boolean sI0; public int IK0; public boolean Y40; public Ih0 ri0; public int dF0; public float pL; public float BL; public final eo T70; public final eo jy; public int dx; public K1(Ih0 paramIh0) { this(); eo eo1;
/* 2 */     super(w90); this.m30 = false; this.wS = 2; this.qT = 90.0F; this.qk = 10.0F; this.Yx0 = 1; this.QP = -0.1F; this.SF = 10.0F; this.P8 = true; this(); this.XD0 = eo1; this.he = true; this.xE = true; this.sp = 51; this.Xf0 = 47; this.b4 = 29; this.Lk = 32; this.fr0 = 46; this.IK0 = 34; this.dF0 = -1; this(); this.T70 = eo1; this(); this.jy = eo1; W90 w90; (w90 = new W90()).wn0 = this; this.ri0 = paramIh0; } public final boolean fo(float paramFloat) { // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: invokevirtual uq : ()Z
/*   */     //   4: ifne -> 12
/*   */     //   7: iconst_0
/*   */     //   8: istore_0
/*   */     //   9: goto -> 52
/*   */     //   12: aload_0
/*   */     //   13: dup
/*   */     //   14: getfield ri0 : Lf/Ih0;
/*   */     //   17: dup
/*   */     //   18: aload_0
/*   */     //   19: getfield T70 : Lf/eo;
/*   */     //   22: swap
/*   */     //   23: getfield yF : Lf/eo;
/*   */     //   26: invokevirtual JL : (Lf/eo;)Lf/eo;
/*   */     //   29: fload_1
/*   */     //   30: invokevirtual uu : (F)Lf/eo;
/*   */     //   33: invokevirtual jy : (Lf/eo;)V
/*   */     //   36: getfield P8 : Z
/*   */     //   39: ifeq -> 50
/*   */     //   42: aload_0
/*   */     //   43: getfield ri0 : Lf/Ih0;
/*   */     //   46: iconst_1
/*   */     //   47: invokevirtual abstract : (Z)V
/*   */     //   50: iconst_1
/*   */     //   51: istore_0
/*   */     //   52: iload_0
/*   */     //   53: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 1
/* 2 */     //   #2	-> 47 } public final boolean Zp0(int paramInt) { if (uq()) { if (paramInt == 0) this.LPt7 = true;  if (paramInt == this.sp) { this.Tx = true; } else if (paramInt == this.Xf0) { this.F2 = true; } else if (paramInt == this.b4) { this.ig = true; } else if (paramInt == this.Lk) { this.rR = true; } else if (paramInt == this.fr0) { this.sI0 = true; } else if (paramInt == this.IK0) { this.Y40 = true; }  }  return false; } public final boolean uq() { if (js.vu0.q50) return false; 
/* 3 */     return this.m30; } public final boolean Di(int paramInt1, int paramInt2, int paramInt3, int paramInt4) { if (uq()) { this.dx = i; int i; if ((i = this.dx & (1 << paramInt3 ^ 0xFFFFFFFF)) != 0) i & i - 1;  this.dF0 = -1; if (super.Di(paramInt1, paramInt2, paramInt3, paramInt4) || this.LPt7) return true;  }  } public final boolean bD0(int paramInt1, int paramInt2, int paramInt3, int paramInt4) { D d; if (uq() && (!D.hS() || (paramInt1 >= (d = D.N2).vt.xY && paramInt1 <= 
/* 4 */       d.prn
/* 5 */       .Kd && paramInt2 >= d
/* 6 */       .Mn
/* 7 */       .yR())))
/* 8 */     { this.dx = i; int i; if ((i = this.dx | 1 << paramInt3) != 0 && (i & i - 1) == 0) { i = 1; } else { i = 0; }  if ((i ^ 0x1) != 0) { this.dF0 = -1; } else if (this.dF0 < 0) { this.dF0 = paramInt4; }  this.pL = paramInt1; this.BL = paramInt2; super.bD0(paramInt1, paramInt2, paramInt3, paramInt4); }  return false; } public final boolean XM(int paramInt) { if (uq()) { if (paramInt == 0) { this.LPt7 = false; this.dF0 = -1; }  if (paramInt == this.sp) { this.Tx = false; } else if (paramInt == this.Xf0) { this.F2 = false; } else if (paramInt == this.b4) { this.ig = false; } else if (paramInt == this.Lk) { this.rR = false; } else if (paramInt == this.fr0) { this.sI0 = false; } else if (paramInt == this.IK0) { this.Y40 = false; }  }  return false; } public final boolean kG0(float paramFloat1, float paramFloat2) { // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: invokevirtual uq : ()Z
/*   */     //   4: ifne -> 12
/*   */     //   7: iconst_0
/*   */     //   8: istore_0
/*   */     //   9: goto -> 28
/*   */     //   12: aload_0
/*   */     //   13: fload_2
/*   */     //   14: aload_0
/*   */     //   15: getfield QP : F
/*   */     //   18: fmul
/*   */     //   19: aload_0
/*   */     //   20: getfield qk : F
/*   */     //   23: fmul
/*   */     //   24: invokevirtual fo : (F)Z
/*   */     //   27: istore_0
/*   */     //   28: iload_0
/*   */     //   29: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 1 }
/* 9 */   public final boolean H2(int paramInt1, int paramInt2, int paramInt3) { eo eo1, eo2; if (!uq()) return false;  if (D.hS()) { D d; if (paramInt1 < (d = D.N2).vt.xY || paramInt1 > d.prn.Kd) return false;  if (paramInt2 < d.Mn.yR()) return false;  }  boolean bool; if ((bool = super.Xe(paramInt1, paramInt2, paramInt3)) || this.dF0 < 0) return bool;  float f1 = (paramInt1 - this.pL) / UB0.M60.fG0(); float f2, f3 = (this.BL - (f2 = paramInt2)) / UB0.M60.dL(); this.pL = paramInt1; this.BL = f2; int i; if ((i = this.dF0) == this.wS) { this.jy.JL(this.ri0.H).zT(this.ri0.yF); (this.T70.JL(this.ri0.yF).Nz(this.ri0.nj0)).y = 0.0F; eo2 = this.jy; eo eo3 = this.T70.WC0(); float f = f3 * this.qT; this.ri0.e20(eo2, eo3, f); eo1 = this.jy; eo2 = eo.Y; f3 = f1 * -this.qT; this.ri0.e20(eo1, eo2, f3); } else if (eo2 == null) { this.ri0.jy(this.T70.JL(this.ri0.yF).Nz(this.ri0.nj0).WC0().uu(-eo1 * this.qk)); float f = f3 * this.qk; this.ri0.jy(this.jy.TG0(0.0F, 0.0F, f)); if (this.he) this.XD0.zT(this.T70).zT(this.jy);  } else { this.ri0.jy(this.T70.JL(this.ri0.yF).uu(f3 * this.qk)); if (eo2 == this.Yx0 && this.xE) this.XD0.zT(this.T70);  }  if (this.P8) this.ri0.abstract(true);  return true; }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/K1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */