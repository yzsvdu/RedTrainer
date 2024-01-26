/*  1 */ package f;public final class vK0 extends Kl0 { public final void sM() { if (this.Ws.get() < 1)
/*    */     
/*  3 */     { this(0);
/*  4 */       this.pp0 = this; return; }  ((vK0)super)
/*    */       
/*  6 */       .ws0 = ((yv)this).Ws.get();
/*    */     
/*  8 */     ((vK0)super).xK = ky.Mt0(((yv)this).Ws.get());
/*    */     
/* 10 */     ((vK0)super).P90 = DO.kk(((yv)this).Ws.get());
/*    */     
/* 12 */     this(((yv)this).Ws.getInt()); Gu0 gu01;
/* 13 */     ((vK0)super).pp0 = gu02;
/* 14 */     long l = ((yv)this).Ws.getLong(); Gu0 gu02;
/* 15 */     (gu02 = new Gu0()).l8 = System.currentTimeMillis() + l + 10000L;
/* 16 */     ((vK0)super).pp0
/*    */       
/* 18 */       .q3 = ((yv)this).Ws.getInt(); short s; byte b;
/* 19 */     for (s = ((yv)this).Ws.getShort(), b = 0; b < s; ) {
/*    */       yG0 yG0;
/*    */       
/* 22 */       int i = ((yv)this).Ws.getInt(); short s1;
/* 23 */       this(s1 = ((yv)this).Ws.getShort(), i, ((yv)this).Ws.getInt()); if (((vK0)super).P90 == DO.JO) yG0
/*    */           
/* 25 */           .L30 = ((yv)this).Ws.get(); 
/* 26 */       ((vK0)super).pp0
/* 27 */         .y70
/* 28 */         .Vh0(s1, yG0); b++;
/*    */     }  }
/*    */ 
/*    */   
/*    */   public byte ws0;
/*    */   public ky xK;
/*    */   public DO P90;
/*    */   public Gu0 pp0;
/*    */   
/*    */   public vK0(c4 paramc4, ByteBuffer paramByteBuffer) {
/*    */     super(paramc4, paramByteBuffer);
/*    */   }
/*    */   
/*    */   public final void Cx() {
/*    */     R8 r8;
/*    */     if ((r8 = km.u4) != null) {
/*    */       byte b = this.ws0;
/*    */       ky ky1 = this.xK;
/*    */       DO dO = this.P90;
/*    */       Gu0 gu0 = this.pp0;
/*    */       r8.rG(b, ky1, dO, gu0);
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/vK0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */