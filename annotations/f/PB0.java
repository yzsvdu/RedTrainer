/* 1 */ package f;public final class PB0 implements con { public final void ng(Object paramObject, int paramInt, float[] paramArrayOffloat) { NC0 nC0 = (NC0)paramObject; if (paramInt != 1) { if (paramInt != 2) { if (paramInt != 3) { if (!fg0) throw new AssertionError();  } else { this.x = paramArrayOffloat[0]; this.y = paramArrayOffloat[1]; }  } else { this.y = paramArrayOffloat[0]; }  } else { this.x = paramArrayOffloat[0]; }
/*   */      }
/*   */ 
/*   */   
/*   */   public final int Uu0(Object paramObject, int paramInt, float[] paramArrayOffloat) {
/*   */     // Byte code:
/*   */     //   0: iload_2
/*   */     //   1: aload_1
/*   */     //   2: checkcast f/NC0
/*   */     //   5: astore_0
/*   */     //   6: iconst_1
/*   */     //   7: if_icmpeq -> 73
/*   */     //   10: iload_2
/*   */     //   11: iconst_2
/*   */     //   12: if_icmpeq -> 60
/*   */     //   15: iload_2
/*   */     //   16: iconst_3
/*   */     //   17: if_icmpeq -> 39
/*   */     //   20: getstatic f/PB0.fg0 : Z
/*   */     //   23: ifeq -> 31
/*   */     //   26: iconst_0
/*   */     //   27: istore_0
/*   */     //   28: goto -> 83
/*   */     //   31: new java/lang/AssertionError
/*   */     //   34: dup
/*   */     //   35: invokespecial <init> : ()V
/*   */     //   38: athrow
/*   */     //   39: aload_3
/*   */     //   40: aload_0
/*   */     //   41: aload_3
/*   */     //   42: aload_0
/*   */     //   43: getfield x : F
/*   */     //   46: iconst_0
/*   */     //   47: swap
/*   */     //   48: fastore
/*   */     //   49: getfield y : F
/*   */     //   52: iconst_1
/*   */     //   53: swap
/*   */     //   54: fastore
/*   */     //   55: iconst_2
/*   */     //   56: istore_0
/*   */     //   57: goto -> 83
/*   */     //   60: aload_3
/*   */     //   61: aload_0
/*   */     //   62: getfield y : F
/*   */     //   65: iconst_0
/*   */     //   66: swap
/*   */     //   67: fastore
/*   */     //   68: iconst_1
/*   */     //   69: istore_0
/*   */     //   70: goto -> 83
/*   */     //   73: aload_3
/*   */     //   74: aload_0
/*   */     //   75: getfield x : F
/*   */     //   78: iconst_0
/*   */     //   79: swap
/*   */     //   80: fastore
/*   */     //   81: iconst_1
/*   */     //   82: istore_0
/*   */     //   83: iload_0
/*   */     //   84: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 20
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/PB0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */