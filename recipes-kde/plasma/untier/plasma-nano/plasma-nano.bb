SUMMARY = "Widget theme for GTK 2 and 3"
LICENSE = "BSD-3-Clause & LGPL-2.1"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=da48810c4ddf8e49efa031294a26b98c \
"

inherit kde-plasma gettext

DEPENDS += " \
    kpackage-native \
    plasma-framework \
    kwindowsystem \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "0a980893e7b928780ad9ff80b45e1c8706ce779e155fb43f664b0f3ea5086df9"

FILES:${PN} += " \
    ${datadir}/plasma \
    ${datadir}/kservices5 \
    ${datadir}/plasma/shells \
    ${datadir}/plasma/packages \
    ${OE_QMAKE_PATH_QML} \
"
