/*  1 */ package f;public final class Ff0 extends Kl0 { public final void sM() { this
/*  2 */       .qu = this.Ws.getInt();
/*    */     
/*  4 */     this.vP = this.Ws.get(); byte b;
/*    */     wA0[] arrayOfWA0;
/*  6 */     for (this.NK = DK.com4(this.Ws.get()), this.Ae = new wA0[Gc0()], b = 0; b < (arrayOfWA0 = this.Ae).length; ) { DK dK = this.NK; byte b1 = this.vP;
/*    */ 
/*    */       
/*  9 */       float f = this.Ws.getFloat();
/* 10 */       short s = this.Ws.getShort();
/* 11 */       int i = this.Ws.getInt(), j = this.Ws.getInt(); (new wA0(this.Ws.getInt(), dK, b1, f, s, i, j))
/*    */         
/* 13 */         .ZP = k60(); arrayOfWA0[b] = new wA0(this.Ws.getInt(), dK, b1, f, s, i, j);
/* 14 */       b++; }
/*    */      }
/*    */ 
/*    */   
/*    */   public int qu;
/*    */   public byte vP;
/*    */   public DK NK;
/*    */   public wA0[] Ae;
/*    */   
/*    */   public Ff0(c4 paramc4, ByteBuffer paramByteBuffer) {
/*    */     super(paramc4, paramByteBuffer);
/*    */   }
/*    */   
/*    */   public final void Cx() {
/*    */     ro ro = r8();
/*    */     int i = this.qu;
/*    */     byte b = this.vP;
/*    */     DK dK = this.NK;
/*    */     wA0[] arrayOfWA0 = this.Ae;
/*    */     pA pA;
/*    */     ve ve;
/*    */     if ((pA = ((R8)this).YG0.MH0) != null && (ve = this.yq0) != null)
/*    */       Zs(i, b, dK, arrayOfWA0); 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ff0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */