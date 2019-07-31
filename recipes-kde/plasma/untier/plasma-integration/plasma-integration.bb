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
SRC_URI[md5sum] = "31b52d29b0aa1c6be4d90844217c7e63"
SRC_URI[sha256sum] = "d4c5022ea91f9727cfebab821cb6b8e7b52671a6508cd7450e05bf51e248452d"

FILES_${PN} += " \
    ${datadir}/kconf_update \
    ${OE_QMAKE_PATH_PLUGINS} \
"
