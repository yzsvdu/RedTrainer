/* 1 */ package f;public final class IF extends dj { public final int hashCode() { int i = (super.hashCode() * 971 + this.Q5) * 971; i = (Float.floatToRawIntBits(this.bW) + i) * 971;
/*   */ 
/*   */     
/* 4 */     return (Float.floatToRawIntBits(this.d30) + i) * 971 + this.OP; }
/*   */ 
/*   */   
/*   */   public static final long kA0;
/*   */   public static long VE = kA0 = dj.tv0("depthStencil");
/*   */   public int Q5;
/*   */   public float bW;
/*   */   public float d30;
/*   */   public boolean OP;
/*   */   
/*   */   public static final boolean ky(long paramLong) {
/*   */     return ((paramLong & VE) != 0L);
/*   */   }
/*   */   
/*   */   public IF() {
/*   */     this(515);
/*   */   }
/*   */   
/*   */   public IF(boolean paramBoolean) {
/*   */     this(515, paramBoolean);
/*   */   }
/*   */   
/*   */   public IF(int paramInt) {
/*   */     this(paramInt, true);
/*   */   }
/*   */   
/*   */   public IF(int paramInt, boolean paramBoolean) {
/*   */     this(paramInt, 0.0F, 1.0F, paramBoolean);
/*   */   }
/*   */   
/*   */   public IF(int paramInt, float paramFloat1, float paramFloat2) {
/*   */     this(paramInt, paramFloat1, paramFloat2, true);
/*   */   }
/*   */   
/*   */   public IF(int paramInt, float paramFloat1, float paramFloat2, boolean paramBoolean) {
/*   */     this(kA0, paramInt, paramFloat1, paramFloat2, paramBoolean);
/*   */   }
/*   */   
/*   */   public IF(long paramLong, int paramInt, float paramFloat1, float paramFloat2, boolean paramBoolean) {
/*   */     super(paramLong);
/*   */     if (ky(paramLong)) {
/*   */       this.Q5 = paramInt;
/*   */       this.bW = paramFloat1;
/*   */       this.d30 = paramFloat2;
/*   */       this.OP = paramBoolean;
/*   */       return;
/*   */     } 
/*   */     throw new JU("Invalid type specified");
/*   */   }
/*   */   
/*   */   public IF(IF paramIF) {
/*   */     this(l, i, f1, f2, bool);
/*   */   }
/*   */   
/*   */   public final dj Mi0() {
/*   */     return new IF(this);
/*   */   }
/*   */   
/*   */   public final int compareTo(Object paramObject) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: aload_1
/*   */     //   2: checkcast f/dj
/*   */     //   5: astore_1
/*   */     //   6: getfield tL : J
/*   */     //   9: dup2
/*   */     //   10: lstore_2
/*   */     //   11: aload_1
/*   */     //   12: getfield tL : J
/*   */     //   15: dup2
/*   */     //   16: lstore #4
/*   */     //   18: lcmp
/*   */     //   19: ifeq -> 31
/*   */     //   22: lload_2
/*   */     //   23: lload #4
/*   */     //   25: lsub
/*   */     //   26: l2i
/*   */     //   27: istore_0
/*   */     //   28: goto -> 145
/*   */     //   31: aload_0
/*   */     //   32: aload_1
/*   */     //   33: checkcast f/IF
/*   */     //   36: astore_1
/*   */     //   37: getfield Q5 : I
/*   */     //   40: dup
/*   */     //   41: istore_2
/*   */     //   42: aload_1
/*   */     //   43: getfield Q5 : I
/*   */     //   46: dup
/*   */     //   47: istore_3
/*   */     //   48: if_icmpeq -> 58
/*   */     //   51: iload_2
/*   */     //   52: iload_3
/*   */     //   53: isub
/*   */     //   54: istore_0
/*   */     //   55: goto -> 145
/*   */     //   58: aload_0
/*   */     //   59: getfield OP : Z
/*   */     //   62: dup
/*   */     //   63: istore_2
/*   */     //   64: aload_1
/*   */     //   65: getfield OP : Z
/*   */     //   68: if_icmpeq -> 85
/*   */     //   71: iload_2
/*   */     //   72: ifeq -> 80
/*   */     //   75: iconst_m1
/*   */     //   76: istore_0
/*   */     //   77: goto -> 145
/*   */     //   80: iconst_1
/*   */     //   81: istore_0
/*   */     //   82: goto -> 145
/*   */     //   85: aload_0
/*   */     //   86: getfield bW : F
/*   */     //   89: aload_1
/*   */     //   90: getfield bW : F
/*   */     //   93: invokestatic JC0 : (FF)Z
/*   */     //   96: ifne -> 114
/*   */     //   99: aload_0
/*   */     //   100: getfield bW : F
/*   */     //   103: aload_1
/*   */     //   104: getfield bW : F
/*   */     //   107: fcmpg
/*   */     //   108: ifge -> 80
/*   */     //   111: goto -> 75
/*   */     //   114: aload_0
/*   */     //   115: getfield d30 : F
/*   */     //   118: aload_1
/*   */     //   119: getfield d30 : F
/*   */     //   122: invokestatic JC0 : (FF)Z
/*   */     //   125: ifne -> 143
/*   */     //   128: aload_0
/*   */     //   129: getfield d30 : F
/*   */     //   132: aload_1
/*   */     //   133: getfield d30 : F
/*   */     //   136: fcmpg
/*   */     //   137: ifge -> 80
/*   */     //   140: goto -> 75
/*   */     //   143: iconst_0
/*   */     //   144: istore_0
/*   */     //   145: iload_0
/*   */     //   146: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 6
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/IF.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */