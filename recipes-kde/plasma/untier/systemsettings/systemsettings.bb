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
SRC_URI[md5sum] = "2c5cb8496ca3bbc93c99c6d18ff01e33"
SRC_URI[sha256sum] = "9298b3d59e4e48dc613db7e9e281e5700b9a17ae541519b848038e200aff4ddd"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/kpackage \
    ${OE_QMAKE_PATH_PLUGINS} \
"
