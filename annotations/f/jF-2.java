/*  1 */ package f;public final class jF extends of { public final boolean xt() { String str; if (UB0.Kg0
/*  2 */       .fl0 == null)
/*  3 */     { str = ""; }
/*    */     
/*    */     else
/*    */     
/*  7 */     { str = GLFW.glfwGetClipboardString(UB0.M60.AW.ne0); }  if (str != null)
/*  8 */     { String[] arrayOfString; byte b = 0; int i; if ((i = str.length()) > 0) { byte b1; for (b = 1, b1 = 0; b1 < i; ) { if (str.charAt(b1) == '\n') b++;  b1++; }  }  if (b > 0) {
/*  9 */         for (i = (arrayOfString = str.replaceAll("\\r", "").split("\\n")).length, b = 0; b < i; ) { gv0(arrayOfString[b]); byte b1 = 66; a70[] arrayOfA70;
/* 10 */           if ((arrayOfA70 = this.kc) != null) { int j; byte b2; for (j = arrayOfA70.length, b2 = 0; b2 < j; ) { arrayOfA70[b2].SX(b1); b2++; }  }  b++; }  return true;
/* 11 */       }  gv0((String)arrayOfString); return true; }  return true; }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/jF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */