/*  1 */ package f;public final class rb0 extends JG0 { public static long CY = 0L; public int gL; public int wu; public int He; public int wa0; public long oD0; public float XB0; public rH Sp; public rH lD0; public rb0(hm0 paramhm0, String paramString) { vF0 vF01; String str; this.gL = 0; this.wu = 0; this.He = 0; this.wa0 = 0; this.oD0 = 0L; this.XB0 = 0.05F; this.Sp = new rH(this); this.lD0 = new rH(this); this.EY = new rH(this); this.a60 = new rH(this); this.lh = new rH(this); this.lK0 = new rH(this); this.Dv = new rH(this); this.He = 0; this.wa0 = 0; (this.wz = new vD()).Nu(0.0F); J8(this.wz); dQ dQ1 = new dQ(); if (paramhm0 == null) { str = "--"; } else { str = paramhm0.fA(); }  this(str); this.yB = dQ1; this
/*  2 */       .wP = new dQ(m0.tF0("/ ", paramString)); this(72, 72); this.pJ0 = new vF0(); vF01.ZH0().zT(36, 36); if (paramhm0 == null) { this.pJ0.ZH0().sm(um0.TK0().lb((short)0, false, (byte)0)); } else { short s = paramhm0.wf0(); byte b = paramhm0.hE(); this.pJ0.ZH0().sm(um0.TK0().lb(s, paramhm0.JF(), b)); }  this.pJ0.ZH0().tL(72, 72); this.pJ0.ZH0().EV(250); J8(this.pJ0); J8(this.yB); J8(this.wP); a80 a80; this.a60.qt(new U70[] { (a80 = a80.Oz0).sk(0) }); this.lh.qt(new U70[] { sk(1) }); this.lK0.qt(new U70[] { sk(2) }); this.lK0.FB0(pRn.ORANGE); this.Sp.qt(new U70[] { Dk(0) }); this.EY.qt(new U70[] { Dk(1) }); this.lD0.qt(new U70[] { Dk(2) }); this.lD0.FB0(new pRn((byte)-1, (byte)117, (byte)-36, (byte)125)); this.oD0 = zm0.zg(); } public rH EY; public rH a60; public rH lh; public rH lK0; public rH Dv; public vD wz; public dQ yB; public dQ wP; public vF0 pJ0; public final boolean zx(boolean paramBoolean) { return paramBoolean ? ((this.wu >= this.wa0)) : ((this.gL >= this.He)); } public final void Y6(boolean paramBoolean) { char c = 'Ǵ'; long l1 = zm0.u20; long l2; while (this.oD0 + (l2 = c) < l1) { this.wu = j + 1; this.wz
/*    */         
/*  4 */         .Nu(this.wz.nB + this.XB0); long l4; int j;
/*  5 */       if ((j = this.wu) < this.wa0 && paramBoolean && (l4 = zm0.u20) - 
/*  6 */         CY > 100L) { CY = l4; km.pm0.bL((byte)1, (short)21); }  this.gL = i + 1; this.wz
/*    */         
/*  8 */         .Nu(this.wz.nB + this.XB0); int i; long l3;
/*  9 */       if ((i = this.gL) < this.He && !paramBoolean && (l3 = zm0.u20) - 
/* 10 */         CY > 100L) { CY = l3; km.pm0.bL((byte)1, (short)21); }  this.oD0 += l2; }
/* 11 */      } public final void V90(throws paramthrows) { super.V90(paramthrows); this.wz.ME(this.Kd - 297, this.er0 + 28); this.wz.uh0(275, 13); this.wz.mM(); this.yB.ME(this.Kd - 290, this.er0 + 8); this.wP.ME(this.Kd - 150, this.er0 + 8);
/* 12 */     this.pJ0
/*    */ 
/*    */       
/* 15 */       .ME(this.Kd - 400, this.er0 - 60);
/*    */     
/* 17 */     rH rH1 = this.pJ0.TS;
/* 18 */     if (this.wz
/* 19 */       .nB >= 0.98F) { b1 = 1; } else { b1 = 0; }  byte b; byte b1; for (rH1
/* 20 */       .vU = b1, b = -8, b1 = 0; b1 < 10; ) { int i = b1 * 24 - 16; int j; if (b1 >= (
/* 21 */         j = this.wa0)) { this.a60.zT(i, b); this.a60.tL(24, 24); this.a60.Iq(); } else if (j - this.wu > b1) { this.lK0.zT(i, b); this.lK0.tL(24, 24); this.lK0.Iq(); } else { this.lh.zT(i, b); this.lh.tL(24, 24); this.lh.Iq(); }  if (b1 >= (j = this.He)) { this.Sp.zT(i, 16); this.Sp.tL(24, 24); this.Sp.Iq(); } else if (j - this.gL > b1) { this.lD0.zT(i, 16); this.lD0.tL(24, 24); this.lD0.Iq(); } else { this.EY.zT(i, 16); this.EY.tL(24, 24); this.EY.Iq(); }  b1++; }  if (this.Dv != null) {
/* 22 */       if (zx(true) && zx(false)) { b = 1; } else { b = 0; }  if (b != 0) { this
/* 23 */           .Dv.zT(-425, 0); this.Dv.tL(48, 48); this.Dv.Iq(); }
/*    */     
/*    */     }  }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/rb0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */