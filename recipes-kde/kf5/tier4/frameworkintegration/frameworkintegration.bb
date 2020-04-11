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
SRC_URI[md5sum] = "0b37bfa36c62021968bf07da1b190164"
SRC_URI[sha256sum] = "df4ea8703a055ca1456296da7958667b4cb0c2e45af2f98a037b4d5d90a08a50"

FILES_${PN} += " \
    ${datadir}/knotifications5 \
    ${datadir}/kconf_update \
    ${OE_QMAKE_PATH_PLUGINS} \
"
