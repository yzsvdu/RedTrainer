/* 1 */ package f;public final class F4 extends dj { public final dj Mi0() { long l = this.tL; Color color = this.Nx0; float f = this.A8; return new F4(l, this, f); }
/*   */ 
/*   */   
/*   */   public static final long Qr0 = dj.tv0("glow");
/*   */   public float nj0 = 1.75F;
/*   */   public float hV = 0.1F;
/*   */   public float A8 = 0.2F;
/*   */   public Color Nx0 = new Color(1.0F, 1.0F, 1.0F, 1.0F);
/*   */   
/*   */   public static final boolean tc0(long paramLong) {
/*   */     return ((paramLong & Qr0) != 0L);
/*   */   }
/*   */   
/*   */   public F4(long paramLong) {
/*   */     super(paramLong);
/*   */     if (tc0(paramLong))
/*   */       return; 
/*   */     throw new JU("Invalid type specified");
/*   */   }
/*   */   
/*   */   public F4(long paramLong, Color paramColor, float paramFloat) {
/*   */     this(paramLong);
/*   */     if (paramColor != null)
/*   */       this.Nx0.set(paramColor); 
/*   */     this.A8 = paramFloat;
/*   */   }
/*   */   
/*   */   public final int hashCode() {
/*   */     int i = super.hashCode() * 953;
/*   */     return this.Nx0.toIntBits() + i;
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
/*   */     //   32: checkcast f/F4
/*   */     //   35: getfield Nx0 : Lcom/badlogic/gdx/graphics/Color;
/*   */     //   38: invokevirtual toIntBits : ()I
/*   */     //   41: aload_0
/*   */     //   42: getfield Nx0 : Lcom/badlogic/gdx/graphics/Color;
/*   */     //   45: invokevirtual toIntBits : ()I
/*   */     //   48: isub
/*   */     //   49: istore_0
/*   */     //   50: iload_0
/*   */     //   51: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 6
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/F4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */