/*  1 */ package f;public class Bz { public static void Tj(Properties[] paramArrayOfProperties) { if (!CN.exists()) { Jr.info("Created config folder {}.", CN.getAbsolutePath()); CN.mkdirs(); }  try { Properties[] arrayOfProperties = Pl.k40(CN); Jr.info("Loaded " + arrayOfProperties.length + " config properties."); if (paramArrayOfProperties != null) { this(true, paramArrayOfProperties.length + arrayOfProperties.length, Properties.class); fQ.tu0((Object[])paramArrayOfProperties, 0, paramArrayOfProperties.length); fQ fQ; (fQ = new fQ()).tu0((Object[])arrayOfProperties, 0, arrayOfProperties.length);
/*  2 */         arrayOfProperties = (Properties[])(new fQ()).toArray(); }
/*  3 */        K.GP(Bz.class, null, arrayOfProperties);
/*    */       
/*  5 */       K.GP(h1.class, null, arrayOfProperties);
/*    */       
/*  7 */       K.GP(Fl0.class, null, arrayOfProperties);
/*    */       
/*  9 */       K.GP(cl0.class, null, arrayOfProperties);
/* 10 */       h1.ab(); if (h1.tR < 1 || h1.wd0 < 1) { h1.tR = 1024; h1.wd0 = 768; }  int i; if ((i = h1.zr0) == 0 || i == 1) YK0.L10 = i;  t90.w40 = h1.VV; km.ZC0 = LF.Cm0(h1.MW, "android"); return; } catch (Exception exception) { Jr.error(A9.lr0("FATAL"), "Can't load configuration", exception); throw new Error("Can't load configuration", exception); }
/*    */      }
/*    */ 
/*    */   
/*    */   public static final ik Jr = C00.gd(Bz.class);
/*    */   public static File CN = new File("config");
/*    */   @mB0(key = "loginserver.network.client.port", defaultValue = "2106")
/*    */   public static int ti0;
/*    */   @mB0(key = "loginserver.network.client.host", defaultValue = "loginserver.pokemmo.com")
/*    */   public static String sb0;
/*    */   @mB0(key = "gameserver.security.max_message_length", defaultValue = "150")
/*    */   public static int ij;
/*    */   @mB0(key = "client.ui.hud.chat.sent_message_memory_count", defaultValue = "20")
/*    */   public static int PM;
/*    */   @mB0(key = "client.ui.hud.chat.message_display_count", defaultValue = "0")
/*    */   public static int oX;
/*    */   @mB0(key = "client.ui.hud.chat.message_history_size", defaultValue = "0")
/*    */   public static int z00;
/*    */   @mB0(key = "client.chat.log_chat", defaultValue = "false")
/*    */   public static boolean yX;
/*    */   @mB0(key = "client.misc.ignore_feed", defaultValue = "false")
/*    */   public static boolean Rf;
/*    */   @mB0(key = "client.misc.test_feed", defaultValue = "")
/*    */   public static String ab0 = "";
/*    */   @mB0(key = "client.misc.test_sig", defaultValue = "")
/*    */   public static String dj0 = "";
/*    */   @mB0(key = "client.misc.testserver_feed_signature", defaultValue = "false")
/*    */   public static boolean uD;
/*    */   @mB0(key = "client.dev.add_latency", defaultValue = "0")
/*    */   public static int rK0;
/*    */   @mB0(key = "client.dev.time_debugs", defaultValue = "false")
/*    */   public static boolean mr0;
/*    */   @mB0(key = "client.dev.quick_close", defaultValue = "false")
/*    */   public static boolean pn;
/*    */   @mB0(key = "client.dev.night_overlay_constant_redgreen", defaultValue = "2")
/*    */   public static float GS;
/*    */   @mB0(key = "client.dev.night_overlay_constant_blue", defaultValue = "4")
/*    */   public static float protected;
/*    */   @mB0(key = "client.sound_engine.midi.rc", defaultValue = "true")
/*    */   public static boolean RU = true;
/*    */   @mB0(key = "client.sound_engine.midi.gs", defaultValue = "false")
/*    */   public static boolean To = false;
/*    */   @mB0(key = "client.sound_engine.midi.xg", defaultValue = "false")
/*    */   public static boolean Lu0 = false;
/*    */   @mB0(key = "client.sound_engine.midi.lv", defaultValue = "true")
/*    */   public static boolean Dz0 = true;
/*    */   @mB0(key = "client.sound_engine.midi.sv", defaultValue = "true")
/*    */   public static boolean OB = true;
/*    */   @mB0(key = "client.sound_engine.midi.cv", defaultValue = "false")
/*    */   public static boolean fn = false;
/*    */   @mB0(key = "client.gpu.profile", defaultValue = "false")
/*    */   public static boolean e00 = false;
/*    */   @mB0(key = "client.particle.system.profile", defaultValue = "false")
/*    */   public static boolean SF = false;
/*    */   @mB0(key = "client.error.reporting", defaultValue = "true")
/*    */   public static boolean YM = true;
/*    */   public static boolean kd0 = false;
/*    */   public static boolean WI = false;
/*    */   @mB0(key = "client.cache.particle.enable", defaultValue = "true")
/*    */   public static boolean na0 = true;
/*    */   @mB0(key = "client.graphics.ow_weather.enable", defaultValue = "true")
/*    */   public static boolean WZ;
/*    */   @mB0(key = "client.input.controllers.detect_valid_controllers", defaultValue = "true")
/*    */   public static boolean Hj;
/*    */   @mB0(key = "client.dev.debugui.notificaitons", defaultValue = "false")
/*    */   public static boolean at = false;
/*    */   @mB0(key = "client.dev.debugui.tooltips", defaultValue = "false")
/*    */   public static boolean Ac = false;
/*    */   @mB0(key = "client.dev.debugui.colorize", defaultValue = "true")
/*    */   public static boolean FC0 = false;
/*    */   @mB0(key = "client.workarounds.disable_broken_accessibility_providers", defaultValue = "true")
/*    */   public static boolean h80;
/*    */   @mB0(key = "force.ls.port", defaultValue = "-1")
/*    */   public static int ud0;
/*    */   @mB0(key = "force.ls.host", defaultValue = "")
/*    */   public static String Zn0;
/*    */   @mB0(key = "force.gs.port", defaultValue = "-1")
/*    */   public static int t00;
/*    */   @mB0(key = "force.gs.host", defaultValue = "")
/*    */   public static String aw;
/*    */   @mB0(key = "force.cs.port", defaultValue = "-1")
/*    */   public static int FT;
/*    */   @mB0(key = "force.cs.host", defaultValue = "")
/*    */   public static String fP;
/*    */   public static int Np0 = 14;
/*    */   public static final String MV = "[a-zA-Z]";
/*    */   public static final String z7 = "[a-zA-ZÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖØÙÚÛÜÝÞßàáâãäåæçèéêëìíîïðñòóôõöøùúûüýþÿ]";
/*    */   public static final String Ug = "[a-zA-Z0-9 ,.!?\"'\\-~ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖØÙÚÛÜÝÞßàáâãäåæçèéêëìíîïðñòóôõöøùúûüýþÿ]";
/*    */   
/*    */   public static void yo0() {
/*    */     Tj(null);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Bz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */