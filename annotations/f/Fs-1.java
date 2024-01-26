/* 1 */ package f;public final class Fs { public final boolean n60() { byte b = 0; return (this.DP && yy0() + b < 1); }
/*   */ 
/*   */   
/*   */   public int Qe = 0;
/*   */   public boolean DP = false;
/*   */   public int zz = 0;
/*   */   public int jt0 = 0;
/*   */   public int js0 = -1;
/*   */   
/*   */   static {
/*   */     C00.gd(Fs.class);
/*   */   }
/*   */   
/*   */   public final int yy0() {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield DP : Z
/*   */     //   4: ifeq -> 51
/*   */     //   7: aload_0
/*   */     //   8: getfield jt0 : I
/*   */     //   11: invokestatic currentTimeMillis : ()J
/*   */     //   14: ldc2_w 1000
/*   */     //   17: ldiv
/*   */     //   18: aload_0
/*   */     //   19: getfield zz : I
/*   */     //   22: i2l
/*   */     //   23: lsub
/*   */     //   24: l2i
/*   */     //   25: isub
/*   */     //   26: dup
/*   */     //   27: istore_1
/*   */     //   28: ifge -> 33
/*   */     //   31: iconst_0
/*   */     //   32: istore_1
/*   */     //   33: aload_0
/*   */     //   34: getfield js0 : I
/*   */     //   37: dup
/*   */     //   38: istore_0
/*   */     //   39: ifle -> 49
/*   */     //   42: iload_1
/*   */     //   43: iload_0
/*   */     //   44: if_icmple -> 49
/*   */     //   47: iload_0
/*   */     //   48: istore_1
/*   */     //   49: iload_1
/*   */     //   50: ireturn
/*   */     //   51: aload_0
/*   */     //   52: getfield jt0 : I
/*   */     //   55: dup
/*   */     //   56: istore_0
/*   */     //   57: ifge -> 62
/*   */     //   60: iconst_0
/*   */     //   61: ireturn
/*   */     //   62: iload_0
/*   */     //   63: ireturn
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Fs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */