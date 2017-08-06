SUMMARY = "KDE system settings"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma gettext

DEPENDS += " \
    kcoreaddons-native \
    kauth-native \
    kconfig-native \
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
    kdoctools-native \
    sonnet-native \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "bb0ecd75155f9536af7522c987a8b34c"
SRC_URI[sha256sum] = "5e5a9d1b3b483cafd2aa61f1c245658449cdc1245f208c7fc4a3df534c842c17"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
