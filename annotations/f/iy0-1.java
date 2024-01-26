/* 1 */ package f;public final class iy0 extends Ws0 { public vF hl; public iy0(short paramShort, HI paramHI, ByteBuffer paramByteBuffer) { super(paramShort, paramHI, paramByteBuffer); } public final void i3() { if (this.he0.bO() == 3) { vF vF1; this.COm4 = (short)this.g5.get(); this.g5.get(); this.F70 = this.g5.getShort(); this.g5.getShort(); this.g5.getShort(); this.g5.getShort(); this.CW = this.g5.getShort(); this.qz = this.g5.getShort(); this.g5.getShort(); this.ZC0 = this.g5.getShort(); this.d8 = this.g5.get(); this.g5.get(); this.Z5 = this.g5.get(); this.et = this.g5.get(); switch ((byte)((this.cC = this.g5.getShort()) & 0x7)) { default: vF1 = vF.Vj; break;case 4: vF1 = vF.ud0; break;case 3: case 6: vF1 = vF.ai; break;case 2: vF1 = vF.IQ; break;case 1: vF1 = vF.AH0; break;case 0: vF1 = vF.Vj; break; }  this
/* 2 */         .hl = vF1; } else { vF vF1; this.g5.get(); this.COm4 = (short)this.g5.get(); this.g5.getShort(); this.F70 = this.g5.getShort(); this.g5.getShort(); this.g5.getShort(); this.g5.getShort(); this.CW = this.g5.getShort(); this.qz = this.g5.getShort(); this.ZC0 = this.g5.getShort(); this.d8 = this.g5.get(); this.g5.get(); this.Z5 = (byte)((short)this.g5.get() >> 1 & 0xFF); short s; switch ((byte)((s = this.g5.getShort()) & 0x7)) { default:
/* 3 */           vF1 = vF.Vj; break;case 4: vF1 = vF.ud0; break;case 3: case 6: vF1 = vF.ai; break;case 2: vF1 = vF.IQ; break;case 1: vF1 = vF.AH0; break;case 0: vF1 = vF.Vj; break; }  this
/* 4 */         .hl = vF1; this.et = (byte)(s >> 4 & 0x3F); this.cC = (short)this.g5.get(); if ((s = this.Ga) >= 343 && s <= 354) { this.CW = 1159; this.qz = 1159; }  }  Lj0(); } public final void Lj0() { HI hI = this.he0; this.P2 = this.kO.Ek[this.COm4]; } public final boolean hG0() { vF vF1; if (this.he0.bO() == 4) { switch (this.Ga) { case 115: case 220: case 222: case 223: case 224: case 247: case 248: case 249: return true; }  if ((vF1 = this.hl) == vF.ud0 || this == vF.ai) return true;  }  if (((Ws0)this)
/* 5 */       .he0.bO() == 3)
/* 6 */     { byte b; if ((b = ((Ws0)this).d8) != 53) { if (b == 56 || b == 117) return false;  } else { return true; }  }  return 
/*   */       
/* 8 */       (((iy0)super).hl == vF.ud0); }
/*   */ 
/*   */   
/*   */   public final String Lr() {
/*   */     short s;
/*   */     if (this.he0.bO() == 4 && (s = this.Ga) >= 343 && s <= 354)
/*   */       return getName() + " (" + Ml0.bM0(429, this.Ga - 327) + ")"; 
/*   */     return getName();
/*   */   }
/*   */   
/*   */   public final vF WD0() {
/*   */     return this.hl;
/*   */   }
/*   */   
/*   */   public final boolean ia0() {
/*   */     if (this.he0.bO() == 4) {
/*   */       switch (this.Ga) {
/*   */         case 115:
/*   */         case 220:
/*   */         case 222:
/*   */         case 223:
/*   */         case 224:
/*   */         case 247:
/*   */         case 248:
/*   */         case 249:
/*   */           return true;
/*   */       } 
/*   */     } else {
/*   */       byte b;
/*   */       if (this.he0.bO() == 3 && ((b = this.d8) == 117 || b == 56))
/*   */         return false; 
/*   */     } 
/*   */     return (this.hl == vF.ud0);
/*   */   }
/*   */   
/*   */   public final boolean kJ() {
/*   */     return (this.he0.bO() == 3) ? M6(-32768) : ((this.he0.bO() == 4) ? M6((short)16) : false);
/*   */   }
/*   */   
/*   */   public final boolean cOM9() {
/*   */     return (this.he0.bO() == 3) ? M6((short)16384) : ((this.he0.bO() == 4) ? M6((short)8) : false);
/*   */   }
/*   */   
/*   */   public final Object clone() {
/*   */     return Ae0();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/iy0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */