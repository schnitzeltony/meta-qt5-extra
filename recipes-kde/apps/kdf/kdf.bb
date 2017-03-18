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
SRC_URI[md5sum] = "a712dd7172e911e05d479c293ea96441"
SRC_URI[sha256sum] = "8569720871f0c06a47dd93f1f6c18bf854b92592bc5f0dafeebd300ac38a0294"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/icons \
    ${OE_QMAKE_PATH_PLUGINS} \
"
