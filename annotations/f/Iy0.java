/* 1 */ package f;public final class Iy0 extends me { public boolean cT = false; public lpt1 qJ0; public final void Ic0(float paramFloat) { if (!this.cT)
/*   */     {
/* 3 */       for (Hc0 hc0 = km.wI0.iJ0.wN.r30(); hc0.hasNext(); ) { Ah ah; if ((ah = (Ah)hc0.next()).wg0.Ga != this.im0.Xg0()) continue;  lpt1 lpt11; Hc0 hc01; for (this.cT = true, lpt11 = null, hc01 = ah.W7.r30(); hc01.hasNext(); ) { lpt1 lpt12; if ("mg06_fl1".equals((lpt12 = (lpt1)hc01.next()).Zl0)) { lpt11 = lpt12; continue; }  if ("mg06_swc".equals(lpt12.Zl0)) this.Sl = lpt12;  }  if (lpt11 != null) { eI.Lj().getClass(); Matrix4 matrix4 = lpt11.mh; (this.qJ0 = eI.Yp0((byte)4, 174, false)).mh.getClass(); (this.qJ0 = eI.Yp0((byte)4, 174, false)).mh
/* 4 */             .Qw(matrix4.Z0);
/* 5 */           kc(this.qJ0); this.qJ0.nl("mg06_fl2", true); this.qJ0.XT("mg06_fl2", true); ah.W7.Ct(lpt11, true); lpt11.Ea0(); }  }  }  super.Ic0(paramFloat); } public lpt1 Sl; public Iy0(hB0 paramhB0) { super(paramhB0); } public final void Ad0(short[] paramArrayOfshort) { if (paramArrayOfshort.length < 1) return;  short s; if ((s = paramArrayOfshort[0]) != 4702) { if (s == 4703) { this.qJ0.k = 1.0E8F; this.qJ0.rd(0, false, null); }  } else { this.qJ0.rd(0, false, null); this.Sl.rd(0, false, null); }
/*   */      }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Iy0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */