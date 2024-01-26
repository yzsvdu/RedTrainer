/* 1 */ package f;public abstract class zi0 implements Externalizable { public final void xt0(boolean paramBoolean) { if (paramBoolean) this.Mj--;  this.ir0 = i; int i, j; if ((i = this.ir0 + 1) > (j = this.qm) || this.Mj == 0) { if (i > j) { i = FH() << 1; int[] arrayOfInt; if ((i = Arrays.binarySearch(arrayOfInt = gF.yv, i)) < 0) i = -i - 1;  i = arrayOfInt[i]; }
/* 2 */       else { i = FH(); }  Hj0(i); this
/* 3 */         .qm = Math.min(i - 1, (int)(i * this.ri0)); this.Mj = (i = FH()) - this.ir0; }
/*   */      }
/*   */ 
/*   */   
/*   */   public static final long serialVersionUID = -1792948471915530295L;
/*   */   public transient int ir0;
/*   */   public transient int Mj;
/*   */   public float ri0 = 0.5F;
/*   */   public int qm;
/*   */   public int Vh0;
/*   */   public float Q0 = 0.5F;
/*   */   public transient boolean IC = false;
/*   */   
/*   */   public zi0() {
/*   */     this(10, 0);
/*   */   }
/*   */   
/*   */   public zi0(int paramInt) {
/*   */     this(paramInt, 0);
/*   */   }
/*   */   
/*   */   public zi0(int paramInt1, int paramInt2) {
/*   */     J00(Yr0.Fg(paramInt1 / 0.5F));
/*   */   }
/*   */   
/*   */   public final boolean isEmpty() {
/*   */     return (this.ir0 == 0);
/*   */   }
/*   */   
/*   */   public final int size() {
/*   */     return this.ir0;
/*   */   }
/*   */   
/*   */   public abstract int FH();
/*   */   
/*   */   public void clear() {
/*   */     this.ir0 = 0;
/*   */     this.Mj = FH();
/*   */   }
/*   */   
/*   */   public abstract int J00(int paramInt);
/*   */   
/*   */   public abstract void Hj0(int paramInt);
/*   */   
/*   */   public void readExternal(ObjectInput paramObjectInput) {
/*   */     paramObjectInput.readByte();
/*   */     this.ri0 = paramObjectInput.readFloat();
/*   */     this.Q0 = paramObjectInput.readFloat();
/*   */     float f;
/*   */     if (this.ri0 != (f = this.ri0))
/*   */       J00((int)Math.ceil((10.0F / f))); 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/zi0.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */