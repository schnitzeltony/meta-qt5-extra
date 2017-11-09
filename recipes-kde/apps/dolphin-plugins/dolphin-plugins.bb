SUMMARY = "Plugins for Dolphin"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24"

inherit kde-apps gettext

DEPENDS += "\
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdesignerplugin-native \
    sonnet-native \
    kxmlgui \
    ki18n \
    kio \
    kdelibs4support-native \
    dolphin \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "da1d926f6d3db6bf7d585679bcd7a62a"
SRC_URI[sha256sum] = "5e3d7f6fdc537ea78535981f728a6e0684931baee06b37fa3b2816ed769659e8"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
