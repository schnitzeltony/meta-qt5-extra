SUMMARY = "KDE system settings"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma gettext

DEPENDS += " \
    kdoctools-native \
    sonnet-native \
    kpackage-native \
    kcoreaddons-native \
    kauth-native \
    kconfig-native \
    kactivities \
    kactivities-stats \
    kirigami2 \
    kitemviews \
    kcmutils \
    ki18n \
    kio \
    kservice \
    kiconthemes \
    kwindowsystem \
    kxmlgui \
    kdbusaddons \
    kconfig \
    khtml \
    kdoctools \
    plasma-workspace \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "0afca35d4eb6b755fa95ce383ca8328d"
SRC_URI[sha256sum] = "dcbff775f7ed6dfaf5dce4937d65e9202fa0e4e8f5b57c6f16642c22ebe7cc54"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/kpackage \
    ${OE_QMAKE_PATH_PLUGINS} \
"
