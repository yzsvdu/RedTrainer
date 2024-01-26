/* 1 */ package f;public final class aw implements D3 { public final Object xr(String paramString1, Field paramField, String paramString2, String paramString3) { try { int i = Integer.decode(paramString1).intValue(); if (!paramString2.isEmpty()) i = Math.max(Integer.decode(paramString2).intValue(), i);  if (!paramString3.isEmpty()) i = Math.min(Integer.decode(paramString3).intValue(), i);  return Integer.valueOf(i); } catch (Exception exception) { throw new y8(this); }
/*   */      }
/*   */ 
/*   */   
/*   */   public static final aw mo = new aw(); }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/aw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */