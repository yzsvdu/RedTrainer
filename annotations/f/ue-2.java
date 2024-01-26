/*  1 */ package f;public final class ue extends Kl0 { public final void sM() { this
/*  2 */       .Bl0 = this.Ws.getShort();
/*    */     
/*  4 */     this.Ss = this.Ws.getInt();
/*    */     
/*  6 */     this.hy0 = this.Ws.getInt();
/*    */     
/*  8 */     this.lpt3 = this.Ws.getInt();
/*    */     
/* 10 */     this.CS = this.Ws.getInt();
/* 11 */     int i = this.Ws.getInt();
/* 12 */     this.My = this.Ss - this.CS; this.b = this.hy0 - i; jY[] arrayOfJY;
/*    */     byte b;
/* 14 */     for (arrayOfJY = new jY[i = this.Ws.get()], b = 0; b < i; )
/*    */     
/* 16 */     { this(this.Ws.getShort()); arrayOfJY[b] = jY1;
/*    */       jY jY1;
/* 18 */       (jY1 = new jY()).kk0 = this.Ws.getInt(); b++; }  this
/* 19 */       .yD = arrayOfJY;
/*    */     
/* 21 */     for (arrayOfJY = new jY[i = this.Ws.get()], b = 0; b < i; )
/*    */     
/* 23 */     { this(this.Ws.get()); arrayOfJY[b] = jY1;
/*    */       jY jY1;
/* 25 */       (jY1 = new jY()).kk0 = this.Ws.getInt(); b++; }  this
/* 26 */       .Jt = arrayOfJY;
/*    */     
/* 28 */     for (arrayOfJY = new jY[i = this.Ws.get()], b = 0; b < i; )
/*    */     
/* 30 */     { this(this.Ws.getShort()); arrayOfJY[b] = jY1;
/*    */       jY jY1;
/* 32 */       (jY1 = new jY()).kk0 = this.Ws.getInt(); b++; }  this
/* 33 */       .Iv = arrayOfJY;
/*    */     
/* 35 */     for (arrayOfJY = new jY[i = this.Ws.get()], b = 0; b < i; )
/*    */     
/* 37 */     { this(this.Ws.getShort()); arrayOfJY[b] = jY1;
/*    */       jY jY1;
/* 39 */       (jY1 = new jY()).kk0 = this.Ws.getInt(); b++; }  this
/* 40 */       .BO = arrayOfJY; }
/*    */ 
/*    */   
/*    */   public int Ss;
/*    */   public int hy0;
/*    */   public int lpt3;
/*    */   public int CS;
/*    */   public int mW;
/*    */   public int My;
/*    */   public int b;
/*    */   public short Bl0;
/*    */   public jY[] yD;
/*    */   public jY[] Jt;
/*    */   public jY[] Iv;
/*    */   public jY[] BO;
/*    */   
/*    */   public ue(c4 paramc4, ByteBuffer paramByteBuffer) {
/*    */     super(paramc4, paramByteBuffer);
/*    */   }
/*    */   
/*    */   public final void Cx() {
/*    */     int i = this.Ss, j = this.hy0, k = this.lpt3, m = this.CS, n = this.mW, i1 = this.My, i2 = this.b;
/*    */     short s = this.Bl0;
/*    */     jY[] arrayOfJY1 = this.yD, arrayOfJY2 = this.Jt, arrayOfJY3 = this.Iv, arrayOfJY4 = this.BO;
/*    */     R8 r8;
/*    */     pA pA;
/*    */     VF0 vF0;
/*    */     if ((r8 = km.u4) != null && (pA = r8.YG0.MH0) != null && (vF0 = pA.L90) != null)
/*    */       vF0.cF.CE(i, j, k, m, n, i1, i2, s, arrayOfJY1, arrayOfJY2, arrayOfJY3, arrayOfJY4); 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */