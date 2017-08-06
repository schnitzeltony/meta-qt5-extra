SUMMARY = "Workspace and cross-framework integration plugins"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += " \
    kauth-native \
    kconfig \
    kconfig-native \
    kcoreaddons-native \
    kconfigwidgets \
    ki18n \
    kiconthemes \
    kio \
    knotifications \
    kwidgetsaddons \
    knewstuff \
    kpackage \
    kpackage-native \
"

RRECCOMENDS_${PN} += "oxygen-fonts"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "eb9d48b9db29ef1a410c12f764feb451"
SRC_URI[sha256sum] = "345f6dc25d5f864aaeeffec8b5888c25b3248dcab16210c60663e2a65d1143e1"

FILES_${PN} += " \
    ${datadir}/knotifications5 \
    ${datadir}/kconf_update \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/*/.debug \
"
