[![Gitpod ready-to-code](https://img.shields.io/badge/Gitpod-ready--to--code-blue?logo=gitpod)](https://gitpod.io/#https://github.com/JavaPOSWorkingGroup/javapos-controls)
[![CI](https://github.com/JavaPOSWorkingGroup/javapos-controls/actions/workflows/build.yml/badge.svg)](https://github.com/JavaPOSWorkingGroup/javapos-controls/actions/workflows/build.yml)
[![Release Build](https://github.com/JavaPOSWorkingGroup/javapos-controls/actions/workflows/release.yml/badge.svg)](https://github.com/JavaPOSWorkingGroup/javapos-controls/actions/workflows/release.yml)
[![Maven Central](https://img.shields.io/maven-central/v/org.javapos/javapos-controls)](https://central.sonatype.com/artifact/org.javapos/javapos-controls)


JavaPOS Controls
================

Hosts the device control classes of the UnifiedPOS reference implementation for Java.

Use this library if your are implementing an JavaPOS application to compile against it. This will make your application independant of JavaPOS device service providers. You will be able to change JavaPOS devices at runtime by configuration. This is tidely intergated with the runtime [JavaPOS configuration loader library](https://github.com/JavaPOSWorkingGroup/javapos-config-loader) provided by this group.

This library may also be used by JavaPOS device service implementors for testing purposes.
