/*  1 */ package f;public final class Mc0 extends Kl0 { public final void sM() { int i; if ((i = this.LPt4) < 224) { this
/*  2 */         .LPt4 = 239; i = 239; }  this
/*    */       
/*  4 */       .PK0 = this.Ws.getInt(); if ((i & 0x1) != 0) this
/*    */         
/*  6 */         .bp = this.Ws.get();  if ((i & 0x2) != 0) { this
/*    */         
/*  8 */         .Ir0 = this.Ws.get();
/*    */       
/* 10 */       this.l50 = this.Ws.get(); }  if ((i & 0x4) != 0) { this
/*    */         
/* 12 */         .XF0 = this.Ws.getShort();
/*    */       
/* 14 */       this.tD = this.Ws.getShort(); } else { this
/*    */         
/* 16 */         .XF0 = (short)this.Ws.get();
/*    */       
/* 18 */       this.tD = (short)this.Ws.get(); }  if ((i & 0x8) != 0) { this
/*    */         
/* 20 */         .oo0 = this.Ws.get(); } else { this.oo0 = 0; }  this
/*    */       
/* 22 */       .F6 = this.Ws.get(); }
/*    */ 
/*    */   
/*    */   public int PK0;
/*    */   public byte bp;
/*    */   public byte Ir0;
/*    */   public byte l50;
/*    */   public short XF0;
/*    */   public short tD;
/*    */   public byte oo0;
/*    */   public byte F6;
/*    */   
/*    */   public Mc0(c4 paramc4, ByteBuffer paramByteBuffer) {
/*    */     super(paramc4, paramByteBuffer);
/*    */   }
/*    */   
/*    */   public final void Cx() {
/*    */     tc tc;
/*    */     if ((tc = (r8()).Qa.Xb(this.PK0)) == null)
/*    */       return; 
/*    */     byte b2, b3 = (byte)((b2 = this.F6) & 0x3);
/*    */     if ((this.F6 & 0x8) != 0) {
/*    */       bool = true;
/*    */     } else {
/*    */       bool = false;
/*    */     } 
/*    */     int i;
/*    */     if (((i = this.LPt4) & 0x1) == 0)
/*    */       this.bp = tc.HW.FB; 
/*    */     if ((i & 0x2) == 0) {
/*    */       G5 g51;
/*    */       this.Ir0 = (g51 = tc.HW).kD0;
/*    */       this.l50 = g51.vu0;
/*    */     } 
/*    */     byte b1 = this.bp;
/*    */     i = this.Ir0;
/*    */     byte b4 = this.l50;
/*    */     short s1 = this.XF0, s2 = this.tD;
/*    */     byte b5 = this.oo0;
/*    */     this(b1, i, b4, bool, s1, s2, b5, b3);
/*    */     d7 d7;
/*    */     G5 g5;
/*    */     LinkedList linkedList;
/*    */     boolean bool;
/*    */     /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/LinkedList}, name=null} */
/*    */     try {
/*    */       return;
/*    */     } finally {
/*    */       d7 = null;
/*    */       /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/LinkedList}, name=null} */
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Mc0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */