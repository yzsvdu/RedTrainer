/*  1 */ package f;public abstract class sh0 { public static final ik ov = C00.gd(sh0.class); public static boolean Sm() { pD pD; if ((pD = km.E) == null || !pD.Ck)
/*    */ 
/*    */       
/*  4 */       try { (km.E = new pD(A1.L7, new rQ[0])).rr(); return true; } catch (Error error) { km.E = null; return false; }   return true; } public static boolean qX(hb0 paramhb0) { if (!Sm()) return false;  try { int i; return (!Bz.Zn0.isEmpty() && (i = Bz.ud0) > 0) ? ((QO(i, Bz.Zn0, null, null, paramhb0, null, false) != null)) : ((QO(Bz.ti0, Bz.sb0, null, null, paramhb0, null, false) != null)); } catch (Exception exception) { ov.error(B40.df("failed ").append(Bz.ti0).toString(), exception); return false; }  } public static boolean Ep0(R8 paramR8) { if (!Sm()) return false;  try { int i; if (!Bz.aw.isEmpty() && (i = Bz.t00) > 0) return (QO(i, Bz.aw, null, null, null, paramR8, false) != null);  String str = p10.aB0; byte[] arrayOfByte = p10.m7;
/*  5 */       U50[] arrayOfU50 = p10.Yy0; P10 p10; return 
/*  6 */         (QO((p10 = paramR8.Bk0).Kj0, str, arrayOfByte, arrayOfU50, null, paramR8, false) != null); } catch (Exception exception) { ov
/*    */         
/*  8 */         .error(B40.df("failed ").append(Bz.t00).toString(), exception); return false; }  } public static PN QO(int paramInt, String paramString, byte[] paramArrayOfbyte, U50[] paramArrayOfU50, hb0 paramhb0, ro paramro, boolean paramBoolean) { if (h1.FJ) { CK cK; byte b; ArrayList<InetSocketAddress> arrayList; try { for (Enumeration<NetworkInterface> enumeration = NetworkInterface.getNetworkInterfaces(); enumeration.hasMoreElements(); ) { Iterator<InterfaceAddress> iterator = ((NetworkInterface)enumeration.nextElement()).getInterfaceAddresses().iterator(); while (true) { if (iterator.hasNext()) { InetAddress inetAddress; if ((inetAddress = ((InterfaceAddress)iterator.next()).getAddress()).isLoopbackAddress() || inetAddress.isLinkLocalAddress() || inetAddress instanceof java.net.Inet4Address) continue;  } else { break; }  boolean bool1 = true; }  }  b = 0; } catch (SocketException socketException) { b = 1; }  km.iE0.getClass(); this(); if (paramArrayOfU50 != null && paramArrayOfU50.length > 0) { ArrayList<U50> arrayList1; ArrayList arrayList2; this(); this(Arrays.asList((E[])paramArrayOfU50)); for (int i = (new ArrayList()).size(); arrayList1.size() < i; ) { int j; Iterator iterator1; for (j = 0, iterator1 = arrayList2.iterator(); iterator1.hasNext(); j += ((U50)iterator1.next()).WY); byte b1; Iterator<U50> iterator2; for (j = xi0.qX(j), b1 = 0, iterator2 = arrayList2.iterator(); iterator2.hasNext(); ) { U50 u50; int m; if (j < (m = b1 + (u50 = iterator2.next()).WY)) { arrayList1.add(u50); arrayList2.remove(u50); break; }  int k = m; }  }  for (Iterator<U50> iterator = arrayList1.iterator(); iterator.hasNext(); ) { U50 u50; if (!(u50 = iterator.next()).Jd0.gK()) { u50.Jd0.getClass(); 
/*  9 */             try { InetAddress inetAddress = InetAddress.getByAddress(u50.Jd0.DH());
/*    */               
/* 11 */               arrayList.add(new InetSocketAddress(inetAddress, u50.PC)); } catch (UnknownHostException null)
/* 12 */             { throw new RuntimeException(unknownHostException); }  }  if (b && 
/*    */             
/* 14 */             !u50.Pc.gK()) { u50
/* 15 */               .Pc
/* 16 */               .getClass(); 
/* 17 */             try { InetAddress inetAddress = InetAddress.getByAddress(u50.Pc.DH());
/*    */               
/* 19 */               arrayList.add(new InetSocketAddress(inetAddress, u50.PC)); } catch (UnknownHostException unknownHostException)
/* 20 */             { throw new RuntimeException(unknownHostException); }  }  }  }  if (paramString != null && 
/* 21 */         !paramString.isEmpty())
/*    */         
/* 23 */         try { Random random = xi0.vg0.DW; InetAddress[] arrayOfInetAddress; if ((arrayOfInetAddress = InetAddress.getAllByName(paramString)) != null)
/* 24 */             for (int j = arrayOfInetAddress.length; j > 1; ) { int k = random.nextInt(j); InetAddress inetAddress = arrayOfInetAddress[--j]; arrayOfInetAddress[j] = arrayOfInetAddress[k]; arrayOfInetAddress[k] = inetAddress; }
/* 25 */               int i; byte b1; for (i = arrayOfInetAddress.length, b1 = 0; b1 < i; ) { InetAddress inetAddress; if (inetAddress = arrayOfInetAddress[b1] instanceof java.net.Inet4Address) { InetSocketAddress inetSocketAddress; this(inetAddress, unknownHostException); arrayList.add(inetSocketAddress); }  b1++; }  if (b) for (i = arrayOfInetAddress.length, b = 0; b < i; ) { InetAddress inetAddress; if (inetAddress = arrayOfInetAddress[b] instanceof java.net.Inet6Address) { InetSocketAddress inetSocketAddress; this(inetAddress, unknownHostException); arrayList.add(inetSocketAddress); }  b++; }   } catch (UnknownHostException unknownHostException1) {}  if (arrayList.isEmpty() && paramArrayOfbyte != null) arrayList.add(new InetSocketAddress(InetAddress.getByAddress(paramArrayOfbyte), unknownHostException));  if (arrayList.isEmpty()) return null;  this(arrayList.<SocketAddress>toArray(new SocketAddress[0]), paramhb0, paramro, paramBoolean); while (!cK.nH0()) { try { Thread.sleep(100L); } catch (InterruptedException interruptedException) {} }
/* 26 */        return cK.nK0; }
/*    */     
/*    */     boolean bool = false; }
/*    */ 
/*    */   
/*    */   public static boolean YO(ro paramro) {
/*    */     if (!Sm())
/*    */       return false; 
/*    */     try {
/*    */       int i;
/*    */       if (!Bz.fP.isEmpty() && (i = Bz.FT) > 0)
/*    */         return (QO(i, Bz.fP, null, null, null, paramro, true) != null); 
/*    */       String str = null;
/*    */       byte[] arrayOfByte = null;
/*    */       U50[] arrayOfU50 = paramro.W20;
/*    */       return (QO(0, str, arrayOfByte, arrayOfU50, null, paramro, true) != null);
/*    */     } catch (Exception exception) {
/*    */       ov.error("failed", exception);
/*    */       return false;
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/sh0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */