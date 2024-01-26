/*   */ package f;public final class WV extends Z8 { public final void sM() {
/* 2 */     ZY zY = (ZY)ZY.MX.Ha0(this.Ws.get());
/* 3 */     if (zY.ordinal() != 8) { this
/*   */         
/* 5 */         .r10 = this.Ws.getInt(); this.vz0 = au();
/*   */       
/* 7 */       this.Gy = Xv0.tE(this.Ws.get(), true);
/*   */       
/* 9 */       this.av = this.Ws.get(); this.uH0 = au(); } else { this.r10 = 0; this.vz0 = ""; this.uH0 = au(); }
/*   */   
/*   */   }
/*   */   
/*   */   public int r10;
/*   */   public String uH0;
/*   */   public String vz0;
/*   */   public ZY o70;
/*   */   public Xv0 Gy;
/*   */   public byte av;
/*   */   
/*   */   public WV(Ku paramKu, ByteBuffer paramByteBuffer) {
/*   */     super(paramKu, paramByteBuffer);
/*   */   }
/*   */   
/*   */   public final void Cx() {
/*   */     ZY zY2;
/*   */     if ((zY2 = this.o70) == null)
/*   */       return; 
/*   */     if (!zY2.DY && this.r10 < 1)
/*   */       this.uH0 = Ml0.LU(this.uH0); 
/*   */     ZY zY1 = this.o70;
/*   */     int i = this.r10;
/*   */     String str1 = this.vz0;
/*   */     Xv0 xv0 = this.Gy;
/*   */     byte b = this.av;
/*   */     String str2 = this.uH0;
/*   */     ((Ku)this.d).C4.Sg(new Mv0(this, i, str1, xv0, b, str2));
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/WV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */