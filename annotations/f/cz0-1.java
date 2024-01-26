/* 1 */ package f;public final class cz0 extends of { public final void jg(char paramChar) { int i; if ((i = Character.digit(paramChar, 16)) >= 0 && i < 16) { i = 1; } else { i = 0; }  if (i != 0) super
/* 2 */         .jg(paramChar);  } public final void gv0(String paramString) { byte b; int i; for (b = 0, i = paramString.length(); b < i; ) { int j; if ((j = Character.digit(paramString.charAt(b), 16)) >= 0 && j < 16) { j = 1; } else { j = 0; }  if (j == 0) { StringBuilder stringBuilder; this(paramString); while (i-- >= b)
/* 3 */         { int k; if ((k = Character.digit(stringBuilder.charAt(i), 16)) >= 0 && k < 16) { k = 1; } else { k = 0; }  if (k == 0) stringBuilder
/* 4 */               .deleteCharAt(i);  }  paramString = stringBuilder.toString(); break; }  b++; }  super.gv0(paramString); }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/cz0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */