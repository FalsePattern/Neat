plugins {
    id("fpgradle-minecraft") version ("0.10.2")
}

group = "com.falsepattern"

minecraft_fp {
    java {
        compatibility = jabel
    }
    mod {
        modid = "Neat"
        name = "Neat"
        rootPkg = "vazkii.neat"
    }
    mixin {
        pkg = "mixin.mixins"
        pluginClass = "mixin.plugin.MixinPlugin"
    }

    core {
        accessTransformerFile = "Neat_at.cfg"
    }

    tokens {
        tokenClass = "Tags"
    }

    publish {
        maven {
            repoName = "mavenpattern"
            repoUrl = "https://mvn.falsepattern.com/releases"
        }
    }
}

repositories {
    cursemavenEX()
    exclusive(mavenpattern(), "com.falsepattern")
    exclusive(mega(), "mega")
}

dependencies {
    implementationSplit("com.falsepattern:falsepatternlib-mc1.7.10:1.5.9")
    runtimeOnlyNonPublishable("com.falsepattern:falsetweaks-mc1.7.10:3.9.0")
    compileOnly(deobfCurse("hbm-ntm-235439:6028711"))
}