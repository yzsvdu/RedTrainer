/*  1 */ package f;public final class n0 extends gT { public final Object Kx0(int paramInt1, int paramInt2) { qa0 qa01 = this.pG[paramInt1]; switch (paramInt2) { default: return "";
/*  2 */       case 3: return Ml0.OH0(qa01.yw + 9200);
/*    */       
/*    */       case 2:
/*  5 */         return this.ri0.format(Long.valueOf(qa01.Gr));
/*    */       case 1:
/*  7 */         return Short.valueOf(qa01.KX);case 0: break; }  Un[] arrayOfUn; if ((arrayOfUn = this.FD)[paramInt1] == null) { Un un; this(qa01.P8()); arrayOfUn[paramInt1] = un; (this.FD[paramInt1])
/*  8 */         .z4 = qa01.P8();
/*  9 */       this.FD[paramInt1].zn();
/* 10 */       this.FD[paramInt1].tW(new Y30(this, qa01)); }  return this.FD[paramInt1]; }
/*    */ 
/*    */   
/*    */   public qa0[] pG = new qa0[0];
/*    */   public SimpleDateFormat ri0 = new SimpleDateFormat("yyyy-MM-dd");
/*    */   public Un[] FD = new Un[0];
/*    */   public String[] b7 = new String[] { Ml0.OH0(9155), Ml0.OH0(9156), Ml0.OH0(9157), Ml0.OH0(9158) };
/*    */   
/*    */   public n0(CS paramCS) {}
/*    */   
/*    */   public final int Z80() {
/*    */     return this.pG.length;
/*    */   }
/*    */   
/*    */   public final int ED0() {
/*    */     return this.b7.length;
/*    */   }
/*    */   
/*    */   public final String zd(int paramInt) {
/*    */     return this.b7[paramInt];
/*    */   }
/*    */   
/*    */   public final Object ms(int paramInt1, int paramInt2) {
/*    */     qa0 qa01 = this.pG[paramInt1];
/*    */     return (paramInt2 != 0) ? "" : P8();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/n0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */