/*  1 */ package f;public class UH extends ZK0 { public boolean sM(xr0 paramxr0, tc paramtc, byte paramByte1, byte paramByte2) { nl nl1; if (paramByte1 != 0) { if (paramByte1 != 1) { if (paramByte1 != 3) { nl1 = nl.Bn; } else { nl1 = nl.Dz0; }  } else { nl1 = nl.Cl; }  } else { nl1 = nl.jC0; }  if (paramxr0.T9() && (paramxr0.Q4()).E10 == 1 && 
/*  2 */       (paramxr0.Q4())
/*  3 */       .cA == 76 && 
/*  4 */       (paramxr0.Q4())
/*  5 */       .VZ >= 35 && 
/*  6 */       (paramxr0.Q4())
/*  7 */       .VZ <= 39) return false; 
/*  8 */     if ((paramxr0.Q4())
/*  9 */       .E10 == 0 && 
/* 10 */       (paramxr0.Q4())
/* 11 */       .cA == 30 && 
/* 12 */       (paramxr0.Q4())
/* 13 */       .VZ == 0) return false;
/*    */     
/* 15 */     boolean bool = this.Fy0; nl[] arrayOfNl; (arrayOfNl = new nl[1])[0] = nl1; return paramtc.pm.Ci0(paramxr0, bool, arrayOfNl); }
/*    */ 
/*    */   
/*    */   public boolean Fy0;
/*    */   public nl QI;
/*    */   
/*    */   public UH(boolean paramBoolean) {
/*    */     this(false, paramBoolean, null);
/*    */   }
/*    */   
/*    */   public UH(boolean paramBoolean1, boolean paramBoolean2, nl paramnl) {
/*    */     this.Fy0 = paramBoolean1;
/*    */     this.QI = paramnl;
/*    */   }
/*    */   
/*    */   public final boolean bf0(xr0 paramxr0, tc paramtc, boolean paramBoolean) {
/*    */     if (paramxr0.jH() != null) {
/*    */       boolean bool;
/*    */       if ((paramxr0.jH()).pn0 != null) {
/*    */         bool = true;
/*    */       } else {
/*    */         bool = false;
/*    */       } 
/*    */       if (bool && this.Fy0) {
/*    */         if (!paramxr0.gc()) {
/*    */           tJ0 tJ0;
/*    */           KI kI = paramxr0.Q4();
/*    */           a4 a4 = paramxr0.jH();
/*    */           this(kI, paramxr0, a4, paramBoolean, false, false);
/*    */           paramxr0.TL0(this);
/*    */         } 
/*    */         return true;
/*    */       } 
/*    */     } 
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final nl V6() {
/*    */     return this.QI;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/UH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */