/*  1 */ package f;public final class Lk extends az0 { public static void C90(t70 paramt70, float paramFloat1, float paramFloat2, int paramInt, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7) { float f1 = 0.0F, f2 = 0.0F, f3 = 0.0F, f4 = 0.0F, f5 = 0.0F, f6 = 0.0F, f7 = 0.0F, f8 = 0.0F, f9 = 1.0F; paramt70.bk(paramInt + 2); int i; if ((i = paramt70.Yo) == 1) { i = paramInt * 6; } else if (i == 4 || i == 0) { i = paramInt * 3; } else { throw new JU("Incorrect primtive type"); }  paramt70
/*  2 */       .Is0.JA0(i); paramFloat6 *= 0.017453292F; paramFloat7 = (paramFloat7 - paramFloat6) * 0.017453292F / paramInt;
/*  3 */     eo eo1 = az0.qs.TG0(paramFloat5, f5, f6).uu(paramFloat1 * 0.5F), eo2 = az0.u30.TG0(f7, f8, f9).uu(paramFloat2 * 0.5F); az0.n30.TG0(paramFloat5, f5, f6).uu(0.0F); az0.gI0.TG0(f7, f8, f9).uu(0.0F); (az0.nC.Ma(null, null)).ZU = true; (az0.nC.Ma(null, null)).K = true; (az0.nC.Ma(null, null)).nB0 = true; (az0.nC.Ma(null, null)).Oe0
/*  4 */       .x = 0.5F;
/*  5 */     (az0.nC.Ma(null, null)).Oe0.y = 0.5F;
/*  6 */     (az0.nC.Ma(null, null)).J1.TG0(f1, paramFloat3, f2); (az0.nC.Ma(null, null)).K10.TG0(f3, paramFloat4, f4); lpT7 lpT7; (lpT7 = az0.Vb.Ma(null, null)).ZU = true; (az0.Vb.Ma(null, null)).K = true; (az0.Vb.Ma(null, null)).nB0 = true; (az0.Vb.Ma(null, null)).Oe0
/*  7 */       .x = 0.5F;
/*  8 */     (az0.Vb.Ma(null, null)).Oe0.y = 0.5F;
/*  9 */     (az0.Vb.Ma(null, null)).J1.TG0(f1, paramFloat3, f2); (az0.Vb.Ma(null, null)).K10.TG0(f3, paramFloat4, f4); short s; short s1; byte b; for (s = paramt70.Bn(az0.Vb.Ma(null, null)), s1 = 0, b = 0; b <= paramInt; ) { f5 = nx0.zN(paramFloat7 * b + paramFloat6); f6 = nx0.E70(paramFloat7 * b + paramFloat6); f7 = eo1.x * f5; f7 = eo1.y * f5; f7 = eo2.y * f6 + f7; f8 = eo1.z * f5; lpT7.J1.TG0(f1, paramFloat3, f2).Tz(eo2.x * f6 + f7, f7, eo2.z * f6 + f8); f5 = f5 * 0.5F + 0.5F; f6 = f6 * 0.5F + 0.5F; lpT7.Oe0
/* 10 */         .x = f5;
/* 11 */       lpT7.Oe0.y = f6;
/* 12 */       short s2 = paramt70.Bn(lpT7); if (b != 0) paramt70.C90(s2, s1, s);  b++; s1 = s2; }
/*    */      }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Lk.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */