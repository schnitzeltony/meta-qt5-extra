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
SRC_URI[md5sum] = "ff4eeba3baf3b750aa158dfa622a8fe9"
SRC_URI[sha256sum] = "d338df0dd293734371e3bb93c17bf52e84f5f4388464d7d51dc0bdcbf5a22a72"

FILES_${PN} += " \
    ${datadir}/kconf_update \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/*/.debug \
"
