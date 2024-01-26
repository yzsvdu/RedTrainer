/*  1 */ package f;public final class B10 extends ZK0 { public static void Nr(B10 paramB10, xr0 paramxr0) { paramB10.getClass(); vh0 vh0; byte b; Iterator<tc> iterator; for (b = 0, iterator = (vh0 = km.a3).iterator(); iterator.hasNext();) { if ((tc = iterator.next()) != null && 
/*  2 */         tc.HW
/*  3 */         .kD0 == 
/*  4 */         (paramxr0.Q4())
/*  5 */         .cA && 
/*  6 */         tc.HW
/*  7 */         .vu0 == 
/*  8 */         (paramxr0.Q4())
/*  9 */         .VZ && 
/* 10 */         tc.HW
/* 11 */         .mm == paramxr0
/* 12 */         .Ka() && 
/* 13 */         tc.HW
/* 14 */         .Yu0 == paramxr0
/* 15 */         .hA0() && 
/* 16 */         tc.HW
/* 17 */         .Qf0 >= 3) b = 1;  }
/* 18 */      Jo jo; if ((jo = vh0.Ct) != null && 
/* 19 */       jo.HW
/* 20 */       .kD0 == 
/* 21 */       (paramxr0.Q4())
/* 22 */       .cA && 
/* 23 */       jo.HW
/* 24 */       .vu0 == 
/* 25 */       (paramxr0.Q4())
/* 26 */       .VZ && 
/* 27 */       jo.HW
/* 28 */       .mm == paramxr0
/* 29 */       .Ka() && 
/* 30 */       jo.HW
/* 31 */       .Yu0 == paramxr0
/* 32 */       .hA0() && 
/* 33 */       jo.HW
/* 34 */       .Qf0 >= 3) b = 1; 
/* 35 */     int i = paramxr0.Ij() / 8 * 8; if (b) { b = 7; } else { b = 6; }  i = (short)(i + b); if (paramxr0.Ij() != i) paramxr0.z0(paramxr0.F80(), i);  }
/*    */ 
/*    */   
/*    */   public final boolean sM(xr0 paramxr0, tc paramtc, byte paramByte1, byte paramByte2) {
/*    */     if (paramtc.XC() && paramtc.HW.Qf0 >= 3)
/*    */       return true; 
/*    */     UB0.Kg0.fN(new rn(this, paramxr0));
/*    */     return this instanceof lk;
/*    */   }
/*    */   
/*    */   public final boolean sl0(xr0 paramxr0, tc paramtc, byte paramByte1, byte paramByte2) {
/*    */     if (paramtc.XC() && paramtc.HW.Qf0 >= 3)
/*    */       return true; 
/*    */     UB0.Kg0.fN(new Id(this, paramxr0));
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final boolean kA0(xr0 paramxr0, tc paramtc, byte paramByte) {
/*    */     UB0.Kg0.fN(new b40(this, paramxr0));
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final void Uk0(tc paramtc, xr0 paramxr0) {
/*    */     UB0.Kg0.fN(new v9(this, paramxr0));
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/B10.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */