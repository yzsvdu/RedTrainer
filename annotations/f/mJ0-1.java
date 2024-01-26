/*  1 */ package f;public final class mJ0 extends GS implements Np0 { public static long jS = 0L; public short dr0; public short[] Gd0; public mJ0(short paramShort, short... paramVarArgs) { this.dr0 = paramShort; this.Gd0 = paramVarArgs; } public final byte YG0() { return 100; } public final short Y1() { boolean bool = false; short[] arrayOfShort; return ((arrayOfShort = this.Gd0).length <= 0) ? 0 : arrayOfShort[bool]; } public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) { if (paramhm02 == null) return;  short s2 = this.dr0; WD wD; if ((wD = yk0.cw().mP(paramShort)) == null) { paramkf.RV("Error 243", "", null); return; }
/*  2 */      String str2 = paramhm02.Ek(); gr0 gr0; if ((gr0 = wD.EE0()) == null) { paramkf
/*  3 */         .RV("Error 244 undefined ContestSkillEffect", "", null); return; }
/*    */     
/*    */     DG dG;
/*  6 */     if (Ml0.nW
/*  7 */       .return((dG = gr0.CA0).sC + 310388))
/*    */     
/*  9 */     { str3 = Ml0.OH0(dG.sC + 310388); } else { str3 = ""; }  if (s2 != 181) { if (s2 == 182)
/* 10 */         str2 = Ml0.OH0(wD.iz);  }
/* 11 */     else { str3 = paramhm02.Ek(); }  (new byte[3])[0] = 2; (new byte[3])[1] = 3; (new byte[3])[2] = 4; String[] arrayOfString; (arrayOfString = new String[3])[0] = paramhm02.Ek(); (new String[3])[1] = str2; (new String[3])[2] = str3; String str1 = Ml0.Nq0(s2 + 310200, new byte[3], arrayOfString); short s3; switch (s3 = this.dr0) { default: switch (s3) { default: paramkf.Kq(str1);
/*    */             return;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           
/*    */           case 1005:
/* 19 */             this(paramkf, paramhm02, (byte)Y1()); break;case 1004: this(paramkf, paramhm02, (byte)Y1()); break;case 1003: this(paramkf, paramhm02, (byte)Y1()); break;case 1002: this(paramkf, paramhm02, (byte)Y1()); break;case 1001: switch (Y1()) { case 6: this((byte)1, (short)21); paramkf
/* 20 */                   .YP
/* 21 */                   .add(xP1); break;case 3: case 4: case 5: this((byte)1, (short)45); paramkf.YP.add(xP1); break;case 1: case 2: this((byte)1, (short)31); paramkf.YP.add(xP1); break;case 0: this((byte)1, (short)32); paramkf.YP.add(xP1); break; }
/* 22 */              this(paramkf, Y1()); break;case 1000: break; }  paramkf
/* 23 */           .YP
/* 24 */           .add(pi); return;case 177: this((byte)1, (short)391); paramkf.YP.add(xP2); this(paramkf, false, Y1(), (String)pi); paramkf.YP.add(lu0); return;case 176: case 178: this(paramkf, true, Y1(), (String)pi); paramkf.YP.add(lu0); return; }  short s1 = Y1(); this(paramkf, (hm0)lu0, s1); Ts ts; xb xb; i90 i90; Op op; xP xP1; pi pi; zF0 zF0; xP xP2; lu0 lu0; String str3; paramkf.YP.add(zF0); }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/mJ0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */