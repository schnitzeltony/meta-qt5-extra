SUMMARY = "Components necessary to integrate browsers into the Plasma Desktop"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING-GPL3;md5=d32239bcb673463ab874e80d47fae504"

inherit kde-plasma gettext

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "dcede75af2b44e7dba52164f52a8a37a"
SRC_URI[sha256sum] = "59c984d174ab484899b9b1d7d4600f5be3152d8bbed2fb8f44cdbf617e510ad6"

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
