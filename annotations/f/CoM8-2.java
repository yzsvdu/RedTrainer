/* 1 */ package f;public final class CoM8 extends NZ { public final void vV(byte paramByte, il paramil) { if (paramil == null) return;  if (this.ys0
/* 2 */       .Xg0() == 209) { if (this
/* 3 */         .pu == 22 && 
/* 4 */         Ka() == 0 && hA0() == 0 && paramByte == 1 && paramil
/* 5 */         .pu == 23) return;  if (this
/* 6 */         .pu == 25 && 
/* 7 */         Ka() == 1 && hA0() == 0 && paramByte == 3 && paramil
/* 8 */         .pu == 16) return;  }  this
/* 9 */       .bt[paramByte] = paramil; }
/*   */ 
/*   */   
/*   */   public short Mw0;
/*   */   public xr0[] bt = new xr0[4];
/*   */   public eo ap0 = new eo();
/*   */   public float fl0;
/*   */   public HE0 ls0;
/*   */   public String KL = "";
/*   */   
/*   */   public CoM8(Cy paramCy, short paramShort1, short paramShort2, byte paramByte, short paramShort3, short paramShort4) {
/*   */     super(paramCy, null, paramShort1, paramShort2, paramByte);
/*   */     this.Mw0 = paramShort3;
/*   */     this.EC0 = paramShort4;
/*   */   }
/*   */   
/*   */   public final float i00() {
/*   */     return this.ap0.y;
/*   */   }
/*   */   
/*   */   public final float Kn() {
/*   */     return this.fl0;
/*   */   }
/*   */   
/*   */   public final void nm(float paramFloat) {
/*   */     this.fl0 += paramFloat;
/*   */   }
/*   */   
/*   */   public final short rv0() {
/*   */     return 0;
/*   */   }
/*   */   
/*   */   public final short RW() {
/*   */     return 0;
/*   */   }
/*   */   
/*   */   public final byte OB0() {
/*   */     return (byte)this.Mw0;
/*   */   }
/*   */   
/*   */   public final short pq() {
/*   */     return this.Mw0;
/*   */   }
/*   */   
/*   */   public final short BY() {
/*   */     return this.EC0;
/*   */   }
/*   */   
/*   */   public final xr0 Cx(byte paramByte) {
/*   */     return (paramByte < 0 || paramByte > 3) ? null : (hz().wJ(paramByte) ? hz().w10(paramByte, this) : this.bt[paramByte]);
/*   */   }
/*   */   
/*   */   public final eo j5() {
/*   */     return this.ap0;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/CoM8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */