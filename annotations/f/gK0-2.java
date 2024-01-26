/* 1 */ package f;public final class gK0 implements D3 { public final Object xr(String paramString1, Field paramField, String paramString2, String paramString3) { if (paramString1.trim().isEmpty()) { this = null; } else { String[] arrayOfString; if ((arrayOfString = paramString1.split(":")).length == 2) try { InetSocketAddress inetSocketAddress; if ("*".equals(this[0])) { InetSocketAddress inetSocketAddress1; this(Integer.parseInt(this[1])); inetSocketAddress = inetSocketAddress1; } else { InetSocketAddress inetSocketAddress1; InetAddress inetAddress = InetAddress.getByName((String)this[0]); int i = Integer.parseInt((String)this[1]); this(this, i); inetSocketAddress = inetSocketAddress1; }  return this; } catch (Exception exception) { throw new y8(this); }   throw new y8("Can't transform property, must be in format \"address:port\""); }  return this; }
/*   */ 
/*   */   
/*   */   public static final gK0 Com3 = new gK0(); }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/gK0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */