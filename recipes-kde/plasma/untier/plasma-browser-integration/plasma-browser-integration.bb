SUMMARY = "Components necessary to integrate browsers into the Plasma Desktop"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING-GPL3;md5=d32239bcb673463ab874e80d47fae504"

inherit kde-plasma gettext

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "dcbd8fac7a192207a652256666ddc6e6"
SRC_URI[sha256sum] = "b58e1bd8a28b10c8abe8d725fe63f0cd171f752a3e81151b5c98217daa3aaf25"

DEPENDS += " \
    kauth-native \
    kconfig-native \
    kpackage-native \
    kio \
    ki18n \
    kdbusaddons \
    knotifications \
    krunner \
    kwindowsystem \
    kactivities \
"

# TBD split chrome/chromium/mozilla
FILES_${PN} += " \
    ${datadir}/k*5 \
    ${libdir}/mozilla \
    ${OE_QMAKE_PATH_PLUGINS} \
"
