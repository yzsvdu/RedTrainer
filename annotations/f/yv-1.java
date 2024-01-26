/* 1 */ package f;public abstract class yv extends JH implements Runnable { public final boolean ZX() { try { sM(); return true; }
/* 2 */     catch (BufferUnderflowException bufferUnderflowException2) { BufferUnderflowException bufferUnderflowException1; String str; int i; StackTraceElement[] arrayOfStackTraceElement; int j; byte b; for (str = null, i = -1, j = (arrayOfStackTraceElement = (bufferUnderflowException1 = null).getStackTrace()).length, b = 0; b < j; ) { StackTraceElement stackTraceElement = arrayOfStackTraceElement[b]; if (str == null && stackTraceElement.getClassName().equals(yv.class.getName())) str = stackTraceElement.getMethodName();  if (i < 0 && stackTraceElement.getClassName().equals(getClass().getName())) i = stackTraceElement.getLineNumber();  if (str != null && i != -1) break;  b++; }  if (str != null && i != -1) { wx
/*   */           
/* 4 */           .error("Buffer underflow for " + str + " " + this + ":" + i + " from " + this.d); } else { wx
/*   */           
/* 6 */           .error("Buffer underflow for packet (" + this + ") from " + this.d, bufferUnderflowException1); }  return false; }
/*   */     catch (Exception exception)
/*   */     { wx.error("Reading failed for packet " + this + " from " + this.d, exception);
/*   */       return false; }
/*   */      }
/*   */ 
/*   */   
/*   */   public static final ik wx = C00.gd(yv.class);
/*   */   public LPt3 d;
/*   */   public ByteBuffer Ws;
/*   */   
/*   */   public yv(ByteBuffer paramByteBuffer, int paramInt) {
/*   */     this(paramInt);
/*   */     this.Ws = paramByteBuffer;
/*   */   }
/*   */   
/*   */   public yv(int paramInt) {
/*   */     super(2, paramInt);
/*   */   }
/*   */   
/*   */   public final void lb(LPt3 paramLPt3) {
/*   */     this.d = paramLPt3;
/*   */   }
/*   */   
/*   */   public abstract void sM();
/*   */   
/*   */   public final int R00() {
/*   */     return this.Ws.get() & 0xFF;
/*   */   }
/*   */   
/*   */   public final int Gc0() {
/*   */     return this.Ws.getShort() & 0xFFFF;
/*   */   }
/*   */   
/*   */   public final String au() {
/*   */     this();
/*   */     StringBuilder stringBuilder;
/*   */     char c;
/*   */     while ((c = this.Ws.getChar()) != '\000')
/*   */       stringBuilder.append(c); 
/*   */     return stringBuilder.toString();
/*   */   }
/*   */   
/*   */   public final byte[] ee0(int paramInt) {
/*   */     this.Ws.get(new byte[paramInt]);
/*   */     return new byte[paramInt];
/*   */   }
/*   */   
/*   */   public final z5 bI() {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: invokevirtual R00 : ()I
/*   */     //   4: iconst_4
/*   */     //   5: if_icmpne -> 25
/*   */     //   8: aload_0
/*   */     //   9: getfield Ws : Ljava/nio/ByteBuffer;
/*   */     //   12: invokevirtual getInt : ()I
/*   */     //   15: istore_0
/*   */     //   16: new f/o80
/*   */     //   19: dup
/*   */     //   20: iload_0
/*   */     //   21: invokespecial <init> : (I)V
/*   */     //   24: areturn
/*   */     //   25: aload_0
/*   */     //   26: dup
/*   */     //   27: getfield Ws : Ljava/nio/ByteBuffer;
/*   */     //   30: invokevirtual getLong : ()J
/*   */     //   33: lstore_1
/*   */     //   34: getfield Ws : Ljava/nio/ByteBuffer;
/*   */     //   37: invokevirtual getLong : ()J
/*   */     //   40: lstore_3
/*   */     //   41: new f/Eb0
/*   */     //   44: dup
/*   */     //   45: lload_1
/*   */     //   46: lload_3
/*   */     //   47: invokespecial <init> : (JJ)V
/*   */     //   50: areturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 9
/*   */     //   #2	-> 16
/*   */     //   #3	-> 27
/*   */     //   #4	-> 34
/*   */     //   #5	-> 41
/*   */   }
/*   */   
/*   */   public abstract void Cx(); }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/yv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */