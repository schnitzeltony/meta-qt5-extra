SUMMARY = "Plugins for Dolphin"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24"

inherit kde-apps gettext

DEPENDS += "\
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdelibs4support-native \
    kdelibs4support \
    sonnet-native \
    kxmlgui \
    ki18n \
    kio \
    dolphin \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "9654ad7175fcaa93dbf0003f5e63c948ac53982be9f7f54482a8774c53abc4b1"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
