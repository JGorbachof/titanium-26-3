# Titanium — unofficial Minecraft 26.3 port

Titanium is a shared library for mod developers, including machine components, energy and fluid storage, inventories, GUI components, networking and data generation.

This is an independent experimental alpha of [InnovativeOnlineIndustries/Titanium](https://github.com/InnovativeOnlineIndustries/Titanium), based on 4.0.18. It is not an official upstream release.

## Installation
Minecraft 26.3, NeoForge 26.3.0.118, Java 25. Install the binary mod JAR on client and server. JEI 31.14.0.72 is optional. Download from [GitHub releases](https://github.com/JGorbachof/titanium-26-3/releases). Back up worlds before testing.

## Alpha testing
Dedicated server GameTests, component persistence, packet codecs, standalone client GUI rendering and input, server data generation, and client startup with and without JEI passed on the port candidate. Live machine synchronization and in-world JEI integration, downstream Industrial Foregoing compatibility, and custom outline rendering remain unverified.

## Source and attribution
Original authors TheCodedOne and Buuz135; copyright Horizon Studio and contributors. See [port changes](PORT_NOTES.md), [LGPL v3](LICENSE.md) and [GPL v3](COPYING.GPL-3.0.txt). The full corresponding source is attached to the release, with build scripts and Gradle wrapper. Run gradlew.bat build (Windows) or ./gradlew build (Linux) using Java 25. The mod is distributed separately and can be replaced with a compatible modified build.
