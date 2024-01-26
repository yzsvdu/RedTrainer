/*  1 */ package f;public final class lpT6 extends Kl0 { public final void sM() { this
/*  2 */       .My = b; byte b; if ((b = this.Ws.get()) != 0) { if (b != 5)
/*  3 */         return;  this
/*    */         
/*  5 */         .c00 = this.Ws.getShort();
/*    */       
/*  7 */       this.F70 = this.Ws.getShort();
/*    */       
/*  9 */       this.Po = this.Ws.getFloat();
/*    */       
/* 11 */       this.D6 = this.Ws.getFloat();
/*    */       
/* 13 */       this.D4 = this.Ws.getFloat();
/*    */       
/* 15 */       this.yQ = this.Ws.getFloat();
/*    */       
/* 17 */       this.Hf = (b != 4) ? this.Ws.getShort() : this.Ws.getShort(); } else { this
/*    */         
/* 19 */         .ci = this.Ws.getShort();
/*    */       
/* 21 */       this.IZ = this.Ws.getShort(); }
/*    */      }
/*    */ 
/*    */   
/*    */   public byte My;
/*    */   public short ci;
/*    */   public short IZ;
/*    */   public short c00;
/*    */   public short F70;
/*    */   public float Po;
/*    */   public float D6;
/*    */   public float D4;
/*    */   public float yQ;
/*    */   public short Hf;
/*    */   
/*    */   public lpT6(c4 paramc4, ByteBuffer paramByteBuffer) {
/*    */     super(paramc4, paramByteBuffer);
/*    */   }
/*    */   
/*    */   public final void Cx() {
/*    */     short s2;
/*    */     Xi xi1, xi2;
/*    */     boolean bool;
/*    */     float f1, f2, f3, f4;
/*    */     short s4;
/*    */     byte b;
/*    */     switch (b = this.My) {
/*    */       default:
/*    */         return;
/*    */       case 4:
/*    */       case 5:
/*    */         xi2 = km.wI0.iJ0;
/*    */         if (b == 5) {
/*    */           bool = true;
/*    */         } else {
/*    */           bool = false;
/*    */         } 
/*    */         s2 = this.c00;
/*    */         s3 = this.F70;
/*    */         f1 = this.Po;
/*    */         f2 = this.D6;
/*    */         f3 = this.D4;
/*    */         f4 = this.yQ;
/*    */         s4 = this.Hf;
/*    */         xi2.fB0(bool, s2, s3, f1, f2, f3, f4, s4);
/*    */       case 3:
/*    */         wJ0.Nf0.dz();
/*    */       case 1:
/*    */       case 2:
/*    */         xi1 = km.wI0.iJ0;
/*    */         if (s3 == 1) {
/*    */           s3 = 1;
/*    */         } else {
/*    */           s3 = 0;
/*    */         } 
/*    */         O00(s3);
/*    */       case 0:
/*    */         break;
/*    */     } 
/*    */     short s1 = ((lpT6)super).ci, s3 = ((lpT6)super).IZ;
/*    */     wJ0.Nf0.uY = s1;
/*    */     wJ0.Nf0.Dk = s3;
/*    */     wJ0.Nf0.SD = s1;
/*    */     wJ0.Nf0.un = s3;
/*    */     wJ0.Nf0.Vo0 = 0;
/*    */     wJ0.Nf0.rs = 0L;
/*    */     wJ0.Nf0.vM = 0L;
/*    */     wJ0.Nf0.X2 = 0L;
/*    */     wJ0.Nf0.NuL = 0L;
/*    */     wJ0.Nf0.Gb = 0;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/lpT6.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */