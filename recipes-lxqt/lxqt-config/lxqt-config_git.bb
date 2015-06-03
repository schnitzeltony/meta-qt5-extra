SUMMARY = "LXQt system settings center"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "liblxqt"

SRCREV = "f4c15db2d9e9fb130d58ed691a4a6be886d933ef"
PV = "0.9.0"

# there are no dev files / pack liblxqt-config-cursor.so correctly
FILES_${PN} += "${libdir}/liblxqt-config-cursor.so"
FILES_${PN}-dev = ""
