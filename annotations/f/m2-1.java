/* 1 */ package f;public final class m2 implements con { public final void ng(Object paramObject, int paramInt, float[] paramArrayOffloat) { Color color = (Color)paramObject; if (paramInt != 0) { if (!nQ) throw new AssertionError();  } else { float f1 = paramArrayOffloat[0], f2 = paramArrayOffloat[1], f3 = paramArrayOffloat[2], f4 = paramArrayOffloat[3]; set(f1, f2, f3, f4); }
/*   */      }
/*   */ 
/*   */   
/*   */   public final int Uu0(Object paramObject, int paramInt, float[] paramArrayOffloat) {
/*   */     // Byte code:
/*   */     //   0: iload_2
/*   */     //   1: aload_1
/*   */     //   2: checkcast com/badlogic/gdx/graphics/Color
/*   */     //   5: astore_0
/*   */     //   6: ifeq -> 28
/*   */     //   9: getstatic f/m2.nQ : Z
/*   */     //   12: ifeq -> 20
/*   */     //   15: iconst_0
/*   */     //   16: istore_0
/*   */     //   17: goto -> 62
/*   */     //   20: new java/lang/AssertionError
/*   */     //   23: dup
/*   */     //   24: invokespecial <init> : ()V
/*   */     //   27: athrow
/*   */     //   28: aload_3
/*   */     //   29: aload_0
/*   */     //   30: aload_3
/*   */     //   31: aload_0
/*   */     //   32: aload_3
/*   */     //   33: aload_0
/*   */     //   34: aload_3
/*   */     //   35: aload_0
/*   */     //   36: getfield r : F
/*   */     //   39: iconst_0
/*   */     //   40: swap
/*   */     //   41: fastore
/*   */     //   42: getfield g : F
/*   */     //   45: iconst_1
/*   */     //   46: swap
/*   */     //   47: fastore
/*   */     //   48: getfield b : F
/*   */     //   51: iconst_2
/*   */     //   52: swap
/*   */     //   53: fastore
/*   */     //   54: getfield a : F
/*   */     //   57: iconst_3
/*   */     //   58: swap
/*   */     //   59: fastore
/*   */     //   60: iconst_4
/*   */     //   61: istore_0
/*   */     //   62: iload_0
/*   */     //   63: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 9
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/m2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */