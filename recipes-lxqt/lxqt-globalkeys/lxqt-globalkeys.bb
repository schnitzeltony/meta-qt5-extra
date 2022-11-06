SUMMARY = "Daemon used to register global keyboard shortcuts"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "liblxqt"

SRC_URI += "file://0001-config-CMakeLists.txt-Use-relative-path-to-include-m.patch"
SRCREV = "218fc2068dbcf08387465f4409d11525c2f683bf"
PV = "1.2.0"

FILES:${PN} += "${datadir}/lxqt"
