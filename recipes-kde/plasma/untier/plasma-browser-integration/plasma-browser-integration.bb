SUMMARY = "Components necessary to integrate browsers into the Plasma Desktop"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING-GPL3;md5=d32239bcb673463ab874e80d47fae504"

inherit kde-plasma gettext

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "c4a5b8682351edaa0559131f43eda870"
SRC_URI[sha256sum] = "0aa69ee733dab6d9435cf82a71bc85011dfe4b703909656e2c67fbf40df2839e"

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
