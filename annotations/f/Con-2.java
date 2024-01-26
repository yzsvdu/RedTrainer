/* 1 */ package f;public abstract class Con extends Thread { public static final ik hx0 = C00.gd(Con.class); public AbstractSelector hr0 = SelectorProvider.provider().openSelector(); public final gL0 lPt9; public final Object s90 = new Object(); public int fm = 1; public int j8 = 50; public final void run() { while (!this.Com3) { try { ok0(); if (!(this instanceof Vz))
/* 2 */           try { Thread.sleep(this.fm); } catch (InterruptedException interruptedException) {}  synchronized (this.s90) { if (this.lPt5 < System.currentTimeMillis()) { Bg(); this.lPt5 = System.currentTimeMillis() + 60000L; }  }  } catch (Exception exception) { hx0.error("Dispatch error", exception); }  }  }
/* 3 */   public boolean Com3 = false; public long lPt5 = 0L; public Con(String paramString, gL0 paramgL0) { super(paramString); this.lPt9 = paramgL0; } public static void kp0(SelectionKey paramSelectionKey) { try { bo0.Av(paramSelectionKey.attachment()); throw null; } catch (Exception exception) { hx0.error("Error while accepting connection: +" + exception, exception); return; }  } public abstract void xl(LPt3 paramLPt3); public abstract void ok0(); public final void ad(SelectionKey paramSelectionKey) { LPt3 lPt3; ByteBuffer byteBuffer1 = (lPt3 = (LPt3)paramSelectionKey.attachment()).UM, byteBuffer2 = ((LPt3)paramSelectionKey.attachment()).ZD; try { int i; if ((i = ((SocketChannel)paramSelectionKey.channel()).read(byteBuffer1)) == -1) { dX(lPt3); return; }  if (i == 0) { dX(lPt3); hx0.info(B40.df("Read 0 ").append(lPt3.he0).toString()); return; }  byteBuffer1
/* 4 */         .flip(); if (!lPt3.Zi) lPt3.Zi = true;  while (byteBuffer1.remaining() > 2 && byteBuffer1.remaining() >= byteBuffer1.getShort(byteBuffer1.position())) { boolean bool; i = 0; 
/* 5 */         try { if ((i = byteBuffer1.getShort()) > 1) i = (short)(i - 2);  if (i < 1) { LPt3.C6.warn("Invalid packet size from client : " + lPt3 + " packet size: " + i + " real size:" + byteBuffer1.remaining()); i = 0; } else { byteBuffer2.limit(byteBuffer1.position() + i).position(byteBuffer1.position()); byteBuffer1.position(byteBuffer1.position() + i);
/* 6 */             System.currentTimeMillis(); lPt3.getClass();
/* 7 */             bool = lPt3.iK0(byteBuffer2); }  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { LPt3.C6.warn("Error on parsing input from client1 : " + lPt3 + " packet size: " + bool + " real size:" + byteBuffer1.remaining(), indexOutOfBoundsException); bool = false; } catch (IllegalArgumentException illegalArgumentException) { LPt3.C6.warn("Error on parsing input from client2 : " + lPt3 + " packet size: " + bool + " real size:" + byteBuffer1.remaining(), illegalArgumentException); bool = false; } catch (Exception exception) { LPt3.C6.error("Error on parsing input from client3 : " + lPt3 + " packet size: " + bool + " real size:" + byteBuffer1.remaining(), exception); bool = false; }  if (!bool)
/* 8 */         { dX(lPt3); break; }  }  if (byteBuffer1
/* 9 */         .hasRemaining()) { lPt3.UM.compact(); } else { byteBuffer1.clear(); }  return; } catch (IOException iOException) { dX(lPt3); return; }  } public final void dX(LPt3 paramLPt3) { Object object; /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/lang/Object}, expression=ClassFileLocalVariableReferenceExpression{type=ObjectType{f/LPt3}, name=paramLPt3}, name=kj0, descriptor=Ljava/lang/Object;}} */ try { return; } finally { this = null;
/*   */       /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */ }
/*   */      }
/*   */ 
/*   */   
/*   */   public final void prn(SelectionKey paramSelectionKey) {
/*   */     SocketChannel socketChannel = (SocketChannel)paramSelectionKey.channel();
/*   */     LPt3 lPt3;
/*   */     ByteBuffer byteBuffer;
/*   */     if ((byteBuffer = (lPt3 = (LPt3)paramSelectionKey.attachment()).Qw).hasRemaining())
/*   */       try {
/*   */         if (socketChannel.write(byteBuffer) == 0)
/*   */           return; 
/*   */         if (byteBuffer.hasRemaining())
/*   */           return; 
/*   */       } catch (IOException iOException) {
/*   */         dX(lPt3);
/*   */         return;
/*   */       }  
/*   */     while (true) {
/*   */       byteBuffer.clear();
/*   */       try {
/*   */       
/*   */       } catch (Exception exception) {
/*   */         hx0.error(B40.df("Write Error: ").append(lPt3.he0).toString(), exception);
/*   */       } catch (StackOverflowError stackOverflowError) {}
/*   */       if (true) {
/*   */         Object object;
/*   */         byteBuffer.limit(0);
/*   */         /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/lang/Object}, expression=ClassFileLocalVariableReferenceExpression{type=ObjectType{f/LPt3}, name=null}, name=kj0, descriptor=Ljava/lang/Object;}} */
/*   */         try {
/*   */           return;
/*   */         } finally {
/*   */           this = null;
/*   */           /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
/*   */         } 
/*   */       } 
/*   */       try {
/*   */         if (socketChannel.write(byteBuffer) == 0)
/*   */           return; 
/*   */         if (byteBuffer.hasRemaining())
/*   */           return; 
/*   */       } catch (IOException iOException) {
/*   */         dX(lPt3);
/*   */         break;
/*   */       } 
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void Bk() {
/*   */     synchronized (this.s90) {
/*   */       for (Iterator<SelectionKey> iterator = this.hr0.keys().iterator(); iterator.hasNext();) {
/*   */         if ((selectionKey = iterator.next()).attachment() instanceof LPt3)
/*   */           ((LPt3)selectionKey.attachment()).Wg(); 
/*   */       } 
/*   */       /* monitor exit ThisExpression{ObjectType{java/lang/Object}} */
/*   */       return;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void Bg() {
/*   */     try {
/*   */       Iterator<SelectionKey> iterator = this.hr0.keys().iterator();
/*   */       while (hasNext()) {
/*   */         SelectionKey selectionKey;
/*   */         if ((selectionKey = (SelectionKey)next()).isValid() && selectionKey.attachment() != null && selectionKey.attachment() instanceof LPt3)
/*   */           ((LPt3)selectionKey.attachment()).dC0(); 
/*   */       } 
/*   */     } catch (ConcurrentModificationException concurrentModificationException) {
/*   */       hx0.error("disconnectTask Error", this);
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Con.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */