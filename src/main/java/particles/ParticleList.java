package particles;

import common.Ver;
import common.ParamTypes;

/**
 * Enum containing all of the particles used in EnhancedParticles.
 *
 * <p>
 *     Every particle is labeled under their name used in the /particle command!
 *
 *     Particles whose names have been changed between versions are listed under the name of their most recent
 *     minecraft version equivalent.
 *
 *     It is possible some particles are improperly named. Please contact PenguinHi5 for any issues or updates.
 * </p>
 */
public enum ParticleList
{

    AMBIENT_ENTITY_EFFECT(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13 },
            new ParamTypes[] {},
            "ambient_entity_effect"),
    ANGRY_VILLAGER(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "angry_villager", "angryVillager"),
    ASH(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16 },
            new ParamTypes[] {},
            "ash"),
    BARRIER(new Ver[]
            { Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "barrier", "barrier"),
    BLOCK(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9 },
            new ParamTypes[] { ParamTypes.BLOCK },
            "block", "blockcrack"),
    BLOCK_DUST(new Ver[]
            { Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9 },
            new ParamTypes[] { ParamTypes.BLOCK },
            "", "blockdust"),
    BLOCK_MARKER(new Ver[]
            { Ver.V1_18 },
            new ParamTypes[] { ParamTypes.BLOCK },
            "block_marker"),
    BUBBLE(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "bubble", "bubble"),
    BUBBLE_COLUMN_UP(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13 },
            new ParamTypes[] {},
            "bubble_column_up"),
    BUBBLE_POP(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13 },
            new ParamTypes[] {},
            "bubble_pop"),
    CAMPFIRE_COSY_SMOKE(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14 },
            new ParamTypes[] {},
            "campfire_cosy_smoke"),
    CAMPFIRE_SIGNAL_SMOKE(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14 },
            new ParamTypes[] {},
            "campfire_signal_smoke"),
    CLOUD(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "cloud", "cloud"),
    COMPOSTER(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14 },
            new ParamTypes[] {},
            "composter"),
    CRIMSON_SPORE(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16 },
            new ParamTypes[] {},
            "crimson_spore"),
    CRIT(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "crit", "crit"),
    CURRENT_DOWN(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13 },
            new ParamTypes[] {},
            "current_down"),
    DAMAGE_INDICATOR(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9 },
            new ParamTypes[] {},
            "damage_indicator", "damageIndicator"),
    DEPTH_SUSPEND(new Ver[]
            { Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "", "depthsuspend"),
    DOLPHIN(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13 },
            new ParamTypes[] {},
            "dolphin"),
    DRAGON_BREATH(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9 },
            new ParamTypes[] {},
            "dragon_breath", "dragonbreath"),
    DRIPPING_DRIPSTONE_LAVA(new Ver[]
            { Ver.V1_18, Ver.V1_17 },
            new ParamTypes[] {},
            "dripping_dripstone_lava"),
    DRIPPING_DRIPSTONE_WATER(new Ver[]
            { Ver.V1_18, Ver.V1_17 },
            new ParamTypes[] {},
            "dripping_dripstone_water"),
    DRIPPING_HONEY(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15 },
            new ParamTypes[] {},
            "dripping_honey"),
    DRIPPING_LAVA(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "dripping_lava", "dripLava"),
    DRIPPING_OBSIDEAN_TEAR(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16 },
            new ParamTypes[] {},
            "dripping_obsidean_tear"),
    DRIPPING_WATER(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "dripping_water", "dripWater"),
    DROPLET(new Ver[]
            { Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "", "droplet"),
    DUST(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] { ParamTypes.RGB, ParamTypes.SIZE },
            "dust", "reddust"),
    DUST_COLOR_TRANSITION(new Ver[]
            { Ver.V1_18, Ver.V1_17 },
            new ParamTypes[] { ParamTypes.RGB, ParamTypes.SIZE, ParamTypes.RGB },
            "dust_color_transition"),
    EFFECT(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "effect", "spell"),
    ELDER_GUARDIAN(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "elder_guardian", "mobappearance"),
    ELECTRIC_SPARK(new Ver[]
            { Ver.V1_18, Ver.V1_17 },
            new ParamTypes[] {},
            "electric_spark"),
    ENCHANT(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "enchant", "enchantmenttable"),
    ENCHANTED_HIT(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "enchanted_hit", "magicCrit"),
    END_ROD(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_10, Ver.V1_9 },
            new ParamTypes[] {},
            "end_rod", "endRod"),
    ENTITY_EFFECT(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] { ParamTypes.RGB }, // NOTE::: Requires count set to 0!
            "entity_effect", "mobSpell"),
    EXPLOSION(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "explosion", "largeexplode"),
    EXPLOSION_EMITTER(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "explosion_emitter", "hugeexplosion"),
    FALLING_DRIPSTONE_LAVA(new Ver[]
            { Ver.V1_18, Ver.V1_17 },
            new ParamTypes[] {},
            "falling_dripstone_lava"),
    FALLING_DRIPSTONE_WATER(new Ver[]
            { Ver.V1_18, Ver.V1_17 },
            new ParamTypes[] {},
            "falling_dripstone_water"),
    FALLING_DUST(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10 },
            new ParamTypes[] { ParamTypes.BLOCK },
            "falling_dust", "fallingdust"),
    FALLING_HONEY(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15 },
            new ParamTypes[] {},
            "falling_honey"),
    FALLING_LAVA(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14 },
            new ParamTypes[] {},
            "falling_lava"),
    FALLING_NECTAR(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15 },
            new ParamTypes[] {},
            "falling_nectar"),
    FALLING_OBSIDIAN_TEAR(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16 },
            new ParamTypes[] {},
            "falling_obsidian_tear"),
    FALLING_SPORE_BLOSSOM(new Ver[]
            { Ver.V1_18, Ver.V1_17 },
            new ParamTypes[] {},
            "falling_spore_blossom"),
    FALLING_WATER(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14 },
            new ParamTypes[] {},
            "falling_water"),
    FIREWORK(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "firework", "fireworksSpark"),
    FISHING(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "fishing", "wake"),
    FLAME(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "flame", "flame"),
    FLASH(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14 },
            new ParamTypes[] {},
            "flash"),
    FOOTSTEP(new Ver[]
            { Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "", "footstep"),
    GLOW(new Ver[]
            { Ver.V1_18, Ver.V1_17 },
            new ParamTypes[] {},
            "glow"),
    GLOW_SQUID_INK(new Ver[]
            { Ver.V1_18, Ver.V1_17 },
            new ParamTypes[] {},
            "glow_squid_ink"),
    HAPPY_VILLAGER(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "happy_villager", "happyVillager"),
    HEART(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "heart", "heart"),
    INSTANT_EFFECT(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "instant_effect", "instantSpell"),
    ITEM(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9 },
            new ParamTypes[] { ParamTypes.ITEM },
            "item", "iconcrack"),
    ITEM_SLIME(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "item_slime", "slime"),
    ITEM_SNOWBALL(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "item_snowball", "snowballpoof"),
    LANDING_HONEY(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15 },
            new ParamTypes[] {},
            "landing_honey"),
    LANDING_LAVA(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14 },
            new ParamTypes[] {},
            "landing_lava"),
    LANDING_OBSIDIAN_TEAR(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16 },
            new ParamTypes[] {},
            "landing_obsidian_tear"),
    LARGE_SMOKE(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "large_smoke", "largesmoke"),
    LAVA(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "lava", "lava"),
    MOB_SPELL_AMBIENT(new Ver[]
            { Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] { ParamTypes.RGB },
            "", "mobSpellAmbient"),
    MYCELIUM(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "mycelium", "townaura"),
    NAUTILUS(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13 },
            new ParamTypes[] {},
            "nautilus"),
    NOTE(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] { ParamTypes.MUSIC_NOTE_COLOR },
            "note", "note"), // https://www.reddit.com/r/MinecraftCommands/comments/bnatf4/how_to_colorize_note_particles/
    POOF(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "poof", "explode"),
    PORTAL(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "portal", "portal"),
    RAIN(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13 },
            new ParamTypes[] {},
            "rain"),
    REVERSE_PORTAL(new Ver[]
            { Ver.V1_16 },
            new ParamTypes[] {},
            "reverse_portal"),
    SCRAPE(new Ver[]
            { Ver.V1_18, Ver.V1_17 },
            new ParamTypes[] {},
            "scrape"),
    SMOKE(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "smoke", "smoke"),
    SNEEZE(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14 },
            new ParamTypes[] {},
            "sneeze"),
    SNOWFLAKE(new Ver[]
            { Ver.V1_18, Ver.V1_17 },
            new ParamTypes[] {},
            "snowflake"),
    SNOW_SHOVEL(new Ver[]
            { Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "", "snowshovel"),
    SOUL(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16 },
            new ParamTypes[] {},
            "soul"),
    SOUL_FIRE_FLAME(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16 },
            new ParamTypes[] {},
            "soul_fire_flame"),
    SPIT(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11 },
            new ParamTypes[] {},
            "spit", "spit"),
    SPORE_BLOSSOM_AIR(new Ver[]
            { Ver.V1_18, Ver.V1_17 },
            new ParamTypes[] {},
            "spore_blossom_air"),
    SPLASH(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "splash", "splash"),
    SQUID_INK(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13 },
            new ParamTypes[] {},
            "squid_ink"),
    SUSPENDED(new Ver[]
            { Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "", "suspended"),
    SWEEP_ATTACK(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9 },
            new ParamTypes[] {},
            "sweep_attack", "sweepAttack"),
    TAKE(new Ver[]
            { Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "", "take"),
    TOTEM_OF_UNDYING(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11 },
            new ParamTypes[] {},
            "totem_of_undying", "totem"),
    UNDERWATER(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13 },
            new ParamTypes[] {},
            "underwater"),
    VIBRATION(new Ver[]
            { Ver.V1_18, Ver.V1_17 },
            new ParamTypes[] { ParamTypes.POSITION, ParamTypes.POSITION, ParamTypes.DURATION },
            "vibration"),
    WARPED_SPORE(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16 },
            new ParamTypes[] {},
            "warped_spore"),
    WAX_OFF(new Ver[]
            { Ver.V1_18, Ver.V1_17 },
            new ParamTypes[] {},
            "wax_off"),
    WAX_ON(new Ver[]
            { Ver.V1_18, Ver.V1_17 },
            new ParamTypes[] {},
            "wax_on"),
    WHITE_ASH(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16 },
            new ParamTypes[] {},
            "white_ash"),
    WITCH(new Ver[]
            { Ver.V1_18, Ver.V1_17, Ver.V1_16, Ver.V1_15, Ver.V1_14, Ver.V1_13, Ver.V1_12, Ver.V1_11, Ver.V1_10, Ver.V1_9, Ver.V1_8 },
            new ParamTypes[] {},
            "witch", "witchMagic");

    public Ver[] supportedVersions;
    public ParamTypes[] additionalParams;
    public String name1_13a;
    public String name1_12b;

    ParticleList(Ver[] supportedVersions, ParamTypes[] additionalParams, String name1_13a, String name1_12b)
    {
        this.supportedVersions = supportedVersions;
        this.additionalParams = additionalParams;
        this.name1_13a = name1_13a;
        this.name1_12b = name1_12b;
    }

    ParticleList(Ver[] supportedVersions, ParamTypes[] additionalParams, String name1_13a)
    {
        this.supportedVersions = supportedVersions;
        this.additionalParams = additionalParams;
        this.name1_13a = name1_13a;
        this.name1_12b = "";
    }

}
