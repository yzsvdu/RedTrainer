/* 1 */ package f;public final class Jh extends dc { public Jh(ByteBuffer paramByteBuffer) { int i, arrayOfInt1[], arrayOfInt2[]; byte b; for (arrayOfInt1 = new int[i = paramByteBuffer.getInt()], arrayOfInt2 = new int[paramByteBuffer.getInt()], this.qJ0 = new String[paramByteBuffer.getInt()], this.sF0 = new dc[i], b = 0; b < i; ) { arrayOfInt1[b] = paramByteBuffer.getInt(); arrayOfInt2[b] = paramByteBuffer.getInt(); b++; }  label27: for (b = 0; b < i; ) { StringBuilder stringBuilder; if (arrayOfInt1[b] == 0) { this.qJ0[b] = XD0.SD0("SEQARC_", b); continue; }
/* 2 */        this(); paramByteBuffer.position(arrayOfInt1[b]); while (true) { dc dc1; char c; if ((c = (char)paramByteBuffer.get()) == '\000') { this.qJ0[b] = stringBuilder.toString().trim(); int j; if ((j = arrayOfInt2[b]) == 0) { this(); this.sF0[b] = dc1; } else { paramByteBuffer.position(dc1); this(paramByteBuffer); this.sF0[b] = dc1; }  b++; continue label27; }  dc1.append(c); }
/*   */        }
/*   */      }
/*   */ 
/*   */   
/*   */   public dc[] sF0; }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Jh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */