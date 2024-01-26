/* 1 */ package f;public final class Hv extends V4 { public final nl eD(int paramInt1, int paramInt2, int paramInt3) { if (paramInt2 < 1) paramInt2 = 1;  if (paramInt3 < 1) paramInt3 = 1;  int i = 0; nl[] arrayOfNl2; int m;
/* 2 */     for (int k = (arrayOfNl2 = this.AC0).length; m < k; ) {
/* 3 */       byte b1; if ((b1 = (arrayOfNl2[m]).rb) == 1 || b1 == 0) { i += paramInt3; } else { i += paramInt2; }  m++;
/* 4 */     }  nl[] arrayOfNl1 = new nl[i]; int j = 0; nl[] arrayOfNl3;
/*   */     byte b;
/* 6 */     for (m = (arrayOfNl3 = this.AC0).length, b = 0; b < m; )
/* 7 */     { nl nl; int n; if ((n = (nl = arrayOfNl3[b]).rb) == 1 || n == 0) { int i1 = paramInt3; } else { n = paramInt2; }  for (byte b1 = 0; b1 < n; ) { int i1 = j + 1; this[j] = nl;
/* 8 */         b1++; j = i1; }  b++; }  return this[paramInt1 % i]; }
/*   */ 
/*   */   
/*   */   public Hv(byte paramByte, byte... paramVarArgs) {
/*   */     super(paramByte, paramVarArgs[0], new nl[0]);
/*   */     if (paramVarArgs.length == 4) {
/*   */       nl[] arrayOfNl = new nl[paramVarArgs.length];
/*   */       for (byte b = 0; b < paramVarArgs.length; b++)
/*   */         arrayOfNl[b] = nl.Tm0(paramVarArgs[b], NI.Ov0); 
/*   */       Gd(arrayOfNl);
/*   */       return;
/*   */     } 
/*   */     throw new RuntimeException();
/*   */   }
/*   */   
/*   */   public final int Y10() {
/*   */     return 0;
/*   */   }
/*   */   
/*   */   public final boolean fG0(short paramShort1, short paramShort2, short paramShort3, short paramShort4, int paramInt1, int paramInt2) {
/*   */     if (paramInt1 < 1)
/*   */       paramInt1 = 1; 
/*   */     if (paramInt2 < 1)
/*   */       paramInt2 = 1; 
/*   */     if (paramShort1 == paramShort3 && paramShort2 == paramShort4)
/*   */       return true; 
/*   */     byte b = 0;
/*   */     nl[] arrayOfNl;
/*   */     while (b < (arrayOfNl = this.AC0).length) {
/*   */       byte b1;
/*   */       switch ((arrayOfNl[b]).rb) {
/*   */         case 3:
/*   */           for (b1 = 0; b1 < paramInt1; ) {
/*   */             if (paramShort1 == (paramShort3 = (short)(paramShort3 + 1)) && paramShort2 == paramShort4)
/*   */               return true; 
/*   */             b1++;
/*   */           } 
/*   */           break;
/*   */         case 2:
/*   */           for (b1 = 0; b1 < paramInt1; ) {
/*   */             if (paramShort1 == (paramShort3 = (short)(paramShort3 - 1)) && paramShort2 == paramShort4)
/*   */               return true; 
/*   */             b1++;
/*   */           } 
/*   */           break;
/*   */         case 1:
/*   */           for (b1 = 0; b1 < paramInt2; ) {
/*   */             paramShort4 = (short)(paramShort4 - 1);
/*   */             if (paramShort1 == paramShort3 && paramShort2 == paramShort4)
/*   */               return true; 
/*   */             b1++;
/*   */           } 
/*   */           break;
/*   */         case 0:
/*   */           for (b1 = 0; b1 < paramInt2; ) {
/*   */             paramShort4 = (short)(paramShort4 + 1);
/*   */             if (paramShort1 == paramShort3 && paramShort2 == paramShort4)
/*   */               return true; 
/*   */             b1++;
/*   */           } 
/*   */           break;
/*   */       } 
/*   */       b++;
/*   */     } 
/*   */     return false;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Hv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */