/* 1 */ package f;public final class LPT9 extends dj { public final int hashCode() { int i = super.hashCode() * 977; return Float.floatToRawIntBits(this.dy0) + i; }
/*   */ 
/*   */   
/*   */   public static final long ft0 = dj.tv0("shininess");
/*   */   public static final long It0 = dj.tv0("alphaTest");
/*   */   public float dy0;
/*   */   
/*   */   public LPT9(long paramLong) {
/*   */     super(paramLong);
/*   */   }
/*   */   
/*   */   public LPT9(long paramLong, float paramFloat) {
/*   */     super(paramLong);
/*   */     this.dy0 = paramFloat;
/*   */   }
/*   */   
/*   */   public final dj Mi0() {
/*   */     long l = this.tL;
/*   */     float f = this.dy0;
/*   */     return new LPT9(l, f);
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
/*   */     //   28: goto -> 71
/*   */     //   31: aload_0
/*   */     //   32: aload_1
/*   */     //   33: checkcast f/LPT9
/*   */     //   36: getfield dy0 : F
/*   */     //   39: fstore_1
/*   */     //   40: getfield dy0 : F
/*   */     //   43: fload_1
/*   */     //   44: invokestatic JC0 : (FF)Z
/*   */     //   47: ifeq -> 55
/*   */     //   50: iconst_0
/*   */     //   51: istore_0
/*   */     //   52: goto -> 71
/*   */     //   55: aload_0
/*   */     //   56: getfield dy0 : F
/*   */     //   59: fload_1
/*   */     //   60: fcmpg
/*   */     //   61: ifge -> 69
/*   */     //   64: iconst_m1
/*   */     //   65: istore_0
/*   */     //   66: goto -> 71
/*   */     //   69: iconst_1
/*   */     //   70: istore_0
/*   */     //   71: iload_0
/*   */     //   72: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 6
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/LPT9.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */