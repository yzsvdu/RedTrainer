/* 1 */ package f;public final class s80 extends Xv { public final wV COm1() { while (this.oo0.length() == 0L && this.mj == 3) { try { Thread.sleep(50L); } catch (InterruptedException interruptedException) {} }  int i; if ((i = this.mj) != 5) { Sl0 sl0; wV wV; String str; if (i == 4) return new wV(3, null); 
/* 2 */       int j = Zk0.s6(5)[Integer.reverseBytes(this.oo0.readInt())]; byte[] arrayOfByte = new byte[Integer.reverseBytes(this.oo0.readInt())]; this.oo0.readFully(arrayOfByte); this(arrayOfByte);
/* 3 */       this(new Qv(str));
/* 4 */       this(j, this); Object[] arrayOfObject; (arrayOfObject = new Object[1])[0] = wV.toString(); String.format("Received packet: %s", this); YW.getClass(); return new wV(); }  throw new IOException("Disconnected!"); }
/*   */ 
/*   */   
/*   */   public static final ik YW = C00.gd(s80.class);
/*   */   public final RandomAccessFile oo0;
/*   */   
/*   */   public s80(B4 paramB4, HashMap paramHashMap, String paramString) {
/*   */     super(paramB4, paramHashMap);
/*   */     try {
/*   */       RandomAccessFile randomAccessFile;
/*   */       this(paramString, "rw");
/*   */       this.oo0 = randomAccessFile;
/*   */       return;
/*   */     } catch (FileNotFoundException fileNotFoundException) {
/*   */       throw new RuntimeException(fileNotFoundException);
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/s80.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */