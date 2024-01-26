/* 1 */ package f;public final class lU extends Wr { public YA0 G70; public IN MQ; public ge0[] SX; private void fq0() { this.class.sk0(false); boolean bool = false; km.u4.e20
/* 2 */       .W3(new GK0(bool)); } public long Om0; public float qS; public Un class; public lU(int paramInt, Xv0 paramXv0, int[] paramArrayOfint, boolean[] paramArrayOfboolean) { vF0 vF0; EP(1); jJ0(false); Lo(Ml0.OH0(6732)); this.qS = paramInt * 1000.0F; long l = System.currentTimeMillis(); this.Om0 = paramInt * 1000L + l; SA sA; (sA = (this.G70 = new YA0()).Dv0).cM().Xj0(10.0F); (this.MQ = new IN()).Nu(1.0F); for (byte b2 = 0; b2 < paramArrayOfint.length; b2++) { dQ dQ; int i = paramArrayOfint[b2]; String str = "???"; Jo jo; if ((jo = km.a3.wQ()) != null) if (jo.VC() == i) { str = jo.m(); } else if (km.u4.Nh0() != null && km.u4.Nh0().gJ(i)) { str = km.u4.Nh0().tk(i).V9(); } else if (km.u4.ik0() != null && km.u4.ik0().FH0(i)) { str = km.u4.ik0().bc(i).getName(); } else if (km.u4.rC0() != null && km.u4.rC0().fH0(i)) { str = km.u4.rC0().ve0(i).getName(); }   this(str); sA.S7(dQ); }  sA.wP(); this.SX = new ge0[paramArrayOfboolean.length]; for (byte b1 = 0; b1 < paramArrayOfboolean.length; b1++) { ge0 ge01; this(); this.SX[b1] = ge01; this.SX[b1].sk0(false); this.SX[b1].zs(paramArrayOfboolean[b1]); sA.S7(this.SX[b1]).R7(); }  sA.wP(); sA.S7(this.MQ).K4().Yv(Integer.valueOf(this.SX.length)); this.MQ.Xu("time-progressbar"); this(Ml0.OH0(5048)); this.class = un; Un un; (un = new Un()).tW(this::fq0); this(32, 32); (new vF0()).ZH0().zy0(); (new vF0()).ZH0().Pn(new pe0[] { interface.ZZ().Fw(paramXv0.RI0()) }); sA.wP(); (new vy()).J8(vF0); (new vy()).J8(new dQ(paramXv0.D70())); sA.S7(new vy()).fu().Kw().Yv(Integer.valueOf(this.SX.length)); sA.wP(); sA.S7(this.class).Yv(Integer.valueOf(this.SX.length)).K4(); J8(this.G70); km.pm0.bL((byte)2, (short)1383); } public final void J00(throws paramthrows) { long l; if ((l = this.Om0 - System.currentTimeMillis()) > 0L) { this.MQ.Nu((float)l / this.qS); } else { Un un; if ((un = this.class).kN) { sk0(false); boolean bool = true; km.u4
/* 3 */           .e20
/* 4 */           .W3(new GK0(bool)); }
/*   */        }
/*   */      }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/lU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */