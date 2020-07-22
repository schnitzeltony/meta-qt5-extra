SUMMARY = "Components necessary to integrate browsers into the Plasma Desktop"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING-GPL3;md5=d32239bcb673463ab874e80d47fae504"

inherit kde-plasma gettext

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "c92ce026219e5bf72eba95097dd2d8a2"
SRC_URI[sha256sum] = "9f2989d25b3e49a2965872e46528dbbe931a7d67f6535a42256d3d5ea0b2f29e"

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
    kfilemetadata \
    purpose \
"

# TBD split chrome/chromium/mozilla
FILES_${PN} += " \
    ${datadir}/k*5 \
    ${libdir}/mozilla \
    ${OE_QMAKE_PATH_PLUGINS} \
"
