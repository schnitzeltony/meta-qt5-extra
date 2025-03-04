SUMMARY = "Daemon used to register global keyboard shortcuts"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "liblxqt"

SRC_URI += "file://0001-config-CMakeLists.txt-Use-relative-path-to-include-m.patch"
SRCREV = "2c1abdf39b67a1e2aa52b9b1a96640fb63aabbeb"
PV = "1.4.0"

FILES:${PN} += "${datadir}/lxqt"
