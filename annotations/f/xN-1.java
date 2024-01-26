/*   */ package f;public final class xN extends Kl0 { public final void sM() {
/* 2 */     ZY zY = (ZY)ZY.MX.Ha0(this.Ws.get());
/* 3 */     if (zY.ordinal() != 8) { this
/*   */         
/* 5 */         .i00 = this.Ws.getInt(); this.oo0 = au();
/*   */       
/* 7 */       this.Fy0 = Xv0.tE(this.Ws.get(), true);
/*   */       
/* 9 */       this.gZ = this.Ws.get(); this.WH = au(); } else { this.i00 = 0; this.oo0 = ""; this.WH = au(); }
/*   */   
/*   */   }
/*   */   
/*   */   public int i00;
/*   */   public String WH;
/*   */   public String oo0;
/*   */   public ZY vp;
/*   */   public Xv0 Fy0;
/*   */   public byte gZ;
/*   */   
/*   */   public xN(c4 paramc4, ByteBuffer paramByteBuffer) {
/*   */     super(paramc4, paramByteBuffer);
/*   */   }
/*   */   
/*   */   public final void Cx() {
/*   */     ZY zY2;
/*   */     if ((zY2 = this.vp) == null)
/*   */       return; 
/*   */     if (!zY2.DY && this.i00 < 1)
/*   */       this.WH = Ml0.LU(this.WH); 
/*   */     ZY zY1 = this.vp;
/*   */     int i = this.i00;
/*   */     String str1 = this.oo0;
/*   */     Xv0 xv0 = this.Fy0;
/*   */     byte b = this.gZ;
/*   */     String str2 = this.WH;
/*   */     r8().Sg(new Mv0(this, i, str1, xv0, b, str2));
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/xN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */