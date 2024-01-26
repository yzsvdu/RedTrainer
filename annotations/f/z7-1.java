/* 1 */ package f;public final class z7 extends V4 { public final nl eD(int paramInt1, int paramInt2, int paramInt3) { if (paramInt2 < 1) paramInt2 = 1;  if (paramInt3 < 1) paramInt3 = 1;  byte b; if ((b = this.Gl) == 1 || b == 0)
/*   */     {
/*   */ 
/*   */       
/* 5 */       return this.AC0[paramInt1 % paramInt3 * 2 / paramInt3]; } 
/*   */     return this.AC0[paramInt1 % paramInt2 * 2 / paramInt2]; }
/*   */ 
/*   */   
/*   */   public z7(byte paramByte1, byte paramByte2, nl paramnl1, nl paramnl2) {
/*   */     super(paramByte1, paramByte2, this);
/*   */     (arrayOfNl = new nl[2])[0] = paramnl1;
/*   */     (new nl[2])[1] = paramnl2;
/*   */     Gd(this);
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
/*   */     switch (this.Gl) {
/*   */       default:
/*   */         return false;
/*   */       case 3:
/*   */         return (paramShort2 != paramShort4) ? false : ((paramShort1 < paramShort3) ? false : (!(paramShort1 > paramShort3 + paramInt1)));
/*   */       case 2:
/*   */         return (paramShort2 != paramShort4) ? false : ((paramShort1 > paramShort3) ? false : (!(paramShort1 < paramShort3 - paramInt1)));
/*   */       case 1:
/*   */         return (paramShort1 != paramShort3) ? false : ((paramShort2 > paramShort4) ? false : (!(paramShort2 < paramShort4 - paramInt2)));
/*   */       case 0:
/*   */         break;
/*   */     } 
/*   */     return (paramShort1 != paramShort3) ? false : ((paramShort2 < paramShort4) ? false : (!(paramShort2 > paramShort4 + paramInt2)));
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/z7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */