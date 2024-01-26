/*  1 */ package f;public abstract class Xv { public static final ik ze = C00.gd(Xv.class); public static final String[] i9 = new String[] { "XDG_RUNTIME_DIR", "TMPDIR", "TMP", "TEMP" }; public static s80 Ws0(B4 paramB4, HashMap paramHashMap, String paramString) { String str; if ((str = System.getProperty("os.name").toLowerCase()).contains("win")) return new s80(paramB4, paramHashMap, paramString);  throw new RuntimeException(m0.tF0("Unsupported OS: ", str)); } public int mj = 2; public int Ru; public Xv(B4 paramB4, HashMap paramHashMap) {} public static String fK(int paramInt) { if (System.getProperty("os.name").contains("Win")) return XD0.SD0("\\\\?\\pipe\\discord-ipc-", paramInt);  String str = null; String[] arrayOfString; int i; byte b;
/*  2 */     for (i = (arrayOfString = i9).length, b = 0; b < i && (str = System.getenv(arrayOfString[b])) == null; b++); if (str == null) str = "/tmp";  return str + "/discord-ipc-" + paramInt; } public final void Rf(int paramInt, Sl0 paramSl0) { 
/*  3 */     try { byte[] arrayOfByte; ByteBuffer byteBuffer = ByteBuffer.allocate((arrayOfByte = (paramSl0 = paramSl0.t(UUID.randomUUID().toString(), "nonce")).toString().getBytes()).length + 8); if (paramInt != 0) { byteBuffer.putInt(Integer.reverseBytes(paramInt - 1)); byteBuffer.putInt(Integer.reverseBytes(arrayOfByte.length)); byteBuffer.put(arrayOfByte); arrayOfByte = byteBuffer.array(); ((s80)this)
/*    */           
/*  5 */           .oo0.write(arrayOfByte);
/*    */ 
/*    */ 
/*    */         
/*  9 */         String.format("Sent packet: %s", new Object[] { "Pkt:" + h6.k1(paramInt) + paramSl0.toString() }); ze.getClass(); } else { throw null; }  } catch (IOException iOException)
/*    */     
/* 11 */     { ze.error("Encountered an IOException while sending a packet and disconnected!"); this.mj = 5; }
/*    */      }
/*    */ 
/*    */   
/*    */   public abstract wV COm1(); }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Xv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */