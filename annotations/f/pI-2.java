/*  1 */ package f;public final class pI extends Cy { public Wo QH0; public ArrayList EG0 = new ArrayList(); public LM[] jp0 = new LM[0]; public rE oL0 = null; public pI(Wo paramWo, short paramShort1, byte paramByte, short paramShort2, h30 paramh30) { super(paramWo, paramShort1, paramByte, paramShort2, paramh30); this.QH0 = paramWo; vJ(); t8(); } public final boolean J4() { boolean bool; if (this.l1 != null) { bool = true; } else { bool = false; }  if (bool) return true;
/*    */ 
/*    */     
/*  4 */     return !!km.u4.fF0.y5(this.E10, (short)2403); } public final void wy0(Ws0 paramWs0) { super.wy0(paramWs0); vJ(); }
/*  5 */   public final void t8() { super.t8(); for (short s = 0; s < this.xk0.X7; ) { lF0 lF0; for (short s1 = 0; s1 < (lF0 = this.xk0).cB0; ) { this.UF[s][s1] = this.lG0.gH0(j); this.xk0.H80[s][s1]; int j; Ws0 ws0; if (this.hp && (j = lF0.H80[s][s1]) >= 0 && (ws0 = this.UF[s][s1]) != null) ws0.Lj0();  int i; if ((i = this.xk0.U1[s][s1]) >= 0) { i = (short)i; if (this.Jb0.Fb(i)) i = this.Jb0.Z90(i);  LW lW = (LW)this.QH0.Ea0(i); if (this.et0 == 0 && this.ey == 0) { this.et0 = lW.ar0;
/*    */             
/*  7 */             this.ey = lW.Rc0; }  if (this.et0 == lW
/*  8 */             .ar0 && this
/*  9 */             .ey == lW
/* 10 */             .Rc0)
/* 11 */           { short[][][][] arrayOfShort; if ((arrayOfShort = lW.gP).length > 
/* 12 */               this.FD) this.FD = arrayOfShort.length;  } else { throw new RuntimeException("Matrix has mismatching footer sizes"); }  }  s1 = (short)(s1 + 1); }  s = (short)(s + 1); }  }
/* 13 */   public final void zf(short paramShort1, short paramShort2) { int i; if ((i = this.xk0.U1[paramShort1][paramShort2]) >= 0) { za0 za0; i = (short)i; if (this.Jb0.Fb(i)) i = this.Jb0.Z90(i);  LW lW = (LW)this.QH0.Ea0(i); this(paramShort1, paramShort2, this, lW); this.eG[paramShort1][paramShort2] = za0; }  } public final gb bD(int paramInt1, int paramInt2) { return (gb)super.XJ0(paramInt1, paramInt2); } public final void vJ() { Ev ev; short s; if ((s = rE.tu(this.E10, this.br0.Ga)) < 0) { this.oL0 = null; this.jp0 = new LM[0]; this.EG0.clear(); return; }  rE rE1 = this.QH0.xy0[s]; this.jp0 = new LM[rE1.LJ0.length]; this.EG0.clear(); Ev[] arrayOfEv; if (s >= (arrayOfEv = this.QH0.t5).length) { arrayOfEv = null; } else { ev = arrayOfEv[s]; }  HE0[] arrayOfHE0; int j; byte b2; for (j = (arrayOfHE0 = this.oL0.LJ0).length, b2 = 0; b2 < j; ) { LM lM; eo eo4; HE0 hE0 = arrayOfHE0[b2]; byte b3; if (s == 2 && ((b3 = hE0.A90) == 8 || b3 == 19)) { b3 = 1; } else { b3 = 0; }  rE rE2; rD rD1 = (rE2 = this.oL0).Ha[hE0.E1]; un un = rE2.it0[hE0.UF]; byte b4 = hE0.A90; wS wS; int k; short s1 = (short)(-(k = (wS = ev.Zf0[b4]).mL) / 2);
/* 14 */       int m = (ev.Zf0[b4]).fk0;
/* 15 */       this(hE0, m, k, s1); this.jp0[b4] = lM;
/*    */ 
/*    */ 
/*    */       
/* 19 */       float f2 = (V1.w3(rD1.Sx, rD1.Sx)).x, f3 = (V1.w3(rD1.Sx, rD1.Sx)).y, f4 = (V1.w3(rD1.Sx, rD1.Sx)).z; eo eo1 = V1.w3(rD2.Sx, rD2.Sx).uD(f2, f3, f4);
/*    */       
/* 21 */       eo eo2 = V1.w3(rD1.Sx, rD1.Sx);
/*    */       
/* 23 */       eo2
/* 24 */         .y = 0.0F; rD rD2; eo eo3; (eo3 = V1.w3((rD2 = (rE2 = this.oL0).Ha[hE0.wP]).Sx, (rD2 = (rE2 = this.oL0).Ha[hE0.wP]).Sx)).y = 0.0F; float f5 = un.AJ0, f6 = un.DF0; this(f5, 0.0F, f6); float f1; if ((f1 = (float)Math.atan2(eo1.x, eo1.z) * 57.295776F) < 0.0F) f1 += 360.0F;  short s2; for (s2 = 0; s2 < k; ) { short s4; for (short s3 = (short)(s1 + s2); s4 < m; )
/* 25 */         { float f; short s5 = wS.RH[0][s4][s2], s6 = wS.RH[1][s4][s2];
/* 26 */           this(this, s4, s3, b4, s5, s6); coM8.ls0 = hE0; (this.jp0[b4])
/* 27 */             .M4[s4][
/* 28 */               s2] = coM8;
/* 29 */           this.EG0.add(coM8); CoM8 coM8;
/* 30 */           eo eo = (coM8 = new CoM8()).ap0; int n;
/* 31 */           if ((n = un.ob) == 0 || b3 != 0)
/*    */           
/*    */           { 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */             
/* 39 */             float f8 = s3; eo.TG0(0.0F, 0.0F, f8); eo eo5 = eo.Y; eo.vS(eo5, f1 + 270.0F); float f7 = s4 / m, f9 = eo.x; eo eo6, eo7; float f10; eo.x = ((eo6 = rD2.Sx).x - (f10 = (eo7 = rD1.Sx).x)) * f7 + f10 + f9; eo.y = (eo6.y - (f9 = eo7.y)) * f7 + f9 + eo.y; eo.z = (eo6.z - (f9 = eo7.z)) * f7 + f9 + eo.z; coM8
/* 40 */               .fl0 = f1 - 90.0F; int i1;
/* 41 */             if ((i1 = hE0.go0) != 1) { if (i1 != 3) { if (i1 == 4) coM8.nm(-180.0F);  } else { coM8.nm(-270.0F); }  } else { coM8.nm(-90.0F); }  if (b3 != 0) { f = 0.0F; switch (s4) { case 3: case 4: f = 1.5F; break;case 2: case 5: f = 1.0F; break;case 1: case 6: f = 0.5F; break; }  eo.y += f; }  } else if (f == 1 || f == 2) { f = un.AJ0; float f8 = un.DF0; f = eo3.Cl0(f, 0.0F, f8); f8 = un.AJ0; float f12 = un.DF0; f8 = eo2.Cl0(f8, 0.0F, f12); this(eo4); float f11 = eo2.x, f13 = eo2.y, f14 = eo2.z; this(eo4); float f10 = eo3.x; f13 = eo3.y; f14 = eo3.z; eo eo6, eo5; float f9 = (float)Math.atan2((eo5 = (eo6 = new eo()).uD(f10, f13, f14)).z, eo5.x) * 57.295776F; f9 -= 90.0F; eo eo7; if ((f13 = (float)Math.atan2((eo6 = (eo7 = new eo()).uD(f11, f13, f14)).z, eo6.x) * 57.295776F - 90.0F) < 0.0F) f13 += 360.0F;  if (f9 < 0.0F) f9 += 360.0F;  boolean bool = false; if (f9 - f13 > 180.0F) f13 += 360.0F;  if (f13 - f9 > 180.0F) f9 += 360.0F;  if (f13 > f9) { f8 = f + (f = (s2 - k / 2)); f = f8 + f; bool = true; } else { f8 = f - (f = (s2 - k / 2)); f = f8 - f; }  float f7; f = NUL.df(f8, f, f7 = s4 / m, f); double d1 = f; double d2; eo.x = (float)(Math.cos(d2 = (((f8 = NUL.df(f9, f13, f7, f13)) + 270.0F) * 0.017453292F)) * d1 + eo4.x); eo.y = NUL.df(rD2.Sx.y, rD1.Sx.y, f7, rD1.Sx.y); eo.z = (float)(Math.sin(d2) * d1 + eo4.z); coM8.fl0 = -f8; if (bool) coM8.nm(180.0F);  int i1; if ((i1 = hE0.go0) != 1) { if (i1 != 3) { if (i1 == 4) coM8.nm(-180.0F);  } else { coM8.nm(-270.0F); }  } else { coM8.nm(-90.0F); }  }  s4 = (short)(s4 + 1); }  s2 = (short)(s2 + 1); }  for (b3 = 0; b3 < k; ) { short s4; for (s4 = 0; s4 < m; ) { short s5 = (short)(s1 + b3); CoM8 coM8 = i40(b4, s4, s5); int n; if ((n = hE0.go0) != 1) { if (n != 3) { if (n != 4) { coM8.vV((byte)0, i40(b4, s4, (short)(s5 + 1))); coM8.vV((byte)1, i40(b4, s4, (short)(s5 - 1))); coM8.vV((byte)3, i40(b4, (short)(s4 + 1), s5)); coM8.vV((byte)2, i40(b4, (short)(s4 - 1), s5)); } else { coM8.vV((byte)0, i40(b4, s4, (short)(s5 - 1))); coM8.vV((byte)1, i40(b4, s4, (short)(s5 + 1))); coM8.vV((byte)3, i40(b4, (short)(s4 - 1), s5)); coM8.vV((byte)2, i40(b4, (short)(s4 + 1), s5)); }  } else { coM8.vV((byte)0, i40(b4, (short)(s4 + 1), s5)); coM8.vV((byte)1, i40(b4, (short)(s4 - 1), s5)); coM8.vV((byte)3, i40(b4, s4, (short)(s5 - 1))); coM8.vV((byte)2, i40(b4, s4, (short)(s5 + 1))); }  } else { coM8.vV((byte)0, i40(b4, (short)(s4 - 1), s5)); coM8.vV((byte)1, i40(b4, (short)(s4 + 1), s5)); coM8.vV((byte)3, i40(b4, s4, (short)(s5 + 1))); coM8.vV((byte)2, i40(b4, s4, (short)(s5 - 1))); }  s4 = (short)(s4 + 1); }  short s3 = (short)(b3 + 1); }  b2++; }  rD[] arrayOfRD; int i; byte b1; for (i = (arrayOfRD = this.oL0.Ha).length, b1 = 0; b1 < i; ) { Ut0 ut0; rD rD = arrayOfRD[b1]; this(); for (byte b = 0; b < 2; ) { for (byte b3 = 0; b3 < 4; ) { int k = rD.dE[b3]; byte b4; if ((b4 = rD.A0[b3]) >= 0 && k != 0)
/* 42 */           { boolean bool; LM lM; if ((lM = this.jp0[b4]).JE0
/* 43 */               .E1 == rD.Nw) { bool = true; } else { bool = false; }
/* 44 */              int m = lM.Sj; short s1;
/* 45 */             for (int n = lM.uU; s1 < m; ) { short s2; for (s2 = 0; s2 < n; )
/*    */               
/* 47 */               { short s3 = (short)(s2 + (this.jp0[b4]).Tv0); CoM8 coM8;
/* 48 */                 if ((coM8 = i40(b4, s1, s3)) != null) { short s4; if (bool) { s4 = s1; } else { s4 = (short)(m - s1); }  if (k == 1 || k == 4) s4 = (short)(s4 * -1);  if (!bool && k == 2) s3 = (short)(s3 * -1);  if (bool && k == 4) s3 = (short)(s3 * -1);  if (!bool && k == 1) s3 = (short)(s3 * -1);  if (bool && k == 3) s3 = (short)(s3 * -1);  if (k == 1 || k == 3) s4 = s3 = s4;  if (b == 0) { int i1; List<CoM8> list; if ((list = (List)ut0.Z6(i1 = s4 & 0xFFFF | (s3 & 0xFFFF) << 16)) == null) { super(); ut0.A3(i1, list); }  list.add(coM8); coM8.KL += "\nPOINT " + rD.Nw + ": " + s4 + " " + s3; } else { switch (k) { case 4: s4 = (short)(s4 + 1); break;case 3: s3 = (short)(s3 - 1); break;case 2: s4 = (short)(s4 - 1); break;case 1: s3 = (short)(s3 + 1); break; }  List list; if ((list = (List)ut0.Z6(s4 & 0xFFFF | (s3 & 0xFFFF) << 16)) != null) for (Iterator<CoM8> iterator = list.iterator(); iterator.hasNext(); ) { CoM8 coM81; if ((coM81 = iterator.next()) == null || coM81
/* 49 */                           .pu == coM8.pu) continue;  byte b5 = 0; switch (k) { case 4: b5 = 2; break;case 3: b5 = 0; break;case 2: b5 = 3; break;case 1: b5 = 1; break; }  coM81
/* 50 */                           .vV(b5, coM8); coM8.vV(LF.IW(b5), coM81); }   }  }  s2 = (short)(s2 + 1); }  s1 = (short)(s1 + 1); }  }  b3++; }  b++; }  b1++; }
/*    */      }
/*    */ 
/*    */   
/*    */   public final CoM8 i40(byte paramByte, short paramShort1, short paramShort2) {
/*    */     LM[] arrayOfLM;
/*    */     if (paramByte < 0 || paramByte >= (arrayOfLM = this.jp0).length)
/*    */       return null; 
/*    */     LM lM;
/*    */     short s = (short)(paramShort2 - (lM = this[paramByte]).Tv0);
/*    */     CoM8 arrayOfCoM81[][], arrayOfCoM8[];
/*    */     if (paramShort1 < 0 || paramShort1 >= (arrayOfCoM81 = this.M4).length || s < 0 || s >= (arrayOfCoM8 = this[paramShort1]).length) {
/*    */       arrayOfCoM8 = null;
/*    */       return (CoM8)this;
/*    */     } 
/*    */     CoM8 coM8 = this[s];
/*    */     return this;
/*    */   }
/*    */   
/*    */   public final xr0 XG0(float paramFloat1, float paramFloat2, float paramFloat3) {
/*    */     float f;
/*    */     CoM8 coM8;
/*    */     Iterator<CoM8> iterator;
/*    */     for (f = Float.MAX_VALUE, coM8 = null, iterator = this.EG0.iterator(); iterator.hasNext();) {
/*    */       if ((f1 = (coM81 = iterator.next()).ap0.Cl0(paramFloat1, paramFloat3, paramFloat2)) < f) {
/*    */         f = f1;
/*    */         coM8 = coM81;
/*    */       } 
/*    */     } 
/*    */     return coM8;
/*    */   }
/*    */   
/*    */   public final Ws0 XJ0(int paramInt1, int paramInt2) {
/*    */     return super.XJ0(paramInt1, paramInt2);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/pI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */