# Unofficial Titanium 26.3 alpha port

Original: https://github.com/InnovativeOnlineIndustries/Titanium
Original revision: 594b97cece7aceb69674b08b3dd02b5d5e146dd4 (4.0.18).
Copyright retained: Horizon Studio and upstream contributors; authors TheCodedOne and Buuz135.
Modified 2026-11-26 by the unofficial port project (AI-assisted).
Licensed under GNU LGPL v3.0; see LICENSE.md and COPYING.GPL-3.0.txt. Existing assets and notices are retained from upstream. No endorsement by upstream is implied.

Changes: Minecraft 26.3 / NeoForge 26.3.0.118 / Java 25 API migration; SDL and GUI rendering; config types; loot and recipe bootstrap; optional JEI 31.14.0.72 API; zero energy codec, unsided inventory, block entity update packets and menu reach fixes.
The library remains replaceable as a separate mod JAR. Build from the corresponding source with gradlew.bat build or ./gradlew build, using Java 25. Release source and build scripts are provided alongside the binary.
Alpha limitations: actual multiplayer machine synchronization, in-world JEI lifecycle and custom outline rendering, Industrial Foregoing and other downstream mods are not yet verified; development-only missing model warnings remain. Back up worlds. Do not assume compatibility with earlier Minecraft versions.
