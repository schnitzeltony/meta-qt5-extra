SUMMARY = "Qt Platform Theme integration plugins for the Plasma workspaces"
LICENSE = "LGPLv3"
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
SRC_URI[md5sum] = "b6aecbde7d6f11dc37692a3521ff6144"
SRC_URI[sha256sum] = "169206bebd790d2fee49cec621c46f6f64a8e20ee3e56bf16ee7373f61cad959"

FILES_${PN} += " \
    ${datadir}/kconf_update \
    ${OE_QMAKE_PATH_PLUGINS} \
"

RDEPENDS_${PN} += "perl"
