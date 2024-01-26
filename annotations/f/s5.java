/* 1 */ package f;public final class s5 extends dj { public final dj Mi0() { long l = this.tL; Color color = this.lx; return new s5(l, this); }
/*   */ 
/*   */   
/*   */   public static final long DR = dj.tv0("overlayColor");
/*   */   public final Color lx = new Color();
/*   */   
/*   */   public static final boolean lL0(long paramLong) {
/*   */     return ((paramLong & DR) != 0L);
/*   */   }
/*   */   
/*   */   public s5(long paramLong) {
/*   */     super(paramLong);
/*   */     if (lL0(paramLong))
/*   */       return; 
/*   */     throw new JU("Invalid type specified");
/*   */   }
/*   */   
/*   */   public s5(long paramLong, Color paramColor) {
/*   */     this(paramLong);
/*   */     if (paramColor != null)
/*   */       this.lx.set(paramColor); 
/*   */   }
/*   */   
/*   */   public s5(long paramLong, int paramInt) {
/*   */     this(paramLong);
/*   */     this.lx.set(1.0F, 1.0F, 1.0F, 0.0F);
/*   */   }
/*   */   
/*   */   public final int hashCode() {
/*   */     int i = super.hashCode() * 953;
/*   */     return this.lx.toIntBits() + i;
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
/*   */     //   28: goto -> 50
/*   */     //   31: aload_1
/*   */     //   32: checkcast f/s5
/*   */     //   35: getfield lx : Lcom/badlogic/gdx/graphics/Color;
/*   */     //   38: invokevirtual toIntBits : ()I
/*   */     //   41: aload_0
/*   */     //   42: getfield lx : Lcom/badlogic/gdx/graphics/Color;
/*   */     //   45: invokevirtual toIntBits : ()I
/*   */     //   48: isub
/*   */     //   49: istore_0
/*   */     //   50: iload_0
/*   */     //   51: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 6
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/s5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */