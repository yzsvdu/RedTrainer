/*  1 */ package f;public final class f4 extends SI0 { public final void p4(kf paramkf) { Bg0 bg0; if (paramkf.AD
/*  2 */       .rx == 
/*  3 */       ky.JH0) { dw dw1 = (new tf(this.pl)).JK(); Wl wl;
/*    */       dw dw2;
/*  5 */       if ((dw2 = (wl = km.wI0.K7).NC0) != null) dw2
/*  6 */           .dispose();  wl.NC0 = dw1; }  if (this
/*  7 */       .ov0 < 0) { char c = ''; byte b = 32; arrayOfString[
/*    */           
/*  9 */           0] = this.pl.m();
/*    */       String[] arrayOfString;
/* 11 */       (arrayOfString = new String[2])[1] = Ml0.OH0(this.fV + 110000);
/*    */ 
/*    */       
/* 14 */       paramkf.Kq(Ml0.tG((byte)2, F40.ef0, c, b, arrayOfString)); this(this);
/* 15 */       paramkf.YP.add(bg0); }
/* 16 */     else { char c = ''; byte b = 41; arrayOfString[
/*    */           
/* 18 */           0] = this.pl.m();
/*    */       String[] arrayOfString;
/* 20 */       (arrayOfString = new String[2])[1] = Ml0.OH0(this.fV + 110000);
/*    */ 
/*    */       
/* 23 */       bg0.Kq(Ml0.tG((byte)2, F40.ef0, c, b, arrayOfString)); }
/*    */      }
/*    */ 
/*    */   
/*    */   public j40 pl;
/*    */   public byte ov0;
/*    */   public short fV;
/*    */   
/*    */   public f4(j40 paramj40, byte paramByte, short paramShort) {
/*    */     this.pl = paramj40;
/*    */     this.ov0 = paramByte;
/*    */     this.fV = paramShort;
/*    */   }
/*    */   
/*    */   public final j40 Fm() {
/*    */     return this.pl;
/*    */   }
/*    */   
/*    */   public final short PL() {
/*    */     return this.fV;
/*    */   }
/*    */   
/*    */   public final boolean equals(Object paramObject) {
/*    */     if (!(paramObject instanceof f4))
/*    */       return false; 
/*    */     if (((f4)(paramObject = paramObject)).fV != this.fV || ((f4)paramObject).ov0 != this.ov0)
/*    */       return false; 
/*    */     j40 j401;
/*    */     if ((j401 = this.pl) == (paramObject = ((f4)paramObject).pl))
/*    */       return true; 
/*    */     if (this == null || paramObject == null)
/*    */       return false; 
/*    */     return !(this.Jg != ((Qh0)paramObject).Jg);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/f4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */