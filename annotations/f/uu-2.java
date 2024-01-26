/* 1 */ package f;public final class uu extends dj { public static final long N1 = dj.tv0("directionalLights"); public final fQ GE = new fQ(1); public final dj Mi0() { return new uu(this); } public uu() { super(N1); } public uu(uu paramuu) { this(); this.GE.OG0(paramuu.GE); } public final int hashCode() { // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: dup
/*   */     //   2: invokespecial hashCode : ()I
/*   */     //   5: istore_0
/*   */     //   6: getfield GE : Lf/fQ;
/*   */     //   9: invokevirtual r30 : ()Lf/Hc0;
/*   */     //   12: astore_1
/*   */     //   13: aload_1
/*   */     //   14: invokevirtual hasNext : ()Z
/*   */     //   17: ifeq -> 55
/*   */     //   20: aload_1
/*   */     //   21: invokevirtual next : ()Ljava/lang/Object;
/*   */     //   24: checkcast f/vm
/*   */     //   27: dup
/*   */     //   28: astore_2
/*   */     //   29: iload_0
/*   */     //   30: sipush #1229
/*   */     //   33: imul
/*   */     //   34: istore_0
/*   */     //   35: ifnonnull -> 43
/*   */     //   38: iconst_0
/*   */     //   39: istore_2
/*   */     //   40: goto -> 48
/*   */     //   43: aload_2
/*   */     //   44: invokevirtual hashCode : ()I
/*   */     //   47: istore_2
/*   */     //   48: iload_0
/*   */     //   49: iload_2
/*   */     //   50: iadd
/*   */     //   51: istore_0
/*   */     //   52: goto -> 13
/*   */     //   55: iload_0
/* 1 */     //   56: ireturn } public final int compareTo(Object paramObject) { dj dj1 = (dj)paramObject; int i; if ((i = this.tL cmp this.tL) != 0) { if (i < 0) { i = -1; } else { i = 1; }  } else { i = 0; }  return i; }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/uu.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */