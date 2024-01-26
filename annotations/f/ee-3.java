/*  1 */ package f;public final class ee extends x60 { public final void Da0(String[] paramArrayOfString) { if (paramArrayOfString.length < 2) { km.u4.oD("/testanimation <skill_id>", ZY.ih); return; }  try { short s = Short.parseShort(paramArrayOfString[1]); Gp0 gp0; if ((gp0 = km.MR) == null) return;  if (km.wI0.K7 == null)
/*  2 */         return;  WD wD; if ((wD = yk0.cw().mP(s)) == null) {
/*    */         return;
/*    */       }
/*  5 */       hm0 hm01 = gp0.N0((byte)0, (byte)0), hm02 = gp0.N0((byte)1, (byte)0); O5.AU.getClass();
/*    */       
/*  7 */       O5.AU.xa(this, this.HA).SK(hm02);
/*    */       
/*  9 */       km.wI0.K7.u4 = O5.AU.xa(this, this.HA).O3(); return; } catch (NumberFormatException numberFormatException)
/* 10 */     { km.u4.oD("/testanimation <skill_id>", ZY.ih);
/*    */       return; }
/*    */      }
/*    */ 
/*    */   
/*    */   public ee() {
/*    */     super("/testanimation");
/*    */   }
/*    */   
/*    */   public final int Gs0() {
/*    */     return 8;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ee.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */