SUMMARY = "Plugins for Dolphin"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24"

inherit kde-apps gettext

DEPENDS += "\
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdesignerplugin-native \
    kdelibs4support-native \
    kdelibs4support \
    sonnet-native \
    kxmlgui \
    ki18n \
    kio \
    dolphin \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "b2b7a1d8f15daaa9ce040b2f318b72c6"
SRC_URI[sha256sum] = "442ed0b6f08dd493885155e090847a069915518fbbbae5dd4923cb2ca3860901"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
