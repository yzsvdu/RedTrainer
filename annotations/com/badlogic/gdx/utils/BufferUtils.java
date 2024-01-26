/* 1 */ package com.badlogic.gdx.utils;public final class BufferUtils { public static fQ sK0 = new fQ(); public static int IK0(Buffer paramBuffer) { if (paramBuffer instanceof ByteBuffer) return paramBuffer.position();  if (paramBuffer instanceof java.nio.ShortBuffer) return paramBuffer.position() << 1;  if (paramBuffer instanceof java.nio.CharBuffer) return paramBuffer.position() << 1;  if (paramBuffer instanceof IntBuffer) return paramBuffer.position() << 2;  if (paramBuffer instanceof java.nio.LongBuffer) return paramBuffer.position() << 3;  if (paramBuffer instanceof FloatBuffer) return paramBuffer.position() << 2;  if (paramBuffer instanceof java.nio.DoubleBuffer) return paramBuffer.position() << 3;  throw new JU(B40.df("Can't copy to a ")
/* 2 */         .append(paramBuffer.getClass().getName()).append(" instance").toString()); } public static int Ri0 = 0; public static void BA0(float[] paramArrayOffloat, Buffer paramBuffer, int paramInt1, int paramInt2) { if (paramBuffer instanceof ByteBuffer) { paramBuffer.limit(paramInt1 << 2); } else if (paramBuffer instanceof FloatBuffer) { paramBuffer.limit(paramInt1); }  copyJni(paramArrayOffloat, paramBuffer, paramInt1, paramInt2); paramBuffer.position(0); } public static int LQ(Buffer paramBuffer, int paramInt) { if (paramBuffer instanceof ByteBuffer) return paramInt;  if (paramBuffer instanceof java.nio.ShortBuffer) return paramInt >>> 1;  if (paramBuffer instanceof java.nio.CharBuffer) return paramInt >>> 1;  if (paramBuffer instanceof IntBuffer) return paramInt >>> 2;  if (paramBuffer instanceof java.nio.LongBuffer) return paramInt >>> 3;  if (paramBuffer instanceof FloatBuffer) return paramInt >>> 2;  if (paramBuffer instanceof java.nio.DoubleBuffer) return paramInt >>> 3;  throw new JU(B40.df("Can't copy to a ").append(paramBuffer.getClass().getName()).append(" instance").toString()); }
/*   */ 
/*   */   
/*   */   public static ByteBuffer ar(int paramInt) {
/*   */     ByteBuffer.allocateDirect(paramInt).order(ByteOrder.nativeOrder());
/*   */     return ByteBuffer.allocateDirect(paramInt);
/*   */   }
/*   */   
/*   */   public static IntBuffer mt0(int paramInt) {
/*   */     ByteBuffer.allocateDirect(paramInt * 4).order(ByteOrder.nativeOrder());
/*   */     return ByteBuffer.allocateDirect(paramInt * 4).asIntBuffer();
/*   */   }
/*   */   
/*   */   public static void lf(ByteBuffer paramByteBuffer) {
/*   */     int i = paramByteBuffer.capacity();
/*   */     synchronized (sK0) {
/*   */       if (sK0.Ct(paramByteBuffer, true)) {
/*   */         Ri0 -= i;
/*   */         freeMemory(paramByteBuffer);
/*   */         return;
/*   */       } 
/*   */       throw new IllegalArgumentException("buffer not allocated with newUnsafeByteBuffer or already disposed");
/*   */     } 
/*   */   }
/*   */   
/*   */   public static ByteBuffer xz(int paramInt) {
/*   */     ByteBuffer byteBuffer;
/*   */     (byteBuffer = newDisposableByteBuffer(paramInt)).order(ByteOrder.nativeOrder());
/*   */     Ri0 += paramInt;
/*   */     synchronized (sK0) {
/*   */       sK0.Com3(byteBuffer);
/*   */       /* monitor exit FieldReferenceExpression{lastType=ObjectType{f/fQ}, expression=ObjectTypeReferenceExpression{ObjectType{com/badlogic/gdx/utils/BufferUtils}}, name=sK0, descriptor=Lf/fQ;} */
/*   */       return newDisposableByteBuffer(paramInt);
/*   */     } 
/*   */   }
/*   */   
/*   */   private static native void freeMemory(ByteBuffer paramByteBuffer);
/*   */   
/*   */   private static native ByteBuffer newDisposableByteBuffer(int paramInt);
/*   */   
/*   */   public static native void clear(ByteBuffer paramByteBuffer, int paramInt);
/*   */   
/*   */   private static native void copyJni(float[] paramArrayOffloat, Buffer paramBuffer, int paramInt1, int paramInt2);
/*   */   
/*   */   private static native void copyJni(byte[] paramArrayOfbyte, int paramInt1, Buffer paramBuffer, int paramInt2, int paramInt3);
/*   */   
/*   */   private static native void copyJni(Buffer paramBuffer1, int paramInt1, Buffer paramBuffer2, int paramInt2, int paramInt3);
/*   */   
/*   */   public static void Nx(byte[] paramArrayOfbyte, ByteBuffer paramByteBuffer, int paramInt) {
/*   */     int i = paramByteBuffer.position();
/*   */     paramByteBuffer.limit(LQ(paramByteBuffer, paramInt) + i);
/*   */     i = IK0(paramByteBuffer);
/*   */     copyJni(paramArrayOfbyte, 0, paramByteBuffer, i, paramInt);
/*   */   }
/*   */   
/*   */   public static void Of0(ByteBuffer paramByteBuffer, Buffer paramBuffer, int paramInt) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: instanceof java/nio/ByteBuffer
/*   */     //   4: ifeq -> 10
/*   */     //   7: goto -> 79
/*   */     //   10: aload_0
/*   */     //   11: instanceof java/nio/ShortBuffer
/*   */     //   14: ifeq -> 20
/*   */     //   17: goto -> 27
/*   */     //   20: aload_0
/*   */     //   21: instanceof java/nio/CharBuffer
/*   */     //   24: ifeq -> 34
/*   */     //   27: iload_2
/*   */     //   28: iconst_1
/*   */     //   29: ishl
/*   */     //   30: istore_2
/*   */     //   31: goto -> 79
/*   */     //   34: aload_0
/*   */     //   35: instanceof java/nio/IntBuffer
/*   */     //   38: ifeq -> 44
/*   */     //   41: goto -> 61
/*   */     //   44: aload_0
/*   */     //   45: instanceof java/nio/LongBuffer
/*   */     //   48: ifeq -> 54
/*   */     //   51: goto -> 75
/*   */     //   54: aload_0
/*   */     //   55: instanceof java/nio/FloatBuffer
/*   */     //   58: ifeq -> 68
/*   */     //   61: iload_2
/*   */     //   62: iconst_2
/*   */     //   63: ishl
/*   */     //   64: istore_2
/*   */     //   65: goto -> 79
/*   */     //   68: aload_0
/*   */     //   69: instanceof java/nio/DoubleBuffer
/*   */     //   72: ifeq -> 115
/*   */     //   75: iload_2
/*   */     //   76: iconst_3
/*   */     //   77: ishl
/*   */     //   78: istore_2
/*   */     //   79: aload_0
/*   */     //   80: aload_1
/*   */     //   81: aload_0
/*   */     //   82: aload_1
/*   */     //   83: dup
/*   */     //   84: iload_2
/*   */     //   85: aload_1
/*   */     //   86: invokevirtual position : ()I
/*   */     //   89: istore_0
/*   */     //   90: invokestatic LQ : (Ljava/nio/Buffer;I)I
/*   */     //   93: iload_0
/*   */     //   94: iadd
/*   */     //   95: invokevirtual limit : (I)Ljava/nio/Buffer;
/*   */     //   98: pop
/*   */     //   99: invokestatic IK0 : (Ljava/nio/Buffer;)I
/*   */     //   102: istore_0
/*   */     //   103: invokestatic IK0 : (Ljava/nio/Buffer;)I
/*   */     //   106: istore_3
/*   */     //   107: iload_0
/*   */     //   108: aload_1
/*   */     //   109: iload_3
/*   */     //   110: iload_2
/*   */     //   111: invokestatic copyJni : (Ljava/nio/Buffer;ILjava/nio/Buffer;II)V
/*   */     //   114: return
/*   */     //   115: new f/JU
/*   */     //   118: dup
/*   */     //   119: ldc 'Can't copy to a '
/*   */     //   121: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   124: aload_0
/*   */     //   125: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   128: invokevirtual getName : ()Ljava/lang/String;
/*   */     //   131: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   134: ldc ' instance'
/*   */     //   136: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   139: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   142: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   145: athrow
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 1
/*   */     //   #2	-> 86
/*   */     //   #3	-> 115
/*   */     //   #4	-> 119
/*   */     //   #5	-> 125
/*   */   }
/*   */   
/*   */   public static FloatBuffer Sg() {
/*   */     ByteBuffer.allocateDirect(64).order(ByteOrder.nativeOrder());
/*   */     return ByteBuffer.allocateDirect(64).asFloatBuffer();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/utils/BufferUtils.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */