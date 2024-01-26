/* 1 */ package f;public final class Ih extends az0 { public static void tk0(t70 paramt70, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, boolean paramBoolean) { paramt70.bk(paramInt + 2); int i; if ((i = paramt70.Yo) == 1) { i = paramInt * 6; } else if (i == 4 || i == 0) { i = paramInt * 3; } else { throw new JU("Incorrect primtive type"); }  paramt70
/* 2 */       .Is0.JA0(i); paramFloat2 = paramFloat1 * 0.5F; float f1 = paramFloat2 * 0.5F, f2 = paramFloat3 * 0.5F, f3 = 0.0F, f4 = paramInt, f5 = 6.2831855F / f4; f4 = 1.0F / f4; lpT7 lpT7;
/* 3 */     (lpT7 = az0.nC.Ma(null, null)).ZU = true; (az0.nC.Ma(null, null)).K = true; (az0.nC.Ma(null, null)).nB0 = true; float f6 = 0.0F, f7 = 0.0F; (az0.Vb.Ma(null, null))
/* 4 */       .J1.TG0(f6, f1, f7); (az0.Vb.Ma(null, null)).K = true; f6 = 0.0F; f7 = 0.0F;
/* 5 */     (az0.Vb.Ma(null, null)).K10.TG0(f6, 1.0F, f7); (az0.Vb.Ma(null, null)).ZU = true; short s; short s1; byte b;
/* 6 */     for (s = paramt70.Bn(az0.Vb.Ma(null, null).u(0.5F, 0.0F)), s1 = 0, b = 0; b <= paramInt; ) { float f8, f9 = f5 * (f8 = b) + f3; f8 = 1.0F - f4 * f8; lpT7.J1.TG0(nx0.zN(f9) * paramFloat2, 0.0F, nx0.E70(f9) * f2); lpT7.K10.JL(lpT7.J1).WC0(); lpT7.J1.y = -f1; lpT7.Oe0
/* 7 */         .x = f8;
/* 8 */       lpT7.Oe0.y = 1.0F;
/* 9 */       short s2 = paramt70.Bn(lpT7); if (b != 0) paramt70.C90(s, s2, s1);  b++; s1 = s2; }  if (paramBoolean) { float f = -f1; Lk.C90(paramt70, paramFloat1, paramFloat3, paramInt, f, -1.0F, -1.0F, -180.0F, 180.0F); }
/*   */      }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ih.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */