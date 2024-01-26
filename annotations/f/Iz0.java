/*    */ package f;public final class Iz0 extends Or { public Iz0(QO paramQO) { super(paramQO); }
/*    */   
/*  3 */   public final boolean t0(tH paramtH, int paramInt, boolean paramBoolean) { byte b = (byte)((paramInt = ((QO)this.zS).zH0) & 0x7F); paramInt = paramInt >> 12 & 0x7; short s = (short)(b + 5149); int j; if ((j = ((QO)this.zS).zH0 >> 8 & 0xF) > 5) s = 0;  if (s == 5214) s = 1446;  U70 u70;
/*  4 */     if ((u70 = FJ(j, b)) == null) return true;  int i = (int)this.ao.x - (u70.HA0().getWidth() - 16) / 2; j = (int)this.ao.y + 2 - (int)(Math.floor((u70.HA0().getHeight() / 16) * 0.5D) * 16.0D); My my = km.si0;
/*    */ 
/*    */     
/*  7 */     int k = this.zS.Jg; if (j > 4) paramInt = -1;  my
/*  8 */       .Bd(s, k, paramInt); Texture texture = u70.HA0(); float f1 = i, f2 = j; paramtH.VI(this, f1, f2); return true; } public final boolean II0(Ih0 paramIh0, K70 paramK70, fo0 paramfo0, int paramInt, boolean paramBoolean) { short s1; paramInt = (byte)((s1 = ((QO)this.zS).zH0) & 0x7F); int i = s1 >> 12 & 0x7; short s2 = (short)(paramInt + 5149); int j; if ((j = ((QO)this.zS).zH0 >> 8 & 0xF) > 5) s2 = 0;  if (s2 == 5214) s2 = 1446;  U70 u70; if ((u70 = FJ(j, paramInt)) == null) return true;  My my = km.si0; int k = this.zS.Jg; if (j > 4) i = -1;  my.Bd(s2, k, i); uT uT; if ((uT = this.Xk0) == null || uT
/*  9 */       .Dx0 != u70
/* 10 */       .mv || uT
/* 11 */       .ex0 != u70
/* 12 */       .s7)
/*    */     
/*    */     { 
/* 15 */       this
/*    */ 
/*    */         
/* 18 */         .Xk0 = uT.xz(u70.mv, u70.s7, new pe0(u70.HA0())); } else { pe0 pe0; this(u70.HA0()); uT.RC.ID(pe0); }  this.Xk0.zO(0.011F); this.Xk0.lM(Xi.WB); this.Xk0.WI0(this.ao); if (u70
/* 19 */       .s7 == 16)
/*    */     
/* 21 */     { this.Xk0.He0
/* 22 */         .z = (float)(this.Xk0.He0.z + 0.05D); this.Xk0.He0.y = (float)(this.Xk0.He0.y - 0.15D); }
/* 23 */     else { this.Xk0.He0
/* 24 */         .y = (float)(this.Xk0.He0.y - 0.1D); }  this.Xk0.si(this.Yk0, this.K70.nj0); paramK70.q10(this.Xk0, paramfo0); return true; } public final U70 FJ(int paramInt, byte paramByte) { paramInt = 0; switch (paramInt) { case 7: paramInt = 10; break;case 6: paramInt = 9; break;case 5: paramInt = 7; break;case 4: paramInt = 5; break;case 3: paramInt = 3; break;case 2: paramInt = 1; break;case 0: case 1: paramInt = 0; break; }  int i = 300000000; i = 300000000; tc tc; if (paramInt > 0 && paramInt < 9 && (System.nanoTime() - ((tc = this.zS).HW.mm * i) - (tc.HW.Yu0 * i)) / 1200000000L % 2L == 1L) paramInt++;  U70 u70 = null; if (paramInt != 9 && paramInt != 10 && paramInt != 0 && paramByte != 65) { int j; P1 p1; BE bE; if ((bE = (p1 = km.mI0).yE) != null) { if (paramByte < 0) paramByte = 0;  if (paramInt < 3) { u70 = bE.Gc[64][paramInt - 1]; } else { int k; if ((k = paramInt + -3) >= 6) k = 0;  if (paramByte < 0 || paramByte >= bE.Gc.length) { j = (byte)((paramByte & 0xFF) % bE.Gc.length); } else { j = paramByte; }  U70 u701 = bE.Gc[j][k]; }  } else if (j.UI0 != null) { byte b; if (paramByte >= 53) byte b1 = (byte)(paramByte - 17);  Nk nk = Nk.mS; if (9 <= paramInt) { j = 0; } else { j = paramInt; }  if (paramByte < 0 || paramByte >= this.dm0.length) { b = (byte)((paramByte & 0xFF) % this.dm0.length); } else { b = paramByte; }  u70 = this.dm0[b][j]; }  }  if (this == null) { if (paramByte == 65) {  } else {  }  LJ lJ = G00.Av0.Cx0((byte)10, 1062, false); u70 = LT(paramInt); }  return this; }
/*    */ 
/*    */   
/*    */   public final tc ns0() {
/*    */     return this.zS;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Iz0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */