SUMMARY = "Components necessary to integrate browsers into the Plasma Desktop"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING-GPL3;md5=d32239bcb673463ab874e80d47fae504"

inherit kde-plasma gettext

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "7b1a7e3eb08484c5907b59eb0ac41f80"
SRC_URI[sha256sum] = "2626a7a9fe7273bc0ad229a93d76ad11036826920c0c33b3733fa1e831a9ed21"

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
