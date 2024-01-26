/*  1 */ package f;public final class xf extends Kl0 { public final void sM() { mG mG; if ((mG = (r8()).Wn0) != null);
/*    */ 
/*    */     
/*  4 */     if (R00() == 1) { b = 1; } else { b = 0; }  byte b; ON[] arrayOfON; for (this.sv0 = b, this.UP = new ON[R00()], b = 0; b < (arrayOfON = this.UP).length; ) {
/*    */       boolean bool;
/*    */ 
/*    */       
/*  8 */       jv jv = jv.LD(this.Ws.get());
/*  9 */       (new ON(this.Ws.getInt(), jv, this.Ws.getInt()))
/* 10 */         .Cq(k60()); arrayOfON[b] = new ON(this.Ws.getInt(), jv, this.Ws.getInt());
/* 11 */       ON oN = this.UP[b]; if (R00() == 1) { bool = true; } else { bool = false; }  oN
/* 12 */         .ZC = bool; b++;
/*    */     }  }
/*    */ 
/*    */   
/*    */   public boolean sv0;
/*    */   public ON[] UP;
/*    */   
/*    */   public xf(c4 paramc4, ByteBuffer paramByteBuffer) {
/*    */     super(paramc4, paramByteBuffer);
/*    */   }
/*    */   
/*    */   public final void Cx() {
/*    */     mG mG;
/*    */     if ((mG = (r8()).Wn0) == null)
/*    */       return; 
/*    */     /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{f/Ut0}, name=null} */
/*    */     if (this.sv0) {
/*    */       Ut0 ut0;
/*    */       try {
/*    */         mG.Aux.clear();
/*    */       } finally {
/*    */         this = null;
/*    */         /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{f/Ut0}, name=null} */
/*    */       } 
/*    */     } 
/*    */     ON[] arrayOfON;
/*    */     int i;
/*    */     byte b;
/*    */     for (i = (arrayOfON = this.UP).length, b = 0; b < i; ) {
/*    */       Ut0 ut0;
/*    */       ON oN = arrayOfON[b];
/*    */       /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{f/Ut0}, name=null} */
/*    */       try {
/*    */         mG.Aux.A3(oN.Y90, oN);
/*    */         /* monitor exit BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{f/Ut0}, name=null} = FieldReferenceExpression{lastType=ObjectType{f/Ut0}, expression=ClassFileLocalVariableReferenceExpression{type=ObjectType{f/mG}, name=null}, name=Aux, descriptor=Lf/Ut0;}} */
/*    */       } finally {
/*    */         this = null;
/*    */         /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{f/Ut0}, name=null} */
/*    */       } 
/*    */     } 
/*    */     r8().ng();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/xf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */