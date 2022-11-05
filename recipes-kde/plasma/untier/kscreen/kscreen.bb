SUMMARY = "KDE's screen management software"
LICENSE = "CC0-1.0 & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & LGPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-only.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-3.0-only.txt;md5=49fc03046e56a282c0c743b5d3a55b7c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=e3e049b303846e4de3eeafccf035a404 \
"

inherit kde-plasma gettext

DEPENDS += "\
    qtdeclarative \
    qtsensors \
    \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kpackage-native \
    kcmutils-native \
    kdbusaddons \
    kconfig \
    kconfigwidgets \
    ki18n \
    kxmlgui \
    kglobalaccel \
    kwidgetsaddons \
    kdeclarative \
	kiconthemes \
    plasma-framework \
    libkscreen \
    layer-shell-qt \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "6fe4f696d6717c494ac485f4ba7d0c2826bd4e8c5a0f2cf26447cdf0132fee10"

FILES:${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/k*_kscreen \
    ${datadir}/kservices5 \
    ${datadir}/plasma \
    ${datadir}/kpackage \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${systemd_user_unitdir} \
"
