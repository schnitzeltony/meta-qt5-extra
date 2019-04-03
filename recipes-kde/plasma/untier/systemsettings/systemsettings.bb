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
SRC_URI[md5sum] = "daec598ce850801ce69dbf66d4f129a8"
SRC_URI[sha256sum] = "2cff11f842266296192381a214df6fd55debfd444b754b6dec80f70a3154defb"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/kpackage \
    ${OE_QMAKE_PATH_PLUGINS} \
"
