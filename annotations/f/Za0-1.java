/* 1 */ package f;public final class Za0 implements Comparable { public final int compareTo(Object paramObject) { short s1; short s2; if ((s2 = ((Za0)paramObject).zo) == (
/* 2 */       s1 = this.zo)) { s1 = 0; } else if (s2 < s1) { s1 = 1; } else { s1 = -1; }  return s1; }
/*   */ 
/*   */   
/*   */   public short W7;
/*   */   public short eq;
/*   */   public byte cA0 = -1;
/*   */   public short zo = -1;
/*   */   public byte q1 = -1;
/*   */   public byte mw = -1;
/*   */   public boolean BK;
/*   */   public boolean EW;
/*   */   public short Ic0;
/*   */   
/*   */   public Za0(byte paramByte, short paramShort1, short paramShort2, short paramShort3) {
/*   */     if (paramByte == 0) {
/*   */       this.cA0 = paramByte;
/*   */       this.eq = paramShort1;
/*   */       this.W7 = paramShort2;
/*   */       this.zo = paramShort3;
/*   */       this.q1 = 0;
/*   */       return;
/*   */     } 
/*   */     throw new RuntimeException("");
/*   */   }
/*   */   
/*   */   public Za0(byte paramByte1, short paramShort1, byte paramByte2, byte paramByte3, boolean paramBoolean1, boolean paramBoolean2, short paramShort2) {
/*   */     if (paramByte1 == 1) {
/*   */       this.cA0 = paramByte1;
/*   */       this.eq = paramShort1;
/*   */       this.zo = paramShort2;
/*   */       this.q1 = paramByte2;
/*   */       this.mw = paramByte3;
/*   */       this.BK = paramBoolean1;
/*   */       this.EW = paramBoolean2;
/*   */       this.W7 = 1;
/*   */       return;
/*   */     } 
/*   */     throw new RuntimeException("");
/*   */   }
/*   */   
/*   */   public Za0(byte paramByte, short paramShort1, short paramShort2) {
/*   */     if (paramByte == 2) {
/*   */       this.cA0 = paramByte;
/*   */       this.Ic0 = paramShort1;
/*   */       this.zo = paramShort2;
/*   */       return;
/*   */     } 
/*   */     throw new RuntimeException("");
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Za0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */