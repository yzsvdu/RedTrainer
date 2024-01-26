/* 1 */ package f;public abstract class lF0 implements Cloneable { public final Object clone() { try { int[][] arrayOfInt; if ((arrayOfInt = (this = (lF0)super.clone()).H80) == null) { arrayOfInt = null; }
/* 2 */       else { int[][] arrayOfInt1; byte b; for (arrayOfInt1 = new int[arrayOfInt.length][], b = 0; b < arrayOfInt.length; ) { arrayOfInt1[b] = Arrays.copyOf(arrayOfInt[b], (arrayOfInt[b]).length); b++; }  arrayOfInt = arrayOfInt1; }  this
/* 3 */         .H80 = arrayOfInt; if ((arrayOfInt = this.U1) == null) { arrayOfInt = null; }
/* 4 */       else { int[][] arrayOfInt1; byte b; for (arrayOfInt1 = new int[arrayOfInt.length][], b = 0; b < arrayOfInt.length; ) { arrayOfInt1[b] = Arrays.copyOf(arrayOfInt[b], (arrayOfInt[b]).length); b++; }  arrayOfInt = arrayOfInt1; }  this
/* 5 */         .U1 = arrayOfInt; } catch (CloneNotSupportedException cloneNotSupportedException) { this = null; }  return this; }
/*   */ 
/*   */   
/*   */   public short sa0;
/*   */   public short X7;
/*   */   public short cB0;
/*   */   public int[][] H80 = null;
/*   */   public int[][] U1 = null;
/*   */   public short ju = 0;
/*   */   public short km0 = 0;
/*   */   
/*   */   public float Dk(int paramInt1, int paramInt2) {
/*   */     return 0.0F;
/*   */   }
/*   */   
/*   */   public boolean B1() {
/*   */     return false;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/lF0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */