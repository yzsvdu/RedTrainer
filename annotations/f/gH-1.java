/* 1 */ package f;public final class gH extends Wr { public final Zz0 wR; public W1 zp; public static void Xb0() { FN.tv
/* 2 */       .rM
/* 3 */       .clear(); } public Lj0[][] qH; public boolean ij0; public gH(h2 paramh2) { OZ oZ; this.qH = new Lj0[4][2]; this.ij0 = false; this.wR = new Zz0(); EP(1); Xu("adminframe"); Lo(""); TG0(() -> paramh2.jf0(this)); char c; String[] arrayOfString = new String[c = 'Ǯ']; byte b; for (b = 0; b < c; b++) arrayOfString[b] = Ml0.OH0(b + 150000) + " #" + b;  this((Object[])arrayOfString); (this.zp = new W1(oZ)).Z30(0); this.zp.D30(this::rJ0); this.wR.of0(new JG0[] { this.zp }); byte[] arrayOfByte; int i = (arrayOfByte = NI.h).length; for (b = 0; b < i; b++) { dA dA; Lj0 lj01; byte b1 = arrayOfByte[b]; this(NI.V90(b1)); (new dA()).uh0(100, 10); this(); this(); lj01.sC(this::ho0); Lj0 lj02; (lj02 = new Lj0()).sC(this::Hv); this.qH[b1][0] = lj01; this.qH[b1][1] = lj02; this.wR.of0(new JG0[] { dA, lj01, lj02 }); }  this("Save Offsets"); Un un; (un = new Un()).tW(this::C50); this.wR.of0(new JG0[] { un }); this("Reload Masks"); (new Un()).tW(gH::Xb0); this.wR.of0(new JG0[] { un }); this("Dump Sprites"); (un = new Un()).tW(this::ui); this.wR.of0(new JG0[] { un }); J8(this.wR); } private void Hv(float paramFloat) { M8(false); } private void ho0(float paramFloat) { M8(false); } public final void rJ0() { this.ij0 = true; Hk.C00 = (short)this.zp.Wa0.go; float[][] arrayOfFloat; byte[] arrayOfByte; int i;
/*   */     byte b;
/* 5 */     for (arrayOfFloat = FN.tv.zE0(Hk.C00), i = (arrayOfByte = NI.h).length, b = 0; b < i; ) { byte b1 = arrayOfByte[b]; this.qH[b1][0].MF0(arrayOfFloat[b1][0]); this.qH[b1][1].MF0(arrayOfFloat[b1][1]); b++; }  this.ij0 = false; } public final void ui() { short s = Hk.C00; zh0[] arrayOfZh0; if ((arrayOfZh0 = switch.TK.e4(s, false, (byte)0)) == null) return;  for (byte b = 0; b < arrayOfZh0.length; ) { pB.TJ0(UB0.vj0.N0("data/sprites/mounts/" + s + "-" + b + ".png"), (arrayOfZh0[b]).jh0.cOm9()); b++; }  } public final void C50() { M8(true); }
/* 6 */   public final void M8(boolean paramBoolean) { if (this.ij0) return;  float[][] arrayOfFloat; byte[] arrayOfByte; int i; byte b; for (arrayOfFloat = new float[4][2], i = (arrayOfByte = NI.h).length, b = 0; b < i; ) { arrayOfFloat1[0] = (this.qH[b1][0]).Z60; byte b1; float[] arrayOfFloat1; (arrayOfFloat1 = arrayOfFloat[b1 = arrayOfByte[b]])[1] = (this.qH[b1][1]).Z60; b++; }  short s = Hk.C00;
/* 7 */     FN.tv.E90
/* 8 */       .Vh0(s, arrayOfFloat); if (paramBoolean) { StringBuilder stringBuilder; this(); for (byte b1 = 0; b1 < arrayOfFloat.length; ) { if (b1 > 0) stringBuilder.append("\n");  stringBuilder.append(Float.toString(arrayOfFloat[b1][0])); stringBuilder.append(","); stringBuilder.append(Float.toString(arrayOfFloat[b1][1])); b1++; }  UB0.vj0.N0("data/sprites/mounts/" + s + ".txt").vF0(stringBuilder.toString(), "UTF-8"); }
/*   */      }
/*   */ 
/*   */   
/*   */   public final void d40() {
/*   */     uh0(500, 300);
/*   */     mM();
/*   */     this.wR.mM();
/*   */     super.d40();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/gH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */