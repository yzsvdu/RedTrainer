/*   */ package f;public final class pH extends ZK0 { public pH(gC0 paramgC0) {} public final boolean sl0(xr0 paramxr0, tc paramtc, byte paramByte1, byte paramByte2) { za[] arrayOfZa;
/* 2 */     for (int i = (arrayOfZa = this.goto.G6).length; paramByte1 < i; ) { short s1 = paramxr0.Ka(), s2 = paramxr0.hA0(); za za; NC0 nC03, nC04; float f3; NC0 nC02; float f1, f2; NC0 nC01; float f4, f5, f6; int j; if ((
/* 3 */         ((j = (za = this[paramByte1]).Fs) == 0) ? ((f5 = s1) >= (
/* 4 */         f6 = (nC04 = za.mo0).x) - 1.0F && f5 <= f6 + 1.0F && (f5 = s2) >= (f4 = nC04.y) - 1.0F && f5 <= f4 + 4.0F) : ((f6 == 1) ? ((f5 = f5) >= (f6 = (nC03 = f4.mo0).x) - 4.0F && f5 <= f6 + 1.0F && (f5 = s2) >= (f3 = nC03.y) - 1.0F && f5 <= f3 + 1.0F) : ((f6 == 2) ? ((f5 = f5) >= (f6 = (nC02 = f3.mo0).x) - 1.0F && f5 <= f6 + 1.0F && (f5 = s2) >= (f2 = nC02.y) - 4.0F && f5 <= f2 + 1.0F) : (f6 == 3 && (f5 = f5) >= (f6 = (nC01 = f2.mo0).x) - 1.0F && f5 <= f6 + 4.0F && (f5 = s2) >= (f1 = nC01.y) - 1.0F && f5 <= f1 + 1.0F))))) return false;  paramByte1++; }  return true; }
/*   */ 
/*   */   
/*   */   public final boolean com4(xr0 paramxr01, xr0 paramxr02, tc paramtc, byte paramByte) {
/*   */     if (paramtc.Pf()) {
/*   */       za[] arrayOfZa;
/*   */       for (int i = (arrayOfZa = this.goto.G6).length; paramByte < i; ) {
/*   */         Jo jo = (Jo)paramtc;
/*   */         short s1 = paramxr01.Ka(), s2 = paramxr01.hA0();
/*   */         this[paramByte].if0(jo, s1, s2);
/*   */         paramByte++;
/*   */       } 
/*   */     } 
/*   */     return false;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/pH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */