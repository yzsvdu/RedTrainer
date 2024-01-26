/* 1 */ package f;public final class iq { public final String Wa0() { Xk xk; if (this.YB0 == 6)
/* 2 */     { xk = T30.Qh.Xr((byte)4, (short)260); return Ml0.OH0(YF() + 190480) + " " + m20(); }  return Ml0.OH0(((iq)super).HL0); }
/*   */ 
/*   */   
/*   */   public byte YB0;
/*   */   public byte hW;
/*   */   public int HL0;
/*   */   public byte b60;
/*   */   public byte Gp0;
/*   */   public short Nf0;
/*   */   public int Vz = 0;
/*   */   public short MW = 0;
/*   */   
/*   */   public iq(byte paramByte1, byte paramByte2, int paramInt, byte paramByte3, byte paramByte4, short paramShort) {
/*   */     this.YB0 = paramByte1;
/*   */     this.hW = paramByte2;
/*   */     this.HL0 = paramInt;
/*   */     this.b60 = paramByte3;
/*   */     this.Gp0 = paramByte4;
/*   */     this.Nf0 = paramShort;
/*   */   }
/*   */   
/*   */   public final byte tq0() {
/*   */     return this.YB0;
/*   */   }
/*   */   
/*   */   public final byte Fk0() {
/*   */     if (this.YB0 <= 4) {
/*   */       short s;
/*   */       if ((s = this.MW) == 1)
/*   */         return 70; 
/*   */       if (s == 2)
/*   */         return 75; 
/*   */       if (s == 3)
/*   */         return 80; 
/*   */       if (s > 3)
/*   */         return 90; 
/*   */     } 
/*   */     return this.b60;
/*   */   }
/*   */   
/*   */   public final int d50() {
/*   */     int i;
/*   */     return ((i = this.Vz) < 1) ? 0 : (int)(i - System.currentTimeMillis() / 1000L);
/*   */   }
/*   */   
/*   */   public final short dP() {
/*   */     return this.MW;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/iq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */