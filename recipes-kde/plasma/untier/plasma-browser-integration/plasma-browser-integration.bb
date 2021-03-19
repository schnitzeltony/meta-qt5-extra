SUMMARY = "Components necessary to integrate browsers into the Plasma Desktop"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://COPYING-GPL3;md5=d32239bcb673463ab874e80d47fae504"

inherit kde-plasma gettext

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "deb4e4de2b821942b4d3096f2193d92459bb6b4b6bdedfe80f77efb1a949e9c3"

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
    plasma-workspace \
"

# TBD split chrome/chromium/mozilla
FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/krunner \
    ${libdir}/mozilla \
    ${OE_QMAKE_PATH_PLUGINS} \
"
