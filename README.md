# Neat (1.7.10) - shaders+FalseTweaks fix

## requires [unimixins](https://github.com/LegacyModdingMC/UniMixins) and [FalsePatternLib](https://github.com/FalsePattern/FalsePatternLib)!

A mod that adds a health bar to mobs, but now works with shaders and FalseTweaks threaded rendering.

### Changes in this fork:
- Squashed git history to remove jar hell bloat

- Migrated to FPGradle buildscript

- Miscellaneous code cleanup to improve readability a bit

- Migrated configs to FPLib (smaller dependency)

- Added compatibility with FalseTweaks threaded rendering

### Neat-shaders-fix changes:
1) Fixed bar above mobs scale not depending on the screen resolution / GUI scale in the mc settings

2) Fixed bar above mobs being displayed incorrectly when `B:"Only show the health bar for the entity looked at"=false`

3) Fixed a bug where bars would not display on top of the player even if `B:"Display on Players"=true`

4) Fixed compatibility with shaders

5) Added config options with which you can disable the rendering of name tags above mobs and player nickname (can be turned on/off separately), enabled by default

6) Added config option with which you can make the bars above mobs appear only if the player wearing HBM's ntm armor with the "Enemy HUD" (It only works if hbm is loaded, it is disabled by default, however, the health of mobs when you wear armor with "Enemy HUD" ( name tag above them) is removed, since it is also regulated by an option that removes the name tag above mobs)

# Credits:

[Vazkii](https://github.com/Vazkii) - [original mod](https://github.com/VazkiiMods/Neat)

[cosmicdan](https://github.com/cosmicdan) - [1.7.10 Neat backport](https://github.com/HostileNetworks/Neat)

[kotmatross28729](https://github.com/kotmatross28729) - [Neat-shaders-fix](https://github.com/kotmatross28729/Neat-shaders-fix)
