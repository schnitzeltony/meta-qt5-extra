SUMMARY = "KDiskFree displays the file devices' information"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-apps gtk-icon-cache

DEPENDS += "\
    kconfigwidgets \
    kcoreaddons \
    kdoctools \
    ki18n \
    kiconthemes \
    kio \
    kcmutils \
    knotifications \
    kwidgetsaddons \
    kxmlgui \
" 

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "d30fe12a118609b772e68e33b6eb6bb7"
SRC_URI[sha256sum] = "a37a6d6066f6fa0e17468410593d91d22ccb47c29f3055c5dfd4de7279ab72ba"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/icons \
    ${OE_QMAKE_PATH_PLUGINS} \
"
