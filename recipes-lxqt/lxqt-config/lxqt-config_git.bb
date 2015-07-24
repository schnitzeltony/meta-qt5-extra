SUMMARY = "LXQt system settings center"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtsvg liblxqt"

SRCREV = "c7a9328c0e3a39e0fcd740df98eb4400623af40a"
PV = "0.9.0+git${SRCPV}"

# there are no dev files / pack liblxqt-config-cursor.so correctly
FILES_${PN} += " \
    ${datadir}/lxqt/icons \
    ${libdir}/liblxqt-config-cursor.so \
"
FILES_${PN}-dev = ""
