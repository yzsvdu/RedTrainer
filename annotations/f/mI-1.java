/*  1 */ package f;public final class mI extends x60 { public final void Da0(String[] paramArrayOfString) { if (paramArrayOfString.length < 2) { km.u4.oD("/lang <language code>", ZY.ih); return; }  Xv0 xv0; if ((xv0 = Xv0.k60(paramArrayOfString[1])) != null)
/*    */     
/*    */     { 
/*  4 */       h1.qc = this.uz0; R8 r8; if (!this.uz0.equalsIgnoreCase(h1.qc) && (r8 = km.u4) != null) r8.Dn();  km.u4.jr(this, null, false, true); } else { String str; Xv0[] arrayOfXv0; int i; byte b; for (str = "", i = (arrayOfXv0 = Xv0.Kf0).length, b = 0; b < i; ) { Xv0 xv01 = arrayOfXv0[b]; if (!isEmpty()) {
/*  5 */           str = m0.tF0(this, ", ");
/*    */         }
/*    */         
/*  8 */         str = B40.df(this).append(xv01.V).toString(); b++; }  km.u4
/*    */         
/* 10 */         .oD(m0.tF0("Invalid language code. Avilable language codes: ", this), ZY.ih); }
/*    */      }
/*    */ 
/*    */   
/*    */   public mI() {
/*    */     super("/lang");
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/mI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */