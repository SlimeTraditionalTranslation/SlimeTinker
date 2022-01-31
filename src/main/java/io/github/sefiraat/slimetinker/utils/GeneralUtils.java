package io.github.sefiraat.slimetinker.utils;

import io.github.sefiraat.slimetinker.SlimeTinker;
import org.bukkit.Location;
import org.bukkit.World;

import javax.annotation.Nonnull;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public final class GeneralUtils {

    private GeneralUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean day(@Nonnull World world) {
        return world.getTime() > 0 && world.getTime() < 12300;
    }

    @Nonnull
    public static String serializeLocation(@Nonnull Location l) {
        String world = Objects.requireNonNull(l.getWorld()).getName();
        double x = l.getX();
        double y = l.getY();
        double z = l.getZ();
        float w = l.getYaw();
        float p = l.getPitch();
        return world + ";" + x + ";" + y + ";" + z + ";" + w + ";" + p;
    }

    @Nonnull
    public static Location deserializeLocation(@Nonnull String s) {
        String[] split = s.split(";");
        return new Location(
            SlimeTinker.getInstance().getServer().getWorld(split[0]),
            Double.parseDouble(split[1]),
            Double.parseDouble(split[2]),
            Double.parseDouble(split[3]),
            Float.parseFloat(split[4]),
            Float.parseFloat(split[5])
        );
    }

    /**
     * Tests a chance roll starting from 1 to upper
     *
     * @param chance The number the roll must be lower than
     * @param upper  The highest possible number that could roll (inclusive)
     * @return true if roll passes
     */
    public static boolean testChance(int chance, int upper) {
        return ThreadLocalRandom.current().nextInt(1, upper + 1) <= chance;
    }

    /**
     * Rolls a number starting from 1 to upper
     *
     * @param upper The highest possible number that could roll (inclusive)
     * @return rolled int
     */
    public static int roll(int upper) {
        return roll(upper, true);
    }

    /**
     * Rolls a number starting from 1 to upper
     *
     * @param upper   The highest possible number that could roll (inclusive)
     * @param upLimit If true, the bound will be increased for 1 for inclusivity while
     *                maintaining readability for manually typed numbers
     *                (i.e. Upper 50 converts to 51 returning a max of 50 still).
     *                Set false when using 0 based indexes (list.size())
     * @return rolled int
     */
    public static int roll(int upper, boolean upLimit) {
        if (upLimit) upper++;
        return ThreadLocalRandom.current().nextInt(1, upper);
    }
}
