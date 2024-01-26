/*  1 */ package f;public final class AUx extends nq { public boolean W7; public dQ pI0; public W1 lpt7; public AUx(pA parampA, byte paramByte1, String paramString, int paramInt1, int paramInt2, int paramInt3, byte paramByte2, ky paramky, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, byte paramByte3, byte paramByte4, byte paramByte5) { super(parampA, paramByte1, 200, 201); StringBuilder stringBuilder; String str3; this.W7 = false; String str1 = ""; str1 = DO.kk(paramByte4).jt(); if (paramByte4 > 0 && !DO.kk(paramByte4).Hb0()) { dQ dQ1; if ((dQ1 = this.pI0) != null) dQ1.wI0(false);  W1 w1; if ((w1 = this.lpt7) != null) { w1.sk0(false); this.lpt7.wI0(false); }  }  String str2 = ""; CC0[] arrayOfCC0; if ((arrayOfCC0 = CC0.Z7(paramByte5)).length < 1) { str2 = Ml0.OH0(61); } else { for (paramByte5 = 0; paramByte5 < arrayOfCC0.length; ) { if (paramByte5 > 0) str2 = m0.tF0(str2, ", ");  if (paramByte5 == 4) {
/*  2 */           str2 = m0.tF0(str2, "\n     ");
/*    */         }
/*  4 */         str2 = B40.df(str2).append(Ml0.OH0(arrayOfCC0[paramByte5].hw())).toString(); paramByte5++; }  }  if (paramByte3 < 1) { str3 = Ml0.OH0(61); } else { str3 = Ml0.Go(226, paramByte3 + ""); }  this(); if (paramBoolean1) { arrayOfString[0] = paramString; String[] arrayOfString; (arrayOfString = new String[2])[1] = Ml0.OH0(paramky.wm()); stringBuilder.append(Ml0.sB(2212, arrayOfString)); } else { arrayOfString[0] = paramString; String[] arrayOfString; (arrayOfString = new String[2])[1] = Ml0.OH0(paramky.wm()); stringBuilder.append(Ml0.sB(2200, arrayOfString)); }  stringBuilder.append("\n\n"); if (paramInt1 > 0) { stringBuilder.append(Ml0.Go(2206, Integer.toString(paramInt1))); stringBuilder.append("\n"); }  if (paramByte2 > 0) { stringBuilder.append(Ml0.Go(2213, Integer.toString(paramByte2))).append("\n"); } else { if (paramInt2 > 0) { stringBuilder.append(Ml0.Go(2207, Integer.toString(paramInt2))); stringBuilder.append("\n"); }  if (paramInt3 > 0) { stringBuilder.append(Ml0.Go(2208, Integer.toString(paramInt3))); stringBuilder.append("\n"); }  }  if (paramByte3 > 0) stringBuilder.append(Ml0.Go(2209, str3)).append("\n");  if (!str1.isEmpty()) stringBuilder.append(Ml0.Go(2210, str1)).append("\n");  if (arrayOfCC0.length > 0) stringBuilder.append(Ml0.Go(2211, str2)).append("\n");  if (paramBoolean2 || paramBoolean3) { stringBuilder.append(Ml0.OH0(2214)).append(" "); if (paramBoolean2) stringBuilder.append(Ml0.OH0(2215));  if (paramBoolean3) { if (paramBoolean2) stringBuilder.append(", ");  stringBuilder.append(Ml0.OH0(2216)); }  stringBuilder.append("\n"); }  BA0(stringBuilder.toString()); if (h1.me0) km.pm0.fy((short)1619);  } public final void ug() { String str = Ml0.OH0(227); (new dQ()).E1(str); (this.pI0 = new dQ()).Xu("label-title"); this(); ArrayList<Uh0> arrayList; OZ oZ; boolean bool; (new ArrayList<>()).add(new Uh0(null));
/*    */     g2 g2 = km.u4.Mg0;
/*    */     byte b = 0;
/*  7 */     while (b < super.Gc(km.u4.Lz.wm0)) { super super; if ((super = g2.LPT5(b)).com6()) { Uh0 uh0; this(super); arrayList.add(uh0); }  b = (byte)(b + 1); }  this(arrayList);
/*  8 */     this(); w1.rk0(oZ);
/*  9 */     this.lpt7 = w1; W1 w1; (w1 = new W1()).Xu("combobox"); this.lpt7.Z30(0); w1 = this.lpt7; if (arrayList.size() > 1) { bool = true; } else { bool = false; }  w1.sk0(bool);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 15 */     arrayOfJG0[0] = this.g30; arrayOfJG0[1] = this.GR; JG0[] arrayOfJG0; (arrayOfJG0 = new JG0[3])[2] = this.LPt5; this.lpt1.WN(V2.Ur(this.lpt1, this.lpt1).Ya(this.GA).Ya(this.cj0).ee0(Mr.X60(this.lpt1, this.lpt1).Mg(new JG0[] { this.pI0, this.lpt7 })).ee0(V2.Ur(this.lpt1, this.lpt1).Mg(new JG0[3])).Em0()); this.lpt1
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 21 */       .rK0(Mr.X60(this.lpt1, this.lpt1).Ya(this.GA).Ya(this.cj0).ee0(V2.Ur(this.lpt1, this.lpt1).Mg(new JG0[] { this.pI0, this.lpt7 })).ee0(Mr.X60(this.lpt1, this.lpt1).Ya(this.g30).Ya(this.GR).Ya(this.LPt5))); }
/*    */ 
/*    */   
/*    */   public final byte ke() {
/*    */     return (byte)(OI0.A90.Vv | ((Uh0)this.lpt7.WW()).aj0 << 3);
/*    */   }
/*    */   
/*    */   public final void V90(throws paramthrows) {
/*    */     float f = (float)(this.Dj - System.currentTimeMillis()) / 1000.0F;
/*    */     if (h1.me0 && (int)f <= 5 && !this.W7) {
/*    */       this.W7 = true;
/*    */       km.pm0.fy((short)1619);
/*    */     } 
/*    */     super.V90(paramthrows);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/AUx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */