/* 1 */ package f;public final class c4 extends PN { public final ArrayDeque IN; public final Inflater ry0; public int VL0; public ro cOm8; public final boolean iK0(ByteBuffer paramByteBuffer) { if (this.VL0 == 1) return super.iK0(paramByteBuffer);  if (!mo0(paramByteBuffer)) { Sa(); return false; }  Kl0 kl0; if ((kl0 = COM7.qe(paramByteBuffer, this, false)) != null && 
/* 2 */       ZX())
/* 3 */       try { Dl0(); } finally { paramByteBuffer = null; }
/* 4 */         return true; } public ScheduledFuture Pi; public CK bC0; public c4(SocketChannel paramSocketChannel, Con paramCon, ro paramro, CK paramCK) { super(paramSocketChannel, paramCon, this); ArrayDeque arrayDeque; Inflater inflater; Sj0 sj0; this(); this.IN = this; this(true); this.ry0 = this; this.VL0 = 1; this((byte)4); this.YS = this; this.cOm8 = paramro; this.bC0 = paramCK; yF(); } static { C00.gd(c4.class); } public final boolean na0(ByteBuffer paramByteBuffer) { Object object; /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/lang/Object}, expression=ThisExpression{ObjectType{f/c4}}, name=kj0, descriptor=Ljava/lang/Object;}} */ try { if (this.VL0 == 1) return super.na0(paramByteBuffer);  Bi bi; if ((bi = this.IN.pollFirst()) == null) return false;  paramByteBuffer.putShort((short)0); paramByteBuffer.put((byte)bi.LPt4); bi.mL(this, paramByteBuffer); paramByteBuffer.flip(); paramByteBuffer.putShort((short)0); short s = (short)(D1(paramByteBuffer) + 2); paramByteBuffer.putShort(0, s); return true; }
/* 5 */     finally { this = null; /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */ }  } public final boolean xo0() { if (this.VL0 == 1) return this.aF.isEmpty() ^ true;  return this.IN.isEmpty() ^ true; } public final void xt() { ScheduledFuture scheduledFuture; if ((scheduledFuture = this.Pi) != null) { scheduledFuture.cancel(false); this.Pi = null; }  this.ry0.end(); if (this.VL0 == 1) { this.bC0.P3(this); return; }  this.cOm8.XQ = true; } public final void lpt5() { this.aF = null; this.VL0 = 2; W3(new MR()); Runnable runnable = this::J00; A1.L7.getClass(); long l1 = 60000L, l2 = 15000L; 
/* 6 */     try { TimeUnit timeUnit = TimeUnit.MILLISECONDS; ScheduledFuture<?> scheduledFuture = A1.L7.nc.scheduleAtFixedRate(runnable, l2, l1, timeUnit); } catch (RejectedExecutionException rejectedExecutionException) { runnable = null; }  this
/* 7 */       .Pi = (ScheduledFuture)runnable; }
/*   */ 
/*   */   
/*   */   public final void Wg() {
/*   */     Sa();
/*   */   }
/*   */   
/*   */   public final void W3(Bi paramBi) {
/*   */     Object object;
/*   */     if (Bz.rK0 > 0) {
/*   */       A1.L7.ac0(() -> {
/*   */             Object object;
/*   */             /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/lang/Object}, expression=ThisExpression{ObjectType{f/c4}}, name=kj0, descriptor=Ljava/lang/Object;}} */
/*   */             try {
/*   */               if (kj())
/*   */                 return; 
/*   */               this.IN.addLast(paramBi);
/*   */               return;
/*   */             } finally {
/*   */               this = null;
/*   */               /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
/*   */             } 
/*   */           }Bz.rK0);
/*   */       return;
/*   */     } 
/*   */     /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/lang/Object}, expression=ThisExpression{ObjectType{f/c4}}, name=kj0, descriptor=Ljava/lang/Object;}} */
/*   */     try {
/*   */       if (kj())
/*   */         return; 
/*   */       this.IN.addLast(paramBi);
/*   */       return;
/*   */     } finally {
/*   */       this = null;
/*   */       /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void dC0() {}
/*   */   
/*   */   public final void J00() {
/*   */     if (kj()) {
/*   */       ScheduledFuture scheduledFuture;
/*   */       if ((scheduledFuture = this.Pi) != null) {
/*   */         scheduledFuture.cancel(false);
/*   */         this.Pi = null;
/*   */       } 
/*   */       return;
/*   */     } 
/*   */     if (this.VL0 != 1) {
/*   */       ne ne;
/*   */       this();
/*   */       W3(this);
/*   */       System.currentTimeMillis();
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/c4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */