SUMMARY = "A collection of core classes used throught Liri"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = " \
    file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit liri distro_features_check

REQUIRED_DISTRO_FEATURES = "pulseaudio"

SRC_URI += "file://0001-remove-Werror-from-build-flags.patch"
PV = "0.9.0+git${SRCPV}"
SRCREV = "8a2163a38d324869a247a103e65848f76ab1c432"
S = "${WORKDIR}/git"

DEPENDS += " \
    solid \
    kwallet \
    networkmanager-qt \
    modemmanager-qt \
    networkmanager \
    modemmanager \
    pulseaudio \
    libqtxdg \
    fluid \
"

RDEPENDS_${PN} += "pulseaudio-server"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
FILES_${PN}-dev += "${libdir}/cmake"

RREPLACES_${PN} = "libhawaii"
RPROVIDES_${PN} = "libhawaii"
RCONFLICTS_${PN} = "libhawaii"
