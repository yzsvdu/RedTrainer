/* 1 */ package f;public abstract class PN extends LPt3 { public final void yF() { Con con; Object object; SocketChannel socketChannel = this.Vn0; boolean bool = true; /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */ try {
/* 2 */       con
/* 3 */         .hr0.wakeup();
/* 4 */       this.oy0 = socketChannel.register(con.hr0, bool, this); return;
/*   */     } finally {
/* 6 */       this = null;
/*   */       /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
/*   */     }  }
/*   */ 
/*   */   
/*   */   public static final ik LY = C00.gd(PN.class);
/*   */   public boolean bW;
/*   */   public PublicKey jB0;
/*   */   public boolean xp;
/*   */   public boolean ao0;
/*   */   public ArrayDeque aF;
/*   */   public Sj0 YS;
/*   */   
/*   */   public PN(SocketChannel paramSocketChannel, Con paramCon, PublicKey paramPublicKey) {
/*   */     super(paramSocketChannel, paramCon);
/*   */     ArrayDeque arrayDeque;
/*   */     this.jB0 = null;
/*   */     this.xp = false;
/*   */     this.ao0 = false;
/*   */     this();
/*   */     this.aF = this;
/*   */     this.bW = true;
/*   */     this.jB0 = paramPublicKey;
/*   */   }
/*   */   
/*   */   public boolean iK0(ByteBuffer paramByteBuffer) {
/*   */     Rr0 rr0;
/*   */     Lpt5 lpt5 = null;
/*   */     byte b;
/*   */     if ((b = paramByteBuffer.get()) != 0) {
/*   */       if (b != 1) {
/*   */         if (b == 2 && !this.bW && this.ao0)
/*   */           this(b); 
/*   */       } else if (this.bW) {
/*   */         LPT4 lPT4;
/*   */         this(b);
/*   */       } 
/*   */     } else {
/*   */       if (!this.bW && !this.ao0)
/*   */         this(b); 
/*   */       this.ao0 = true;
/*   */     } 
/*   */     if (rr0 == null)
/*   */       return false; 
/*   */     rr0.Ws = paramByteBuffer;
/*   */     rr0.d = this;
/*   */     if (rr0.ZX())
/*   */       rr0.run(); 
/*   */     return true;
/*   */   }
/*   */   
/*   */   public boolean na0(ByteBuffer paramByteBuffer) {
/*   */     Object object;
/*   */     /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/lang/Object}, expression=ThisExpression{ObjectType{f/PN}}, name=kj0, descriptor=Ljava/lang/Object;}} */
/*   */     try {
/*   */       HY hY;
/*   */       if ((hY = this.aF.pollFirst()) == null)
/*   */         return false; 
/*   */       paramByteBuffer.putShort((short)0);
/*   */       paramByteBuffer.put((byte)hY.LPt4);
/*   */       hY.sr(paramByteBuffer);
/*   */       paramByteBuffer.flip();
/*   */       paramByteBuffer.putShort((short)paramByteBuffer.limit());
/*   */       paramByteBuffer.position(0);
/*   */       return true;
/*   */     } finally {
/*   */       this = null;
/*   */       /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
/*   */     } 
/*   */   }
/*   */   
/*   */   public final boolean mo0(ByteBuffer paramByteBuffer) {
/*   */     Sj0 sj0;
/*   */     (sj0 = this.YS).getClass();
/*   */     int i = paramByteBuffer.remaining(), j = paramByteBuffer.arrayOffset();
/*   */     j = paramByteBuffer.position() + j;
/*   */     byte[] arrayOfByte = paramByteBuffer.array();
/*   */     try {
/*   */       sj0.eb.update(arrayOfByte, j, i - sj0.pu.KB(), arrayOfByte, j);
/*   */     } catch (ShortBufferException shortBufferException) {
/*   */       Sj0.AN.error("", shortBufferException);
/*   */     } 
/*   */     paramByteBuffer.limit(paramByteBuffer.limit() - sj0.pu.KB());
/*   */     if (!((!sj0.pu.Sb0(arrayOfByte, j, i) ? false : false) ? 1 : 0)) {
/*   */       LY.warn("Wrong checksum: " + this);
/*   */       return false;
/*   */     } 
/*   */     return true;
/*   */   }
/*   */   
/*   */   public final int D1(ByteBuffer paramByteBuffer) {
/*   */     Sj0 sj0;
/*   */     (sj0 = this.YS).getClass();
/*   */     int i = paramByteBuffer.limit() - paramByteBuffer.position(), j = paramByteBuffer.arrayOffset();
/*   */     j = paramByteBuffer.position() + j;
/*   */     byte[] arrayOfByte = paramByteBuffer.array();
/*   */     try {
/*   */       this.gp0.update(arrayOfByte, j, i, arrayOfByte, j);
/*   */     } catch (ShortBufferException shortBufferException) {
/*   */       Sj0.AN.error("", shortBufferException);
/*   */     } 
/*   */     this.kt.on(arrayOfByte, j, i);
/*   */     i = this.kt.KB() + i;
/*   */     if (this.qj) {
/*   */       WG0();
/*   */       this.qj = false;
/*   */     } 
/*   */     return i;
/*   */   }
/*   */   
/*   */   public final void nb(HY paramHY) {
/*   */     Object object;
/*   */     /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/lang/Object}, expression=ThisExpression{ObjectType{f/PN}}, name=kj0, descriptor=Ljava/lang/Object;}} */
/*   */     try {
/*   */       if (kj())
/*   */         return; 
/*   */       this.aF.addLast(paramHY);
/*   */       return;
/*   */     } finally {
/*   */       this = null;
/*   */       /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
/*   */     } 
/*   */   }
/*   */   
/*   */   public abstract void lpt5(); }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/PN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */