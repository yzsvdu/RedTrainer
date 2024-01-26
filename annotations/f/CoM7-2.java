/* 1 */ package f;public final class CoM7 extends gT { public nUL HT; public qk[] ux0; public SimpleDateFormat Ap0; public String[] LE0; public final Object Kx0(int paramInt1, int paramInt2) { qk qk1 = this.ux0[paramInt1]; if (paramInt2 != 0) { if (paramInt2 != 1) { if (paramInt2 != 2) return "";  (new Un(Ml0.OH0(1663))).tW(new AO(this, qk1)); return new Un(Ml0.OH0(1663)); }
/* 2 */        return this.Ap0.format(new Date(qk1.Lq0 * 1000L)); }
/* 3 */      return qk1.mV; } public CoM7(nUL paramnUL) { String[] arrayOfString; this.ux0 = new qk[0]; this.Ap0 = new SimpleDateFormat("yyyy-MM-dd"); this.HT = paramnUL; if (km.XU()) { (arrayOfString = new String[3])[0] = Ml0.OH0(1651); (new String[3])[1] = Ml0.OH0(1662); (new String[3])[2] = Ml0.OH0(1683); this.LE0 = this; } else { (arrayOfString = new String[2])[0] = Ml0.OH0(1651); (new String[2])[1] = Ml0.OH0(1662); ((CoM7)super).LE0 = this; }  } public final int Z80() { return this.ux0.length; } public final int ED0() { return this.LE0.length; } public final String zd(int paramInt) { return this.LE0[paramInt]; } public final Object ms(int paramInt1, int paramInt2) { this(); StringBuilder stringBuilder; return pv.X9(1661, this, "\n").append((this.ux0[paramInt1]).VA0).toString(); }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/CoM7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */