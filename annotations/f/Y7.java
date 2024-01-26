// Class Version: 8
package f;

import f.SF;
import f.Td0;
import f.aY;
import org.lwjgl.glfw.GLFWKeyCallback;

public final class Y7
        extends GLFWKeyCallback {
    public final aY Bk;

    public Y7(aY aY2) {
        this.Bk = aY2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void invoke(long l, int n, int n2, int n3, int n4) {
        // l is window
        // n is keycode
        // n2 is scancode
        // n3 is action that occurred (1 = PRESS, 0 = RELEASE, 2 = REPEAT)
        // n4 is modifier key (shift, control, cmd)

        aY aY2;
        aY2 = ((Y7)((Object)aY2)).Bk;
        if (n3 != 0) {
            // goes in if an keyboard action occurred
            if (n3 != 1) {
                if (n3 != 2) {
                    // goes if keyboard key is released
                    aY2.getClass();
                    return;
                }
                // goes here if key is being held down
                if (aY2.B == '\u0000') return; // checks if B is null
                Object object = aY2;
                ((aY)object).jF0.Ai.AW.df0(); //this problem initializes the key being helded as instance of aY
                Td0 td0 = ((aY)object).hl0;
                char c = aY2.B; //sets key that is starting to repeat
                long l2 = System.nanoTime();
                synchronized (td0) {
                    td0.Ou.oU(2);
                    td0.Jo0(l2);
                    td0.Ou.oU(c);
                    return;
                }
            }
            // goes here when key is pressed initially without repeat
            aY2.getClass();
            n = aY.f80(n); // probably gets the key code
            Object object = aY2;
            Td0 td0 = ((aY)object).hl0;
            long l3 = System.nanoTime();
            synchronized (td0) {
                td0.Ou.oU(0);
                td0.Jo0(l3);
                td0.Ou.oU(n);
            }
            ++((SF)object).Jr;
            ((SF)object).DI0 = true;
            ((SF)object).Qu[n] = true; //this directly causes the player to move depending on the key set to true
            ((SF)object).t3[n] = true;
            ((aY)object).jF0.Ai.AW.df0();
            ((aY)object).B = '\u0000';
            n = n != 61 ? (n != 112 ? (n != 160 && n != 66 ? (n != 67 ? 0 : 8) : 10) : 127) : 9;
            if (n == 0) return;
            aY2.AB.invoke(l, n);
            return;
        }
        //no keyboard action sets B to null key
        Object object = aY2;
        aY2.getClass();
        int n5 = aY.f80(n);
        --((SF)object).Jr;
        ((SF)object).Qu[n5] = false;
        ((aY)object).jF0.Ai.AW.df0();
        Td0 td0 = ((aY)object).hl0;
        long l4 = System.nanoTime();
        synchronized (td0) {
            td0.Ou.oU(1);
            td0.Jo0(l4);
            td0.Ou.oU(n5);
            return;
        }
    }
}