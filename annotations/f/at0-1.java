/* 1 */ package f;public final class at0 extends x60 { public final void Da0(String[] paramArrayOfString) { if (paramArrayOfString.length < 2) { km.u4.oD("/channelchange <channel_id>", ZY.ih); return; }  try { byte b; if ((b = (byte)(Byte.parseByte(paramArrayOfString[1]) - 1)) < 0 || b >= km.a3.XA)
/*   */       
/*   */       { 
/*   */         
/* 5 */         km.u4.oD("Invalid Channel Id.", ZY.ih); return; }  boolean bool = false; km.u4.e20.W3(new aD(b, bool)); return; } catch (NumberFormatException numberFormatException) { km.u4.oD("/channelchange <channel_id>", ZY.ih);
/*   */       return; }
/*   */      }
/*   */ 
/*   */   
/*   */   public at0() {
/*   */     super("/channelchange");
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/at0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */