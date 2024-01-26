/* 1 */ package f;public final class uf0 extends gT { public uf0(int[] paramArrayOfint1, int[] paramArrayOfint2, LPT1[] paramArrayOfLPT1) { byte b; String[] arrayOfString; for (this.IF = arrayOfString = new String[paramArrayOfint1.length + 1], this.kq = new String[arrayOfString.length], b = 0; b < paramArrayOfint1.length; ) { StringBuilder stringBuilder; String str; int j; if ((j = paramArrayOfint2[b]) > 0) { if (paramArrayOfLPT1[b] != null) { this(); StringBuilder stringBuilder1; this.IF[b] = (stringBuilder1 = new StringBuilder()).append(Ml0.Go(paramArrayOfint1[b], paramArrayOfLPT1[b].Na())).append(":").toString(); } else { StringBuilder stringBuilder1; this(); this.IF[b] = yh0.jJ0(paramArrayOfint1[b], stringBuilder1, ":"); }  }
/* 2 */       else { this.IF[b] = "???"; }  String[] arrayOfString1 = this.kq; this(); if (j > 0) { str = "+"; } else { str = ""; }  arrayOfString1[b] = stringBuilder.append(str).append(j).toString(); b++; }  int i; this.IF[i = this.IF.length - 1] = Ml0.OH0(1726); this.kq[i] = NumberFormat.getInstance().format(IntStream.of(paramArrayOfint2).sum()); }
/*   */ 
/*   */   
/*   */   public final String[] IF;
/*   */   public final String[] kq;
/*   */   
/*   */   public final int Z80() {
/*   */     return this.IF.length;
/*   */   }
/*   */   
/*   */   public final int ED0() {
/*   */     return 2;
/*   */   }
/*   */   
/*   */   public final String zd(int paramInt) {
/*   */     return "";
/*   */   }
/*   */   
/*   */   public final Object Kx0(int paramInt1, int paramInt2) {
/*   */     return (paramInt2 != 0) ? ((paramInt2 != 1) ? "" : this.kq[paramInt1]) : this.IF[paramInt1];
/*   */   }
/*   */   
/*   */   public final Object ms(int paramInt1, int paramInt2) {
/*   */     return "";
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/uf0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */