/* 1 */ package f;public final class S0 { public static S0 qy(ByteBuffer paramByteBuffer) { this(); S0 s0; int i; if ((i = paramByteBuffer.getShort()) == 16961) { int[] arrayOfInt1; int[] arrayOfInt2; byte b; for (arrayOfInt1 = new int[i = (paramByteBuffer.getShort() & 0xFFFF) / 2], arrayOfInt2 = new int[(paramByteBuffer.getShort() & 0xFFFF) / 2], b = 0; b < i; ) { arrayOfInt1[b] = paramByteBuffer.getInt(); b++; }  for (b = 0; b < i; ) { arrayOfInt2[b] = paramByteBuffer.getInt(); b++; }  paramByteBuffer.getInt(); for (b = 0; b < i; ) { paramByteBuffer.position(arrayOfInt1[b]); this(); mh0.yn0 = b; Mh0 mh0; (mh0 = new Mh0()).Ut0 = paramByteBuffer.getShort(); paramByteBuffer.getShort(); if ((mh0.c50 = paramByteBuffer.getShort()) >= 0) { float f = paramByteBuffer.getShort(); mh0.wp = new eo(paramByteBuffer.getShort(), f, paramByteBuffer.getShort()); } else { paramByteBuffer.getShort(); paramByteBuffer.getShort(); paramByteBuffer.getShort(); }  paramByteBuffer.getShort(); paramByteBuffer.getShort(); int j = paramByteBuffer.position(); mh0.iz = paramByteBuffer.getShort(); mh0.t90 = paramByteBuffer.get(); paramByteBuffer.get(); int arrayOfInt[], k; for (arrayOfInt = new int[4], k = 0; k < 4; ) { arrayOfInt[k] = paramByteBuffer.getInt(); k++; }  paramByteBuffer.position(arrayOfInt2[b] + 8); k = paramByteBuffer.getInt(); paramByteBuffer.position(arrayOfInt2[b] + k); for (mh0.fF0 = arrayOfInt2[b], mh0.ut0 = paramByteBuffer, k = 0; k < 4; ) { int m; if (paramByteBuffer.limit() > (m = arrayOfInt[k]) && m >= 1) mh0.R8.Com3(Integer.valueOf(j + m));  k++; }  s0.Of0.add(mh0); s0.Vr0.put(Short.valueOf(mh0.Ut0), mh0); b++; }  return s0; }  throw new RuntimeException(XD0.SD0("Header magic mismatch = ", i)); }
/*   */ 
/*   */   
/*   */   public ArrayList Of0;
/*   */   public HashMap Vr0;
/*   */   
/*   */   public S0() {
/*   */     ArrayList arrayList;
/*   */     HashMap<Object, Object> hashMap;
/*   */     this();
/*   */     this.Of0 = this;
/*   */     this();
/*   */     this.Vr0 = this;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/S0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */