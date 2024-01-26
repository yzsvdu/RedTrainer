/* 1 */ package f;public final class gm0 extends Sp0 { public gm0(dv0[] paramArrayOfdv0, int[] paramArrayOfint) { super(paramArrayOfdv0[0].Jq0()); int[] arrayOfInt; this.V4 = paramArrayOfdv0; if (paramArrayOfint != null) { if (paramArrayOfint.length == 1) { this.Wg0 = arrayOfInt; Arrays.fill(arrayOfInt = new int[paramArrayOfdv0.length], paramArrayOfint[0]); } else { if (paramArrayOfint.length == arrayOfInt.length) { this.Wg0 = paramArrayOfint; return; }  throw new IllegalArgumentException(B40.df("Invalid frame times length. Expected: ")
/* 2 */             .append(arrayOfInt.length).append(" Has: ").append(paramArrayOfint.length).toString()); }  return; }  throw new IllegalArgumentException(
/*   */ 
/*   */         
/* 5 */         N.Gl0(B40.df("Invalid frame times length. Expected: "), arrayOfInt.length, " Has: 0")); }
/*   */ 
/*   */   
/*   */   public zh0[] vw0;
/*   */   public final dv0[] V4;
/*   */   public final int[] Wg0;
/*   */   
/*   */   public final zh0[] fD0() {
/*   */     zh0[] arrayOfZh0;
/*   */     if ((arrayOfZh0 = this.vw0) != null)
/*   */       return arrayOfZh0; 
/*   */     this.vw0 = new zh0[this.V4.length];
/*   */     for (byte b = 0; b < this.V4.length; b++) {
/*   */       zh0 zh01;
/*   */       this(new U70(new Ds(this, b)), 0, 0, -1, -1);
/*   */       this.vw0[b] = zh01;
/*   */     } 
/*   */     return this.vw0;
/*   */   }
/*   */   
/*   */   public final boolean ln() {
/*   */     return true;
/*   */   }
/*   */   
/*   */   public final int[] pL0() {
/*   */     return this.Wg0;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/gm0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */