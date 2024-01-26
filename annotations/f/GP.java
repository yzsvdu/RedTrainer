/*   */ package f;public final class GP extends SI0 { public final void p4(kf paramkf) { Gp0 gp0;
/* 2 */     byte b1 = (gp0 = paramkf.AD).hG0(); byte b2, b3 = (byte)(((b2 = this.mC0) == 0) ? 1 : 0); QZ qZ2 = gp0.wB(b3); QZ qZ1; if ((qZ1 = gp0.wB(b2)) == null) return;  String str = qZ1.dy(); byte b4 = qZ1.ZY(); int i = 0; if (!gp0.yx0() || b3 == b1) { hj[] arrayOfHj = this.EJ; i = this.oo0; bool = i | qZ2.GT(paramkf, false, str, b4, arrayOfHj, i); }  if (!gp0.yx0() || this.mC0 == b1) { hj[] arrayOfHj = this.Bd; int j = this.oo0; bool |= qZ1.GT(paramkf, true, str, b4, arrayOfHj, j); }  if ((bool || this.LR > 0) && this.mC0 == b1 && (gp0.sQ() || this.mC0 == b1)) { byte b = qZ2.Gp(); km.pm0.Wk0(b, qZ2.p7()); }  if (this.LR > 0) { String[] arrayOfString; (arrayOfString = new String[2])[0] = str; (new String[2])[1] = NumberFormat.getInstance().format(this.LR); paramkf
/*   */         
/* 4 */         .Kq(Ml0.lz((byte)2, F40.ef0, 15, 59, arrayOfString)); }  if (this.mC0 == b1) { hj[] arrayOfHj; for (int j = (arrayOfHj = this.Uz0).length; b1 < j; ) { hj hj1; if ((hj1 = this[b1]) != null) paramkf.CoM5(hj1);  b1++; }  }  this(); tp0 tp0; boolean bool; paramkf
/* 5 */       .YP.add(this); }
/*   */ 
/*   */   
/*   */   public final byte mC0;
/*   */   public final hj[] EJ;
/*   */   public final hj[] Bd;
/*   */   public final int oo0;
/*   */   public final int LR;
/*   */   public final hj[] Uz0;
/*   */   
/*   */   public GP(byte paramByte, hj[] paramArrayOfhj1, hj[] paramArrayOfhj2, int paramInt1, int paramInt2, hj[] paramArrayOfhj3) {
/*   */     this.mC0 = paramByte;
/*   */     this.EJ = paramArrayOfhj1;
/*   */     this.Bd = paramArrayOfhj2;
/*   */     this.oo0 = paramInt1;
/*   */     this.LR = paramInt2;
/*   */     this.Uz0 = paramArrayOfhj3;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/GP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */