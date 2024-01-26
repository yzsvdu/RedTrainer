/*  1 */ package f;public final class lPt7 extends Rm { public final void l4(int paramInt) { Rm[] arrayOfRm; boolean bool; paramInt = this.T8; super
/*  2 */       .l4(paramInt); AH aH2; Q90 q902;
/*  3 */     (q902 = (aH2 = this.ej).X00)
/*  4 */       .getClass(); int m; byte[] arrayOfByte2; int i1;
/*  5 */     for (arrayOfByte2 = new byte[m = hR.ka.length], i1 = 0; i1 < m; ) { arrayOfByte2[i1] = q902.Hc(hR.ka[i1]); i1++; }  int k = 0; hR[] arrayOfHR2; byte b;
/*  6 */     for (i1 = (arrayOfHR2 = hR.ka).length, b = 0; b < i1; ) { hR hR = arrayOfHR2[b];
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 11 */       k = Math.abs((byte)(aH2.Yj0[hR.It0]).T8 - arrayOfByte2[hR.dL]) + k; b++; }
/* 12 */      (aH2 = this.ej)
/* 13 */       .getClass();
/* 14 */     if ((int)Math.ceil(k / aH2.ZW) > km.u4
/*    */       
/* 16 */       .gN(km.u4.jG0)
/*    */ 
/*    */ 
/*    */       
/* 20 */       .jW(aH2.p00.Lh.p1)) super
/* 21 */         .l4(paramInt);  AH aH1; Q90 q901;
/* 22 */     (q901 = (aH1 = this.ej).X00)
/* 23 */       .getClass(); byte[] arrayOfByte1; int n;
/* 24 */     for (arrayOfByte1 = new byte[k = hR.ka.length], n = 0; n < k; ) { arrayOfByte1[n] = q901.Hc(hR.ka[n]); n++; }  int j = 0; hR[] arrayOfHR1;
/* 25 */     for (n = (arrayOfHR1 = hR.ka).length, i1 = 0; i1 < n; ) { hR hR = arrayOfHR1[i1];
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 30 */       j = Math.abs((byte)(aH1.Yj0[hR.It0]).T8 - arrayOfByte1[hR.dL]) + j; i1++; }
/* 31 */      arrayOfString[0] = aH1.p00.JG0(); String[] arrayOfString; (arrayOfString = new String[2])[1] = String.valueOf(j); aH1.Ce0.E1(Ml0.sB(5638, arrayOfString));
/* 32 */     if ((j = (int)Math.ceil(j / aH1.ZW)) < km.u4
/*    */       
/* 34 */       .gN(km.u4.jG0)
/*    */ 
/*    */ 
/*    */       
/* 38 */       .jW(aH1.p00.Lh.p1))
/* 39 */     { for (j = (arrayOfRm = aH1.Yj0).length, bool = false; bool < j; )
/*    */       
/* 41 */       { Un un4 = rm.mc0; Rm rm; if ((n = (rm = arrayOfRm[bool]).T8) > 0) { b = 1; } else { b = 0; }  un4.sk0(b); Un un3 = rm.Xx; if (n < 31) { n = 1; } else { n = 0; }  un3.sk0(n); bool++; }  } else { Q90 q90; (q90 = ((AH)arrayOfRm).X00).getClass();
/* 42 */       for (arrayOfByte1 = new byte[bool = hR.ka.length], n = 0; n < bool; ) { arrayOfByte1[n] = q90.Hc(hR.ka[n]); n++; }
/* 43 */        hR[] arrayOfHR; for (bool = (arrayOfHR = hR.ka).length, n = 0; n < bool; ) { hR hR = arrayOfHR[n];
/*    */ 
/*    */ 
/*    */         
/* 47 */         byte b1 = arrayOfByte1[hR.dL]; Rm rm; int i2;
/* 48 */         if ((i2 = (rm = ((AH)arrayOfRm).Yj0[hR.It0]).T8) > b1) { rm
/* 49 */             .mc0.sk0(true); rm.Xx.sk0(false); } else if (i2 < b1) { rm.mc0.sk0(false); rm.Xx.sk0(true); } else { rm.mc0.sk0(false); rm.Xx.sk0(false); }  n++; }
/*    */        }
/* 51 */      Un un2 = this.Xx; int i; if ((i = this.T8) < 31) { bool = true; } else { bool = false; }  un2.sk0(bool); Un un1 = this.mc0; if (i > 0) { i = 1; } else { i = 0; }  sk0(i); }
/*    */ 
/*    */   
/*    */   public lPt7(AH paramAH, zT paramzT) {
/*    */     super(paramzT);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/lPt7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */