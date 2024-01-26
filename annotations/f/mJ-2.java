/* 1 */ package f;public final class mJ { public final int hashCode() { int i = mJ.class.hashCode() + 12; byte b = this.md; return (byte)(this.FI0 & 0xF | b << 4) + i; }
/*   */ 
/*   */   
/*   */   public static final mJ[][] FJ0 = new mJ[2][6];
/*   */   public static final mJ ba = new mJ((byte)-1, (byte)-1);
/*   */   public final byte FI0;
/*   */   public final byte md;
/*   */   
/*   */   public mJ(byte paramByte1, byte paramByte2) {
/*   */     this.FI0 = paramByte1;
/*   */     this.md = paramByte2;
/*   */   }
/*   */   
/*   */   public static mJ Vs0(byte paramByte1, byte paramByte2) {
/*   */     return (paramByte1 >= 0 && paramByte1 < 2 && paramByte2 >= 0 && paramByte2 < 5) ? FJ0[paramByte1][paramByte2] : ((paramByte1 == -1 && paramByte2 == -1) ? ba : new mJ(paramByte1, paramByte2));
/*   */   }
/*   */   
/*   */   public static mJ kc(byte paramByte) {
/*   */     paramByte = (byte)(paramByte >> 4 & 0xF);
/*   */     byte b;
/*   */     if ((b = (byte)(paramByte & 0xF)) == 15)
/*   */       b = -1; 
/*   */     if (paramByte == 15)
/*   */       paramByte = -1; 
/*   */     return Vs0(b, paramByte);
/*   */   }
/*   */   
/*   */   static {
/*   */     for (byte b = 0; b < FJ0.length; b = (byte)(b + 1)) {
/*   */       mJ[] arrayOfMJ;
/*   */       for (byte b1 = 0; b1 < (arrayOfMJ = FJ0[b]).length; b1 = (byte)(b1 + 1)) {
/*   */         mJ mJ1;
/*   */         this(b, b1);
/*   */         arrayOfMJ[b1] = mJ1;
/*   */       } 
/*   */     } 
/*   */   }
/*   */   
/*   */   public final byte aR() {
/*   */     return this.FI0;
/*   */   }
/*   */   
/*   */   public final byte F90() {
/*   */     return this.md;
/*   */   }
/*   */   
/*   */   public final boolean equals(Object paramObject) {
/*   */     return !(paramObject instanceof mJ) ? false : ((this.FI0 == ((mJ)(paramObject = paramObject)).FI0 && this.md == ((mJ)paramObject).md));
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/mJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */