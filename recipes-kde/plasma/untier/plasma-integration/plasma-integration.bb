SUMMARY = "Qt Platform Theme integration plugins for the Plasma workspaces"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING.LGPL-3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit kde-plasma distro_features_check gettext pkgconfig

DEPENDS += " \
    qtquickcontrols2 \
    breeze \
    kauth-native \
    kconfig \
    kconfig-native \
    kconfigwidgets \
    kcoreaddons-native \
    ki18n \
    kio \
    knotifications \
    kwidgetsaddons \
    \
    libxcb \
    libxcursor \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "3c35e275cdc620e36857de4fea66501b"
SRC_URI[sha256sum] = "05920610c68981a9effb1a97395a22d281d3b61e42d55d66adf8bb587da29621"

FILES_${PN} += " \
    ${datadir}/kconf_update \
    ${OE_QMAKE_PATH_PLUGINS} \
"
