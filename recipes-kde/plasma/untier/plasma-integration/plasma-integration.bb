SUMMARY = "Qt Platform Theme integration plugins for the Plasma workspaces"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = " \
    file://COPYING.LGPL-3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit kde-plasma features_check gettext pkgconfig

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
SRC_URI[sha256sum] = "1cc280a93fab2c9c461deb172ee22da34a5100c3cd31ad8ebf0a9c405899422e"

FILES_${PN} += " \
    ${datadir}/kconf_update \
    ${OE_QMAKE_PATH_PLUGINS} \
"

RDEPENDS_${PN} += "perl"
