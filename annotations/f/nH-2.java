/* 1 */ package f;public final class nH extends ZK0 { public final boolean sM(xr0 paramxr0, tc paramtc, byte paramByte1, byte paramByte2) { if (!(paramtc instanceof Jo)) return false;  Jo jo; if (!(jo = (Jo)paramtc).so0((byte)1)) return false;  vh0 vh02; if ((vh02 = km.a3) == null) return false; 
/* 2 */     byte b1 = this.HW.FB;
/* 3 */     byte b2 = this.HW.kD0;
/* 4 */     byte b3 = this.HW.vu0; KI kI;
/* 5 */     if ((kI = vh02.COm8(b1, b2, b3)) == null) return false;  xr0 xr01; if ((xr01 = COm3(paramxr0, paramByte1, 1)) == null || T9())
/*   */     {
/*   */       
/* 8 */       return false; }  if (vh02.bk(bl0(), this)) return true;  vh0 vh01; if ((paramByte2 & 0x1) == 0 && km.u4 != null && (vh01 = km.a3) != null && paramtc == this.Ct) km.u4.tN = true;  return false; }
/*   */ 
/*   */   
/*   */   public final boolean uH0(tc paramtc, byte paramByte) {
/*   */     return !(paramtc instanceof Jo) ? false : (((Jo)paramtc).so0((byte)1) ^ true);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/nH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */