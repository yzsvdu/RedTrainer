/* 1 */ package f;public abstract class xr0 { public short si0; public short k80; public fQ Gl = null; public xr0(short paramShort1, short paramShort2) { this.si0 = paramShort1; this.k80 = paramShort2; } public abstract KI Q4(); public boolean Y00() { return this instanceof CoM8; } public short Ka() { return this.si0; } public short hA0() { return this.k80; } public abstract byte bl0(); public float i00() { return 0.0F; } public void lk0(float paramFloat) {} public float Kn() { return 0.0F; } public final boolean gc() { fQ fQ1; if ((fQ1 = this.Gl) != null && fQ1.Z8 != 0) { for (Hc0 hc0 = fQ1.r30(); hc0.hasNext();) { if ((fZ = (fZ)hc0.next()) == null || fZ.i2()) hc0.remove();  }  return 
/* 2 */         (this.Gl.Z8 != 0); }  return false; } public abstract byte F80(); public abstract byte OB0(); public abstract ZK0 hz(); public void wu0(ZK0 paramZK0) { throw new RuntimeException(); } public abstract boolean T9(); public abstract boolean Gc(byte paramByte); public abstract boolean a5(byte paramByte); public abstract boolean WS(); public boolean f() { return false; } public boolean EA0() { return false; } public a4 jH() { return null; } public short Ij() { return 0; } public final void TL0(fZ paramfZ) { MF.KQ(); if (this.Gl == null) { fQ fQ2; this(false, 4); this.Gl = fQ2; }  fQ fQ1; if ((fQ1 = this.Gl).Z8 > 3) return;  fQ1.Com3(paramfZ); Q4().gx0(this); } public boolean Hc0(xr0 paramxr0, tc paramtc, byte paramByte1, byte paramByte2) { return hz().kA0(paramxr0, paramtc, paramByte1); } public boolean jd0(xr0 paramxr0, tc paramtc, byte paramByte1, byte paramByte2) { return hz().sM(paramxr0, paramtc, paramByte1, paramByte2); } public nl i2(tc paramtc) { return hz().V6(); } public xr0 Cx(byte paramByte) { return null; } public eo j5() { throw new UnsupportedOperationException(); } public final String toString() { return B40.df("{").append(Ka()).append(", ").append(hA0()).append(" ").append(i00()).append("}").toString(); }
/*   */ 
/*   */   
/*   */   public abstract void z0(byte paramByte, short paramShort);
/*   */   
/*   */   public void vV(byte paramByte, il paramil) {
/*   */     throw new UnsupportedOperationException();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/xr0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */