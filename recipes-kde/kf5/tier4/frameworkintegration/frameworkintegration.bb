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
SRC_URI[md5sum] = "56cadbbd46a2b489fe43f063090fc1ce"
SRC_URI[sha256sum] = "b1724eced475ba98847dfa77e234984cce54c42e59921d1997d7808e8c98d75d"

FILES_${PN} += " \
    ${datadir}/knotifications5 \
    ${datadir}/kconf_update \
    ${OE_QMAKE_PATH_PLUGINS} \
"
