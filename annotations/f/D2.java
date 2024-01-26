/* 1 */ package f;public final class D2 { public final String R30(byte paramByte, short paramShort) { int i; if ((i = paramShort / 512) == 19 || i == 18) {
/* 2 */       WD wD; if ((wD = yk0.cw().mP((short)(paramShort % 512))) == null) return "???"; 
/* 3 */       return Ml0.OH0(this.iz);
/*   */     } 
/*   */     UD0 uD0;
/*   */     return (i == 0 || i == 21) ? (((uD0 = On.v30().lpT3((short)(paramShort % 512))) == null) ? "???" : o60(false)) : (String)((D2)super).Xz0[paramByte].Z90(paramShort); }
/*   */ 
/*   */   
/*   */   public static final D2 Wf0 = new D2();
/*   */   public hq0[] Xz0 = (hq0[])new qw0[5];
/*   */   
/*   */   public D2() {
/*   */     hq0[] arrayOfHq0;
/*   */     for (byte b = 0; b < (arrayOfHq0 = this.Xz0).length; b++) {
/*   */       qw0 qw0;
/*   */       this();
/*   */       arrayOfHq0[b] = qw0;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final String Lg0(byte paramByte, short[] paramArrayOfshort) {
/*   */     this();
/*   */     StringBuilder stringBuilder;
/*   */     for (byte b = 0; b < paramArrayOfshort.length; b++) {
/*   */       if (paramArrayOfshort[b] > 0) {
/*   */         if (b == 3) {
/*   */           stringBuilder.append("\n");
/*   */         } else if (stringBuilder.length() > 0) {
/*   */           stringBuilder.append(" ");
/*   */         } 
/*   */         stringBuilder.append(R30(paramByte, paramArrayOfshort[b]));
/*   */       } 
/*   */     } 
/*   */     return stringBuilder.toString();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/D2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */