/* 1 */ package f;public final class CoN extends az0 { public static void Qx0(t70 paramt70, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt) { paramFloat2 = paramFloat1 * 0.5F; float f2 = paramFloat2 * 0.5F, f3 = paramFloat3 * 0.5F, f4 = 0.0F, f5 = paramInt, f6 = 6.2831855F / f5; f5 = 1.0F / f5; lpT7 lpT71; (lpT71 = az0.nC.Ma(null, null)).ZU = true; (az0.nC.Ma(null, null)).K = true; (az0.nC.Ma(null, null)).nB0 = true; lpT7 lpT72; (lpT72 = az0.Vb.Ma(null, null)).ZU = true; (az0.Vb.Ma(null, null)).K = true; (az0.Vb.Ma(null, null)).nB0 = true; short s1 = 0, s2 = 0; paramt70.bk((paramInt + 1) * 2); paramt70.PI0(paramInt); for (byte b = 0; b <= paramInt; ) { float f7, f9 = f6 * (f7 = b) + f4; f7 = 1.0F - f5 * f7; lpT71.J1.TG0(nx0.zN(f9) * paramFloat2, 0.0F, nx0.E70(f9) * f3); lpT71.K10.JL(lpT71.J1).WC0(); eo eo1; (eo1 = lpT71.J1).y = -f2; lpT71.Oe0
/* 2 */         .x = f7;
/* 3 */       lpT71.Oe0.y = 1.0F;
/* 4 */       eo2.getClass();
/* 5 */       float f8 = eo1.x, f10 = eo1.y, f11 = eo1.z; eo eo2; (eo2 = lpT72.J1).TG0(f8, f10, f11);
/* 6 */       lpT72.K10.JL(lpT71.K10); lpT72.J1.y = f2; lpT72.Oe0
/* 7 */         .x = f7;
/* 8 */       lpT72.Oe0.y = 0.0F;
/* 9 */       short s3 = paramt70.Bn(lpT71), s4 = paramt70.Bn(lpT72); if (b != 0) paramt70.SH(s1, s4, s3, s2);  b++; s2 = s3; s1 = s4; }  Lk.C90(paramt70, paramFloat1, paramFloat3, paramInt, f2, 1.0F, 1.0F, 0.0F, 360.0F); float f1 = -f2; Lk.C90(paramt70, paramFloat1, paramFloat3, paramInt, f1, -1.0F, -1.0F, -180.0F, 180.0F); }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/CoN.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */