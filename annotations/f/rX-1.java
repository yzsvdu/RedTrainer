/* 1 */ package f;public abstract class rX { public final void remove() { int i; y10 y101; if ((i = this.T1) == -1 && (y101 = this.dv0).yq0) { y101.yq0 = false; y101.vf0 = null; } else if (i >= 0) { int[] arrayOfInt; Object[] arrayOfObject; int j; int k; int m; for (arrayOfInt = this.dv0.PG0, arrayOfObject = this.dv0.Bu, j = this.dv0.O10, k = i + 1 & j; (m = arrayOfInt[k]) != 0; ) { y10 y102 = this.dv0; int n; if ((k - (n = (int)(m * -7046029254386353131L >>> y102.yA)) & j) > (i - n & j)) { arrayOfInt[i] = m; arrayOfObject[
/* 2 */               i] = arrayOfObject[k]; i = k; }  k = k + 1 & j; }  arrayOfInt[i] = 0; arrayOfObject[i] = null; if (i != this.T1) this.xn--;  } else { throw new IllegalStateException("next must be called before remove."); }  this.T1 = -2; this.dv0.kG--; }
/*   */ 
/*   */   
/*   */   public boolean gt0;
/*   */   public final y10 dv0;
/*   */   public int xn;
/*   */   public int T1;
/*   */   public boolean Jc = true;
/*   */   
/*   */   public rX(y10 paramy10) {
/*   */     this.dv0 = paramy10;
/*   */     GS();
/*   */   }
/*   */   
/*   */   public final void GS() {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: dup
/*   */     //   2: dup
/*   */     //   3: bipush #-2
/*   */     //   5: putfield T1 : I
/*   */     //   8: iconst_m1
/*   */     //   9: putfield xn : I
/*   */     //   12: getfield dv0 : Lf/y10;
/*   */     //   15: dup
/*   */     //   16: astore_1
/*   */     //   17: getfield yq0 : Z
/*   */     //   20: ifeq -> 31
/*   */     //   23: aload_0
/*   */     //   24: iconst_1
/*   */     //   25: putfield gt0 : Z
/*   */     //   28: goto -> 75
/*   */     //   31: aload_1
/*   */     //   32: getfield PG0 : [I
/*   */     //   35: dup
/*   */     //   36: astore_1
/*   */     //   37: arraylength
/*   */     //   38: istore_2
/*   */     //   39: aload_0
/*   */     //   40: getfield xn : I
/*   */     //   43: iconst_1
/*   */     //   44: iadd
/*   */     //   45: dup
/*   */     //   46: istore_3
/*   */     //   47: iload_2
/*   */     //   48: aload_0
/*   */     //   49: iload_3
/*   */     //   50: putfield xn : I
/*   */     //   53: if_icmpge -> 70
/*   */     //   56: aload_1
/*   */     //   57: iload_3
/*   */     //   58: iaload
/*   */     //   59: ifeq -> 39
/*   */     //   62: aload_0
/*   */     //   63: iconst_1
/*   */     //   64: putfield gt0 : Z
/*   */     //   67: goto -> 75
/*   */     //   70: aload_0
/*   */     //   71: iconst_0
/*   */     //   72: putfield gt0 : Z
/*   */     //   75: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 32
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/rX.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */