SUMMARY = "LXQt system settings cente"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt

DEPENDS += "liblxqt"

SRCREV = "8f5f74ca1b47b57e73c19174cd0e0b1eb577658c"
PV = "0.8.0+git${SRCPV}"

# there are no dev files / pack liblxqt-config-cursor.so correctly
FILES_${PN} += "${libdir}/liblxqt-config-cursor.so"
FILES_${PN}-dev = ""
