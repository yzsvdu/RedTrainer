/*  1 */ package f;public abstract class uD0 { public static void W0(et paramet, JG0 paramJG0, int paramInt1, int paramInt2, int paramInt3) { So so = So.k60();
/*  2 */     paramInt2 = paramet.Sp(paramInt2, paramJG0.xY) + paramInt1;
/*    */     
/*  4 */     paramInt1 = paramet.nV(paramInt3, paramJG0.HC) + paramInt1; if ((paramInt3 = paramet.ordinal()) != 0) { if (paramInt3 != 2) { if (paramInt3 == 4) so
/*    */             
/*  6 */             .PL(Wz0.aG(2, paramJG0).a((paramInt1 + paramJG0.HC))).PL(Wz0.gq(paramJG0, 2, 0.15F).a(paramInt1));  } else { so
/*    */           
/*  8 */           .PL(Wz0.aG(1, paramJG0).a((paramInt2 + paramJG0.xY))).PL(Wz0.gq(paramJG0, 1, 0.15F).a(paramInt2)); }  } else { so
/*    */         
/* 10 */         .PL(Wz0.aG(1, paramJG0).a((paramInt2 - paramJG0.xY))).PL(Wz0.gq(paramJG0, 1, 0.15F).a(paramInt2)); }  so
/*    */       
/* 12 */       .mg(km.wI0.Ee); } public static So EU(et paramet, JG0 paramJG0, int paramInt1, int paramInt2, hk0 paramhk0) { Wz0 wz0; So so = So.k60(); paramInt1 = paramet.Sp(paramInt1, paramJG0.xY); paramInt2 = paramet.nV(paramInt2, paramJG0.HC); int i; if ((i = paramet.ordinal()) != 0) { if (i != 2) { if (i != 3) { if (i != 4) { if (paramhk0 != null) so
/* 13 */                 .C00 = paramhk0;  return (So)so
/*    */ 
/*    */               
/* 16 */               .mg(km.wI0.Ee); }  wz0 = Wz0.gq(paramJG0, 2, 0.15F); paramInt1 = paramInt2 = paramInt1 = paramJG0.HC; } else { wz0 = Wz0.gq(wz0, 2, 0.15F); paramInt1 = paramInt2 = paramInt1 = ((JG0)wz0).HC; so.PL(wz0.a((paramInt1 - paramInt2))); }  } else { wz0 = Wz0.gq(wz0, 1, 0.15F); paramInt2 = ((JG0)wz0).xY; }  so.PL(wz0.a((paramInt1 + paramInt2))); } else { wz0 = Wz0.gq(wz0, 1, 0.15F); paramInt2 = ((JG0)wz0).xY; so.PL(wz0.a((paramInt1 - paramInt2))); }  if (paramhk0 != null) so.C00 = paramhk0;  return (So)so.mg(km.wI0.Ee); }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/uD0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */