/*    */ package f;
/*  2 */ public final class UW extends Wr implements r60 { public byte QI0; public int fb; public Texture q80; public static zh0[] pB(byte paramByte) { return um0.Kt0.lb(um0.HZ(paramByte, (short)201), false, (byte)0); } public vF0 tC0; public vF0[] bo0; public UW(byte paramByte, short paramShort) { ig ig; vF0 vF01; byte[] arrayOfByte; vJ vJ; ek0 ek0; Xu("base-frame-padded"); Lo(""); EP(1); jJ0(false); TG0(this::XS); this.QI0 = paramByte; this(km.mI0.yE.Vz().B8("/a/1/7/4")); this(ig.Em0(15)); this(ig.Em0(16)); ZH zH1 = (new FM(ig.Em0(17))).VC0(vJ, ek0); Uc uc = zH1.TU(); this(144, 48, uc); zH2.Wq(zH1, 56, 64, 144, 48); this.q80 = new Texture(zH2); this(); this.tC0 = new vF0(); vF01.ZH0().Yo(new Texture[] { this.q80 }); J8(this.tC0); zH1.dispose(); ZH zH2; (zH2 = new ZH()).dispose(); if (paramShort != 1) { if (paramShort != 2) { if (paramShort != 3) { (arrayOfByte = new byte[6])[0] = 4; (new byte[6])[1] = 18; (new byte[6])[2] = 2; (new byte[6])[3] = 0; (new byte[6])[4] = 15; (new byte[6])[5] = 4; } else { (arrayOfByte = new byte[5])[0] = 7; (new byte[5])[1] = 14; (new byte[5])[2] = -1; (new byte[5])[3] = 14; (new byte[5])[4] = 7; }  } else { (arrayOfByte = new byte[5])[0] = 22; (new byte[5])[1] = 0; (new byte[5])[2] = 19; (new byte[5])[3] = 4; (new byte[5])[4] = 17; }  } else { (arrayOfByte = new byte[5])[0] = 11; (new byte[5])[1] = 8; (new byte[5])[2] = 6; (new byte[5])[3] = 7; (new byte[5])[4] = 19; }  this.bo0 = new vF0[arrayOfByte.length]; vF0[] arrayOfVF0; for (paramShort = 0; paramShort < (arrayOfVF0 = this.bo0).length; paramShort++) { vF0 vF02; this(); arrayOfVF0[paramShort] = vF02; if (arrayOfByte[paramShort] != -1) this.bo0[paramShort].ZH0().sm(new zh0[] { pB(arrayOfByte[paramShort])[0] });  this.bo0[paramShort].ZH0().tL(36, 36); J8(this.bo0[paramShort]); }  CH0(); } public final void XS() { pA.Dg0.jf0(this); km.u4.lx0(this.QI0, (byte)0); } public final void LM(throws paramthrows) { VA0.c90(this); CH0(); int i = this.fr0.RS();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*  8 */     i = this.fr0.e3();
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 13 */     ME(JO.Se0(this.fr0.qF(), this.xY, 2, i), (this.fr0.Hy() - this.HC) / 4 + i); } public final boolean i2(oa0 paramoa0) { int i; if (B8.Wm0(paramoa0.cz0) && paramoa0.oO() && (h1.J20(i = paramoa0.GG0, BM.lc) || h1.J20(i, BM.bC))) { XS(); return true; }  return super.i2(paramoa0); } public final void V90(throws paramthrows) { super.V90(paramthrows); } public final void CH0() { int j = (int)(km.wI0.k1() * 0.75D); if ((this.fb = Math.min((int)(km.wI0.dG() * 0.75D) / 144, j / 48)) < 1) this.fb = 1;  int i = this.fb * 144 + 3; uh0(i, this.fb * 48 + 2); i = this.fb * 144 + 3; Tm(i, this.fb * 48 + 2); } public final void d40() { CH0(); super.d40(); int i = RS() + 2; this.tC0.ME(i, e3()); this.tC0.TS.V1 = (i = this.fb); int j; vF0[] arrayOfVF0; for (i = this.bo0.length * 36 / 2 * i, j = RS(), i = (qF() - i) / 2 + j - this.fb * 18 / 2, j = 0; j < (arrayOfVF0 = this.bo0).length; ) { float f = e3(); arrayOfVF0[j].ME(j * 36 / 2 * this.fb + i, (int)(this.HC / 2.5F + f - (this.fb * 36 / 2))); (this.bo0[j]).TS.V1 = this.fb; j++; }
/*    */      }
/*    */ 
/*    */   
/*    */   public final void jA0() {
/*    */     super.jA0();
/*    */     this.q80.dispose();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/UW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */