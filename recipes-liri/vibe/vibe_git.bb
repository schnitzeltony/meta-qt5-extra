SUMMARY = "A collection of core classes used throught Liri"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = " \
    file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit liri distro_features_check

REQUIRED_DISTRO_FEATURES = "pulseaudio"

PV = "0.9.0+git${SRCPV}"

SRCREV = "a2a8337b5356dd98e4ee2cfd424581b8ae2f4723"
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

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
FILES_${PN}-dev += "${libdir}/cmake"

RREPLACES_${PN} = "libhawaii"
RPROVIDES_${PN} = "libhawaii"
RCONFLICTS_${PN} = "libhawaii"
