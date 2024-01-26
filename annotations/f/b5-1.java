/* 1 */ package f;public final class b5 extends x60 { public final void Da0(String[] paramArrayOfString) { if (paramArrayOfString.length < 2) { km.u4.oD("/block <target name> <block reason>", ZY.ih); return; }  String str1 = paramArrayOfString[1]; this(); StringBuilder stringBuilder; for (byte b = 2; b < paramArrayOfString.length; ) { if (b > 2) stringBuilder.append(" ");  stringBuilder.append(paramArrayOfString[b]); b++; }  R8 r8 = km.u4; String str2 = stringBuilder.toString(); r8.e20
/* 2 */       .W3(new Dg(this, str2)); }
/*   */ 
/*   */   
/*   */   public b5() {
/*   */     super("/block");
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/b5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */